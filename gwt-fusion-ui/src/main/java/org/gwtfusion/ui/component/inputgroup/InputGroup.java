package org.gwtfusion.ui.component.inputgroup;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.css.CssClasses;

public final class InputGroup extends BaseComponent<InputGroup> {
    public static final String BASE_CLASSES = "flex min-h-9 w-full items-center overflow-hidden rounded-md border border-input bg-transparent shadow-sm focus-within:ring-1 focus-within:ring-ring";
    public static final String ADDON_CLASSES = "inline-flex h-9 items-center border-border bg-muted px-3 text-sm text-muted-foreground";
    public static final String INPUT_CLASSES = "flex-1 border-0 shadow-none focus-visible:ring-0";
    public static final String START_ADDON_CLASSES = "border-r";
    public static final String END_ADDON_CLASSES = "border-l";

    private InputGroup(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
    }

    public static InputGroup create() {
        return new InputGroup((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public InputGroup startText(String text) {
        HTMLElement addon = addon(text);
        addon.classList.add(START_ADDON_CLASSES);
        element().appendChild(addon);
        return this;
    }

    public InputGroup endText(String text) {
        HTMLElement addon = addon(text);
        addon.classList.add(END_ADDON_CLASSES);
        element().appendChild(addon);
        return this;
    }

    public InputGroup add(UiComponent component) {
        for (String className : CssClasses.tokens(INPUT_CLASSES)) {
            component.element().classList.add(className);
        }
        element().appendChild(component.element());
        return this;
    }

    private HTMLElement addon(String text) {
        HTMLElement addon = (HTMLElement) DomGlobal.document.createElement("span");
        addon.className = ADDON_CLASSES;
        addon.textContent = text == null ? "" : text;
        return addon;
    }
}
