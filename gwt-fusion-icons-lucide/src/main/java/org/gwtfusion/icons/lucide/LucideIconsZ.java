package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsZ {
    private static final String[] NAMES = {"zap", "zap-off", "zodiac-aquarius", "zodiac-aries", "zodiac-cancer", "zodiac-capricorn", "zodiac-gemini", "zodiac-leo", "zodiac-libra", "zodiac-ophiuchus", "zodiac-pisces", "zodiac-sagittarius", "zodiac-scorpio", "zodiac-taurus", "zodiac-virgo", "zoom-in", "zoom-out"};

    private LucideIconsZ() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("zap".equals(name)) {
            return zap();
        }
        if ("zap-off".equals(name)) {
            return zapOff();
        }
        if ("zodiac-aquarius".equals(name)) {
            return zodiacAquarius();
        }
        if ("zodiac-aries".equals(name)) {
            return zodiacAries();
        }
        if ("zodiac-cancer".equals(name)) {
            return zodiacCancer();
        }
        if ("zodiac-capricorn".equals(name)) {
            return zodiacCapricorn();
        }
        if ("zodiac-gemini".equals(name)) {
            return zodiacGemini();
        }
        if ("zodiac-leo".equals(name)) {
            return zodiacLeo();
        }
        if ("zodiac-libra".equals(name)) {
            return zodiacLibra();
        }
        if ("zodiac-ophiuchus".equals(name)) {
            return zodiacOphiuchus();
        }
        if ("zodiac-pisces".equals(name)) {
            return zodiacPisces();
        }
        if ("zodiac-sagittarius".equals(name)) {
            return zodiacSagittarius();
        }
        if ("zodiac-scorpio".equals(name)) {
            return zodiacScorpio();
        }
        if ("zodiac-taurus".equals(name)) {
            return zodiacTaurus();
        }
        if ("zodiac-virgo".equals(name)) {
            return zodiacVirgo();
        }
        if ("zoom-in".equals(name)) {
            return zoomIn();
        }
        if ("zoom-out".equals(name)) {
            return zoomOut();
        }
        return null;
    }

    static Icon zap() {
        return Icon.create()
                .element("path", "d", "M4 14a1 1 0 0 1-.78-1.63l9.9-10.2a.5.5 0 0 1 .86.46l-1.92 6.02A1 1 0 0 0 13 10h7a1 1 0 0 1 .78 1.63l-9.9 10.2a.5.5 0 0 1-.86-.46l1.92-6.02A1 1 0 0 0 11 14z");
    }

    static Icon zapOff() {
        return Icon.create()
                .element("path", "d", "M10.513 4.856 13.12 2.17a.5.5 0 0 1 .86.46l-1.377 4.317")
                .element("path", "d", "M15.656 10H20a1 1 0 0 1 .78 1.63l-1.72 1.773")
                .element("path", "d", "M16.273 16.273 10.88 21.83a.5.5 0 0 1-.86-.46l1.92-6.02A1 1 0 0 0 11 14H4a1 1 0 0 1-.78-1.63l4.507-4.643")
                .element("path", "d", "m2 2 20 20");
    }

    static Icon zodiacAquarius() {
        return Icon.create()
                .element("path", "d", "m2 10 2.456-3.684a.7.7 0 0 1 1.106-.013l2.39 3.413a.7.7 0 0 0 1.096-.001l2.402-3.432a.7.7 0 0 1 1.098 0l2.402 3.432a.7.7 0 0 0 1.098 0l2.389-3.413a.7.7 0 0 1 1.106.013L22 10")
                .element("path", "d", "m2 18.002 2.456-3.684a.7.7 0 0 1 1.106-.013l2.39 3.413a.7.7 0 0 0 1.097 0l2.402-3.432a.7.7 0 0 1 1.098 0l2.402 3.432a.7.7 0 0 0 1.098 0l2.389-3.413a.7.7 0 0 1 1.106.013L22 18.002");
    }

    static Icon zodiacAries() {
        return Icon.create()
                .element("path", "d", "M12 7.5a4.5 4.5 0 1 1 5 4.5")
                .element("path", "d", "M7 12a4.5 4.5 0 1 1 5-4.5V21");
    }

    static Icon zodiacCancer() {
        return Icon.create()
                .element("path", "d", "M21 14.5A9 6.5 0 0 1 5.5 19")
                .element("path", "d", "M3 9.5A9 6.5 0 0 1 18.5 5")
                .element("circle", "cx", "17.5", "cy", "14.5", "r", "3.5")
                .element("circle", "cx", "6.5", "cy", "9.5", "r", "3.5");
    }

    static Icon zodiacCapricorn() {
        return Icon.create()
                .element("path", "d", "M11 21a3 3 0 0 0 3-3V6.5a1 1 0 0 0-7 0")
                .element("path", "d", "M7 19V6a3 3 0 0 0-3-3h0")
                .element("circle", "cx", "17", "cy", "17", "r", "3");
    }

    static Icon zodiacGemini() {
        return Icon.create()
                .element("path", "d", "M16 4.525v14.948")
                .element("path", "d", "M20 3A17 17 0 0 1 4 3")
                .element("path", "d", "M4 21a17 17 0 0 1 16 0")
                .element("path", "d", "M8 4.525v14.948");
    }

    static Icon zodiacLeo() {
        return Icon.create()
                .element("path", "d", "M10 16c0-4-3-4.5-3-8a5 5 0 0 1 10 0c0 3.466-3 6.196-3 10a3 3 0 0 0 6 0")
                .element("circle", "cx", "7", "cy", "16", "r", "3");
    }

    static Icon zodiacLibra() {
        return Icon.create()
                .element("path", "d", "M3 16h6.857c.162-.012.19-.323.038-.38a6 6 0 1 1 4.212 0c-.153.057-.125.368.038.38H21")
                .element("path", "d", "M3 20h18");
    }

    static Icon zodiacOphiuchus() {
        return Icon.create()
                .element("path", "d", "M3 10A6.06 6.06 0 0 1 12 10 A6.06 6.06 0 0 0 21 10")
                .element("path", "d", "M6 3v12a6 6 0 0 0 12 0V3");
    }

    static Icon zodiacPisces() {
        return Icon.create()
                .element("path", "d", "M19 21a15 15 0 0 1 0-18")
                .element("path", "d", "M20 12H4")
                .element("path", "d", "M5 3a15 15 0 0 1 0 18");
    }

    static Icon zodiacSagittarius() {
        return Icon.create()
                .element("path", "d", "M15 3h6v6")
                .element("path", "d", "M21 3 3 21")
                .element("path", "d", "m9 9 6 6");
    }

    static Icon zodiacScorpio() {
        return Icon.create()
                .element("path", "d", "M10 19V5.5a1 1 0 0 1 5 0V17a2 2 0 0 0 2 2h5l-3-3")
                .element("path", "d", "m22 19-3 3")
                .element("path", "d", "M5 19V5.5a1 1 0 0 1 5 0")
                .element("path", "d", "M5 5.5A2.5 2.5 0 0 0 2.5 3");
    }

    static Icon zodiacTaurus() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "15", "r", "6")
                .element("path", "d", "M18 3A6 6 0 0 1 6 3");
    }

    static Icon zodiacVirgo() {
        return Icon.create()
                .element("path", "d", "M11 5.5a1 1 0 0 1 5 0V16a5 5 0 0 0 5 5")
                .element("path", "d", "M16 11.5a1 1 0 0 1 5 0V16a5 5 0 0 1-5 5")
                .element("path", "d", "M6 19V6a3 3 0 0 0-3-3h0")
                .element("path", "d", "M6 5.5a1 1 0 0 1 5 0V19");
    }

    static Icon zoomIn() {
        return Icon.create()
                .element("circle", "cx", "11", "cy", "11", "r", "8")
                .element("line", "x1", "21", "x2", "16.65", "y1", "21", "y2", "16.65")
                .element("line", "x1", "11", "x2", "11", "y1", "8", "y2", "14")
                .element("line", "x1", "8", "x2", "14", "y1", "11", "y2", "11");
    }

    static Icon zoomOut() {
        return Icon.create()
                .element("circle", "cx", "11", "cy", "11", "r", "8")
                .element("line", "x1", "21", "x2", "16.65", "y1", "21", "y2", "16.65")
                .element("line", "x1", "8", "x2", "14", "y1", "11", "y2", "11");
    }
}
