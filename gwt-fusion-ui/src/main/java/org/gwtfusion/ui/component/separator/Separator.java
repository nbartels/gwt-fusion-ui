package org.gwtfusion.ui.component.separator;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Separator extends BaseComponent<Separator> {
    private SeparatorOrientation orientation;

    private Separator(HTMLElement element) {
        super(element);
        classes("shrink-0 bg-border");
        orientation(SeparatorOrientation.HORIZONTAL);
    }

    public static Separator create() {
        return new Separator((HTMLElement) DomGlobal.document.createElement("div"))
                .attr("role", "separator");
    }

    public Separator orientation(SeparatorOrientation orientation) {
        if (this.orientation != null) {
            removeClasses(this.orientation.classes());
        }
        this.orientation = orientation;
        attr("aria-orientation", orientation.name().toLowerCase());
        return classes(orientation.classes());
    }
}
