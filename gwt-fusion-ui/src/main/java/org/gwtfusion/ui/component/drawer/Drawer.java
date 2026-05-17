package org.gwtfusion.ui.component.drawer;

import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Drawer implements UiComponent {
    public static final String PANEL_CLASSES = "fixed inset-x-0 bottom-0 z-50 grid max-h-screen gap-4 rounded-t-lg border-t border-border bg-background p-6 text-foreground shadow-lg";

    private final Dialog dialog;

    private Drawer(Dialog dialog) {
        this.dialog = dialog.panelClasses(PANEL_CLASSES);
    }

    public static Drawer create() {
        return new Drawer(Dialog.create());
    }

    @Override
    public HTMLElement element() {
        return dialog.element();
    }

    public Drawer trigger(UiComponent trigger) {
        dialog.trigger(trigger);
        return this;
    }

    public Drawer title(String title) {
        dialog.title(title);
        return this;
    }

    public Drawer description(String description) {
        dialog.description(description);
        return this;
    }

    public Drawer content(UiComponent content) {
        dialog.content(content);
        return this;
    }

    public Drawer open(boolean open) {
        dialog.open(open);
        return this;
    }

    public boolean open() {
        return dialog.open();
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        return dialog.onOpenChange(listener);
    }
}
