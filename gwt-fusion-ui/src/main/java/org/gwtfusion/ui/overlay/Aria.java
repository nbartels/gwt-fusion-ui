package org.gwtfusion.ui.overlay;

import elemental2.dom.HTMLElement;

public final class Aria {
    private Aria() {
    }

    public static String expanded(boolean expanded) {
        return String.valueOf(expanded);
    }

    public static String modal(boolean modal) {
        return String.valueOf(modal);
    }

    public static String selected(boolean selected) {
        return String.valueOf(selected);
    }

    public static String controls(String id) {
        return emptyToNull(id);
    }

    public static String labelledBy(String id) {
        return emptyToNull(id);
    }

    public static void buttonPopup(HTMLElement trigger, String popup, String controlsId, boolean expanded) {
        if (trigger == null) {
            return;
        }
        trigger.setAttribute("aria-haspopup", popup == null || popup.isEmpty() ? "dialog" : popup);
        set(trigger, "aria-controls", controls(controlsId));
        trigger.setAttribute("aria-expanded", expanded(expanded));
    }

    public static void dialog(HTMLElement element, String labelledBy, boolean modal) {
        if (element == null) {
            return;
        }
        element.setAttribute("role", "dialog");
        element.setAttribute("aria-modal", modal(modal));
        set(element, "aria-labelledby", labelledBy(labelledBy));
    }

    public static void set(HTMLElement element, String name, String value) {
        if (element == null || name == null || name.isEmpty()) {
            return;
        }
        if (value == null || value.isEmpty()) {
            element.removeAttribute(name);
        } else {
            element.setAttribute(name, value);
        }
    }

    private static String emptyToNull(String value) {
        return value == null || value.isEmpty() ? null : value;
    }
}
