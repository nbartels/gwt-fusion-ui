package org.gwtfusion.ui.component.tabs;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.css.CssClasses;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;

public final class Tabs extends BaseComponent<Tabs> {
    public static final String ROOT_CLASSES = "grid gap-2";
    public static final String LIST_CLASSES = "inline-flex h-9 items-center justify-center rounded-lg bg-muted p-1 text-muted-foreground";
    public static final String TRIGGER_CLASSES = "inline-flex items-center justify-center whitespace-nowrap rounded-md px-3 py-1 text-sm font-medium transition-colors focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50";
    public static final String TRIGGER_ACTIVE_CLASSES = "bg-background text-foreground shadow";
    public static final String TRIGGER_INACTIVE_CLASSES = "hover:bg-background hover:text-foreground";
    public static final String PANEL_CLASSES = "mt-2 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";

    private final HTMLElement list;
    private final List<Item> items = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private String value;

    private Tabs(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
        list = (HTMLElement) DomGlobal.document.createElement("div");
        list.className = LIST_CLASSES;
        list.setAttribute("role", "tablist");
        element.appendChild(list);
    }

    public static Tabs create() {
        return new Tabs((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Tabs addTab(String value, String label, UiComponent content) {
        String safeValue = value == null ? "" : value;
        HTMLElement trigger = (HTMLElement) DomGlobal.document.createElement("button");
        trigger.className = TRIGGER_CLASSES;
        trigger.textContent = label == null ? "" : label;
        trigger.setAttribute("type", "button");
        trigger.setAttribute("role", "tab");
        trigger.setAttribute("id", tabId(safeValue));
        trigger.setAttribute("aria-controls", panelId(safeValue));

        HTMLElement panel = (HTMLElement) DomGlobal.document.createElement("div");
        panel.className = PANEL_CLASSES;
        panel.setAttribute("role", "tabpanel");
        panel.setAttribute("id", panelId(safeValue));
        panel.setAttribute("aria-labelledby", tabId(safeValue));
        panel.appendChild(content.element());

        Item item = new Item(safeValue, trigger, panel);
        items.add(item);
        trigger.addEventListener("click", event -> select(safeValue, true));
        trigger.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event, item));
        list.appendChild(trigger);
        element().appendChild(panel);

        if (items.size() == 1) {
            select(safeValue, false);
        } else {
            applyItemState(item, false);
        }
        return this;
    }

    public Tabs value(String value) {
        select(value, false);
        return this;
    }

    public String value() {
        return value == null ? "" : value;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    private void select(String nextValue, boolean notify) {
        String previous = value();
        value = nextValue == null ? "" : nextValue;
        for (Item item : items) {
            applyItemState(item, item.value.equals(value));
        }
        if (notify && !previous.equals(value)) {
            notifyValueChange();
        }
    }

    private void notifyValueChange() {
        for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
            listener.onValueChange(value());
        }
    }

    private void applyItemState(Item item, boolean active) {
        item.trigger.setAttribute("aria-selected", String.valueOf(active));
        item.trigger.setAttribute("tabindex", active ? "0" : "-1");
        item.trigger.setAttribute("data-state", active ? "active" : "inactive");
        item.panel.setAttribute("data-state", active ? "active" : "inactive");

        toggleClasses(item.trigger, TRIGGER_ACTIVE_CLASSES, active);
        toggleClasses(item.trigger, TRIGGER_INACTIVE_CLASSES, !active);

        if (active) {
            item.panel.removeAttribute("hidden");
        } else {
            item.panel.setAttribute("hidden", "");
        }
    }

    private void onKeyDown(KeyboardEvent event, Item current) {
        int index = items.indexOf(current);
        if (index < 0) {
            return;
        }
        String key = event.key;
        if ("ArrowRight".equals(key) || "ArrowDown".equals(key)) {
            event.preventDefault();
            focusAndSelect((index + 1) % items.size());
        } else if ("ArrowLeft".equals(key) || "ArrowUp".equals(key)) {
            event.preventDefault();
            focusAndSelect((index - 1 + items.size()) % items.size());
        } else if ("Home".equals(key)) {
            event.preventDefault();
            focusAndSelect(0);
        } else if ("End".equals(key)) {
            event.preventDefault();
            focusAndSelect(items.size() - 1);
        }
    }

    private void focusAndSelect(int index) {
        Item item = items.get(index);
        select(item.value, true);
        item.trigger.focus();
    }

    private void toggleClasses(HTMLElement element, String classes, boolean add) {
        for (String className : CssClasses.tokens(classes)) {
            if (add) {
                element.classList.add(className);
            } else {
                element.classList.remove(className);
            }
        }
    }

    private String tabId(String value) {
        return "tab-" + value;
    }

    private String panelId(String value) {
        return "panel-" + value;
    }

    private static final class Item {
        private final String value;
        private final HTMLElement trigger;
        private final HTMLElement panel;

        private Item(String value, HTMLElement trigger, HTMLElement panel) {
            this.value = value;
            this.trigger = trigger;
            this.panel = panel;
        }
    }
}
