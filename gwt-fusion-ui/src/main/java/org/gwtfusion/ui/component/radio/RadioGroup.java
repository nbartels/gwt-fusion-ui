package org.gwtfusion.ui.component.radio;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLInputElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.form.FormControl;

public final class RadioGroup extends BaseComponent<RadioGroup> implements FormControl<RadioGroup> {
    public static final String OPTION_CLASSES = "inline-flex items-center gap-2 text-sm font-medium leading-none";
    public static final String INPUT_CLASSES = "h-4 w-4 border border-input text-primary accent-primary focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50";

    private final List<Option> options = new ArrayList<>();
    private RadioGroupOrientation orientation;
    private String name;

    private RadioGroup(HTMLElement element) {
        super(element);
        attr("role", "radiogroup");
        orientation(RadioGroupOrientation.VERTICAL);
    }

    public static RadioGroup create() {
        return new RadioGroup((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public RadioGroup orientation(RadioGroupOrientation orientation) {
        if (this.orientation != null) {
            removeClasses(this.orientation.classes());
        }
        this.orientation = orientation;
        data("orientation", orientation.name().toLowerCase());
        return classes(orientation.classes());
    }

    public RadioGroup name(String name) {
        this.name = name == null ? "" : name;
        for (Option option : options) {
            option.input.name = this.name;
        }
        return this;
    }

    public RadioGroup addOption(String value, String label) {
        Option option = new Option(value, label);
        options.add(option);
        if (name != null) {
            option.input.name = name;
        }
        element().appendChild(option.element);
        return this;
    }

    public RadioGroup value(String value) {
        for (Option option : options) {
            option.input.checked = option.value.equals(value);
        }
        return this;
    }

    public String value() {
        for (Option option : options) {
            if (option.input.checked) {
                return option.value;
            }
        }
        return "";
    }

    public RadioGroup disabled(boolean disabled) {
        aria("disabled", String.valueOf(disabled));
        for (Option option : options) {
            option.input.disabled = disabled;
        }
        return this;
    }

    private static final class Option {
        private final HTMLElement element;
        private final HTMLInputElement input;
        private final String value;

        private Option(String value, String label) {
            this.value = value == null ? "" : value;
            element = (HTMLElement) DomGlobal.document.createElement("label");
            element.className = OPTION_CLASSES;
            input = (HTMLInputElement) DomGlobal.document.createElement("input");
            input.type = "radio";
            input.value = this.value;
            input.className = INPUT_CLASSES;
            HTMLElement text = (HTMLElement) DomGlobal.document.createElement("span");
            text.textContent = label == null ? "" : label;
            element.appendChild(input);
            element.appendChild(text);
        }
    }
}
