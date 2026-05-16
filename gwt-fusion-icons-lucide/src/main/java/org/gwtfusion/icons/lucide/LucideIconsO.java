package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsO {
    private static final String[] NAMES = {"octagon", "octagon-alert", "octagon-minus", "octagon-pause", "octagon-x", "omega", "option", "orbit", "origami", "outdent"};

    private LucideIconsO() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("octagon".equals(name)) {
            return octagon();
        }
        if ("octagon-alert".equals(name)) {
            return octagonAlert();
        }
        if ("octagon-minus".equals(name)) {
            return octagonMinus();
        }
        if ("octagon-pause".equals(name)) {
            return octagonPause();
        }
        if ("octagon-x".equals(name)) {
            return octagonX();
        }
        if ("omega".equals(name)) {
            return omega();
        }
        if ("option".equals(name)) {
            return option();
        }
        if ("orbit".equals(name)) {
            return orbit();
        }
        if ("origami".equals(name)) {
            return origami();
        }
        if ("outdent".equals(name)) {
            return outdent();
        }
        return null;
    }

    static Icon octagon() {
        return Icon.create()
                .element("path", "d", "M2.586 16.726A2 2 0 0 1 2 15.312V8.688a2 2 0 0 1 .586-1.414l4.688-4.688A2 2 0 0 1 8.688 2h6.624a2 2 0 0 1 1.414.586l4.688 4.688A2 2 0 0 1 22 8.688v6.624a2 2 0 0 1-.586 1.414l-4.688 4.688a2 2 0 0 1-1.414.586H8.688a2 2 0 0 1-1.414-.586z");
    }

    static Icon octagonAlert() {
        return Icon.create()
                .element("path", "d", "M12 16h.01")
                .element("path", "d", "M12 8v4")
                .element("path", "d", "M15.312 2a2 2 0 0 1 1.414.586l4.688 4.688A2 2 0 0 1 22 8.688v6.624a2 2 0 0 1-.586 1.414l-4.688 4.688a2 2 0 0 1-1.414.586H8.688a2 2 0 0 1-1.414-.586l-4.688-4.688A2 2 0 0 1 2 15.312V8.688a2 2 0 0 1 .586-1.414l4.688-4.688A2 2 0 0 1 8.688 2z");
    }

    static Icon octagonMinus() {
        return Icon.create()
                .element("path", "d", "M2.586 16.726A2 2 0 0 1 2 15.312V8.688a2 2 0 0 1 .586-1.414l4.688-4.688A2 2 0 0 1 8.688 2h6.624a2 2 0 0 1 1.414.586l4.688 4.688A2 2 0 0 1 22 8.688v6.624a2 2 0 0 1-.586 1.414l-4.688 4.688a2 2 0 0 1-1.414.586H8.688a2 2 0 0 1-1.414-.586z")
                .element("path", "d", "M8 12h8");
    }

    static Icon octagonPause() {
        return Icon.create()
                .element("path", "d", "M10 15V9")
                .element("path", "d", "M14 15V9")
                .element("path", "d", "M2.586 16.726A2 2 0 0 1 2 15.312V8.688a2 2 0 0 1 .586-1.414l4.688-4.688A2 2 0 0 1 8.688 2h6.624a2 2 0 0 1 1.414.586l4.688 4.688A2 2 0 0 1 22 8.688v6.624a2 2 0 0 1-.586 1.414l-4.688 4.688a2 2 0 0 1-1.414.586H8.688a2 2 0 0 1-1.414-.586z");
    }

    static Icon octagonX() {
        return Icon.create()
                .element("path", "d", "m15 9-6 6")
                .element("path", "d", "M2.586 16.726A2 2 0 0 1 2 15.312V8.688a2 2 0 0 1 .586-1.414l4.688-4.688A2 2 0 0 1 8.688 2h6.624a2 2 0 0 1 1.414.586l4.688 4.688A2 2 0 0 1 22 8.688v6.624a2 2 0 0 1-.586 1.414l-4.688 4.688a2 2 0 0 1-1.414.586H8.688a2 2 0 0 1-1.414-.586z")
                .element("path", "d", "m9 9 6 6");
    }

    static Icon omega() {
        return Icon.create()
                .element("path", "d", "M3 20h4.5a.5.5 0 0 0 .5-.5v-.282a.52.52 0 0 0-.247-.437 8 8 0 1 1 8.494-.001.52.52 0 0 0-.247.438v.282a.5.5 0 0 0 .5.5H21");
    }

    static Icon option() {
        return Icon.create()
                .element("path", "d", "M3 3h6l6 18h6")
                .element("path", "d", "M14 3h7");
    }

    static Icon orbit() {
        return Icon.create()
                .element("path", "d", "M20.341 6.484A10 10 0 0 1 10.266 21.85")
                .element("path", "d", "M3.659 17.516A10 10 0 0 1 13.74 2.152")
                .element("circle", "cx", "12", "cy", "12", "r", "3")
                .element("circle", "cx", "19", "cy", "5", "r", "2")
                .element("circle", "cx", "5", "cy", "19", "r", "2");
    }

    static Icon origami() {
        return Icon.create()
                .element("path", "d", "M12 12V4a1 1 0 0 1 1-1h6.297a1 1 0 0 1 .651 1.759l-4.696 4.025")
                .element("path", "d", "m12 21-7.414-7.414A2 2 0 0 1 4 12.172V6.415a1.002 1.002 0 0 1 1.707-.707L20 20.009")
                .element("path", "d", "m12.214 3.381 8.414 14.966a1 1 0 0 1-.167 1.199l-1.168 1.163a1 1 0 0 1-.706.291H6.351a1 1 0 0 1-.625-.219L3.25 18.8a1 1 0 0 1 .631-1.781l4.165.027");
    }

    static Icon outdent() {
        return Icon.create()
                .element("path", "d", "M21 5H11")
                .element("path", "d", "M21 12H11")
                .element("path", "d", "M21 19H11")
                .element("path", "d", "m7 8-4 4 4 4");
    }
}
