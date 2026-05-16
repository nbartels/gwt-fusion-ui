package org.gwtfusion.ui.component.icon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IconTest {
    @Test
    void exposesStableIconContracts() throws NoSuchMethodException {
        assertTrue(Icon.ROOT_CLASSES.contains("inline-flex"));
        assertEquals("http://www.w3.org/2000/svg", Icon.SVG_NAMESPACE);

        Icon.class.getMethod("size", int.class);
        Icon.class.getMethod("strokeWidth", double.class);
        Icon.class.getMethod("ariaLabel", String.class);
        Icon.class.getMethod("decorative");
    }

    @Test
    void enumsExposeIconStylingOptions() {
        assertEquals(20, IconSize.MD.pixels());
        assertEquals("text-primary", IconVariant.PRIMARY.classes());
        assertEquals("currentColor", IconTheme.STROKE.stroke());
    }

    @Test
    void registryKeepsProvidersExplicit() {
        IconRegistry registry = IconRegistry.create();
        IconProvider provider = name -> null;

        assertSame(registry, registry.register("lucide", provider));
        assertNull(registry.icon("lucide", "missing"));
        assertNull(registry.icon("missing", "search"));
    }

    @Test
    void lucideProofOfConceptExposesProvider() {
        assertNotNull(LucideIcons.provider());
    }
}
