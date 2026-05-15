package org.gwtfusion.ui.component.togglegroup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ToggleGroupTest {
    @Test
    void exposesGroupStylingAndTypes() {
        assertTrue(ToggleGroup.BASE_CLASSES.contains("inline-flex"));
        assertEquals(ToggleGroupType.SINGLE, ToggleGroupType.valueOf("SINGLE"));
        assertEquals(ToggleGroupType.MULTIPLE, ToggleGroupType.valueOf("MULTIPLE"));
    }
}
