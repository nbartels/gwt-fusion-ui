package org.gwtfusion.ui.component.textarea;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLTextAreaElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.form.FormControl;

public final class Textarea extends BaseComponent<Textarea> implements FormControl<Textarea> {
    public static final String BASE_CLASSES = "flex min-h-16 w-full rounded-md border border-input bg-transparent px-3 py-2 text-base shadow-sm placeholder:text-muted-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50 md:text-sm";
    public static final String INVALID_CLASSES = "border-destructive";

    private Textarea(HTMLTextAreaElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static Textarea create() {
        return new Textarea((HTMLTextAreaElement) DomGlobal.document.createElement("textarea"));
    }

    public Textarea value(String value) {
        ((HTMLTextAreaElement) element()).value = value == null ? "" : value;
        return this;
    }

    public String value() {
        return ((HTMLTextAreaElement) element()).value;
    }

    public Textarea placeholder(String placeholder) {
        ((HTMLTextAreaElement) element()).placeholder = placeholder == null ? "" : placeholder;
        return this;
    }

    public Textarea rows(int rows) {
        ((HTMLTextAreaElement) element()).rows = rows;
        return this;
    }

    public Textarea disabled(boolean disabled) {
        ((HTMLTextAreaElement) element()).disabled = disabled;
        return this;
    }

    public Textarea invalid(boolean invalid) {
        aria("invalid", String.valueOf(invalid));
        if (invalid) {
            classes(INVALID_CLASSES);
        } else {
            removeClasses(INVALID_CLASSES);
        }
        return this;
    }

    public Textarea name(String name) {
        ((HTMLTextAreaElement) element()).name = name == null ? "" : name;
        return this;
    }

    public Textarea required(boolean required) {
        attr("required", required ? "" : null);
        return this;
    }
}
