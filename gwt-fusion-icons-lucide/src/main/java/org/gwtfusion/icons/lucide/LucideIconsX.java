package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsX {
    private static final String[] NAMES = {"x", "x-circle", "x-line-top", "x-octagon", "x-square"};

    private LucideIconsX() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("x".equals(name)) {
            return x();
        }
        if ("x-circle".equals(name)) {
            return xCircle();
        }
        if ("x-line-top".equals(name)) {
            return xLineTop();
        }
        if ("x-octagon".equals(name)) {
            return xOctagon();
        }
        if ("x-square".equals(name)) {
            return xSquare();
        }
        return null;
    }

    static Icon x() {
        return Icon.create()
                .element("path", "d", "M18 6 6 18")
                .element("path", "d", "m6 6 12 12");
    }

    static Icon xCircle() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("path", "d", "m15 9-6 6")
                .element("path", "d", "m9 9 6 6");
    }

    static Icon xLineTop() {
        return Icon.create()
                .element("path", "d", "M18 4H6")
                .element("path", "d", "M18 8 6 20")
                .element("path", "d", "m6 8 12 12");
    }

    static Icon xOctagon() {
        return Icon.create()
                .element("path", "d", "m15 9-6 6")
                .element("path", "d", "M2.586 16.726A2 2 0 0 1 2 15.312V8.688a2 2 0 0 1 .586-1.414l4.688-4.688A2 2 0 0 1 8.688 2h6.624a2 2 0 0 1 1.414.586l4.688 4.688A2 2 0 0 1 22 8.688v6.624a2 2 0 0 1-.586 1.414l-4.688 4.688a2 2 0 0 1-1.414.586H8.688a2 2 0 0 1-1.414-.586z")
                .element("path", "d", "m9 9 6 6");
    }

    static Icon xSquare() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "m15 9-6 6")
                .element("path", "d", "m9 9 6 6");
    }
}
