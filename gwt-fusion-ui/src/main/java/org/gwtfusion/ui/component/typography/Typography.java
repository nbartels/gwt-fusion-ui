package org.gwtfusion.ui.component.typography;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Typography {
    public static final String H1_CLASSES = "text-4xl font-bold tracking-tight";
    public static final String H2_CLASSES = "text-2xl font-semibold tracking-tight";
    public static final String P_CLASSES = "text-sm leading-7";
    public static final String LEAD_CLASSES = "text-xl text-muted-foreground";
    public static final String MUTED_CLASSES = "text-sm text-muted-foreground";
    public static final String BLOCKQUOTE_CLASSES = "border-l-4 pl-4 italic text-muted-foreground";
    public static final String INLINE_CODE_CLASSES = "rounded bg-muted px-1.5 py-0.5 font-mono text-sm";

    private Typography() {
    }

    public static Text h1(String text) {
        return Text.create("h1", H1_CLASSES, text);
    }

    public static Text h2(String text) {
        return Text.create("h2", H2_CLASSES, text);
    }

    public static Text p(String text) {
        return Text.create("p", P_CLASSES, text);
    }

    public static Text lead(String text) {
        return Text.create("p", LEAD_CLASSES, text);
    }

    public static Text muted(String text) {
        return Text.create("p", MUTED_CLASSES, text);
    }

    public static Text blockquote(String text) {
        return Text.create("blockquote", BLOCKQUOTE_CLASSES, text);
    }

    public static Text inlineCode(String text) {
        return Text.create("code", INLINE_CODE_CLASSES, text);
    }

    public static final class Text extends BaseComponent<Text> {
        private Text(HTMLElement element) {
            super(element);
        }

        private static Text create(String tagName, String classes, String text) {
            return new Text((HTMLElement) DomGlobal.document.createElement(tagName)).classes(classes).text(text);
        }
    }
}
