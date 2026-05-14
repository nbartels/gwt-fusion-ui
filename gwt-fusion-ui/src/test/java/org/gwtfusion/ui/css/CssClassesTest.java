package org.gwtfusion.ui.css;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class CssClassesTest {
    @Test
    void tokensIgnoresEmptyWhitespace() {
        assertTrue(CssClasses.tokens("  \t  ").isEmpty());
    }

    @Test
    void tokensSplitsWhitespaceSeparatedClasses() {
        assertEquals(List.of("bg-primary", "text-primary-foreground", "hover:bg-primary/90"),
                CssClasses.tokens(" bg-primary   text-primary-foreground\nhover:bg-primary/90 "));
    }

    @Test
    void joinKeepsOrderAndRemovesDuplicates() {
        assertEquals("inline-flex rounded-md text-sm",
                CssClasses.join("inline-flex rounded-md", "rounded-md text-sm"));
    }
}
