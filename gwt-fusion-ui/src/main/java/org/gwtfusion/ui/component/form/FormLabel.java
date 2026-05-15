package org.gwtfusion.ui.component.form;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLLabelElement;
import org.gwtfusion.ui.BaseComponent;

public final class FormLabel extends BaseComponent<FormLabel> {
    public static final String BASE_CLASSES = "text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70";

    private FormLabel(HTMLLabelElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static FormLabel create(String text) {
        return new FormLabel((HTMLLabelElement) DomGlobal.document.createElement("label")).text(text);
    }

    public FormLabel forId(String id) {
        ((HTMLLabelElement) element()).htmlFor = id == null ? "" : id;
        return this;
    }
}
