package org.gwtfusion.ui.component.radio;

public enum RadioGroupOrientation {
    VERTICAL("flex flex-col gap-2"),
    HORIZONTAL("flex flex-row flex-wrap gap-4");

    private final String classes;

    RadioGroupOrientation(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
