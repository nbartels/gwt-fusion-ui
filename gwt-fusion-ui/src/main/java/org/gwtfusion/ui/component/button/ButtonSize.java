package org.gwtfusion.ui.component.button;

public enum ButtonSize {
    SM("h-8 rounded-md px-3 text-xs"),
    MD("h-9 px-4 py-2"),
    LG("h-10 rounded-md px-8"),
    ICON("h-9 w-9");

    private final String classes;

    ButtonSize(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
