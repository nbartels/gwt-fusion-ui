package org.gwtfusion.ui.component.select;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLSelectElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.form.FormControl;

public final class NativeSelect extends BaseComponent<NativeSelect> implements FormControl<NativeSelect> {
    public static final String BASE_CLASSES = "flex h-9 w-full min-w-0 rounded-md border border-input bg-transparent px-3 py-1 text-base shadow-sm focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50 md:text-sm";
    public static final String INVALID_CLASSES = "border-destructive";

    private NativeSelect(HTMLSelectElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static NativeSelect create() {
        return new NativeSelect((HTMLSelectElement) DomGlobal.document.createElement("select"));
    }

    public NativeSelect option(String value, String label) {
        HTMLElement option = (HTMLElement) DomGlobal.document.createElement("option");
        option.setAttribute("value", value == null ? "" : value);
        option.textContent = label == null ? "" : label;
        element().appendChild(option);
        return this;
    }

    public NativeSelect value(String value) {
        ((HTMLSelectElement) element()).value = value == null ? "" : value;
        return this;
    }

    public String value() {
        return ((HTMLSelectElement) element()).value;
    }

    @Override
    public NativeSelect name(String name) {
        ((HTMLSelectElement) element()).name = name == null ? "" : name;
        return this;
    }

    @Override
    public NativeSelect disabled(boolean disabled) {
        ((HTMLSelectElement) element()).disabled = disabled;
        return this;
    }

    @Override
    public NativeSelect required(boolean required) {
        attr("required", required ? "" : null);
        return this;
    }

    @Override
    public NativeSelect invalid(boolean invalid) {
        aria("invalid", String.valueOf(invalid));
        if (invalid) {
            classes(INVALID_CLASSES);
        } else {
            removeClasses(INVALID_CLASSES);
        }
        return this;
    }
}
