package org.gwtfusion.ui.event;

@FunctionalInterface
public interface ValueChangeListener<T> {
    void onValueChange(T value);
}
