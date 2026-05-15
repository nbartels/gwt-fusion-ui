package org.gwtfusion.ui.component.checkbox;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckboxTest {
    @Test
    void baseClassesExposeNativeCheckboxStyling() {
        assertTrue(Checkbox.BASE_CLASSES.contains("h-4"));
        assertTrue(Checkbox.BASE_CLASSES.contains("accent-primary"));
        assertTrue(Checkbox.BASE_CLASSES.contains("disabled:opacity-50"));
    }

    @Test
    void invalidClassesUseDestructiveToken() {
        assertTrue(Checkbox.INVALID_CLASSES.contains("border-destructive"));
    }
}
