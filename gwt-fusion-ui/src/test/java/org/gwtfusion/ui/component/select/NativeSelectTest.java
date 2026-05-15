package org.gwtfusion.ui.component.select;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NativeSelectTest {
    @Test
    void baseClassesExposeNativeSelectStyling() {
        assertTrue(NativeSelect.BASE_CLASSES.contains("h-9"));
        assertTrue(NativeSelect.BASE_CLASSES.contains("border-input"));
        assertTrue(NativeSelect.BASE_CLASSES.contains("focus-visible:ring-ring"));
    }

    @Test
    void invalidClassesUseDestructiveToken() {
        assertTrue(NativeSelect.INVALID_CLASSES.contains("border-destructive"));
    }
}
