package org.gwtfusion.ui.component.alertdialog;

import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class AlertDialog implements UiComponent {
    public static final String PANEL_CLASSES = Dialog.PANEL_CLASSES + " border-destructive/50";

    private final Dialog dialog;

    private AlertDialog(Dialog dialog) {
        this.dialog = dialog.role("alertdialog").panelClasses(PANEL_CLASSES);
    }

    public static AlertDialog create() {
        return new AlertDialog(Dialog.create());
    }

    @Override
    public HTMLElement element() {
        return dialog.element();
    }

    public AlertDialog trigger(UiComponent trigger) {
        dialog.trigger(trigger);
        return this;
    }

    public AlertDialog title(String title) {
        dialog.title(title);
        return this;
    }

    public AlertDialog description(String description) {
        dialog.description(description);
        return this;
    }

    public AlertDialog content(UiComponent content) {
        dialog.content(content);
        return this;
    }

    public AlertDialog addAction(UiComponent action) {
        dialog.addAction(action);
        return this;
    }

    public AlertDialog open(boolean open) {
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
