package org.gwtfusion.ui.component.slider;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLInputElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.form.FormControl;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Slider extends BaseComponent<Slider> implements FormControl<Slider> {
    public static final String BASE_CLASSES = "h-2 w-full cursor-pointer appearance-none rounded-full bg-secondary accent-primary disabled:cursor-not-allowed disabled:opacity-50";

    private Slider(HTMLInputElement element) {
        super(element);
        element.type = "range";
        classes(BASE_CLASSES);
    }

    public static Slider create() {
        return new Slider((HTMLInputElement) DomGlobal.document.createElement("input"));
    }

    public Slider min(double min) {
        ((HTMLInputElement) element()).min = String.valueOf(min);
        return this;
    }

    public Slider max(double max) {
        ((HTMLInputElement) element()).max = String.valueOf(max);
        return this;
    }

    public Slider step(double step) {
        ((HTMLInputElement) element()).step = String.valueOf(step);
        return this;
    }

    public Slider value(double value) {
        ((HTMLInputElement) element()).value = String.valueOf(value);
        return this;
    }

    public String value() {
        return ((HTMLInputElement) element()).value;
    }

    public double doubleValue() {
        String value = value();
        if (value == null || value.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(value);
    }

    public ListenerRegistration onValueChange(ValueChangeListener<Double> listener) {
        return listen("input", event -> listener.onValueChange(doubleValue()));
    }

    public ListenerRegistration onValueCommit(ValueChangeListener<Double> listener) {
        return listen("change", event -> listener.onValueChange(doubleValue()));
    }

    @Override
    public Slider name(String name) {
        ((HTMLInputElement) element()).name = name == null ? "" : name;
        return this;
    }

    @Override
    public Slider disabled(boolean disabled) {
        ((HTMLInputElement) element()).disabled = disabled;
        return this;
    }
}
