package org.gwtfusion.ui;

import elemental2.dom.Element;
import elemental2.dom.HTMLElement;

public interface UiComponent {
    HTMLElement element();

    default void attachTo(Element parent) {
        parent.appendChild(element());
    }
}
