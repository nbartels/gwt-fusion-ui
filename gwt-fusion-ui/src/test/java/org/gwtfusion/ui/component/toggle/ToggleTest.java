package org.gwtfusion.ui.component.toggle;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ToggleTest {
    @Test
    void variantsSizesAndPressedClassesExposeStateTokens() {
        assertTrue(Toggle.BASE_CLASSES.contains("focus-visible:ring-ring"));
        assertTrue(Toggle.PRESSED_CLASSES.contains("bg-accent"));
        assertTrue(ToggleVariant.OUTLINE.classes().contains("border"));
        assertTrue(ToggleSize.SM.classes().contains("h-8"));
    }
}
