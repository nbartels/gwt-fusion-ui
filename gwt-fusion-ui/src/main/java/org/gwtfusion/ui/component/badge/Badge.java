package org.gwtfusion.ui.component.badge;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Badge extends BaseComponent<Badge> {
    public static final String BASE_CLASSES = "inline-flex items-center rounded-md border px-2.5 py-0.5 text-xs font-semibold transition-colors focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";

    private BadgeVariant variant;

    private Badge(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        variant(BadgeVariant.DEFAULT);
    }

    public static Badge create(String text) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement("span");
        return new Badge(element).text(text);
    }

    public Badge variant(BadgeVariant variant) {
        if (this.variant != null) {
            removeClasses(this.variant.classes());
        }
        this.variant = variant;
        return classes(variant.classes());
    }
}
