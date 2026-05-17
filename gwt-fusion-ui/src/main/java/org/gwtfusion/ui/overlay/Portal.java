package org.gwtfusion.ui.overlay;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.event.ListenerRegistration;

public final class Portal {
    private Portal() {
    }

    public static ListenerRegistration appendToBody(HTMLElement element) {
        return append(DomGlobal.document.body, element);
    }

    public static ListenerRegistration append(Element parent, HTMLElement element) {
        if (parent == null || element == null) {
            return ListenerRegistration.empty();
        }
        parent.appendChild(element);
        return () -> {
            if (element.parentNode != null) {
                element.parentNode.removeChild(element);
            }
        };
    }
}
