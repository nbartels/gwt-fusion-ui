package org.gwtfusion.ui.overlay;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;

public final class OverlayLayer extends BaseComponent<OverlayLayer> {
    public static final String ROOT_CLASSES = "fixed inset-0 z-50 flex items-center justify-center pointer-events-none";
    public static final String SURFACE_CLASSES = "pointer-events-auto";

    private final HTMLElement surface;

    private OverlayLayer(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        surface = (HTMLElement) DomGlobal.document.createElement("div");
        surface.className = SURFACE_CLASSES;
        element.appendChild(surface);
    }

    public static OverlayLayer create() {
        return new OverlayLayer((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public OverlayLayer add(UiComponent component) {
        if (component != null) {
            surface.appendChild(component.element());
        }
        return this;
    }

    public HTMLElement surface() {
        return surface;
    }
}
