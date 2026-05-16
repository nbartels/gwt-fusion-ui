package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsJ {
    private static final String[] NAMES = {"japanese-yen", "joystick"};

    private LucideIconsJ() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("japanese-yen".equals(name)) {
            return japaneseYen();
        }
        if ("joystick".equals(name)) {
            return joystick();
        }
        return null;
    }

    static Icon japaneseYen() {
        return Icon.create()
                .element("path", "d", "M12 9.5V21m0-11.5L6 3m6 6.5L18 3")
                .element("path", "d", "M6 15h12")
                .element("path", "d", "M6 11h12");
    }

    static Icon joystick() {
        return Icon.create()
                .element("path", "d", "M21 17a2 2 0 0 0-2-2H5a2 2 0 0 0-2 2v2a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-2Z")
                .element("path", "d", "M6 15v-2")
                .element("path", "d", "M12 15V9")
                .element("circle", "cx", "12", "cy", "6", "r", "3");
    }
}
