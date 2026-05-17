package org.gwtfusion.ui.component.sheet;

public enum SheetSide {
    TOP("inset-x-0 top-0 w-full border-b"),
    RIGHT("inset-y-0 right-0 h-full w-3/4 max-w-sm border-l"),
    BOTTOM("inset-x-0 bottom-0 w-full border-t"),
    LEFT("inset-y-0 left-0 h-full w-3/4 max-w-sm border-r");

    private final String classes;

    SheetSide(String classes) {
        this.classes = classes;
    }

    public String classes() {
        return classes;
    }
}
