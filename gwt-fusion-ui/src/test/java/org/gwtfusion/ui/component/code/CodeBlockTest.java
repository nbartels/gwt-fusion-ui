package org.gwtfusion.ui.component.code;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CodeBlockTest {
    @Test
    void classesExposeCodeBlockStyling() {
        assertTrue(CodeBlock.BASE_CLASSES.contains("bg-muted"));
        assertTrue(CodeBlock.BASE_CLASSES.contains("overflow-auto"));
        assertTrue(CodeBlock.BASE_CLASSES.contains("whitespace-pre"));
        assertTrue(CodeBlock.CODE_CLASSES.contains("font-mono"));
    }
}
