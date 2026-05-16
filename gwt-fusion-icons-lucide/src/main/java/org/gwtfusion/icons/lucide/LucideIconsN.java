package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsN {
    private static final String[] NAMES = {"navigation", "navigation-2", "navigation-2-off", "navigation-off", "network", "newspaper", "nfc", "non-binary", "notebook", "notebook-pen", "notebook-tabs", "notebook-text", "notepad-text", "notepad-text-dashed", "nut", "nut-off"};

    private LucideIconsN() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("navigation".equals(name)) {
            return navigation();
        }
        if ("navigation-2".equals(name)) {
            return navigationN2();
        }
        if ("navigation-2-off".equals(name)) {
            return navigationN2Off();
        }
        if ("navigation-off".equals(name)) {
            return navigationOff();
        }
        if ("network".equals(name)) {
            return network();
        }
        if ("newspaper".equals(name)) {
            return newspaper();
        }
        if ("nfc".equals(name)) {
            return nfc();
        }
        if ("non-binary".equals(name)) {
            return nonBinary();
        }
        if ("notebook".equals(name)) {
            return notebook();
        }
        if ("notebook-pen".equals(name)) {
            return notebookPen();
        }
        if ("notebook-tabs".equals(name)) {
            return notebookTabs();
        }
        if ("notebook-text".equals(name)) {
            return notebookText();
        }
        if ("notepad-text".equals(name)) {
            return notepadText();
        }
        if ("notepad-text-dashed".equals(name)) {
            return notepadTextDashed();
        }
        if ("nut".equals(name)) {
            return nut();
        }
        if ("nut-off".equals(name)) {
            return nutOff();
        }
        return null;
    }

    static Icon navigation() {
        return Icon.create()
                .element("polygon", "points", "3 11 22 2 13 21 11 13 3 11");
    }

    static Icon navigationN2() {
        return Icon.create()
                .element("polygon", "points", "12 2 19 21 12 17 5 21 12 2");
    }

    static Icon navigationN2Off() {
        return Icon.create()
                .element("path", "d", "M9.31 9.31 5 21l7-4 7 4-1.17-3.17")
                .element("path", "d", "M14.53 8.88 12 2l-1.17 3.17")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }

    static Icon navigationOff() {
        return Icon.create()
                .element("path", "d", "M8.43 8.43 3 11l8 2 2 8 2.57-5.43")
                .element("path", "d", "M17.39 11.73 22 2l-9.73 4.61")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }

    static Icon network() {
        return Icon.create()
                .element("rect", "x", "16", "y", "16", "width", "6", "height", "6", "rx", "1")
                .element("rect", "x", "2", "y", "16", "width", "6", "height", "6", "rx", "1")
                .element("rect", "x", "9", "y", "2", "width", "6", "height", "6", "rx", "1")
                .element("path", "d", "M5 16v-3a1 1 0 0 1 1-1h12a1 1 0 0 1 1 1v3")
                .element("path", "d", "M12 12V8");
    }

    static Icon newspaper() {
        return Icon.create()
                .element("path", "d", "M15 18h-5")
                .element("path", "d", "M18 14h-8")
                .element("path", "d", "M4 22h16a2 2 0 0 0 2-2V4a2 2 0 0 0-2-2H8a2 2 0 0 0-2 2v16a2 2 0 0 1-4 0v-9a2 2 0 0 1 2-2h2")
                .element("rect", "width", "8", "height", "4", "x", "10", "y", "6", "rx", "1");
    }

    static Icon nfc() {
        return Icon.create()
                .element("path", "d", "M6 8.32a7.43 7.43 0 0 1 0 7.36")
                .element("path", "d", "M9.46 6.21a11.76 11.76 0 0 1 0 11.58")
                .element("path", "d", "M12.91 4.1a15.91 15.91 0 0 1 .01 15.8")
                .element("path", "d", "M16.37 2a20.16 20.16 0 0 1 0 20");
    }

    static Icon nonBinary() {
        return Icon.create()
                .element("path", "d", "M12 2v10")
                .element("path", "d", "m8.5 4 7 4")
                .element("path", "d", "m8.5 8 7-4")
                .element("circle", "cx", "12", "cy", "17", "r", "5");
    }

    static Icon notebook() {
        return Icon.create()
                .element("path", "d", "M2 6h4")
                .element("path", "d", "M2 10h4")
                .element("path", "d", "M2 14h4")
                .element("path", "d", "M2 18h4")
                .element("rect", "width", "16", "height", "20", "x", "4", "y", "2", "rx", "2")
                .element("path", "d", "M16 2v20");
    }

    static Icon notebookPen() {
        return Icon.create()
                .element("path", "d", "M13.4 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2v-7.4")
                .element("path", "d", "M2 6h4")
                .element("path", "d", "M2 10h4")
                .element("path", "d", "M2 14h4")
                .element("path", "d", "M2 18h4")
                .element("path", "d", "M21.378 5.626a1 1 0 1 0-3.004-3.004l-5.01 5.012a2 2 0 0 0-.506.854l-.837 2.87a.5.5 0 0 0 .62.62l2.87-.837a2 2 0 0 0 .854-.506z");
    }

    static Icon notebookTabs() {
        return Icon.create()
                .element("path", "d", "M2 6h4")
                .element("path", "d", "M2 10h4")
                .element("path", "d", "M2 14h4")
                .element("path", "d", "M2 18h4")
                .element("rect", "width", "16", "height", "20", "x", "4", "y", "2", "rx", "2")
                .element("path", "d", "M15 2v20")
                .element("path", "d", "M15 7h5")
                .element("path", "d", "M15 12h5")
                .element("path", "d", "M15 17h5");
    }

    static Icon notebookText() {
        return Icon.create()
                .element("path", "d", "M2 6h4")
                .element("path", "d", "M2 10h4")
                .element("path", "d", "M2 14h4")
                .element("path", "d", "M2 18h4")
                .element("rect", "width", "16", "height", "20", "x", "4", "y", "2", "rx", "2")
                .element("path", "d", "M9.5 8h5")
                .element("path", "d", "M9.5 12H16")
                .element("path", "d", "M9.5 16H14");
    }

    static Icon notepadText() {
        return Icon.create()
                .element("path", "d", "M8 2v4")
                .element("path", "d", "M12 2v4")
                .element("path", "d", "M16 2v4")
                .element("rect", "width", "16", "height", "18", "x", "4", "y", "4", "rx", "2")
                .element("path", "d", "M8 10h6")
                .element("path", "d", "M8 14h8")
                .element("path", "d", "M8 18h5");
    }

    static Icon notepadTextDashed() {
        return Icon.create()
                .element("path", "d", "M8 2v4")
                .element("path", "d", "M12 2v4")
                .element("path", "d", "M16 2v4")
                .element("path", "d", "M16 4h2a2 2 0 0 1 2 2v2")
                .element("path", "d", "M20 12v2")
                .element("path", "d", "M20 18v2a2 2 0 0 1-2 2h-1")
                .element("path", "d", "M13 22h-2")
                .element("path", "d", "M7 22H6a2 2 0 0 1-2-2v-2")
                .element("path", "d", "M4 14v-2")
                .element("path", "d", "M4 8V6a2 2 0 0 1 2-2h2")
                .element("path", "d", "M8 10h6")
                .element("path", "d", "M8 14h8")
                .element("path", "d", "M8 18h5");
    }

    static Icon nut() {
        return Icon.create()
                .element("path", "d", "M12 4V2")
                .element("path", "d", "M5 10v4a7.004 7.004 0 0 0 5.277 6.787c.412.104.802.292 1.102.592L12 22l.621-.621c.3-.3.69-.488 1.102-.592A7.003 7.003 0 0 0 19 14v-4")
                .element("path", "d", "M12 4C8 4 4.5 6 4 8c-.243.97-.919 1.952-2 3 1.31-.082 1.972-.29 3-1 .54.92.982 1.356 2 2 1.452-.647 1.954-1.098 2.5-2 .595.995 1.151 1.427 2.5 2 1.31-.621 1.862-1.058 2.5-2 .629.977 1.162 1.423 2.5 2 1.209-.548 1.68-.967 2-2 1.032.916 1.683 1.157 3 1-1.297-1.036-1.758-2.03-2-3-.5-2-4-4-8-4Z");
    }

    static Icon nutOff() {
        return Icon.create()
                .element("path", "d", "M12 4V2")
                .element("path", "d", "M5 10v4a7.004 7.004 0 0 0 5.277 6.787c.412.104.802.292 1.102.592L12 22l.621-.621c.3-.3.69-.488 1.102-.592a7.01 7.01 0 0 0 4.125-2.939")
                .element("path", "d", "M19 10v3.343")
                .element("path", "d", "M12 12c-1.349-.573-1.905-1.005-2.5-2-.546.902-1.048 1.353-2.5 2-1.018-.644-1.46-1.08-2-2-1.028.71-1.69.918-3 1 1.081-1.048 1.757-2.03 2-3 .194-.776.84-1.551 1.79-2.21m11.654 5.997c.887-.457 1.28-.891 1.556-1.787 1.032.916 1.683 1.157 3 1-1.297-1.036-1.758-2.03-2-3-.5-2-4-4-8-4-.74 0-1.461.068-2.15.192")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }
}
