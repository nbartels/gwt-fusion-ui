package org.gwtfusion.ui.theme;

import elemental2.dom.DomGlobal;
import elemental2.dom.MediaQueryList;
import java.util.Objects;

public final class ThemeManager {
    public static final String DARK_CLASS = "dark";

    private static ThemeMode mode = ThemeMode.LIGHT;

    private ThemeManager() {
    }

    public static ThemeMode mode() {
        return mode;
    }

    public static void setMode(ThemeMode nextMode) {
        mode = Objects.requireNonNull(nextMode, "nextMode");
        apply();
    }

    public static void apply() {
        if (DomGlobal.document == null || DomGlobal.document.documentElement == null) {
            return;
        }
        if (isDarkActive()) {
            DomGlobal.document.documentElement.classList.add(DARK_CLASS);
        } else {
            DomGlobal.document.documentElement.classList.remove(DARK_CLASS);
        }
    }

    public static boolean isDarkActive() {
        if (mode == ThemeMode.DARK) {
            return true;
        }
        if (mode == ThemeMode.LIGHT) {
            return false;
        }
        if (DomGlobal.window == null) {
            return ThemeMode.SYSTEM.darkClassByDefault();
        }
        MediaQueryList query = DomGlobal.window.matchMedia("(prefers-color-scheme: dark)");
        return query != null && query.matches;
    }
}
