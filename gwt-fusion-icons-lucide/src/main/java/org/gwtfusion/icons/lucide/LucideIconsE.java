package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsE {
    private static final String[] NAMES = {"ear", "ear-off", "earth", "earth-lock", "eclipse", "edit", "edit-2", "edit-3", "egg", "egg-fried", "egg-off", "ellipse", "ellipsis", "ellipsis-vertical", "equal", "equal-approximately", "equal-not", "equal-square", "eraser", "ethernet-port", "euro", "ev-charger", "expand", "external-link", "eye", "eye-closed", "eye-off"};

    private LucideIconsE() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("ear".equals(name)) {
            return ear();
        }
        if ("ear-off".equals(name)) {
            return earOff();
        }
        if ("earth".equals(name)) {
            return earth();
        }
        if ("earth-lock".equals(name)) {
            return earthLock();
        }
        if ("eclipse".equals(name)) {
            return eclipse();
        }
        if ("edit".equals(name)) {
            return edit();
        }
        if ("edit-2".equals(name)) {
            return editN2();
        }
        if ("edit-3".equals(name)) {
            return editN3();
        }
        if ("egg".equals(name)) {
            return egg();
        }
        if ("egg-fried".equals(name)) {
            return eggFried();
        }
        if ("egg-off".equals(name)) {
            return eggOff();
        }
        if ("ellipse".equals(name)) {
            return ellipse();
        }
        if ("ellipsis".equals(name)) {
            return ellipsis();
        }
        if ("ellipsis-vertical".equals(name)) {
            return ellipsisVertical();
        }
        if ("equal".equals(name)) {
            return equal();
        }
        if ("equal-approximately".equals(name)) {
            return equalApproximately();
        }
        if ("equal-not".equals(name)) {
            return equalNot();
        }
        if ("equal-square".equals(name)) {
            return equalSquare();
        }
        if ("eraser".equals(name)) {
            return eraser();
        }
        if ("ethernet-port".equals(name)) {
            return ethernetPort();
        }
        if ("euro".equals(name)) {
            return euro();
        }
        if ("ev-charger".equals(name)) {
            return evCharger();
        }
        if ("expand".equals(name)) {
            return expand();
        }
        if ("external-link".equals(name)) {
            return externalLink();
        }
        if ("eye".equals(name)) {
            return eye();
        }
        if ("eye-closed".equals(name)) {
            return eyeClosed();
        }
        if ("eye-off".equals(name)) {
            return eyeOff();
        }
        return null;
    }

    static Icon ear() {
        return Icon.create()
                .element("path", "d", "M6 8.5a6.5 6.5 0 1 1 13 0c0 6-6 6-6 10a3.5 3.5 0 1 1-7 0")
                .element("path", "d", "M15 8.5a2.5 2.5 0 0 0-5 0v1a2 2 0 1 1 0 4");
    }

    static Icon earOff() {
        return Icon.create()
                .element("path", "d", "M6 18.5a3.5 3.5 0 1 0 7 0c0-1.57.92-2.52 2.04-3.46")
                .element("path", "d", "M6 8.5c0-.75.13-1.47.36-2.14")
                .element("path", "d", "M8.8 3.15A6.5 6.5 0 0 1 19 8.5c0 1.63-.44 2.81-1.09 3.76")
                .element("path", "d", "M12.5 6A2.5 2.5 0 0 1 15 8.5M10 13a2 2 0 0 0 1.82-1.18")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }

    static Icon earth() {
        return Icon.create()
                .element("path", "d", "M21.54 15H17a2 2 0 0 0-2 2v4.54")
                .element("path", "d", "M7 3.34V5a3 3 0 0 0 3 3a2 2 0 0 1 2 2c0 1.1.9 2 2 2a2 2 0 0 0 2-2c0-1.1.9-2 2-2h3.17")
                .element("path", "d", "M11 21.95V18a2 2 0 0 0-2-2a2 2 0 0 1-2-2v-1a2 2 0 0 0-2-2H2.05")
                .element("circle", "cx", "12", "cy", "12", "r", "10");
    }

    static Icon earthLock() {
        return Icon.create()
                .element("path", "d", "M7 3.34V5a3 3 0 0 0 3 3")
                .element("path", "d", "M11 21.95V18a2 2 0 0 0-2-2 2 2 0 0 1-2-2v-1a2 2 0 0 0-2-2H2.05")
                .element("path", "d", "M21.54 15H17a2 2 0 0 0-2 2v4.54")
                .element("path", "d", "M12 2a10 10 0 1 0 9.54 13")
                .element("path", "d", "M20 6V4a2 2 0 1 0-4 0v2")
                .element("rect", "width", "8", "height", "5", "x", "14", "y", "6", "rx", "1");
    }

    static Icon eclipse() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("path", "d", "M12 2a7 7 0 1 0 10 10");
    }

    static Icon edit() {
        return Icon.create()
                .element("path", "d", "M12 3H5a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7")
                .element("path", "d", "M18.375 2.625a1 1 0 0 1 3 3l-9.013 9.014a2 2 0 0 1-.853.505l-2.873.84a.5.5 0 0 1-.62-.62l.84-2.873a2 2 0 0 1 .506-.852z");
    }

    static Icon editN2() {
        return Icon.create()
                .element("path", "d", "M21.174 6.812a1 1 0 0 0-3.986-3.987L3.842 16.174a2 2 0 0 0-.5.83l-1.321 4.352a.5.5 0 0 0 .623.622l4.353-1.32a2 2 0 0 0 .83-.497z");
    }

    static Icon editN3() {
        return Icon.create()
                .element("path", "d", "M13 21h8")
                .element("path", "d", "M21.174 6.812a1 1 0 0 0-3.986-3.987L3.842 16.174a2 2 0 0 0-.5.83l-1.321 4.352a.5.5 0 0 0 .623.622l4.353-1.32a2 2 0 0 0 .83-.497z");
    }

    static Icon egg() {
        return Icon.create()
                .element("path", "d", "M12 2C8 2 4 8 4 14a8 8 0 0 0 16 0c0-6-4-12-8-12");
    }

    static Icon eggFried() {
        return Icon.create()
                .element("circle", "cx", "11.5", "cy", "12.5", "r", "3.5")
                .element("path", "d", "M3 8c0-3.5 2.5-6 6.5-6 5 0 4.83 3 7.5 5s5 2 5 6c0 4.5-2.5 6.5-7 6.5-2.5 0-2.5 2.5-6 2.5s-7-2-7-5.5c0-3 1.5-3 1.5-5C3.5 10 3 9 3 8Z");
    }

    static Icon eggOff() {
        return Icon.create()
                .element("path", "d", "m2 2 20 20")
                .element("path", "d", "M20 14.347V14c0-6-4-12-8-12-1.078 0-2.157.436-3.157 1.19")
                .element("path", "d", "M6.206 6.21C4.871 8.4 4 11.2 4 14a8 8 0 0 0 14.568 4.568");
    }

    static Icon ellipse() {
        return Icon.create()
                .element("ellipse", "cx", "12", "cy", "12", "rx", "10", "ry", "6");
    }

    static Icon ellipsis() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "1")
                .element("circle", "cx", "19", "cy", "12", "r", "1")
                .element("circle", "cx", "5", "cy", "12", "r", "1");
    }

    static Icon ellipsisVertical() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "1")
                .element("circle", "cx", "12", "cy", "5", "r", "1")
                .element("circle", "cx", "12", "cy", "19", "r", "1");
    }

    static Icon equal() {
        return Icon.create()
                .element("line", "x1", "5", "x2", "19", "y1", "9", "y2", "9")
                .element("line", "x1", "5", "x2", "19", "y1", "15", "y2", "15");
    }

    static Icon equalApproximately() {
        return Icon.create()
                .element("path", "d", "M5 15a6.5 6.5 0 0 1 7 0 6.5 6.5 0 0 0 7 0")
                .element("path", "d", "M5 9a6.5 6.5 0 0 1 7 0 6.5 6.5 0 0 0 7 0");
    }

    static Icon equalNot() {
        return Icon.create()
                .element("line", "x1", "5", "x2", "19", "y1", "9", "y2", "9")
                .element("line", "x1", "5", "x2", "19", "y1", "15", "y2", "15")
                .element("line", "x1", "19", "x2", "5", "y1", "5", "y2", "19");
    }

    static Icon equalSquare() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("path", "d", "M7 10h10")
                .element("path", "d", "M7 14h10");
    }

    static Icon eraser() {
        return Icon.create()
                .element("path", "d", "M21 21H8a2 2 0 0 1-1.42-.587l-3.994-3.999a2 2 0 0 1 0-2.828l10-10a2 2 0 0 1 2.829 0l5.999 6a2 2 0 0 1 0 2.828L12.834 21")
                .element("path", "d", "m5.082 11.09 8.828 8.828");
    }

    static Icon ethernetPort() {
        return Icon.create()
                .element("path", "d", "m15 20 3-3h2a2 2 0 0 0 2-2V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v9a2 2 0 0 0 2 2h2l3 3z")
                .element("path", "d", "M6 8v1")
                .element("path", "d", "M10 8v1")
                .element("path", "d", "M14 8v1")
                .element("path", "d", "M18 8v1");
    }

    static Icon euro() {
        return Icon.create()
                .element("path", "d", "M4 10h12")
                .element("path", "d", "M4 14h9")
                .element("path", "d", "M19 6a7.7 7.7 0 0 0-5.2-2A7.9 7.9 0 0 0 6 12c0 4.4 3.5 8 7.8 8 2 0 3.8-.8 5.2-2");
    }

    static Icon evCharger() {
        return Icon.create()
                .element("path", "d", "M14 13h2a2 2 0 0 1 2 2v2a2 2 0 0 0 4 0v-6.998a2 2 0 0 0-.59-1.42L18 5")
                .element("path", "d", "M14 21V5a2 2 0 0 0-2-2H5a2 2 0 0 0-2 2v16")
                .element("path", "d", "M2 21h13")
                .element("path", "d", "M3 7h11")
                .element("path", "d", "m9 11-2 3h3l-2 3");
    }

    static Icon expand() {
        return Icon.create()
                .element("path", "d", "m15 15 6 6")
                .element("path", "d", "m15 9 6-6")
                .element("path", "d", "M21 16v5h-5")
                .element("path", "d", "M21 8V3h-5")
                .element("path", "d", "M3 16v5h5")
                .element("path", "d", "m3 21 6-6")
                .element("path", "d", "M3 8V3h5")
                .element("path", "d", "M9 9 3 3");
    }

    static Icon externalLink() {
        return Icon.create()
                .element("path", "d", "M15 3h6v6")
                .element("path", "d", "M10 14 21 3")
                .element("path", "d", "M18 13v6a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h6");
    }

    static Icon eye() {
        return Icon.create()
                .element("path", "d", "M2.062 12.348a1 1 0 0 1 0-.696 10.75 10.75 0 0 1 19.876 0 1 1 0 0 1 0 .696 10.75 10.75 0 0 1-19.876 0")
                .element("circle", "cx", "12", "cy", "12", "r", "3");
    }

    static Icon eyeClosed() {
        return Icon.create()
                .element("path", "d", "m15 18-.722-3.25")
                .element("path", "d", "M2 8a10.645 10.645 0 0 0 20 0")
                .element("path", "d", "m20 15-1.726-2.05")
                .element("path", "d", "m4 15 1.726-2.05")
                .element("path", "d", "m9 18 .722-3.25");
    }

    static Icon eyeOff() {
        return Icon.create()
                .element("path", "d", "M10.733 5.076a10.744 10.744 0 0 1 11.205 6.575 1 1 0 0 1 0 .696 10.747 10.747 0 0 1-1.444 2.49")
                .element("path", "d", "M14.084 14.158a3 3 0 0 1-4.242-4.242")
                .element("path", "d", "M17.479 17.499a10.75 10.75 0 0 1-15.417-5.151 1 1 0 0 1 0-.696 10.75 10.75 0 0 1 4.446-5.143")
                .element("path", "d", "m2 2 20 20");
    }
}
