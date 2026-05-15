package org.gwtfusion.ui.component.textarea;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TextareaTest {
    @Test
    void baseClassesExposeTextareaStyling() {
        assertTrue(Textarea.BASE_CLASSES.contains("min-h-16"));
        assertTrue(Textarea.BASE_CLASSES.contains("w-full"));
        assertTrue(Textarea.BASE_CLASSES.contains("placeholder:text-muted-foreground"));
    }

    @Test
    void invalidClassesUseDestructiveToken() {
        assertTrue(Textarea.INVALID_CLASSES.contains("border-destructive"));
    }
}
