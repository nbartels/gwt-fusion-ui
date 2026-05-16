package org.gwtfusion.icons.lucide;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.icon.Icon;
import org.junit.jupiter.api.Test;

class LucideIconsTest {
    @Test
    void exposesProviderAndSupportedNamesWithoutGlobalRegistration() throws NoSuchMethodException {
        assertNotNull(LucideIcons.provider());
        assertEquals(1960, LucideIcons.names().length);
        LucideIcons.class.getMethod("icon", String.class);
        LucideIcons.class.getMethod("search");
        assertEquals(Icon.class, LucideIcons.class.getMethod("icon", String.class).getReturnType());
        assertTrue(new LucideIconProvider().supports("search"));
        assertTrue(new LucideIconProvider().supports("settings"));
        assertTrue(new LucideIconProvider().supports("arrow-down-0-1"));
        assertFalse(new LucideIconProvider().supports("unknown"));
    }
}
