package org.gwtfusion.ui.component.badge;

public enum BadgeVariant {
    DEFAULT("border-transparent bg-primary text-primary-foreground shadow hover:bg-primary/80"),
    SECONDARY("border-transparent bg-secondary text-secondary-foreground hover:bg-secondary/80"),
    DESTRUCTIVE("border-transparent bg-destructive text-destructive-foreground shadow hover:bg-destructive/80"),
    OUTLINE("text-foreground");

    private final String classes;

    BadgeVariant(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
