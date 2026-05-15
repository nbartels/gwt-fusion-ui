const componentClasses = [
  'inline-flex', 'items-center', 'justify-center', 'gap-2', 'whitespace-nowrap',
  'rounded-md', 'rounded-lg', 'rounded', 'rounded-full', 'text-base', 'text-sm', 'text-xs', 'font-medium', 'font-semibold',
  'transition-colors', 'transition-transform', 'focus-visible:outline-none', 'focus-visible:ring-1',
  'focus-visible:ring-ring', 'disabled:pointer-events-none', 'disabled:opacity-50',
  'disabled:cursor-not-allowed', 'cursor-pointer', 'pointer-events-none',
  'bg-primary', 'text-primary-foreground', 'hover:bg-primary/90',
  'bg-destructive', 'text-destructive-foreground', 'hover:bg-destructive/90',
  'border', 'border-2', 'border-input', 'border-primary', 'border-destructive', 'bg-background', 'hover:bg-accent', 'hover:text-accent-foreground',
  'bg-secondary', 'text-secondary-foreground', 'hover:bg-secondary/80',
  'hover:bg-accent', 'hover:text-accent-foreground', 'underline-offset-4', 'hover:underline',
  'h-4', 'h-5', 'h-8', 'h-9', 'h-10', 'h-11', 'w-4', 'w-9', 'px-3', 'px-4', 'px-8', 'py-1', 'py-2',
  'shadow', 'shadow-sm', 'w-full', 'min-w-0', 'min-h-12', 'min-h-16',
  'border-transparent', 'bg-transparent', 'bg-muted', 'bg-border', 'bg-input', 'text-foreground', 'text-muted-foreground', 'text-primary',
  'border-destructive/50', 'text-destructive', 'dark:border-destructive',
  'border-l-4', 'p-4', 'p-6', 'pt-0', 'space-y-1.5', 'mb-1', 'mx-4',
  'flex', 'flex-col', 'flex-row', 'flex-wrap', 'gap-4', 'leading-none', 'tracking-tight',
  'relative', 'shrink-0', 'h-px', 'w-px', 'h-full',
  'translate-x-0', 'translate-x-4', 'accent-primary',
  'file:border-0', 'file:bg-transparent', 'file:text-sm', 'file:font-medium',
  'placeholder:text-muted-foreground', 'selection:bg-primary', 'selection:text-primary-foreground'
];

module.exports = {
  darkMode: ['class'],
  content: [
    './src/main/java/**/*.java',
    '../gwt-fusion-ui-demo/src/main/java/**/*.java',
    '../gwt-fusion-ui-demo/src/main/webapp/**/*.html'
  ],
  safelist: componentClasses,
  theme: {
    extend: {
      colors: {
        border: 'hsl(var(--border))',
        input: 'hsl(var(--input))',
        ring: 'hsl(var(--ring))',
        background: 'hsl(var(--background))',
        foreground: 'hsl(var(--foreground))',
        primary: {
          DEFAULT: 'hsl(var(--primary))',
          foreground: 'hsl(var(--primary-foreground))'
        },
        secondary: {
          DEFAULT: 'hsl(var(--secondary))',
          foreground: 'hsl(var(--secondary-foreground))'
        },
        destructive: {
          DEFAULT: 'hsl(var(--destructive))',
          foreground: 'hsl(var(--destructive-foreground))'
        },
        muted: {
          DEFAULT: 'hsl(var(--muted))',
          foreground: 'hsl(var(--muted-foreground))'
        },
        accent: {
          DEFAULT: 'hsl(var(--accent))',
          foreground: 'hsl(var(--accent-foreground))'
        }
      }
    }
  },
  plugins: []
};
