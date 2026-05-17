package org.gwtfusion.ui.component.sheet;

import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Sheet implements UiComponent {
    public static final String PANEL_BASE_CLASSES = "fixed z-50 grid gap-4 bg-background p-6 text-foreground shadow-lg";

    private final Dialog dialog;
    private SheetSide side = SheetSide.RIGHT;

    private Sheet(Dialog dialog) {
        this.dialog = dialog;
        applySide();
    }

    public static Sheet create() {
        return new Sheet(Dialog.create());
    }

    @Override
    public HTMLElement element() {
        return dialog.element();
    }

    public Sheet trigger(UiComponent trigger) {
        dialog.trigger(trigger);
        return this;
    }

    public Sheet title(String title) {
        dialog.title(title);
        return this;
    }

    public Sheet description(String description) {
        dialog.description(description);
        return this;
    }

    public Sheet content(UiComponent content) {
        dialog.content(content);
        return this;
    }

    public Sheet side(SheetSide side) {
        this.side = side == null ? SheetSide.RIGHT : side;
        applySide();
        return this;
    }

    public Sheet open(boolean open) {
        dialog.open(open);
        return this;
    }

    public boolean open() {
        return dialog.open();
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        return dialog.onOpenChange(listener);
    }

    private void applySide() {
        dialog.panelClasses(PANEL_BASE_CLASSES + " " + side.classes());
    }
}
