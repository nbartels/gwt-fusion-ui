package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsV {
    private static final String[] NAMES = {"van", "variable", "vault", "vector-square", "vegan", "venetian-mask", "venus", "venus-and-mars", "verified", "vibrate", "vibrate-off", "video", "video-off", "videotape", "view", "voicemail", "volleyball", "volume", "volume-1", "volume-2", "volume-off", "volume-x", "vote"};

    private LucideIconsV() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("van".equals(name)) {
            return van();
        }
        if ("variable".equals(name)) {
            return variable();
        }
        if ("vault".equals(name)) {
            return vault();
        }
        if ("vector-square".equals(name)) {
            return vectorSquare();
        }
        if ("vegan".equals(name)) {
            return vegan();
        }
        if ("venetian-mask".equals(name)) {
            return venetianMask();
        }
        if ("venus".equals(name)) {
            return venus();
        }
        if ("venus-and-mars".equals(name)) {
            return venusAndMars();
        }
        if ("verified".equals(name)) {
            return verified();
        }
        if ("vibrate".equals(name)) {
            return vibrate();
        }
        if ("vibrate-off".equals(name)) {
            return vibrateOff();
        }
        if ("video".equals(name)) {
            return video();
        }
        if ("video-off".equals(name)) {
            return videoOff();
        }
        if ("videotape".equals(name)) {
            return videotape();
        }
        if ("view".equals(name)) {
            return view();
        }
        if ("voicemail".equals(name)) {
            return voicemail();
        }
        if ("volleyball".equals(name)) {
            return volleyball();
        }
        if ("volume".equals(name)) {
            return volume();
        }
        if ("volume-1".equals(name)) {
            return volumeN1();
        }
        if ("volume-2".equals(name)) {
            return volumeN2();
        }
        if ("volume-off".equals(name)) {
            return volumeOff();
        }
        if ("volume-x".equals(name)) {
            return volumeX();
        }
        if ("vote".equals(name)) {
            return vote();
        }
        return null;
    }

    static Icon van() {
        return Icon.create()
                .element("path", "d", "M13 6v5a1 1 0 0 0 1 1h6.102a1 1 0 0 1 .712.298l.898.91a1 1 0 0 1 .288.702V17a1 1 0 0 1-1 1h-3")
                .element("path", "d", "M5 18H3a1 1 0 0 1-1-1V8a2 2 0 0 1 2-2h12c1.1 0 2.1.8 2.4 1.8l1.176 4.2")
                .element("path", "d", "M9 18h5")
                .element("circle", "cx", "16", "cy", "18", "r", "2")
                .element("circle", "cx", "7", "cy", "18", "r", "2");
    }

    static Icon variable() {
        return Icon.create()
                .element("path", "d", "M8 21s-4-3-4-9 4-9 4-9")
                .element("path", "d", "M16 3s4 3 4 9-4 9-4 9")
                .element("line", "x1", "15", "x2", "9", "y1", "9", "y2", "15")
                .element("line", "x1", "9", "x2", "15", "y1", "9", "y2", "15");
    }

    static Icon vault() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("circle", "cx", "7.5", "cy", "7.5", "r", ".5", "fill", "currentColor")
                .element("path", "d", "m7.9 7.9 2.7 2.7")
                .element("circle", "cx", "16.5", "cy", "7.5", "r", ".5", "fill", "currentColor")
                .element("path", "d", "m13.4 10.6 2.7-2.7")
                .element("circle", "cx", "7.5", "cy", "16.5", "r", ".5", "fill", "currentColor")
                .element("path", "d", "m7.9 16.1 2.7-2.7")
                .element("circle", "cx", "16.5", "cy", "16.5", "r", ".5", "fill", "currentColor")
                .element("path", "d", "m13.4 13.4 2.7 2.7")
                .element("circle", "cx", "12", "cy", "12", "r", "2");
    }

    static Icon vectorSquare() {
        return Icon.create()
                .element("path", "d", "M19.5 7a24 24 0 0 1 0 10")
                .element("path", "d", "M4.5 7a24 24 0 0 0 0 10")
                .element("path", "d", "M7 19.5a24 24 0 0 0 10 0")
                .element("path", "d", "M7 4.5a24 24 0 0 1 10 0")
                .element("rect", "x", "17", "y", "17", "width", "5", "height", "5", "rx", "1")
                .element("rect", "x", "17", "y", "2", "width", "5", "height", "5", "rx", "1")
                .element("rect", "x", "2", "y", "17", "width", "5", "height", "5", "rx", "1")
                .element("rect", "x", "2", "y", "2", "width", "5", "height", "5", "rx", "1");
    }

    static Icon vegan() {
        return Icon.create()
                .element("path", "d", "M16 8q6 0 6-6-6 0-6 6")
                .element("path", "d", "M17.41 3.59a10 10 0 1 0 3 3")
                .element("path", "d", "M2 2a26.6 26.6 0 0 1 10 20c.9-6.82 1.5-9.5 4-14");
    }

    static Icon venetianMask() {
        return Icon.create()
                .element("path", "d", "M18 11c-1.5 0-2.5.5-3 2")
                .element("path", "d", "M4 6a2 2 0 0 0-2 2v4a5 5 0 0 0 5 5 8 8 0 0 1 5 2 8 8 0 0 1 5-2 5 5 0 0 0 5-5V8a2 2 0 0 0-2-2h-3a8 8 0 0 0-5 2 8 8 0 0 0-5-2z")
                .element("path", "d", "M6 11c1.5 0 2.5.5 3 2");
    }

    static Icon venus() {
        return Icon.create()
                .element("path", "d", "M12 15v7")
                .element("path", "d", "M9 19h6")
                .element("circle", "cx", "12", "cy", "9", "r", "6");
    }

    static Icon venusAndMars() {
        return Icon.create()
                .element("path", "d", "M10 20h4")
                .element("path", "d", "M12 16v6")
                .element("path", "d", "M17 2h4v4")
                .element("path", "d", "m21 2-5.46 5.46")
                .element("circle", "cx", "12", "cy", "11", "r", "5");
    }

    static Icon verified() {
        return Icon.create()
                .element("path", "d", "M3.85 8.62a4 4 0 0 1 4.78-4.77 4 4 0 0 1 6.74 0 4 4 0 0 1 4.78 4.78 4 4 0 0 1 0 6.74 4 4 0 0 1-4.77 4.78 4 4 0 0 1-6.75 0 4 4 0 0 1-4.78-4.77 4 4 0 0 1 0-6.76Z")
                .element("path", "d", "m9 12 2 2 4-4");
    }

    static Icon vibrate() {
        return Icon.create()
                .element("path", "d", "m2 8 2 2-2 2 2 2-2 2")
                .element("path", "d", "m22 8-2 2 2 2-2 2 2 2")
                .element("rect", "width", "8", "height", "14", "x", "8", "y", "5", "rx", "1");
    }

    static Icon vibrateOff() {
        return Icon.create()
                .element("path", "d", "m2 8 2 2-2 2 2 2-2 2")
                .element("path", "d", "m22 8-2 2 2 2-2 2 2 2")
                .element("path", "d", "M8 8v10c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-2")
                .element("path", "d", "M16 10.34V6c0-.55-.45-1-1-1h-4.34")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }

    static Icon video() {
        return Icon.create()
                .element("path", "d", "m16 13 5.223 3.482a.5.5 0 0 0 .777-.416V7.87a.5.5 0 0 0-.752-.432L16 10.5")
                .element("rect", "x", "2", "y", "6", "width", "14", "height", "12", "rx", "2");
    }

    static Icon videoOff() {
        return Icon.create()
                .element("path", "d", "M10.66 6H14a2 2 0 0 1 2 2v2.5l5.248-3.062A.5.5 0 0 1 22 7.87v8.196")
                .element("path", "d", "M16 16a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h2")
                .element("path", "d", "m2 2 20 20");
    }

    static Icon videotape() {
        return Icon.create()
                .element("rect", "width", "20", "height", "16", "x", "2", "y", "4", "rx", "2")
                .element("path", "d", "M2 8h20")
                .element("circle", "cx", "8", "cy", "14", "r", "2")
                .element("path", "d", "M8 12h8")
                .element("circle", "cx", "16", "cy", "14", "r", "2");
    }

    static Icon view() {
        return Icon.create()
                .element("path", "d", "M21 17v2a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-2")
                .element("path", "d", "M21 7V5a2 2 0 0 0-2-2H5a2 2 0 0 0-2 2v2")
                .element("circle", "cx", "12", "cy", "12", "r", "1")
                .element("path", "d", "M18.944 12.33a1 1 0 0 0 0-.66 7.5 7.5 0 0 0-13.888 0 1 1 0 0 0 0 .66 7.5 7.5 0 0 0 13.888 0");
    }

    static Icon voicemail() {
        return Icon.create()
                .element("circle", "cx", "6", "cy", "12", "r", "4")
                .element("circle", "cx", "18", "cy", "12", "r", "4")
                .element("line", "x1", "6", "x2", "18", "y1", "16", "y2", "16");
    }

    static Icon volleyball() {
        return Icon.create()
                .element("path", "d", "M11 7a16 16 20 0 1 10.98 4.362")
                .element("path", "d", "M12 12a13 13 0 0 1-8.66 5")
                .element("path", "d", "M16.83 13.634a16 16 0 0 1-9.267 7.328")
                .element("path", "d", "M20.66 17A13 13 0 0 0 12 12a13 13 0 0 1 0-10")
                .element("path", "d", "M8.17 15.366a16 16 0 0 1-1.713-11.69")
                .element("circle", "cx", "12", "cy", "12", "r", "10");
    }

    static Icon volume() {
        return Icon.create()
                .element("path", "d", "M11 4.702a.705.705 0 0 0-1.203-.498L6.413 7.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298z");
    }

    static Icon volumeN1() {
        return Icon.create()
                .element("path", "d", "M11 4.702a.705.705 0 0 0-1.203-.498L6.413 7.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298z")
                .element("path", "d", "M16 9a5 5 0 0 1 0 6");
    }

    static Icon volumeN2() {
        return Icon.create()
                .element("path", "d", "M11 4.702a.705.705 0 0 0-1.203-.498L6.413 7.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298z")
                .element("path", "d", "M16 9a5 5 0 0 1 0 6")
                .element("path", "d", "M19.364 18.364a9 9 0 0 0 0-12.728");
    }

    static Icon volumeOff() {
        return Icon.create()
                .element("path", "d", "M16 9a5 5 0 0 1 .95 2.293")
                .element("path", "d", "M19.364 5.636a9 9 0 0 1 1.889 9.96")
                .element("path", "d", "m2 2 20 20")
                .element("path", "d", "m7 7-.587.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298V11")
                .element("path", "d", "M9.828 4.172A.686.686 0 0 1 11 4.657v.686");
    }

    static Icon volumeX() {
        return Icon.create()
                .element("path", "d", "M11 4.702a.705.705 0 0 0-1.203-.498L6.413 7.587A1.4 1.4 0 0 1 5.416 8H3a1 1 0 0 0-1 1v6a1 1 0 0 0 1 1h2.416a1.4 1.4 0 0 1 .997.413l3.383 3.384A.705.705 0 0 0 11 19.298z")
                .element("line", "x1", "22", "x2", "16", "y1", "9", "y2", "15")
                .element("line", "x1", "16", "x2", "22", "y1", "9", "y2", "15");
    }

    static Icon vote() {
        return Icon.create()
                .element("path", "d", "m9 12 2 2 4-4")
                .element("path", "d", "M5 7c0-1.1.9-2 2-2h10a2 2 0 0 1 2 2v12H5V7Z")
                .element("path", "d", "M22 19H2");
    }
}
