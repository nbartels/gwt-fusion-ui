package org.gwtfusion.ui.overlay;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;

public final class FocusManager {
    private FocusManager() {
    }

    public static int firstIndex(int size) {
        return size <= 0 ? -1 : 0;
    }

    public static int lastIndex(int size) {
        return size <= 0 ? -1 : size - 1;
    }

    public static int nextIndex(int current, int size) {
        return Keyboard.nextIndex(current, size);
    }

    public static int previousIndex(int current, int size) {
        return Keyboard.previousIndex(current, size);
    }

    public static HTMLElement activeElement() {
        Element active = DomGlobal.document == null ? null : DomGlobal.document.activeElement;
        return active instanceof HTMLElement ? (HTMLElement) active : null;
    }

    public static void focus(HTMLElement element) {
        if (element != null) {
            element.focus();
        }
    }

    public static void focusFirst(HTMLElement... elements) {
        HTMLElement element = firstFocusable(elements);
        if (element != null) {
            element.focus();
        }
    }

    public static HTMLElement firstFocusable(HTMLElement... elements) {
        if (elements == null) {
            return null;
        }
        for (HTMLElement element : elements) {
            if (element != null && !"true".equals(element.getAttribute("aria-hidden"))) {
                return element;
            }
        }
        return null;
    }
}
