package org.gwtfusion.ui.component.switcher;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Switch extends BaseComponent<Switch> {
    public static final String BASE_CLASSES = "inline-flex h-5 w-9 shrink-0 cursor-pointer items-center rounded-full border-2 border-transparent shadow-sm transition-colors focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50";
    public static final String THUMB_CLASSES = "pointer-events-none block h-4 w-4 rounded-full bg-background shadow transition-transform";
    public static final String CHECKED_CLASSES = "bg-primary";
    public static final String UNCHECKED_CLASSES = "bg-input";
    public static final String THUMB_CHECKED_CLASSES = "translate-x-4";
    public static final String THUMB_UNCHECKED_CLASSES = "translate-x-0";

    private final HTMLElement thumb;
    private boolean checked;

    private Switch(HTMLButtonElement element) {
        super(element);
        element.type = "button";
        attr("role", "switch");
        classes(BASE_CLASSES);
        thumb = (HTMLElement) DomGlobal.document.createElement("span");
        thumb.className = THUMB_CLASSES;
        element.appendChild(thumb);
        checked(false);
        onClick(event -> checked(!checked));
    }

    public static Switch create() {
        return new Switch((HTMLButtonElement) DomGlobal.document.createElement("button"));
    }

    public Switch checked(boolean checked) {
        this.checked = checked;
        aria("checked", String.valueOf(checked));
        data("state", checked ? "checked" : "unchecked");
        if (checked) {
            removeClasses(UNCHECKED_CLASSES);
            classes(CHECKED_CLASSES);
            thumb.classList.remove(THUMB_UNCHECKED_CLASSES);
            thumb.classList.add(THUMB_CHECKED_CLASSES);
        } else {
            removeClasses(CHECKED_CLASSES);
            classes(UNCHECKED_CLASSES);
            thumb.classList.remove(THUMB_CHECKED_CLASSES);
            thumb.classList.add(THUMB_UNCHECKED_CLASSES);
        }
        return this;
    }

    public boolean checked() {
        return checked;
    }

    public Switch disabled(boolean disabled) {
        ((HTMLButtonElement) element()).disabled = disabled;
        aria("disabled", String.valueOf(disabled));
        return this;
    }
}
