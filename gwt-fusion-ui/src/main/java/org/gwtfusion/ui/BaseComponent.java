package org.gwtfusion.ui;

import elemental2.dom.EventListener;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.css.CssClasses;

public abstract class BaseComponent<T extends BaseComponent<T>> implements UiComponent {
    private final HTMLElement element;

    protected BaseComponent(HTMLElement element) {
        this.element = element;
    }

    @Override
    public final HTMLElement element() {
        return element;
    }

    public final T classes(String classes) {
        for (String className : CssClasses.tokens(classes)) {
            element.classList.add(className);
        }
        return self();
    }

    public final T removeClasses(String classes) {
        for (String className : CssClasses.tokens(classes)) {
            element.classList.remove(className);
        }
        return self();
    }

    public final T attr(String name, String value) {
        if (value == null) {
            element.removeAttribute(name);
        } else {
            element.setAttribute(name, value);
        }
        return self();
    }

    public final T data(String name, String value) {
        return attr("data-" + name, value);
    }

    public final T aria(String name, String value) {
        return attr("aria-" + name, value);
    }

    public final T text(String text) {
        element.textContent = text == null ? "" : text;
        return self();
    }

    public final T onClick(EventListener listener) {
        element.addEventListener("click", listener);
        return self();
    }

    @SuppressWarnings("unchecked")
    protected final T self() {
        return (T) this;
    }
}
