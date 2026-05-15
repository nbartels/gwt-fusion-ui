package org.gwtfusion.ui.component.input;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLInputElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.form.FormControl;

public final class Input extends BaseComponent<Input> implements FormControl<Input> {
    public static final String BASE_CLASSES = "flex h-9 w-full min-w-0 rounded-md border border-input bg-transparent px-3 py-1 text-base shadow-sm transition-colors file:border-0 file:bg-transparent file:text-sm file:font-medium placeholder:text-muted-foreground selection:bg-primary selection:text-primary-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50 md:text-sm";
    public static final String INVALID_CLASSES = "border-destructive";

    private Input(HTMLInputElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static Input create() {
        return new Input((HTMLInputElement) DomGlobal.document.createElement("input"));
    }

    public Input type(String type) {
        ((HTMLInputElement) element()).type = type;
        return this;
    }

    public Input value(String value) {
        ((HTMLInputElement) element()).value = value == null ? "" : value;
        return this;
    }

    public Input placeholder(String placeholder) {
        ((HTMLInputElement) element()).placeholder = placeholder == null ? "" : placeholder;
        return this;
    }

    @Override
    public Input name(String name) {
        ((HTMLInputElement) element()).name = name == null ? "" : name;
        return this;
    }

    @Override
    public Input disabled(boolean disabled) {
        ((HTMLInputElement) element()).disabled = disabled;
        return this;
    }

    @Override
    public Input required(boolean required) {
        ((HTMLInputElement) element()).required = required;
        return this;
    }

    @Override
    public Input invalid(boolean invalid) {
        aria("invalid", String.valueOf(invalid));
        if (invalid) {
            classes(INVALID_CLASSES);
        } else {
            removeClasses(INVALID_CLASSES);
        }
        return this;
    }

    public String value() {
        return ((HTMLInputElement) element()).value;
    }
}
