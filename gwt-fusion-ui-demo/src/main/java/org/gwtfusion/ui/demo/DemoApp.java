package org.gwtfusion.ui.demo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.alert.Alert;
import org.gwtfusion.ui.component.alert.AlertVariant;
import org.gwtfusion.ui.component.badge.Badge;
import org.gwtfusion.ui.component.badge.BadgeVariant;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.button.ButtonSize;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.component.card.Card;
import org.gwtfusion.ui.component.input.Input;
import org.gwtfusion.ui.component.label.Label;
import org.gwtfusion.ui.component.separator.Separator;
import org.gwtfusion.ui.component.separator.SeparatorOrientation;
import org.gwtfusion.ui.theme.ThemeManager;
import org.gwtfusion.ui.theme.ThemeMode;

public final class DemoApp implements EntryPoint {
    private HTMLElement content;
    private ThemeMode nextMode = ThemeMode.DARK;

    @Override
    public void onModuleLoad() {
        ThemeManager.apply();
        HTMLElement app = (HTMLElement) DomGlobal.document.getElementById("app");
        app.appendChild(shell());
        renderHome();
    }

    private HTMLElement shell() {
        HTMLElement shell = element("div", "demo-shell");
        HTMLElement header = element("header", "demo-header");
        header.appendChild(textElement("div", "demo-brand", "GWT Fusion UI"));
        header.appendChild(Button.create("Theme wechseln").variant(ButtonVariant.OUTLINE).onClick(event -> toggleTheme()).element());
        shell.appendChild(header);

        HTMLElement layout = element("div", "demo-layout");
        HTMLElement nav = element("nav", "demo-nav");
        nav.appendChild(Button.create("Start").variant(ButtonVariant.GHOST).onClick(event -> renderHome()).element());
        nav.appendChild(Button.create("Komponenten").variant(ButtonVariant.GHOST).onClick(event -> renderComponentsAsync()).element());
        nav.appendChild(Button.create("Theme").variant(ButtonVariant.GHOST).onClick(event -> renderTheme()).element());
        layout.appendChild(nav);

        content = element("section", "demo-content");
        layout.appendChild(content);
        shell.appendChild(layout);
        return shell;
    }

    private void toggleTheme() {
        ThemeManager.setMode(nextMode);
        nextMode = nextMode == ThemeMode.DARK ? ThemeMode.LIGHT : ThemeMode.DARK;
    }

    private void renderHome() {
        clearContent();
        HTMLElement hero = element("div", "demo-hero");
        hero.appendChild(textElement("h1", "", "GWT UI-Komponenten mit Tailwind-DNA"));
        hero.appendChild(textElement("p", "demo-muted", "Eine DOM-basierte Komponentenbibliothek fuer GWT 2.13 und J2CL-kompatible Anwendungen. Die API ist Java-typisch, die Styles folgen Tailwind und shadcn-inspirierten Theme Tokens."));
        content.appendChild(hero);

        content.appendChild(example("Erster Button",
                Button.create("Speichern").variant(ButtonVariant.DEFAULT),
                "Button.create(\"Speichern\")\n    .variant(ButtonVariant.DEFAULT);"));
    }

    private void renderComponentsAsync() {
        clearContent();
        content.appendChild(textElement("p", "demo-muted", "Komponenten werden in der Demo ueber GWT.runAsync geladen, damit Splitpoints frueh sichtbar bleiben."));
        GWT.runAsync(new RunAsyncCallback() {
            @Override
            public void onFailure(Throwable reason) {
                content.appendChild(textElement("p", "demo-muted", "Komponenten konnten nicht geladen werden: " + reason.getMessage()));
            }

            @Override
            public void onSuccess() {
                renderComponents();
            }
        });
    }

    private void renderComponents() {
        clearContent();
        content.appendChild(textElement("h1", "", "Komponenten"));
        content.appendChild(textElement("p", "demo-muted", "Jedes Beispiel zeigt links die gerenderte Komponente und rechts den dazugehoerigen Java-Code. Varianten und Groessen sind bewusst nebeneinander sichtbar."));
        HTMLElement grid = element("div", "demo-grid");

        HTMLElement buttons = preview();
        buttons.appendChild(Button.create("Default").element());
        buttons.appendChild(Button.create("Destructive").variant(ButtonVariant.DESTRUCTIVE).element());
        buttons.appendChild(Button.create("Secondary").variant(ButtonVariant.SECONDARY).element());
        buttons.appendChild(Button.create("Outline").variant(ButtonVariant.OUTLINE).element());
        buttons.appendChild(Button.create("Ghost").variant(ButtonVariant.GHOST).element());
        buttons.appendChild(Button.create("Link").variant(ButtonVariant.LINK).element());
        buttons.appendChild(Button.create("Small").size(ButtonSize.SM).element());
        buttons.appendChild(Button.create("Large").size(ButtonSize.LG).element());
        buttons.appendChild(Button.create("Disabled").disabled(true).element());
        grid.appendChild(example("Button", buttons,
                "Button.create(\"Default\");\n"
                        + "Button.create(\"Destructive\").variant(ButtonVariant.DESTRUCTIVE);\n"
                        + "Button.create(\"Secondary\").variant(ButtonVariant.SECONDARY);\n"
                        + "Button.create(\"Outline\").variant(ButtonVariant.OUTLINE);\n"
                        + "Button.create(\"Ghost\").variant(ButtonVariant.GHOST);\n"
                        + "Button.create(\"Link\").variant(ButtonVariant.LINK);\n"
                        + "Button.create(\"Small\").size(ButtonSize.SM);\n"
                        + "Button.create(\"Large\").size(ButtonSize.LG);\n"
                        + "Button.create(\"Disabled\").disabled(true);"));

        HTMLElement badges = preview();
        badges.appendChild(Badge.create("Default").element());
        badges.appendChild(Badge.create("Secondary").variant(BadgeVariant.SECONDARY).element());
        badges.appendChild(Badge.create("Destructive").variant(BadgeVariant.DESTRUCTIVE).element());
        badges.appendChild(Badge.create("Outline").variant(BadgeVariant.OUTLINE).element());
        grid.appendChild(example("Badge", badges,
                "Badge.create(\"Default\");\n"
                        + "Badge.create(\"Secondary\").variant(BadgeVariant.SECONDARY);\n"
                        + "Badge.create(\"Destructive\").variant(BadgeVariant.DESTRUCTIVE);\n"
                        + "Badge.create(\"Outline\").variant(BadgeVariant.OUTLINE);"));

        Card card = Card.create()
                .add(Card.header()
                        .add(Card.title("Card Title"))
                        .add(Card.description("Strukturierte Flaeche fuer Inhalte.")))
                .add(Card.content().add(Button.create("Aktion")));
        grid.appendChild(example("Card", card,
                "Card.create()\n    .add(Card.header()\n        .add(Card.title(\"Card Title\"))\n        .add(Card.description(\"Strukturierte Flaeche fuer Inhalte.\")))\n    .add(Card.content().add(Button.create(\"Aktion\")));"));

        HTMLElement form = preview();
        form.appendChild(Label.create("E-Mail").forId("email-demo").element());
        form.appendChild(Input.create().type("email").placeholder("name@example.com").attr("id", "email-demo").element());
        form.appendChild(Input.create().type("text").value("Mit Wert").element());
        form.appendChild(Input.create().type("password").placeholder("Passwort").element());
        grid.appendChild(example("Input", form,
                "Label.create(\"E-Mail\").forId(\"email-demo\");\n"
                        + "Input.create()\n"
                        + "    .type(\"email\")\n"
                        + "    .placeholder(\"name@example.com\")\n"
                        + "    .attr(\"id\", \"email-demo\");\n"
                        + "Input.create().type(\"text\").value(\"Mit Wert\");\n"
                        + "Input.create().type(\"password\").placeholder(\"Passwort\");"));

        HTMLElement alerts = preview();
        alerts.appendChild(Alert.create()
                .add(Alert.title("Hinweis"))
                .add(Alert.description("Alert-Komponenten nutzen Rollen und Theme Tokens."))
                .element());
        alerts.appendChild(Alert.create()
                .variant(AlertVariant.DESTRUCTIVE)
                .add(Alert.title("Fehler"))
                .add(Alert.description("Destructive nutzt eine eigene Variante."))
                .element());
        grid.appendChild(example("Alert", alerts,
                "Alert.create()\n"
                        + "    .add(Alert.title(\"Hinweis\"))\n"
                        + "    .add(Alert.description(\"Alert-Komponenten nutzen Rollen und Theme Tokens.\"));\n\n"
                        + "Alert.create()\n"
                        + "    .variant(AlertVariant.DESTRUCTIVE)\n"
                        + "    .add(Alert.title(\"Fehler\"))\n"
                        + "    .add(Alert.description(\"Destructive nutzt eine eigene Variante.\"));"));

        HTMLElement separators = preview();
        separators.appendChild(Separator.create().element());
        separators.appendChild(Separator.create().orientation(SeparatorOrientation.VERTICAL).classes("mx-4 min-h-12").element());
        grid.appendChild(example("Separator", separators,
                "Separator.create();\n"
                        + "Separator.create()\n"
                        + "    .orientation(SeparatorOrientation.VERTICAL)\n"
                        + "    .classes(\"mx-4 min-h-12\");"));
        content.appendChild(grid);
    }

    private void renderTheme() {
        clearContent();
        content.appendChild(textElement("h1", "", "Theme"));
        content.appendChild(textElement("p", "demo-muted", "Themes werden ueber CSS-Variablen und die Root-Klasse .dark gesteuert. ThemeManager.setMode(...) ist die Java-API dafuer."));
        content.appendChild(example("ThemeManager",
                Button.create("Dark Mode aktivieren").variant(ButtonVariant.OUTLINE).onClick(event -> ThemeManager.setMode(ThemeMode.DARK)),
                "ThemeManager.setMode(ThemeMode.DARK);\nThemeManager.setMode(ThemeMode.LIGHT);\nThemeManager.setMode(ThemeMode.SYSTEM);"));
    }

    private HTMLElement example(String title, UiComponent component, String code) {
        return example(title, wrap(component), code);
    }

    private HTMLElement example(String title, HTMLElement preview, String code) {
        HTMLElement example = element("article", "demo-example");
        example.appendChild(textElement("h2", "", title));
        HTMLElement body = element("div", "demo-example-body");
        body.appendChild(preview);
        body.appendChild(code(code));
        example.appendChild(body);
        return example;
    }

    private HTMLElement wrap(UiComponent component) {
        HTMLElement preview = preview();
        preview.appendChild(component.element());
        return preview;
    }

    private HTMLElement preview() {
        return element("div", "demo-preview");
    }

    private HTMLElement code(String code) {
        HTMLElement pre = element("pre", "demo-code");
        pre.textContent = code;
        return pre;
    }

    private HTMLElement textElement(String tagName, String classes, String text) {
        HTMLElement element = element(tagName, classes);
        element.textContent = text;
        return element;
    }

    private HTMLElement element(String tagName, String classes) {
        HTMLElement element = (HTMLElement) DomGlobal.document.createElement(tagName);
        if (classes != null && !classes.isEmpty()) {
            element.className = classes;
        }
        return element;
    }

    private void clearContent() {
        while (content.firstChild != null) {
            content.removeChild(content.firstChild);
        }
    }
}
