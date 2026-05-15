package org.gwtfusion.ui.component.inputgroup;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class InputGroupTest {
    @Test
    void baseClassesExposeGroupedInputStyling() {
        assertTrue(InputGroup.BASE_CLASSES.contains("overflow-hidden"));
        assertTrue(InputGroup.BASE_CLASSES.contains("focus-within:ring-ring"));
    }

    @Test
    void addonClassesExposeMutedAddons() {
        assertTrue(InputGroup.ADDON_CLASSES.contains("bg-muted"));
        assertTrue(InputGroup.START_ADDON_CLASSES.contains("border-r"));
        assertTrue(InputGroup.END_ADDON_CLASSES.contains("border-l"));
    }
}
