package org.gwtfusion.ui.component.tooltip;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Portal;

public final class Tooltip extends BaseComponent<Tooltip> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String CONTENT_CLASSES = "fixed left-1/2 top-1/2 z-50 max-w-xs -translate-x-1/2 -translate-y-1/2 rounded-md bg-primary px-3 py-1.5 text-xs text-primary-foreground shadow-lg";

    private final IdGenerator ids = IdGenerator.create("tooltip");
    private final String tooltipId = ids.next("content");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private HTMLElement trigger;
    private HTMLElement tooltip;
    private ListenerRegistration portal = ListenerRegistration.empty();
    private String text = "";
    private boolean open;

    private Tooltip(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Tooltip create(String text) {
        return new Tooltip((HTMLElement) DomGlobal.document.createElement("span")).label(text);
    }

    public Tooltip trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        this.trigger.setAttribute("aria-describedby", tooltipId);
        this.trigger.addEventListener("mouseenter", event -> open(true));
        this.trigger.addEventListener("focus", event -> open(true));
        this.trigger.addEventListener("mouseleave", event -> open(false));
        this.trigger.addEventListener("blur", event -> open(false));
        element().appendChild(this.trigger);
        return this;
    }

    public Tooltip label(String text) {
        this.text = text == null ? "" : text;
        return this;
    }

    public Tooltip open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        if (open) {
            mount();
        } else {
            unmount();
        }
        notifyOpenChange();
        return this;
    }

    public boolean open() {
        return open;
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        openChangeListeners.add(listener);
        return () -> openChangeListeners.remove(listener);
    }

    private void mount() {
        tooltip = (HTMLElement) DomGlobal.document.createElement("div");
        tooltip.className = CONTENT_CLASSES;
        tooltip.setAttribute("id", tooltipId);
        tooltip.setAttribute("role", "tooltip");
        tooltip.textContent = text;
        portal = Portal.appendToBody(tooltip);
    }

    private void unmount() {
        portal.remove();
        portal = ListenerRegistration.empty();
        tooltip = null;
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }
}
