package org.gwtfusion.ui.component.scrollarea;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class ScrollArea extends BaseComponent<ScrollArea> {
    public static final String BASE_CLASSES = "overflow-auto rounded-md border bg-background p-4";

    private ScrollArea(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static ScrollArea create() {
        return new ScrollArea((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public ScrollArea height(int px) {
        element().style.setProperty("max-height", Math.max(0, px) + "px");
        return this;
    }

    public ScrollArea add(UiComponent component) {
        element().appendChild(component.element());
        return this;
    }
}
