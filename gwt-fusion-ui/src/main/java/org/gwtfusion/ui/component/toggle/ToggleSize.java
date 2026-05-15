package org.gwtfusion.ui.component.toggle;

public enum ToggleSize {
    SM("h-8 px-2 text-xs"),
    MD("h-9 px-3 text-sm"),
    LG("h-10 px-4 text-base");

    private final String classes;

    ToggleSize(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
