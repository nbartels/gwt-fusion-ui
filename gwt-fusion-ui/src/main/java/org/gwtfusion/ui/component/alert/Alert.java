package org.gwtfusion.ui.component.alert;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class Alert extends BaseComponent<Alert> {
    private AlertVariant variant;

    private Alert(HTMLElement element) {
        super(element);
        classes("relative w-full rounded-lg border p-4");
        variant(AlertVariant.DEFAULT);
    }

    public static Alert create() {
        return new Alert((HTMLElement) DomGlobal.document.createElement("div")).attr("role", "alert");
    }

    public Alert variant(AlertVariant variant) {
        if (this.variant != null) {
            removeClasses(this.variant.classes());
        }
        this.variant = variant;
        return classes(variant.classes());
    }

    public Alert add(UiComponent component) {
        element().appendChild(component.element());
        return this;
    }

    public static AlertText title(String text) {
        return AlertText.create("h5", "mb-1 font-medium leading-none tracking-tight").text(text);
    }

    public static AlertText description(String text) {
        return AlertText.create("div", "text-sm").text(text);
    }

    public static final class AlertText extends BaseComponent<AlertText> {
        private AlertText(HTMLElement element, String classes) {
            super(element);
            classes(classes);
        }

        private static AlertText create(String tagName, String classes) {
            return new AlertText((HTMLElement) DomGlobal.document.createElement(tagName), classes);
        }
    }
}
