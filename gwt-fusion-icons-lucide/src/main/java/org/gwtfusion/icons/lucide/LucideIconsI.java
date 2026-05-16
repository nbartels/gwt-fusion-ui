package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsI {
    private static final String[] NAMES = {"ice-cream", "ice-cream-2", "ice-cream-bowl", "ice-cream-cone", "id-card", "id-card-lanyard", "image", "image-down", "image-minus", "image-off", "image-play", "image-plus", "image-up", "image-upscale", "images", "import", "inbox", "indent", "indent-decrease", "indent-increase", "indian-rupee", "infinity", "info", "inspect", "inspection-panel", "italic", "iteration-ccw", "iteration-cw"};

    private LucideIconsI() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("ice-cream".equals(name)) {
            return iceCream();
        }
        if ("ice-cream-2".equals(name)) {
            return iceCreamN2();
        }
        if ("ice-cream-bowl".equals(name)) {
            return iceCreamBowl();
        }
        if ("ice-cream-cone".equals(name)) {
            return iceCreamCone();
        }
        if ("id-card".equals(name)) {
            return idCard();
        }
        if ("id-card-lanyard".equals(name)) {
            return idCardLanyard();
        }
        if ("image".equals(name)) {
            return image();
        }
        if ("image-down".equals(name)) {
            return imageDown();
        }
        if ("image-minus".equals(name)) {
            return imageMinus();
        }
        if ("image-off".equals(name)) {
            return imageOff();
        }
        if ("image-play".equals(name)) {
            return imagePlay();
        }
        if ("image-plus".equals(name)) {
            return imagePlus();
        }
        if ("image-up".equals(name)) {
            return imageUp();
        }
        if ("image-upscale".equals(name)) {
            return imageUpscale();
        }
        if ("images".equals(name)) {
            return images();
        }
        if ("import".equals(name)) {
            return importIcon();
        }
        if ("inbox".equals(name)) {
            return inbox();
        }
        if ("indent".equals(name)) {
            return indent();
        }
        if ("indent-decrease".equals(name)) {
            return indentDecrease();
        }
        if ("indent-increase".equals(name)) {
            return indentIncrease();
        }
        if ("indian-rupee".equals(name)) {
            return indianRupee();
        }
        if ("infinity".equals(name)) {
            return infinity();
        }
        if ("info".equals(name)) {
            return info();
        }
        if ("inspect".equals(name)) {
            return inspect();
        }
        if ("inspection-panel".equals(name)) {
            return inspectionPanel();
        }
        if ("italic".equals(name)) {
            return italic();
        }
        if ("iteration-ccw".equals(name)) {
            return iterationCcw();
        }
        if ("iteration-cw".equals(name)) {
            return iterationCw();
        }
        return null;
    }

    static Icon iceCream() {
        return Icon.create()
                .element("path", "d", "m7 11 4.08 10.35a1 1 0 0 0 1.84 0L17 11")
                .element("path", "d", "M17 7A5 5 0 0 0 7 7")
                .element("path", "d", "M17 7a2 2 0 0 1 0 4H7a2 2 0 0 1 0-4");
    }

    static Icon iceCreamN2() {
        return Icon.create()
                .element("path", "d", "M12 17c5 0 8-2.69 8-6H4c0 3.31 3 6 8 6m-4 4h8m-4-3v3M5.14 11a3.5 3.5 0 1 1 6.71 0")
                .element("path", "d", "M12.14 11a3.5 3.5 0 1 1 6.71 0")
                .element("path", "d", "M15.5 6.5a3.5 3.5 0 1 0-7 0");
    }

    static Icon iceCreamBowl() {
        return Icon.create()
                .element("path", "d", "M12 17c5 0 8-2.69 8-6H4c0 3.31 3 6 8 6m-4 4h8m-4-3v3M5.14 11a3.5 3.5 0 1 1 6.71 0")
                .element("path", "d", "M12.14 11a3.5 3.5 0 1 1 6.71 0")
                .element("path", "d", "M15.5 6.5a3.5 3.5 0 1 0-7 0");
    }

    static Icon iceCreamCone() {
        return Icon.create()
                .element("path", "d", "m7 11 4.08 10.35a1 1 0 0 0 1.84 0L17 11")
                .element("path", "d", "M17 7A5 5 0 0 0 7 7")
                .element("path", "d", "M17 7a2 2 0 0 1 0 4H7a2 2 0 0 1 0-4");
    }

    static Icon idCard() {
        return Icon.create()
                .element("path", "d", "M16 10h2")
                .element("path", "d", "M16 14h2")
                .element("path", "d", "M6.17 15a3 3 0 0 1 5.66 0")
                .element("circle", "cx", "9", "cy", "11", "r", "2")
                .element("rect", "x", "2", "y", "5", "width", "20", "height", "14", "rx", "2");
    }

    static Icon idCardLanyard() {
        return Icon.create()
                .element("path", "d", "M13.5 8h-3")
                .element("path", "d", "m15 2-1 2h3a2 2 0 0 1 2 2v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2h3")
                .element("path", "d", "M16.899 22A5 5 0 0 0 7.1 22")
                .element("path", "d", "m9 2 3 6")
                .element("circle", "cx", "12", "cy", "15", "r", "3");
    }

    static Icon image() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("circle", "cx", "9", "cy", "9", "r", "2")
                .element("path", "d", "m21 15-3.086-3.086a2 2 0 0 0-2.828 0L6 21");
    }

    static Icon imageDown() {
        return Icon.create()
                .element("path", "d", "M10.3 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2v10l-3.1-3.1a2 2 0 0 0-2.814.014L6 21")
                .element("path", "d", "m14 19 3 3v-5.5")
                .element("path", "d", "m17 22 3-3")
                .element("circle", "cx", "9", "cy", "9", "r", "2");
    }

    static Icon imageMinus() {
        return Icon.create()
                .element("path", "d", "M21 9v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h7")
                .element("line", "x1", "16", "x2", "22", "y1", "5", "y2", "5")
                .element("circle", "cx", "9", "cy", "9", "r", "2")
                .element("path", "d", "m21 15-3.086-3.086a2 2 0 0 0-2.828 0L6 21");
    }

    static Icon imageOff() {
        return Icon.create()
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22")
                .element("path", "d", "M10.41 10.41a2 2 0 1 1-2.83-2.83")
                .element("line", "x1", "13.5", "x2", "6", "y1", "13.5", "y2", "21")
                .element("line", "x1", "18", "x2", "21", "y1", "12", "y2", "15")
                .element("path", "d", "M3.59 3.59A1.99 1.99 0 0 0 3 5v14a2 2 0 0 0 2 2h14c.55 0 1.052-.22 1.41-.59")
                .element("path", "d", "M21 15V5a2 2 0 0 0-2-2H9");
    }

    static Icon imagePlay() {
        return Icon.create()
                .element("path", "d", "M15 15.003a1 1 0 0 1 1.517-.859l4.997 2.997a1 1 0 0 1 0 1.718l-4.997 2.997a1 1 0 0 1-1.517-.86z")
                .element("path", "d", "M21 12.17V5a2 2 0 0 0-2-2H5a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h6")
                .element("path", "d", "m6 21 5-5")
                .element("circle", "cx", "9", "cy", "9", "r", "2");
    }

    static Icon imagePlus() {
        return Icon.create()
                .element("path", "d", "M16 5h6")
                .element("path", "d", "M19 2v6")
                .element("path", "d", "M21 11.5V19a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h7.5")
                .element("path", "d", "m21 15-3.086-3.086a2 2 0 0 0-2.828 0L6 21")
                .element("circle", "cx", "9", "cy", "9", "r", "2");
    }

    static Icon imageUp() {
        return Icon.create()
                .element("path", "d", "M10.3 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2v10l-3.1-3.1a2 2 0 0 0-2.814.014L6 21")
                .element("path", "d", "m14 19.5 3-3 3 3")
                .element("path", "d", "M17 22v-5.5")
                .element("circle", "cx", "9", "cy", "9", "r", "2");
    }

    static Icon imageUpscale() {
        return Icon.create()
                .element("path", "d", "M16 3h5v5")
                .element("path", "d", "M17 21h2a2 2 0 0 0 2-2")
                .element("path", "d", "M21 12v3")
                .element("path", "d", "m21 3-5 5")
                .element("path", "d", "M3 7V5a2 2 0 0 1 2-2")
                .element("path", "d", "m5 21 4.144-4.144a1.21 1.21 0 0 1 1.712 0L13 19")
                .element("path", "d", "M9 3h3")
                .element("rect", "x", "3", "y", "11", "width", "10", "height", "10", "rx", "1");
    }

    static Icon images() {
        return Icon.create()
                .element("path", "d", "m22 11-1.296-1.296a2.4 2.4 0 0 0-3.408 0L11 16")
                .element("path", "d", "M4 8a2 2 0 0 0-2 2v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2")
                .element("circle", "cx", "13", "cy", "7", "r", "1", "fill", "currentColor")
                .element("rect", "x", "8", "y", "2", "width", "14", "height", "14", "rx", "2");
    }

    static Icon importIcon() {
        return Icon.create()
                .element("path", "d", "M12 3v12")
                .element("path", "d", "m8 11 4 4 4-4")
                .element("path", "d", "M8 5H4a2 2 0 0 0-2 2v10a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V7a2 2 0 0 0-2-2h-4");
    }

    static Icon inbox() {
        return Icon.create()
                .element("polyline", "points", "22 12 16 12 14 15 10 15 8 12 2 12")
                .element("path", "d", "M5.45 5.11 2 12v6a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2v-6l-3.45-6.89A2 2 0 0 0 16.76 4H7.24a2 2 0 0 0-1.79 1.11z");
    }

    static Icon indent() {
        return Icon.create()
                .element("path", "d", "M21 5H11")
                .element("path", "d", "M21 12H11")
                .element("path", "d", "M21 19H11")
                .element("path", "d", "m3 8 4 4-4 4");
    }

    static Icon indentDecrease() {
        return Icon.create()
                .element("path", "d", "M21 5H11")
                .element("path", "d", "M21 12H11")
                .element("path", "d", "M21 19H11")
                .element("path", "d", "m7 8-4 4 4 4");
    }

    static Icon indentIncrease() {
        return Icon.create()
                .element("path", "d", "M21 5H11")
                .element("path", "d", "M21 12H11")
                .element("path", "d", "M21 19H11")
                .element("path", "d", "m3 8 4 4-4 4");
    }

    static Icon indianRupee() {
        return Icon.create()
                .element("path", "d", "M6 3h12")
                .element("path", "d", "M6 8h12")
                .element("path", "d", "m6 13 8.5 8")
                .element("path", "d", "M6 13h3")
                .element("path", "d", "M9 13c6.667 0 6.667-10 0-10");
    }

    static Icon infinity() {
        return Icon.create()
                .element("path", "d", "M6 16c5 0 7-8 12-8a4 4 0 0 1 0 8c-5 0-7-8-12-8a4 4 0 1 0 0 8");
    }

    static Icon info() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("path", "d", "M12 16v-4")
                .element("path", "d", "M12 8h.01");
    }

    static Icon inspect() {
        return Icon.create()
                .element("path", "d", "M12.034 12.681a.498.498 0 0 1 .647-.647l9 3.5a.5.5 0 0 1-.033.943l-3.444 1.068a1 1 0 0 0-.66.66l-1.067 3.443a.5.5 0 0 1-.943.033z")
                .element("path", "d", "M21 11V5a2 2 0 0 0-2-2H5a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h6");
    }

    static Icon inspectionPanel() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("path", "d", "M7 7h.01")
                .element("path", "d", "M17 7h.01")
                .element("path", "d", "M7 17h.01")
                .element("path", "d", "M17 17h.01");
    }

    static Icon italic() {
        return Icon.create()
                .element("line", "x1", "19", "x2", "10", "y1", "4", "y2", "4")
                .element("line", "x1", "14", "x2", "5", "y1", "20", "y2", "20")
                .element("line", "x1", "15", "x2", "9", "y1", "4", "y2", "20");
    }

    static Icon iterationCcw() {
        return Icon.create()
                .element("path", "d", "m16 14 4 4-4 4")
                .element("path", "d", "M20 10a8 8 0 1 0-8 8h8");
    }

    static Icon iterationCw() {
        return Icon.create()
                .element("path", "d", "M4 10a8 8 0 1 1 8 8H4")
                .element("path", "d", "m8 22-4-4 4-4");
    }
}
