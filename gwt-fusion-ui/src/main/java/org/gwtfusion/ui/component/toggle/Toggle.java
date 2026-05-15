package org.gwtfusion.ui.component.toggle;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import org.gwtfusion.ui.BaseComponent;

public final class Toggle extends BaseComponent<Toggle> {
    public static final String BASE_CLASSES = "inline-flex items-center justify-center rounded-md font-medium transition-colors focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50";
    public static final String PRESSED_CLASSES = "bg-accent text-accent-foreground";

    private ToggleVariant variant;
    private ToggleSize size;
    private boolean pressed;

    private Toggle(HTMLButtonElement element) {
        super(element);
        element.type = "button";
        classes(BASE_CLASSES);
        variant(ToggleVariant.DEFAULT);
        size(ToggleSize.MD);
        pressed(false);
        onClick(event -> pressed(!pressed));
    }

    public static Toggle create(String text) {
        return new Toggle((HTMLButtonElement) DomGlobal.document.createElement("button")).text(text);
    }

    public Toggle variant(ToggleVariant variant) {
        if (this.variant != null) {
            removeClasses(this.variant.classes());
        }
        this.variant = variant;
        return classes(variant.classes());
    }

    public Toggle size(ToggleSize size) {
        if (this.size != null) {
            removeClasses(this.size.classes());
        }
        this.size = size;
        return classes(size.classes());
    }

    public Toggle pressed(boolean pressed) {
        this.pressed = pressed;
        attr("aria-pressed", String.valueOf(pressed));
        data("state", pressed ? "on" : "off");
        if (pressed) {
            classes(PRESSED_CLASSES);
        } else {
            removeClasses(PRESSED_CLASSES);
        }
        return this;
    }

    public boolean pressed() {
        return pressed;
    }

    public Toggle disabled(boolean disabled) {
        ((HTMLButtonElement) element()).disabled = disabled;
        return this;
    }
}
