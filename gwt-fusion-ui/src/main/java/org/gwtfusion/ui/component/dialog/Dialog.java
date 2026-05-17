package org.gwtfusion.ui.component.dialog;

import elemental2.dom.DomGlobal;
import elemental2.dom.EventTarget;
import elemental2.dom.HTMLElement;
import elemental2.dom.KeyboardEvent;
import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.event.ListenerRegistration;
import org.gwtfusion.ui.event.ValueChangeListener;
import org.gwtfusion.ui.overlay.Aria;
import org.gwtfusion.ui.overlay.FocusManager;
import org.gwtfusion.ui.overlay.IdGenerator;
import org.gwtfusion.ui.overlay.Keyboard;
import org.gwtfusion.ui.overlay.Portal;

public class Dialog extends BaseComponent<Dialog> {
    public static final String ROOT_CLASSES = "inline-flex";
    public static final String LAYER_CLASSES = "fixed inset-0 z-50 flex items-center justify-center bg-background/80 p-4";
    public static final String PANEL_CLASSES = "grid w-full max-w-lg gap-4 rounded-lg border border-border bg-background p-6 shadow-lg text-foreground";
    public static final String TITLE_CLASSES = "text-lg font-semibold tracking-tight";
    public static final String DESCRIPTION_CLASSES = "text-sm text-muted-foreground";
    public static final String BODY_CLASSES = "grid gap-4";
    public static final String ACTIONS_CLASSES = "flex flex-wrap justify-end gap-2";

    private final IdGenerator ids = IdGenerator.create("dialog");
    private final String dialogId = ids.next("content");
    private final String titleId = ids.next("title");
    private final String descriptionId = ids.next("description");
    private final List<ValueChangeListener<Boolean>> openChangeListeners = new ArrayList<>();
    private final List<UiComponent> actions = new ArrayList<>();

    private HTMLElement trigger;
    private HTMLElement layer;
    private HTMLElement previouslyFocused;
    private ListenerRegistration portal = ListenerRegistration.empty();
    private UiComponent content;
    private String title = "";
    private String description = "";
    private String role = "dialog";
    private String panelClasses = PANEL_CLASSES;
    private boolean closeOnBackdrop = true;
    private boolean open;

    protected Dialog(HTMLElement element) {
        super(element);
        classes(ROOT_CLASSES);
    }

    public static Dialog create() {
        return new Dialog((HTMLElement) DomGlobal.document.createElement("div"));
    }

    public Dialog trigger(UiComponent trigger) {
        if (trigger == null) {
            return this;
        }
        this.trigger = trigger.element();
        Aria.buttonPopup(this.trigger, role, dialogId, open);
        this.trigger.addEventListener("click", event -> open(true));
        element().appendChild(this.trigger);
        return this;
    }

    public Dialog title(String title) {
        this.title = title == null ? "" : title;
        return this;
    }

    public Dialog description(String description) {
        this.description = description == null ? "" : description;
        return this;
    }

    public Dialog content(UiComponent content) {
        this.content = content;
        return this;
    }

    public Dialog addAction(UiComponent action) {
        if (action != null) {
            actions.add(action);
        }
        return this;
    }

    public Dialog role(String role) {
        this.role = role == null || role.isEmpty() ? "dialog" : role;
        return this;
    }

    public Dialog panelClasses(String panelClasses) {
        this.panelClasses = panelClasses == null || panelClasses.isEmpty() ? PANEL_CLASSES : panelClasses;
        return this;
    }

    public Dialog closeOnBackdrop(boolean closeOnBackdrop) {
        this.closeOnBackdrop = closeOnBackdrop;
        return this;
    }

    public Dialog open(boolean open) {
        if (this.open == open) {
            return this;
        }
        this.open = open;
        if (open) {
            mount();
        } else {
            unmount(true);
        }
        notifyOpenChange();
        return this;
    }

    public boolean open() {
        return open;
    }

    public ListenerRegistration onOpenChange(ValueChangeListener<Boolean> listener) {
        openChangeListeners.add(listener);
        return () -> openChangeListeners.remove(listener);
    }

    private void mount() {
        previouslyFocused = FocusManager.activeElement();
        layer = (HTMLElement) DomGlobal.document.createElement("div");
        layer.className = LAYER_CLASSES;
        layer.setAttribute("tabindex", "-1");

        HTMLElement panel = (HTMLElement) DomGlobal.document.createElement("div");
        panel.className = panelClasses;
        panel.setAttribute("id", dialogId);
        Aria.dialog(panel, titleId, true);
        panel.setAttribute("role", role);
        if (!description.isEmpty()) {
            panel.setAttribute("aria-describedby", descriptionId);
        }

        if (!title.isEmpty()) {
            HTMLElement titleElement = textElement("h2", TITLE_CLASSES, title);
            titleElement.setAttribute("id", titleId);
            panel.appendChild(titleElement);
        }
        if (!description.isEmpty()) {
            HTMLElement descriptionElement = textElement("p", DESCRIPTION_CLASSES, description);
            descriptionElement.setAttribute("id", descriptionId);
            panel.appendChild(descriptionElement);
        }
        if (content != null) {
            HTMLElement body = (HTMLElement) DomGlobal.document.createElement("div");
            body.className = BODY_CLASSES;
            body.appendChild(content.element());
            panel.appendChild(body);
        }
        HTMLElement actionRow = (HTMLElement) DomGlobal.document.createElement("div");
        actionRow.className = ACTIONS_CLASSES;
        for (UiComponent action : actions) {
            actionRow.appendChild(action.element());
        }
        actionRow.appendChild(Button.create("Close").variant(ButtonVariant.OUTLINE).onClick(event -> open(false)).element());
        panel.appendChild(actionRow);

        layer.appendChild(panel);
        layer.addEventListener("click", event -> {
            EventTarget target = event.target;
            if (closeOnBackdrop && target == layer) {
                open(false);
            }
        });
        layer.addEventListener("keydown", event -> {
            KeyboardEvent keyEvent = (KeyboardEvent) event;
            if (Keyboard.isEscape(keyEvent.key)) {
                keyEvent.preventDefault();
                open(false);
            }
        });
        portal = Portal.appendToBody(layer);
        if (trigger != null) {
            Aria.buttonPopup(trigger, role, dialogId, true);
        }
        FocusManager.focus(layer);
    }

    private void unmount(boolean restoreFocus) {
        portal.remove();
        portal = ListenerRegistration.empty();
        layer = null;
        if (trigger != null) {
            Aria.buttonPopup(trigger, role, dialogId, false);
        }
        if (restoreFocus) {
            FocusManager.focus(previouslyFocused != null ? previouslyFocused : trigger);
        }
        previouslyFocused = null;
    }

    private void notifyOpenChange() {
        for (ValueChangeListener<Boolean> listener : new ArrayList<>(openChangeListeners)) {
            listener.onValueChange(open);
        }
    }

    private HTMLElement textElement(String tagName, String classes, String text) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement(tagName);
        element.className = classes;
        element.textContent = text;
        return element;
    }
}
