package org.gwtfusion.ui.component.breadcrumb;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Breadcrumb extends BaseComponent<Breadcrumb> {
    public static final String NAV_CLASSES = "flex";
    public static final String LIST_CLASSES = "flex flex-wrap items-center gap-2 text-sm text-muted-foreground";
    public static final String LINK_CLASSES = "transition-colors hover:text-foreground";
    public static final String CURRENT_CLASSES = "font-medium text-foreground";
    public static final String SEPARATOR_CLASSES = "text-muted-foreground";

    private final HTMLElement list;
    private boolean empty = true;

    private Breadcrumb(HTMLElement element) {
        super(element);
        classes(NAV_CLASSES);
        attr("aria-label", "Breadcrumb");
        list = (HTMLElement) DomGlobal.document.createElement("ol");
        list.className = LIST_CLASSES;
        element.appendChild(list);
    }

    public static Breadcrumb create() {
        return new Breadcrumb((HTMLElement) DomGlobal.document.createElement("nav"));
    }

    public Breadcrumb link(String label, String href) {
        addSeparatorIfNeeded();
        HTMLElement item = item();
        HTMLElement link = (HTMLElement) DomGlobal.document.createElement("a");
        link.className = LINK_CLASSES;
        link.setAttribute("href", href == null ? "#" : href);
        link.textContent = label == null ? "" : label;
        item.appendChild(link);
        list.appendChild(item);
        empty = false;
        return this;
    }

    public Breadcrumb current(String label) {
        addSeparatorIfNeeded();
        HTMLElement item = item();
        HTMLElement current = (HTMLElement) DomGlobal.document.createElement("span");
        current.className = CURRENT_CLASSES;
        current.setAttribute("aria-current", "page");
        current.textContent = label == null ? "" : label;
        item.appendChild(current);
        list.appendChild(item);
        empty = false;
        return this;
    }

    private HTMLElement item() {
        return (HTMLElement) DomGlobal.document.createElement("li");
    }

    private void addSeparatorIfNeeded() {
        if (empty) {
            return;
        }
        HTMLElement separator = item();
        separator.className = SEPARATOR_CLASSES;
        separator.setAttribute("aria-hidden", "true");
        separator.textContent = "/";
        list.appendChild(separator);
    }
}
