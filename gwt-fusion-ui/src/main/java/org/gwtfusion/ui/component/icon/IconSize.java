package org.gwtfusion.ui.component.icon;

public enum IconSize {
    XS(12),
    SM(16),
    MD(20),
    LG(24),
    XL(32);

    private final int pixels;

    IconSize(int pixels) {
        this.pixels = pixels;
    }

    public int pixels() {
        return pixels;
    }
}
