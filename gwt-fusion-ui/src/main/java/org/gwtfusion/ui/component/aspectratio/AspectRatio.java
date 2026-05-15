package org.gwtfusion.ui.component.aspectratio;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class AspectRatio extends BaseComponent<AspectRatio> {
    public static final String ROOT_CLASSES = "relative w-full overflow-hidden rounded-md";
    public static final String CONTENT_CLASSES = "absolute inset-0 h-full w-full";

    private final HTMLElement content;

    private AspectRatio(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        content = (HTMLElement) DomGlobal.document.createElement("div");
        content.className = CONTENT_CLASSES;
        element.appendChild(content);
        ratio(16, 9);
    }

    public static AspectRatio create() {
        return new AspectRatio((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public AspectRatio ratio(double width, double height) {
        double safeWidth = width <= 0 ? 1 : width;
        double safeHeight = height <= 0 ? 1 : height;
        element().style.setProperty("padding-top", (safeHeight / safeWidth * 100) + "%");
        return this;
    }

    public AspectRatio add(UiComponent component) {
        content.appendChild(component.element());
        return this;
    }
}
