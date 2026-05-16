import fs from 'node:fs';
import path from 'node:path';

const [, , sourceDirArg, outputDirArg] = process.argv;

if (!sourceDirArg || !outputDirArg) {
  console.error('Usage: node generate-lucide-icons.mjs <lucide-icons-dir> <output-java-dir>');
  process.exit(1);
}

const sourceDir = path.resolve(sourceDirArg);
const outputDir = path.resolve(outputDirArg);
const keywords = new Set([
  'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class', 'const',
  'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final', 'finally', 'float',
  'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int', 'interface', 'long', 'native',
  'new', 'package', 'private', 'protected', 'public', 'return', 'short', 'static', 'strictfp',
  'super', 'switch', 'synchronized', 'this', 'throw', 'throws', 'transient', 'try', 'void',
  'volatile', 'while'
]);

function javaString(value) {
  return String(value)
    .replace(/\\/g, '\\\\')
    .replace(/"/g, '\\"')
    .replace(/\r/g, '\\r')
    .replace(/\n/g, '\\n');
}

function methodName(name) {
  const parts = name.split(/[^a-zA-Z0-9]+/).filter(Boolean);
  let result = parts.map((part, index) => {
    const lower = part.toLowerCase();
    const normalized = /^[0-9]+$/.test(lower) ? `n${lower}` : lower;
    if (index === 0) {
      return normalized;
    }
    return normalized.charAt(0).toUpperCase() + normalized.slice(1);
  }).join('');
  if (!result || /^[0-9]/.test(result)) {
    result = 'icon' + parts.map(part => part.charAt(0).toUpperCase() + part.slice(1).toLowerCase()).join('');
  }
  if (keywords.has(result)) {
    result += 'Icon';
  }
  return result;
}

function parseAttributes(source) {
  const attrs = [];
  for (const match of source.matchAll(/([a-zA-Z_:][-a-zA-Z0-9_:.]*)="([^"]*)"/g)) {
    attrs.push([match[1], match[2]]);
  }
  return attrs;
}

function parseShapes(svg) {
  const shapes = [];
  for (const match of svg.matchAll(/<(path|circle|rect|line|polyline|polygon|ellipse)\b([^>]*)\/?\s*>/g)) {
    shapes.push({ tag: match[1], attrs: parseAttributes(match[2]) });
  }
  return shapes;
}

function iconExpression(icon) {
  const calls = icon.shapes.map(shape => {
    const args = [shape.tag, ...shape.attrs.flat()].map(value => `"${javaString(value)}"`).join(', ');
    return `\n                .element(${args})`;
  }).join('');
  return `Icon.create()${calls}`;
}

function chunkName(method) {
  const first = method.charAt(0).toUpperCase();
  return /^[A-Z]$/.test(first) ? first : 'Misc';
}

const icons = fs.readdirSync(sourceDir)
  .filter(file => file.endsWith('.svg'))
  .map(file => {
    const name = file.slice(0, -4);
    const svg = fs.readFileSync(path.join(sourceDir, file), 'utf8');
    return { name, method: methodName(name), shapes: parseShapes(svg) };
  })
  .sort((a, b) => a.name.localeCompare(b.name));

const seenMethods = new Set();
for (const icon of icons) {
  if (seenMethods.has(icon.method)) {
    throw new Error(`Duplicate Java method name: ${icon.method}`);
  }
  seenMethods.add(icon.method);
}

fs.mkdirSync(outputDir, { recursive: true });
for (const file of fs.readdirSync(outputDir)) {
  if (file.startsWith('LucideIcons') && file.endsWith('.java')) {
    fs.rmSync(path.join(outputDir, file));
  }
}

const chunks = new Map();
for (const icon of icons) {
  const chunk = chunkName(icon.method);
  if (!chunks.has(chunk)) {
    chunks.set(chunk, []);
  }
  chunks.get(chunk).push(icon);
}

const packageName = 'org.gwtfusion.icons.lucide';
const chunkKeys = [...chunks.keys()].sort();

for (const key of chunkKeys) {
  const className = `LucideIcons${key}`;
  const chunkIcons = chunks.get(key);
  const names = chunkIcons.map(icon => `"${javaString(icon.name)}"`).join(', ');
  const lookup = chunkIcons.map(icon => `        if ("${javaString(icon.name)}".equals(name)) {\n            return ${icon.method}();\n        }`).join('\n');
  const methods = chunkIcons.map(icon => `    static Icon ${icon.method}() {\n        return ${iconExpression(icon)};\n    }`).join('\n\n');
  const source = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\n\nfinal class ${className} {\n    private static final String[] NAMES = {${names}};\n\n    private ${className}() {\n    }\n\n    static String[] names() {\n        return NAMES;\n    }\n\n    static Icon icon(String name) {\n${lookup}\n        return null;\n    }\n\n${methods}\n}\n`;
  fs.writeFileSync(path.join(outputDir, `${className}.java`), source);
}

const publicMethods = icons.map(icon => `    public static Icon ${icon.method}() {\n        return LucideIcons${chunkName(icon.method)}.${icon.method}();\n    }`).join('\n\n');
const nameCopies = chunkKeys.map(key => `        offset = copy(LucideIcons${key}.names(), names, offset);`).join('\n');
const dispatch = chunkKeys.map(key => {
  const firstName = chunks.get(key)[0].name.charAt(0);
  const names = [...new Set(chunks.get(key).map(icon => icon.name.charAt(0)))].sort();
  return names.map(name => `            case '${javaString(name)}':`).join('\n') + `\n                return LucideIcons${key}.icon(name);`;
}).join('\n');

let lucideIcons = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class LucideIcons {\n    public static final int COUNT = ${icons.length};\n\n    private LucideIcons() {\n    }\n\n    public static IconProvider provider() {\n        return new LucideIconProvider();\n    }\n\n    public static String[] names() {\n        String[] names = new String[COUNT];\n        int offset = 0;\n${nameCopies}\n        return names;\n    }\n\n    static Icon icon(String name) {\n        if (name == null || name.isEmpty()) {\n            return null;\n        }\n        switch (name.charAt(0)) {\n${dispatch}\n            default:\n                return null;\n        }\n    }\n\n    private static int copy(String[] source, String[] target, int offset) {\n        for (int i = 0; i < source.length; i++) {\n            target[offset + i] = source[i];\n        }\n        return offset + source.length;\n    }\n\n${publicMethods}\n}\n`;
lucideIcons = lucideIcons.replace('    static Icon icon(String name)', '    public static Icon icon(String name)');
fs.writeFileSync(path.join(outputDir, 'LucideIcons.java'), lucideIcons);

const provider = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class LucideIconProvider implements IconProvider {\n    @Override\n    public Icon icon(String name) {\n        return LucideIcons.icon(name);\n    }\n\n    public boolean supports(String name) {\n        for (String supportedName : LucideIcons.names()) {\n            if (supportedName.equals(name)) {\n                return true;\n            }\n        }\n        return false;\n    }\n}\n`;
fs.writeFileSync(path.join(outputDir, 'LucideIconProvider.java'), provider);

console.log(`Generated ${icons.length} Lucide icons in ${outputDir}`);
