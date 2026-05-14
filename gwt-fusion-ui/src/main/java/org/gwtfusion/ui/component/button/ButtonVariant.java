package org.gwtfusion.ui.component.button;

public enum ButtonVariant {
    DEFAULT("bg-primary text-primary-foreground shadow hover:bg-primary/90"),
    DESTRUCTIVE("bg-destructive text-destructive-foreground shadow-sm hover:bg-destructive/90"),
    OUTLINE("border border-input bg-background shadow-sm hover:bg-accent hover:text-accent-foreground"),
    SECONDARY("bg-secondary text-secondary-foreground shadow-sm hover:bg-secondary/80"),
    GHOST("hover:bg-accent hover:text-accent-foreground"),
    LINK("text-primary underline-offset-4 hover:underline");

    private final String classes;

    ButtonVariant(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
