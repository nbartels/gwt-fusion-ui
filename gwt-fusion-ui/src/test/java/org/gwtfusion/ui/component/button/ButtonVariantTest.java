package org.gwtfusion.ui.component.button;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ButtonVariantTest {
    @Test
    void defaultVariantUsesThemeTokens() {
        assertTrue(ButtonVariant.DEFAULT.classes().contains("bg-primary"));
        assertTrue(ButtonVariant.DEFAULT.classes().contains("text-primary-foreground"));
    }

    @Test
    void sizesExposeStableTailwindClasses() {
        assertTrue(ButtonSize.SM.classes().contains("h-8"));
        assertTrue(ButtonSize.MD.classes().contains("h-9"));
        assertTrue(ButtonSize.LG.classes().contains("h-10"));
    }
}
