package org.gwtfusion.ui.component.slider;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SliderTest {
    @Test
    void baseClassesExposeRangeInputStyling() {
        assertTrue(Slider.BASE_CLASSES.contains("appearance-none"));
        assertTrue(Slider.BASE_CLASSES.contains("accent-primary"));
        assertTrue(Slider.BASE_CLASSES.contains("rounded-full"));
    }
}
