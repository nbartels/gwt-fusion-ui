package org.gwtfusion.ui.overlay;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLElement;
import elemental2.dom.Node;
import org.gwtfusion.ui.event.ListenerRegistration;

public final class OutsideClick {
    private OutsideClick() {
    }

    public static ListenerRegistration listen(HTMLElement boundary, EventListener listener) {
        if (boundary == null || listener == null || DomGlobal.document == null) {
            return ListenerRegistration.empty();
        }
        EventListener delegate = event -> {
            if (isOutside(boundary, event)) {
                listener.handleEvent(event);
            }
        };
        DomGlobal.document.addEventListener("mousedown", delegate, true);
        DomGlobal.document.addEventListener("touchstart", delegate, true);
        return () -> {
            DomGlobal.document.removeEventListener("mousedown", delegate, true);
            DomGlobal.document.removeEventListener("touchstart", delegate, true);
        };
    }

    public static boolean isOutside(HTMLElement boundary, Event event) {
        if (boundary == null || event == null) {
            return false;
        }
        EventTarget target = event.target;
        return !(target instanceof Node) || !boundary.contains((Node) target);
    }
}
