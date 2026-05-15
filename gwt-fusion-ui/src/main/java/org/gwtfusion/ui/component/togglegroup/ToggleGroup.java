package org.gwtfusion.ui.component.togglegroup;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.component.toggle.Toggle;

public final class ToggleGroup extends BaseComponent<ToggleGroup> {
    public static final String BASE_CLASSES = "inline-flex items-center gap-1 rounded-md bg-muted p-1";

    private final List<Item> items = new ArrayList<>();
    private ToggleGroupType type = ToggleGroupType.SINGLE;

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
        for (Item item : items) {
            item.toggle.pressed(item.value.equals(safeValue));
        }
        return this;
    }

    private void select(Item selected) {
        if (type == ToggleGroupType.MULTIPLE) {
            return;
        }
        for (Item item : items) {
            item.toggle.pressed(item == selected);
        }
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
