package org.gwtfusion.ui.component.alert;

public enum AlertVariant {
    DEFAULT("bg-background text-foreground"),
    DESTRUCTIVE("border-destructive/50 text-destructive dark:border-destructive");

    private final String classes;

    AlertVariant(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
