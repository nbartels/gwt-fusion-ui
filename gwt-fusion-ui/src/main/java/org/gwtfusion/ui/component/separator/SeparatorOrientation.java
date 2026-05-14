package org.gwtfusion.ui.component.separator;

public enum SeparatorOrientation {
    HORIZONTAL("h-px w-full"),
    VERTICAL("h-full w-px");

    private final String classes;

    SeparatorOrientation(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
