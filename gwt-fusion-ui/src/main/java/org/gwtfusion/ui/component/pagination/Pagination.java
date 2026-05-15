package org.gwtfusion.ui.component.pagination;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Pagination extends BaseComponent<Pagination> {
    public static final String NAV_CLASSES = "flex items-center justify-center";
    public static final String LIST_CLASSES = "flex flex-row items-center gap-1";
    public static final String LINK_CLASSES = "inline-flex h-9 min-w-9 items-center justify-center rounded-md px-3 text-sm font-medium transition-colors hover:bg-accent hover:text-accent-foreground";
    public static final String ACTIVE_CLASSES = "border border-input bg-background shadow-sm";

    private final HTMLElement list;

    private Pagination(HTMLElement element) {
        super(element);
        classes(NAV_CLASSES);
        attr("aria-label", "Pagination");
        list = (HTMLElement) DomGlobal.document.createElement("div");
        list.className = LIST_CLASSES;
        element.appendChild(list);
    }

    public static Pagination create() {
        return new Pagination((HTMLElement) DomGlobal.document.createElement("nav"));
    }

    public Pagination previous(String href) {
        return link("Previous", href, false);
    }

    public Pagination page(int page, String href, boolean active) {
        return link(String.valueOf(page), href, active);
    }

    public Pagination next(String href) {
        return link("Next", href, false);
    }

    private Pagination link(String label, String href, boolean active) {
        HTMLElement link = (HTMLElement) DomGlobal.document.createElement("a");
        link.className = active ? LINK_CLASSES + " " + ACTIVE_CLASSES : LINK_CLASSES;
        link.setAttribute("href", href == null ? "#" : href);
        if (active) {
            link.setAttribute("aria-current", "page");
        }
        link.textContent = label;
        list.appendChild(link);
        return this;
    }
}
