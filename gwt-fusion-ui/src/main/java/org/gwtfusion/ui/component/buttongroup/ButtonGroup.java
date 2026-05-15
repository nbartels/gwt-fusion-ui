package org.gwtfusion.ui.component.buttongroup;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class ButtonGroup extends BaseComponent<ButtonGroup> {
    public static final String BASE_CLASSES = "inline-flex items-center rounded-md shadow-sm";

    private ButtonGroup(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        attr("role", "group");
    }

    public static ButtonGroup create() {
        return new ButtonGroup((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public ButtonGroup add(UiComponent component) {
        element().appendChild(component.element());
        return this;
    }
}
