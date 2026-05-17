package org.gwtfusion.ui.component.hovercard;

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

public final class HoverCard extends BaseComponent<HoverCard> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String CONTENT_CLASSES = "fixed left-1/2 top-1/2 z-50 grid w-80 -translate-x-1/2 -translate-y-1/2 gap-3 rounded-md border border-border bg-background p-4 text-sm text-foreground shadow-lg";

    private final IdGenerator ids = IdGenerator.create("hover-card");
    private final String contentId = ids.next("content");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private HTMLElement trigger;
    private HTMLElement card;
    private UiComponent content;
    private ListenerRegistration portal = ListenerRegistration.empty();
    private boolean open;

    private HoverCard(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static HoverCard create() {
        return new HoverCard((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public HoverCard trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        this.trigger.setAttribute("aria-describedby", contentId);
        this.trigger.addEventListener("mouseenter", event -> open(true));
        this.trigger.addEventListener("focus", event -> open(true));
        this.trigger.addEventListener("mouseleave", event -> open(false));
        this.trigger.addEventListener("blur", event -> open(false));
        element().appendChild(this.trigger);
        return this;
    }

    public HoverCard content(UiComponent content) {
        this.content = content;
        return this;
    }

    public HoverCard open(boolean open) {
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
        card = (HTMLElement) DomGlobal.document.createElement("div");
        card.className = CONTENT_CLASSES;
        card.setAttribute("id", contentId);
        card.setAttribute("role", "dialog");
        if (content != null) {
            card.appendChild(content.element());
        }
        portal = Portal.appendToBody(card);
    }

    private void unmount() {
        portal.remove();
        portal = ListenerRegistration.empty();
        card = null;
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }
}
