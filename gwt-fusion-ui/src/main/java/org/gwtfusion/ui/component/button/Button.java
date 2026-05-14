package org.gwtfusion.ui.component.button;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.css.CssClasses;

public final class Button extends BaseComponent<Button> {
    public static final String BASE_CLASSES = CssClasses.join(
            "inline-flex items-center justify-center gap-2 whitespace-nowrap rounded-md text-sm font-medium",
            "transition-colors focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring",
            "disabled:pointer-events-none disabled:opacity-50"
    );

    private ButtonVariant variant;
    private ButtonSize size;

    private Button(HTMLButtonElement element) {
        super(element);
        classes(BASE_CLASSES);
        variant(ButtonVariant.DEFAULT);
        size(ButtonSize.MD);
    }

    public static Button create(String text) {
        HTMLButtonElement element = (HTMLButtonElement) DomGlobal.document.createElement("button");
        element.type = "button";
        return new Button(element).text(text);
    }

    public Button variant(ButtonVariant variant) {
        if (this.variant != null) {
            removeClasses(this.variant.classes());
        }
        this.variant = variant;
        return classes(variant.classes());
    }

    public Button size(ButtonSize size) {
        if (this.size != null) {
            removeClasses(this.size.classes());
        }
        this.size = size;
        return classes(size.classes());
    }

    public Button disabled(boolean disabled) {
        ((HTMLButtonElement) element()).disabled = disabled;
        aria("disabled", String.valueOf(disabled));
        return this;
    }
}
