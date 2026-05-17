package org.gwtfusion.ui.component.contextmenu;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import elemental2.dom.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.OutsideClick;
import org.gwtfusion.ui.overlay.OverlaySide;
import org.gwtfusion.ui.overlay.Portal;

public final class ContextMenu extends BaseComponent<ContextMenu> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String MENU_CLASSES = "fixed z-50 grid min-w-40 gap-1 rounded-md border border-border bg-background p-1 text-sm text-foreground shadow-lg";
    public static final String ITEM_CLASSES = DropdownMenuItemClasses.ITEM_CLASSES;
    public static final int OFFSET = 4;

    private final IdGenerator ids = IdGenerator.create("context-menu");
    private final String menuId = ids.next("content");
    private final List<Item> items = new ArrayList<>();
    private final List<HTMLElement> itemElements = new ArrayList<>();
    private final List<ValueChangeListener<String>> valueChangeListeners = new ArrayList<>();
    private HTMLElement menu;
    private ListenerRegistration cleanup = ListenerRegistration.empty();
    private String value = "";
    private double clientX;
    private double clientY;
    private OverlaySide side = OverlaySide.BOTTOM;
    private boolean open;

    private ContextMenu(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static ContextMenu create() {
        return new ContextMenu((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public ContextMenu target(UiComponent target) {
        if (target == null) {
            return this;
        }
        HTMLElement targetElement = target.element();
        targetElement.setAttribute("aria-haspopup", "menu");
        targetElement.setAttribute("aria-controls", menuId);
        targetElement.addEventListener("contextmenu", event -> {
            event.preventDefault();
            MouseEvent mouseEvent = (MouseEvent) event;
            clientX = mouseEvent.clientX;
            clientY = mouseEvent.clientY;
            if (open) {
                open(false);
            }
            open(true);
        });
        element().appendChild(targetElement);
        return this;
    }

    public ContextMenu addItem(String value, String label) {
        items.add(new Item(value == null ? "" : value, label == null ? "" : label));
        return this;
    }

    public ContextMenu side(OverlaySide side) {
        this.side = side == null ? OverlaySide.BOTTOM : side;
        return this;
    }

    public ContextMenu open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        if (open) {
            mount();
        } else {
            unmount();
        }
        return this;
    }

    public boolean open() {
        return open;
    }

    public String value() {
        return value;
    }

    public ListenerRegistration onValueChange(ValueChangeListener<String> listener) {
        valueChangeListeners.add(listener);
        return () -> valueChangeListeners.remove(listener);
    }

    private void mount() {
        itemElements.clear();
        menu = (HTMLElement) DomGlobal.document.createElement("div");
        menu.className = MENU_CLASSES;
        menu.setAttribute("id", menuId);
        menu.setAttribute("role", "menu");
        menu.setAttribute("tabindex", "-1");
        for (Item item : items) {
            HTMLElement itemElement = (HTMLElement) DomGlobal.document.createElement("button");
            itemElement.className = ITEM_CLASSES;
            itemElement.setAttribute("type", "button");
            itemElement.setAttribute("role", "menuitem");
            itemElement.setAttribute("tabindex", "-1");
            itemElement.textContent = item.label;
            itemElement.addEventListener("click", event -> select(item));
            itemElements.add(itemElement);
            menu.appendChild(itemElement);
        }
        menu.addEventListener("keydown", event -> onKeyDown((KeyboardEvent) event));
        ListenerRegistration portal = Portal.appendToBody(menu);
        positionAtPointer();
        cleanup = ListenerRegistration.combine(OutsideClick.listen(menu, event -> open(false)), portal);
        focusItem(0);
    }

    private void unmount() {
        cleanup.remove();
        cleanup = ListenerRegistration.empty();
        itemElements.clear();
        menu = null;
    }

    private void select(Item item) {
        String previous = value;
        value = item.value;
        open(false);
        if (!previous.equals(value)) {
            for (ValueChangeListener<String> listener : new ArrayList<>(valueChangeListeners)) {
                listener.onValueChange(value);
            }
        }
    }

    private void onKeyDown(KeyboardEvent event) {
        int current = focusedIndex();
        int next = Keyboard.indexForKey(event.key, current, itemElements.size(), true);
        if (Keyboard.isEscape(event.key)) {
            event.preventDefault();
            open(false);
        } else if (next != current) {
            event.preventDefault();
            focusItem(next);
        } else if (Keyboard.isActivationKey(event.key) && current >= 0 && current < items.size()) {
            event.preventDefault();
            select(items.get(current));
        }
    }

    private int focusedIndex() {
        HTMLElement active = FocusManager.activeElement();
        for (int i = 0; i < itemElements.size(); i++) {
            if (itemElements.get(i) == active) {
                return i;
            }
        }
        return -1;
    }

    private void focusItem(int index) {
        if (index >= 0 && index < itemElements.size()) {
            FocusManager.focus(itemElements.get(index));
        } else {
            FocusManager.focus(menu);
        }
    }

    private void positionAtPointer() {
        if (menu == null) {
            return;
        }
        double left;
        double top;
        if (side == OverlaySide.RIGHT) {
            left = clientX + OFFSET;
            top = clientY;
        } else if (side == OverlaySide.TOP) {
            left = clientX;
            top = clientY - menu.offsetHeight - OFFSET;
        } else if (side == OverlaySide.LEFT) {
            left = clientX - menu.offsetWidth - OFFSET;
            top = clientY;
        } else {
            left = clientX;
            top = clientY + OFFSET;
        }
        menu.style.left = left + "px";
        menu.style.top = top + "px";
    }

    private static final class Item {
        private final String value;
        private final String label;

        private Item(String value, String label) {
            this.value = value;
            this.label = label;
        }
    }

    private static final class DropdownMenuItemClasses {
        private static final String ITEM_CLASSES = "w-full rounded px-2 py-1.5 text-left hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring";
    }
}
