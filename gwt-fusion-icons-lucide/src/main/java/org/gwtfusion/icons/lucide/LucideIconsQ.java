package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsQ {
    private static final String[] NAMES = {"qr-code", "quote"};

    private LucideIconsQ() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("qr-code".equals(name)) {
            return qrCode();
        }
        if ("quote".equals(name)) {
            return quote();
        }
        return null;
    }

    static Icon qrCode() {
        return Icon.create()
                .element("rect", "width", "5", "height", "5", "x", "3", "y", "3", "rx", "1")
                .element("rect", "width", "5", "height", "5", "x", "16", "y", "3", "rx", "1")
                .element("rect", "width", "5", "height", "5", "x", "3", "y", "16", "rx", "1")
                .element("path", "d", "M21 16h-3a2 2 0 0 0-2 2v3")
                .element("path", "d", "M21 21v.01")
                .element("path", "d", "M12 7v3a2 2 0 0 1-2 2H7")
                .element("path", "d", "M3 12h.01")
                .element("path", "d", "M12 3h.01")
                .element("path", "d", "M12 16v.01")
                .element("path", "d", "M16 12h1")
                .element("path", "d", "M21 12v.01")
                .element("path", "d", "M12 21v-1");
    }

    static Icon quote() {
        return Icon.create()
                .element("path", "d", "M16 3a2 2 0 0 0-2 2v6a2 2 0 0 0 2 2 1 1 0 0 1 1 1v1a2 2 0 0 1-2 2 1 1 0 0 0-1 1v2a1 1 0 0 0 1 1 6 6 0 0 0 6-6V5a2 2 0 0 0-2-2z")
                .element("path", "d", "M5 3a2 2 0 0 0-2 2v6a2 2 0 0 0 2 2 1 1 0 0 1 1 1v1a2 2 0 0 1-2 2 1 1 0 0 0-1 1v2a1 1 0 0 0 1 1 6 6 0 0 0 6-6V5a2 2 0 0 0-2-2z");
    }
}
