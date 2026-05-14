package org.gwtfusion.ui.component.label;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLLabelElement;
import org.gwtfusion.ui.BaseComponent;

public final class Label extends BaseComponent<Label> {
    private Label(HTMLLabelElement element) {
        super(element);
        classes("text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70");
    }

    public static Label create(String text) {
        return new Label((HTMLLabelElement) DomGlobal.document.createElement("label")).text(text);
    }

    public Label forId(String id) {
        ((HTMLLabelElement) element()).htmlFor = id;
        return this;
    }
}
