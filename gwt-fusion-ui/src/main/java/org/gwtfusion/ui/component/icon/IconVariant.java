package org.gwtfusion.ui.component.icon;

public enum IconVariant {
    DEFAULT("text-foreground"),
    MUTED("text-muted-foreground"),
    PRIMARY("text-primary"),
    DESTRUCTIVE("text-destructive");

    private final String classes;

    IconVariant(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
