package org.gwtfusion.ui.theme;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ThemeModeTest {
    @Test
    void darkModeRequiresDarkRootClassByDefault() {
        assertTrue(ThemeMode.DARK.darkClassByDefault());
        assertFalse(ThemeMode.LIGHT.darkClassByDefault());
        assertFalse(ThemeMode.SYSTEM.darkClassByDefault());
    }
}
