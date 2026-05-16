package org.gwtfusion.ui.component.icon;

public final class LucideIcons {
    private LucideIcons() {
    }

    public static IconProvider provider() {
        return name -> {
            if ("check".equals(name)) {
                return check();
            }
            if ("search".equals(name)) {
                return search();
            }
            if ("x".equals(name)) {
                return x();
            }
            return null;
        };
    }

    public static Icon check() {
        return Icon.create().polyline("20 6 9 17 4 12");
    }

    public static Icon search() {
        return Icon.create()
                .circle(11, 11, 8)
                .path("m21 21-4.3-4.3");
    }

    public static Icon x() {
        return Icon.create()
                .path("M18 6 6 18")
                .path("m6 6 12 12");
    }
}
