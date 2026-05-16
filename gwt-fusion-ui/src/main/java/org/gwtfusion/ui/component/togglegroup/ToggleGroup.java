package org.gwtfusion.ui.component.togglegroup;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.toggle.Toggle;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class ToggleGroup extends BaseComponent<ToggleGroup> {
    public static final String BASE_CLASSES = "inline-flex items-center gap-1 rounded-md bg-muted p-1";

    private final List<Item> items = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private final List<ValueChangeListener<List<String>>> valuesChangeListeners = new ArrayList<>();
    private ToggleGroupType type = ToggleGroupType.SINGLE;
    private String value = "";

    private ToggleGroup(HTMLElement element) {
        super(element);
        classes(BASE_CLASSES);
        attr("role", "group");
    }

    public static ToggleGroup create() {
        return new ToggleGroup((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public ToggleGroup type(ToggleGroupType type) {
        this.type = type == null ? ToggleGroupType.SINGLE : type;
        return this;
    }

    public ToggleGroup addItem(String value, String label) {
        Toggle toggle = Toggle.create(label);
        Item item = new Item(value == null ? "" : value, toggle);
        items.add(item);
        toggle.onClick(event -> select(item));
        element().appendChild(toggle.element());
        return this;
    }

    public ToggleGroup value(String value) {
        String safeValue = value == null ? "" : value;
        this.value = safeValue;
        for (Item item : items) {
            item.toggle.pressed(item.value.equals(safeValue));
        }
        return this;
    }

    public String value() {
        if (type == ToggleGroupType.SINGLE) {
            return value;
        }
        for (Item item : items) {
            if (item.toggle.pressed()) {
                return item.value;
            }
        }
        return "";
    }

    public List<String> values() {
        List<String> values = new ArrayList<>();
        for (Item item : items) {
            if (item.toggle.pressed()) {
                values.add(item.value);
            }
        }
        return values;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    public ListenerRegistration onValuesChange(ValueChangeListener<List<String>> listener) {
        valuesChangeListeners.add(listener);
        return () -> valuesChangeListeners.remove(listener);
    }

    private void select(Item selected) {
        String previousValues = valuesKey();
        if (type == ToggleGroupType.MULTIPLE) {
            notifyValuesIfChanged(previousValues);
            return;
        }
        String previousValue = value;
        for (Item item : items) {
            item.toggle.pressed(item == selected);
        }
        value = selected.value;
        notifyValueIfChanged(previousValue);
    }

    private void notifyValueIfChanged(String previousValue) {
        if (!previousValue.equals(value)) {
            for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
                listener.onValueChange(value);
            }
        }
    }

    private void notifyValuesIfChanged(String previousValues) {
        if (!previousValues.equals(valuesKey())) {
            for (ValueChangeListener<List<String>> listener : new ArrayList<>(valuesChangeListeners)) {
                listener.onValueChange(values());
            }
        }
    }

    private String valuesKey() {
        StringBuilder builder = new StringBuilder();
        for (String value : values()) {
            if (builder.length() > 0) {
                builder.append('\n');
            }
            builder.append(value);
        }
        return builder.toString();
    }

    private static final class Item {
        private final String value;
        private final Toggle toggle;

        private Item(String value, Toggle toggle) {
            this.value = value;
            this.toggle = toggle;
        }
    }
}
