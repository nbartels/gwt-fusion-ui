package org.gwtfusion.ui.component.code;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class CodeBlock extends BaseComponent<CodeBlock> {
    public static final String BASE_CLASSES = "rounded-lg bg-muted p-4 text-sm text-foreground overflow-auto whitespace-pre";
    public static final String CODE_CLASSES = "font-mono";

    private final HTMLElement codeElement;

    private CodeBlock(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        codeElement = (HTMLElement) DomGlobal.document.createElement("code");
        codeElement.className = CODE_CLASSES;
        element.appendChild(codeElement);
    }

    public static CodeBlock create(String code) {
        return new CodeBlock((HTMLElement) DomGlobal.document.createElement("pre")).code(code);
    }

    public CodeBlock code(String code) {
        codeElement.textContent = code == null ? "" : code;
        return this;
    }

    public CodeBlock language(String language) {
        if (language == null || language.isEmpty()) {
            codeElement.removeAttribute("data-language");
        } else {
            codeElement.setAttribute("data-language", language);
        }
        return this;
    }
}
