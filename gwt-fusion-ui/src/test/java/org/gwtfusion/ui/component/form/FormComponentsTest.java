package org.gwtfusion.ui.component.form;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FormComponentsTest {
    @Test
    void formFieldUsesGridLayout() {
        assertTrue(FormField.BASE_CLASSES.contains("grid"));
        assertTrue(FormField.BASE_CLASSES.contains("gap-2"));
    }

    @Test
    void formTextComponentsUseExpectedTokens() {
        assertTrue(FormLabel.BASE_CLASSES.contains("text-sm"));
        assertTrue(FormDescription.BASE_CLASSES.contains("text-muted-foreground"));
        assertTrue(FormMessage.BASE_CLASSES.contains("text-destructive"));
    }
}
