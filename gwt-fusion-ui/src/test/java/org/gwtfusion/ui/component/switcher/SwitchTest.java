package org.gwtfusion.ui.component.switcher;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SwitchTest {
    @Test
    void baseClassesExposeSwitchTrackStyling() {
        assertTrue(Switch.BASE_CLASSES.contains("rounded-full"));
        assertTrue(Switch.BASE_CLASSES.contains("focus-visible:ring-ring"));
    }

    @Test
    void checkedAndUncheckedClassesAreDistinct() {
        assertTrue(Switch.CHECKED_CLASSES.contains("bg-primary"));
        assertTrue(Switch.UNCHECKED_CLASSES.contains("bg-input"));
        assertTrue(Switch.THUMB_CHECKED_CLASSES.contains("translate-x-4"));
        assertTrue(Switch.THUMB_UNCHECKED_CLASSES.contains("translate-x-0"));
    }
}
