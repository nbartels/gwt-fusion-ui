package org.gwtfusion.ui.component.collapsible;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CollapsibleTest {
    @Test
    void classesExposeCollapsibleStructure() {
        assertTrue(Collapsible.ROOT_CLASSES.contains("grid"));
        assertTrue(Collapsible.TRIGGER_CLASSES.contains("aria") || Collapsible.TRIGGER_CLASSES.contains("rounded-md"));
        assertTrue(Collapsible.CONTENT_CLASSES.contains("overflow-hidden"));
    }
}
