package org.gwtfusion.ui.component.icon;

public enum IconTheme {
    STROKE("none", "currentColor", 2),
    FILLED("currentColor", "none", 0);

    private final String fill;
    private final String stroke;
    private final double strokeWidth;

    IconTheme(String fill, String stroke, double strokeWidth) {
        this.fill = fill;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    public String fill() {
        return fill;
    }

    public String stroke() {
        return stroke;
    }

    public double strokeWidth() {
        return strokeWidth;
    }
}
