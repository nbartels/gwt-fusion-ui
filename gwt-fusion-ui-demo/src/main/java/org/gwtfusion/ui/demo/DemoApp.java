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
import org.gwtfusion.ui.component.checkbox.Checkbox;
import org.gwtfusion.ui.component.code.CodeBlock;
import org.gwtfusion.ui.component.form.FormField;
import org.gwtfusion.ui.component.input.Input;
import org.gwtfusion.ui.component.inputgroup.InputGroup;
import org.gwtfusion.ui.component.label.Label;
import org.gwtfusion.ui.component.radio.RadioGroup;
import org.gwtfusion.ui.component.radio.RadioGroupOrientation;
import org.gwtfusion.ui.component.select.NativeSelect;
import org.gwtfusion.ui.component.separator.Separator;
import org.gwtfusion.ui.component.separator.SeparatorOrientation;
import org.gwtfusion.ui.component.slider.Slider;
import org.gwtfusion.ui.component.switcher.Switch;
import org.gwtfusion.ui.component.tabs.Tabs;
import org.gwtfusion.ui.component.textarea.Textarea;
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
        header.appendChild(Button.create("Toggle theme").variant(ButtonVariant.OUTLINE).onClick(event -> toggleTheme()).element());
        shell.appendChild(header);

        HTMLElement layout = element("div", "demo-layout");
        HTMLElement nav = element("nav", "demo-nav");
        nav.appendChild(Button.create("Home").variant(ButtonVariant.GHOST).onClick(event -> renderHome()).element());
        nav.appendChild(Button.create("Components").variant(ButtonVariant.GHOST).onClick(event -> renderComponentsAsync()).element());
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
        hero.appendChild(textElement("h1", "", "GWT UI components with Tailwind DNA"));
        hero.appendChild(textElement("p", "demo-muted", "A DOM-based component library for GWT 2.13 and J2CL-compatible applications. The API feels natural in Java, while the styling follows Tailwind and shadcn-inspired theme tokens."));
        content.appendChild(hero);

        content.appendChild(example("First button",
                Button.create("Save").variant(ButtonVariant.DEFAULT),
                "Button.create(\"Save\")\n    .variant(ButtonVariant.DEFAULT);"));
    }

    private void renderComponentsAsync() {
        clearContent();
        content.appendChild(textElement("p", "demo-muted", "Components are loaded through GWT.runAsync in this demo, making split points visible from the start."));
        GWT.runAsync(new RunAsyncCallback() {
            @Override
            public void onFailure(Throwable reason) {
                content.appendChild(textElement("p", "demo-muted", "Components could not be loaded: " + reason.getMessage()));
            }

            @Override
            public void onSuccess() {
                renderComponents();
            }
        });
    }

    private void renderComponents() {
        clearContent();
        content.appendChild(textElement("h1", "", "Components"));
        content.appendChild(textElement("p", "demo-muted", "Each example shows the rendered component on the left and the matching Java code on the right. Variants and sizes are intentionally shown side by side."));
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

        HTMLElement tabPreview = preview("demo-tabs-preview");
        tabPreview.appendChild(Tabs.create()
                .addTab("preview", "Preview", raw(textElement("p", "demo-muted", "Tabs keep related panels in the same flow and support arrow-key navigation.")))
                .addTab("code", "Code", CodeBlock.create("Tabs.create()\n    .addTab(\"preview\", \"Preview\", previewContent)\n    .addTab(\"code\", \"Code\", codeContent);").language("java"))
                .element());
        grid.appendChild(example("Tabs", tabPreview,
                "Tabs.create()\n"
                        + "    .addTab(\"preview\", \"Preview\", previewContent)\n"
                        + "    .addTab(\"code\", \"Code\", codeContent);"));

        Card card = Card.create()
                .add(Card.header()
                        .add(Card.title("Card Title"))
                        .add(Card.description("A structured surface for related content.")))
                .add(Card.content().add(Button.create("Action")));
        grid.appendChild(example("Card", card,
                "Card.create()\n    .add(Card.header()\n        .add(Card.title(\"Card Title\"))\n        .add(Card.description(\"A structured surface for related content.\")))\n    .add(Card.content().add(Button.create(\"Action\")));"));

        HTMLElement form = preview();
        form.appendChild(Label.create("Email").forId("email-demo").element());
        form.appendChild(Input.create().type("email").placeholder("name@example.com").attr("id", "email-demo").element());
        form.appendChild(Input.create().type("text").value("With value").element());
        form.appendChild(Input.create().type("password").placeholder("Password").element());
        grid.appendChild(example("Input", form,
                "Label.create(\"Email\").forId(\"email-demo\");\n"
                        + "Input.create()\n"
                        + "    .type(\"email\")\n"
                        + "    .placeholder(\"name@example.com\")\n"
                        + "    .attr(\"id\", \"email-demo\");\n"
                        + "Input.create().type(\"text\").value(\"With value\");\n"
                        + "Input.create().type(\"password\").placeholder(\"Password\");"));

        HTMLElement checkboxes = preview();
        checkboxes.appendChild(labelled("Accept terms", Checkbox.create().checked(true)));
        checkboxes.appendChild(labelled("Disabled", Checkbox.create().disabled(true)));
        checkboxes.appendChild(labelled("Invalid", Checkbox.create().invalid(true)));
        grid.appendChild(example("Checkbox", checkboxes,
                "Checkbox.create().checked(true);\n"
                        + "Checkbox.create().disabled(true);\n"
                        + "Checkbox.create().invalid(true);"));

        HTMLElement switches = preview();
        switches.appendChild(labelled("Notifications", Switch.create().checked(true)));
        switches.appendChild(labelled("Marketing", Switch.create()));
        switches.appendChild(labelled("Disabled", Switch.create().disabled(true)));
        grid.appendChild(example("Switch", switches,
                "Switch.create().checked(true);\n"
                        + "Switch.create();\n"
                        + "Switch.create().disabled(true);"));

        HTMLElement textareas = preview();
        textareas.appendChild(Textarea.create().placeholder("Write a message...").rows(4).element());
        textareas.appendChild(Textarea.create().value("Existing content").rows(3).element());
        textareas.appendChild(Textarea.create().placeholder("Disabled").disabled(true).element());
        grid.appendChild(example("Textarea", textareas,
                "Textarea.create()\n"
                        + "    .placeholder(\"Write a message...\")\n"
                        + "    .rows(4);\n"
                        + "Textarea.create().value(\"Existing content\").rows(3);\n"
                        + "Textarea.create().placeholder(\"Disabled\").disabled(true);"));

        HTMLElement radios = preview();
        radios.appendChild(RadioGroup.create()
                .name("density")
                .addOption("compact", "Compact")
                .addOption("comfortable", "Comfortable")
                .addOption("spacious", "Spacious")
                .value("comfortable")
                .element());
        radios.appendChild(RadioGroup.create()
                .name("billing")
                .orientation(RadioGroupOrientation.HORIZONTAL)
                .addOption("monthly", "Monthly")
                .addOption("yearly", "Yearly")
                .value("yearly")
                .element());
        radios.appendChild(RadioGroup.create()
                .name("disabled-plan")
                .addOption("team", "Team")
                .addOption("enterprise", "Enterprise")
                .disabled(true)
                .element());
        grid.appendChild(example("RadioGroup", radios,
                "RadioGroup.create()\n"
                        + "    .name(\"density\")\n"
                        + "    .addOption(\"compact\", \"Compact\")\n"
                        + "    .addOption(\"comfortable\", \"Comfortable\")\n"
                        + "    .addOption(\"spacious\", \"Spacious\")\n"
                        + "    .value(\"comfortable\");\n\n"
                        + "RadioGroup.create()\n"
                        + "    .orientation(RadioGroupOrientation.HORIZONTAL)\n"
                        + "    .addOption(\"monthly\", \"Monthly\")\n"
                        + "    .addOption(\"yearly\", \"Yearly\")\n"
                        + "    .value(\"yearly\");"));

        HTMLElement selectPreview = preview();
        selectPreview.appendChild(NativeSelect.create()
                .name("role")
                .option("admin", "Admin")
                .option("editor", "Editor")
                .option("viewer", "Viewer")
                .value("editor")
                .element());
        selectPreview.appendChild(NativeSelect.create()
                .option("", "Disabled select")
                .disabled(true)
                .element());
        grid.appendChild(example("NativeSelect", selectPreview,
                "NativeSelect.create()\n"
                        + "    .name(\"role\")\n"
                        + "    .option(\"admin\", \"Admin\")\n"
                        + "    .option(\"editor\", \"Editor\")\n"
                        + "    .option(\"viewer\", \"Viewer\")\n"
                        + "    .value(\"editor\");\n\n"
                        + "NativeSelect.create()\n"
                        + "    .option(\"\", \"Disabled select\")\n"
                        + "    .disabled(true);"));

        HTMLElement inputGroups = preview();
        inputGroups.appendChild(InputGroup.create()
                .startText("https://")
                .add(Input.create().placeholder("example.com"))
                .element());
        inputGroups.appendChild(InputGroup.create()
                .add(Input.create().type("number").placeholder("Amount"))
                .endText("EUR")
                .element());
        grid.appendChild(example("InputGroup", inputGroups,
                "InputGroup.create()\n"
                        + "    .startText(\"https://\")\n"
                        + "    .add(Input.create().placeholder(\"example.com\"));\n\n"
                        + "InputGroup.create()\n"
                        + "    .add(Input.create().type(\"number\").placeholder(\"Amount\"))\n"
                        + "    .endText(\"EUR\");"));

        HTMLElement sliders = preview();
        sliders.appendChild(Slider.create().name("volume").min(0).max(100).step(1).value(65).element());
        sliders.appendChild(Slider.create().min(0).max(10).step(0.5).value(4.5).disabled(true).element());
        grid.appendChild(example("Slider", sliders,
                "Slider.create()\n"
                        + "    .name(\"volume\")\n"
                        + "    .min(0)\n"
                        + "    .max(100)\n"
                        + "    .step(1)\n"
                        + "    .value(65);\n\n"
                        + "Slider.create().min(0).max(10).step(0.5).value(4.5).disabled(true);"));

        HTMLElement composedForm = preview("demo-form-preview");
        composedForm.appendChild(FormField.create("profile-email")
                .label("Email")
                .control(Input.create().type("email").placeholder("name@example.com").required(true))
                .description("Used for account notifications.")
                .element());
        composedForm.appendChild(FormField.create("profile-bio")
                .label("Bio")
                .control(Textarea.create().placeholder("Tell us about your work...").rows(3))
                .description("Keep it short and specific.")
                .element());
        composedForm.appendChild(FormField.create("profile-role")
                .label("Role")
                .control(NativeSelect.create()
                        .option("admin", "Admin")
                        .option("editor", "Editor")
                        .option("viewer", "Viewer")
                        .value("viewer"))
                .element());
        composedForm.appendChild(FormField.create("profile-name")
                .label("Validation state")
                .control(Input.create().value("A").invalid(true))
                .message("Name must contain at least 2 characters.")
                .element());
        grid.appendChild(example("Form composition", composedForm,
                "FormField.create(\"profile-email\")\n"
                        + "    .label(\"Email\")\n"
                        + "    .control(Input.create()\n"
                        + "        .type(\"email\")\n"
                        + "        .placeholder(\"name@example.com\")\n"
                        + "        .required(true))\n"
                        + "    .description(\"Used for account notifications.\");\n\n"
                        + "FormField.create(\"profile-name\")\n"
                        + "    .label(\"Validation state\")\n"
                        + "    .control(Input.create().value(\"A\").invalid(true))\n"
                        + "    .message(\"Name must contain at least 2 characters.\");"));

        HTMLElement alerts = preview();
        alerts.appendChild(Alert.create()
                .add(Alert.title("Heads up"))
                .add(Alert.description("Alert components use roles and theme tokens."))
                .element());
        alerts.appendChild(Alert.create()
                .variant(AlertVariant.DESTRUCTIVE)
                .add(Alert.title("Error"))
                .add(Alert.description("The destructive style uses its own variant."))
                .element());
        grid.appendChild(example("Alert", alerts,
                "Alert.create()\n"
                        + "    .add(Alert.title(\"Heads up\"))\n"
                        + "    .add(Alert.description(\"Alert components use roles and theme tokens.\"));\n\n"
                        + "Alert.create()\n"
                        + "    .variant(AlertVariant.DESTRUCTIVE)\n"
                        + "    .add(Alert.title(\"Error\"))\n"
                        + "    .add(Alert.description(\"The destructive style uses its own variant.\"));"));

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
        content.appendChild(textElement("p", "demo-muted", "Themes are controlled through CSS variables and the root .dark class. ThemeManager.setMode(...) is the Java API for switching modes."));
        content.appendChild(example("ThemeManager",
                Button.create("Enable dark mode").variant(ButtonVariant.OUTLINE).onClick(event -> ThemeManager.setMode(ThemeMode.DARK)),
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

    private HTMLElement preview(String extraClass) {
        HTMLElement preview = preview();
        preview.className = preview.className + " " + extraClass;
        return preview;
    }

    private HTMLElement code(String code) {
        return CodeBlock.create(code).language("java").classes("demo-code").element();
    }

    private UiComponent raw(HTMLElement element) {
        return () -> element;
    }

    private HTMLElement labelled(String label, UiComponent component) {
        HTMLElement wrapper = element("label", "demo-control-label");
        wrapper.appendChild(component.element());
        wrapper.appendChild(textElement("span", "", label));
        return wrapper;
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
