package org.gwtfusion.ui.component.form;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class FormField extends BaseComponent<FormField> {
    public static final String BASE_CLASSES = "grid gap-2";

    private final String controlId;
    private UiComponent control;
    private String descriptionId;
    private String messageId;

    private FormField(HTMLElement element, String controlId) {
        super(element);
        this.controlId = controlId;
        classes(BASE_CLASSES);
    }

    public static FormField create(String controlId) {
        return new FormField((HTMLElement) DomGlobal.document.createElement("div"), controlId);
    }

    public FormField label(String text) {
        return add(FormLabel.create(text).forId(controlId));
    }

    public FormField control(FormControl<?> control) {
        control.id(controlId);
        this.control = control;
        element().appendChild(control.element());
        applyDescriptions();
        return this;
    }

    public FormField add(UiComponent component) {
        element().appendChild(component.element());
        return this;
    }

    public FormField description(String text) {
        descriptionId = controlId + "-description";
        FormDescription description = FormDescription.create(text).attr("id", descriptionId);
        element().appendChild(description.element());
        applyDescriptions();
        return this;
    }

    public FormField message(String text) {
        messageId = controlId + "-message";
        FormMessage message = FormMessage.create(text).attr("id", messageId);
        element().appendChild(message.element());
        applyDescriptions();
        return this;
    }

    private void applyDescriptions() {
        if (control == null) {
            return;
        }
        String describedBy = joinIds(descriptionId, messageId);
        if (describedBy.isEmpty()) {
            control.element().removeAttribute("aria-describedby");
        } else {
            control.element().setAttribute("aria-describedby", describedBy);
        }
    }

    private String joinIds(String first, String second) {
        if (first == null || first.isEmpty()) {
            return second == null ? "" : second;
        }
        if (second == null || second.isEmpty()) {
            return first;
        }
        return first + " " + second;
    }
}
