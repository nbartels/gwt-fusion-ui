package org.gwtfusion.ui.component.icon;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import org.gwtfusion.ui.BaseComponent;

public final class Icon extends BaseComponent<Icon> {
    public static final String ROOT_CLASSES = "inline-flex shrink-0 items-center justify-center";
    public static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";

    private final Element svg;
    private IconVariant variant;

    private Icon(HTMLElement element, String viewBox) {
        super(element);
        classes(ROOT_CLASSES);
        svg = DomGlobal.document.createElementNS(SVG_NAMESPACE, "svg");
        svg.setAttribute("xmlns", SVG_NAMESPACE);
        svg.setAttribute("viewBox", viewBox == null || viewBox.isEmpty() ? "0 0 24 24" : viewBox);
        svg.setAttribute("fill", IconTheme.STROKE.fill());
        svg.setAttribute("stroke", IconTheme.STROKE.stroke());
        svg.setAttribute("stroke-width", String.valueOf(IconTheme.STROKE.strokeWidth()));
        svg.setAttribute("stroke-linecap", "round");
        svg.setAttribute("stroke-linejoin", "round");
        element.appendChild(svg);
        size(IconSize.MD);
        decorative();
    }

    public static Icon create() {
        return svg("0 0 24 24");
    }

    public static Icon svg(String viewBox) {
        return new Icon((HTMLElement) DomGlobal.document.createElement("span"), viewBox);
    }

    public Icon theme(IconTheme theme) {
        IconTheme nextTheme = theme == null ? IconTheme.STROKE : theme;
        svg.setAttribute("fill", nextTheme.fill());
        svg.setAttribute("stroke", nextTheme.stroke());
        return strokeWidth(nextTheme.strokeWidth());
    }

    public Icon variant(IconVariant variant) {
        if (this.variant != null) {
            removeClasses(this.variant.classes());
        }
        this.variant = variant == null ? IconVariant.DEFAULT : variant;
        return classes(this.variant.classes());
    }

    public Icon size(IconSize size) {
        IconSize nextSize = size == null ? IconSize.MD : size;
        return size(nextSize.pixels());
    }

    public Icon size(int pixels) {
        int safePixels = Math.max(1, pixels);
        svg.setAttribute("width", String.valueOf(safePixels));
        svg.setAttribute("height", String.valueOf(safePixels));
        element().style.setProperty("width", safePixels + "px");
        element().style.setProperty("height", safePixels + "px");
        return this;
    }

    public Icon strokeWidth(double strokeWidth) {
        svg.setAttribute("stroke-width", String.valueOf(Math.max(0, strokeWidth)));
        return this;
    }

    public Icon ariaLabel(String label) {
        String safeLabel = label == null ? "" : label;
        attr("role", "img");
        attr("aria-label", safeLabel);
        attr("aria-hidden", null);
        return this;
    }

    public Icon decorative() {
        attr("aria-hidden", "true");
        attr("aria-label", null);
        attr("role", null);
        return this;
    }

    public Icon path(String d) {
        Element path = DomGlobal.document.createElementNS(SVG_NAMESPACE, "path");
        path.setAttribute("d", d == null ? "" : d);
        svg.appendChild(path);
        return this;
    }

    public Icon circle(double cx, double cy, double r) {
        Element circle = DomGlobal.document.createElementNS(SVG_NAMESPACE, "circle");
        circle.setAttribute("cx", String.valueOf(cx));
        circle.setAttribute("cy", String.valueOf(cy));
        circle.setAttribute("r", String.valueOf(r));
        svg.appendChild(circle);
        return this;
    }

    public Icon line(double x1, double y1, double x2, double y2) {
        Element line = DomGlobal.document.createElementNS(SVG_NAMESPACE, "line");
        line.setAttribute("x1", String.valueOf(x1));
        line.setAttribute("y1", String.valueOf(y1));
        line.setAttribute("x2", String.valueOf(x2));
        line.setAttribute("y2", String.valueOf(y2));
        svg.appendChild(line);
        return this;
    }

    public Icon polyline(String points) {
        Element polyline = DomGlobal.document.createElementNS(SVG_NAMESPACE, "polyline");
        polyline.setAttribute("points", points == null ? "" : points);
        svg.appendChild(polyline);
        return this;
    }
}
