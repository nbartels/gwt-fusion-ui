package org.gwtfusion.ui.component.form;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class FormDescription extends BaseComponent<FormDescription> {
    public static final String BASE_CLASSES = "text-sm text-muted-foreground";

    private FormDescription(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static FormDescription create(String text) {
        return new FormDescription((HTMLElement) DomGlobal.document.createElement("p")).text(text);
    }
}
