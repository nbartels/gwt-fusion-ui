package org.gwtfusion.ui.theme;

public enum ThemeMode {
    LIGHT(false),
    DARK(true),
    SYSTEM(false);

    private final boolean darkClassByDefault;

    ThemeMode(boolean darkClassByDefault) {
        this.darkClassByDefault = darkClassByDefault;
    }

    public boolean darkClassByDefault() {
        return darkClassByDefault;
    }
}
