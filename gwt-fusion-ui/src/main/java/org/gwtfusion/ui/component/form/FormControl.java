package org.gwtfusion.ui.component.form;

import org.gwtfusion.ui.UiComponent;

public interface FormControl<T extends FormControl<T>> extends UiComponent {
    default T id(String id) {
        if (id == null || id.isEmpty()) {
            element().removeAttribute("id");
        } else {
            element().setAttribute("id", id);
        }
        return castThis();
    }

    default T name(String name) {
        if (name == null || name.isEmpty()) {
            element().removeAttribute("name");
        } else {
            element().setAttribute("name", name);
        }
        return castThis();
    }

    default T disabled(boolean disabled) {
        if (disabled) {
            element().setAttribute("disabled", "");
        } else {
            element().removeAttribute("disabled");
        }
        element().setAttribute("aria-disabled", String.valueOf(disabled));
        return castThis();
    }

    default T required(boolean required) {
        if (required) {
            element().setAttribute("required", "");
        } else {
            element().removeAttribute("required");
        }
        return castThis();
    }

    default T invalid(boolean invalid) {
        element().setAttribute("aria-invalid", String.valueOf(invalid));
        return castThis();
    }

    @SuppressWarnings("unchecked")
    default T castThis() {
        return (T) this;
    }
}
