package org.gwtfusion.ui.component.radio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RadioGroupTest {
    @Test
    void orientationClassesExposeLayoutDirection() {
        assertTrue(RadioGroupOrientation.VERTICAL.classes().contains("flex-col"));
        assertTrue(RadioGroupOrientation.HORIZONTAL.classes().contains("flex-row"));
    }

    @Test
    void optionClassesExposeRadioStyling() {
        assertTrue(RadioGroup.OPTION_CLASSES.contains("items-center"));
        assertTrue(RadioGroup.INPUT_CLASSES.contains("accent-primary"));
    }
}
