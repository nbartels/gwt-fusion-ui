package org.gwtfusion.ui.component.toggle;

public enum ToggleVariant {
    DEFAULT("bg-transparent hover:bg-accent hover:text-accent-foreground"),
    OUTLINE("border border-input bg-transparent hover:bg-accent hover:text-accent-foreground");

    private final String classes;

    ToggleVariant(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
