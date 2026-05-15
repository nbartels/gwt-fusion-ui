package org.gwtfusion.ui.component.checkbox;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLInputElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.form.FormControl;

public final class Checkbox extends BaseComponent<Checkbox> implements FormControl<Checkbox> {
    public static final String BASE_CLASSES = "h-4 w-4 rounded border border-input accent-primary shadow-sm focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50";
    public static final String INVALID_CLASSES = "border-destructive";

    private Checkbox(HTMLInputElement element) {
        super(element);
        element.type = "checkbox";
        classes(BASE_CLASSES);
    }

    public static Checkbox create() {
        return new Checkbox((HTMLInputElement) DomGlobal.document.createElement("input"));
    }

    public Checkbox checked(boolean checked) {
        ((HTMLInputElement) element()).checked = checked;
        return this;
    }

    public boolean checked() {
        return ((HTMLInputElement) element()).checked;
    }

    public Checkbox disabled(boolean disabled) {
        ((HTMLInputElement) element()).disabled = disabled;
        return this;
    }

    public Checkbox invalid(boolean invalid) {
        aria("invalid", String.valueOf(invalid));
        if (invalid) {
            classes(INVALID_CLASSES);
        } else {
            removeClasses(INVALID_CLASSES);
        }
        return this;
    }

    public Checkbox name(String name) {
        ((HTMLInputElement) element()).name = name == null ? "" : name;
        return this;
    }

    public Checkbox value(String value) {
        ((HTMLInputElement) element()).value = value == null ? "" : value;
        return this;
    }

    public Checkbox required(boolean required) {
        ((HTMLInputElement) element()).required = required;
        return this;
    }
}
