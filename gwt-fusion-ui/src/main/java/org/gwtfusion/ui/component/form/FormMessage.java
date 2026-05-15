package org.gwtfusion.ui.component.form;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class FormMessage extends BaseComponent<FormMessage> {
    public static final String BASE_CLASSES = "text-sm font-medium text-destructive";

    private FormMessage(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static FormMessage create(String text) {
        return new FormMessage((HTMLElement) DomGlobal.document.createElement("p")).text(text);
    }
}
