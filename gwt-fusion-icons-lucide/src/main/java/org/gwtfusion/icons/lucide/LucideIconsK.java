package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsK {
    private static final String[] NAMES = {"kanban", "kanban-square", "kanban-square-dashed", "kayak", "key", "key-round", "key-square", "keyboard", "keyboard-music", "keyboard-off"};

    private LucideIconsK() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("kanban".equals(name)) {
            return kanban();
        }
        if ("kanban-square".equals(name)) {
            return kanbanSquare();
        }
        if ("kanban-square-dashed".equals(name)) {
            return kanbanSquareDashed();
        }
        if ("kayak".equals(name)) {
            return kayak();
        }
        if ("key".equals(name)) {
            return key();
        }
        if ("key-round".equals(name)) {
            return keyRound();
        }
        if ("key-square".equals(name)) {
            return keySquare();
        }
        if ("keyboard".equals(name)) {
            return keyboard();
        }
        if ("keyboard-music".equals(name)) {
            return keyboardMusic();
        }
        if ("keyboard-off".equals(name)) {
            return keyboardOff();
        }
        return null;
    }

    static Icon kanban() {
        return Icon.create()
                .element("path", "d", "M5 3v14")
                .element("path", "d", "M12 3v8")
                .element("path", "d", "M19 3v18");
    }

    static Icon kanbanSquare() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("path", "d", "M8 7v7")
                .element("path", "d", "M12 7v4")
                .element("path", "d", "M16 7v9");
    }

    static Icon kanbanSquareDashed() {
        return Icon.create()
                .element("path", "d", "M8 7v7")
                .element("path", "d", "M12 7v4")
                .element("path", "d", "M16 7v9")
                .element("path", "d", "M5 3a2 2 0 0 0-2 2")
                .element("path", "d", "M9 3h1")
                .element("path", "d", "M14 3h1")
                .element("path", "d", "M19 3a2 2 0 0 1 2 2")
                .element("path", "d", "M21 9v1")
                .element("path", "d", "M21 14v1")
                .element("path", "d", "M21 19a2 2 0 0 1-2 2")
                .element("path", "d", "M14 21h1")
                .element("path", "d", "M9 21h1")
                .element("path", "d", "M5 21a2 2 0 0 1-2-2")
                .element("path", "d", "M3 14v1")
                .element("path", "d", "M3 9v1");
    }

    static Icon kayak() {
        return Icon.create()
                .element("path", "d", "M18 17a1 1 0 0 0-1 1v1a2 2 0 1 0 2-2z")
                .element("path", "d", "M20.97 3.61a.45.45 0 0 0-.58-.58C10.2 6.6 6.6 10.2 3.03 20.39a.45.45 0 0 0 .58.58C13.8 17.4 17.4 13.8 20.97 3.61")
                .element("path", "d", "m6.707 6.707 10.586 10.586")
                .element("path", "d", "M7 5a2 2 0 1 0-2 2h1a1 1 0 0 0 1-1z");
    }

    static Icon key() {
        return Icon.create()
                .element("path", "d", "m15.5 7.5 2.3 2.3a1 1 0 0 0 1.4 0l2.1-2.1a1 1 0 0 0 0-1.4L19 4")
                .element("path", "d", "m21 2-9.6 9.6")
                .element("circle", "cx", "7.5", "cy", "15.5", "r", "5.5");
    }

    static Icon keyRound() {
        return Icon.create()
                .element("path", "d", "M2.586 17.414A2 2 0 0 0 2 18.828V21a1 1 0 0 0 1 1h3a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1h1a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1h.172a2 2 0 0 0 1.414-.586l.814-.814a6.5 6.5 0 1 0-4-4z")
                .element("circle", "cx", "16.5", "cy", "7.5", "r", ".5", "fill", "currentColor");
    }

    static Icon keySquare() {
        return Icon.create()
                .element("path", "d", "M12.4 2.7a2.5 2.5 0 0 1 3.4 0l5.5 5.5a2.5 2.5 0 0 1 0 3.4l-3.7 3.7a2.5 2.5 0 0 1-3.4 0L8.7 9.8a2.5 2.5 0 0 1 0-3.4z")
                .element("path", "d", "m14 7 3 3")
                .element("path", "d", "m9.4 10.6-6.814 6.814A2 2 0 0 0 2 18.828V21a1 1 0 0 0 1 1h3a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1h1a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1h.172a2 2 0 0 0 1.414-.586l.814-.814");
    }

    static Icon keyboard() {
        return Icon.create()
                .element("path", "d", "M10 8h.01")
                .element("path", "d", "M12 12h.01")
                .element("path", "d", "M14 8h.01")
                .element("path", "d", "M16 12h.01")
                .element("path", "d", "M18 8h.01")
                .element("path", "d", "M6 8h.01")
                .element("path", "d", "M7 16h10")
                .element("path", "d", "M8 12h.01")
                .element("rect", "width", "20", "height", "16", "x", "2", "y", "4", "rx", "2");
    }

    static Icon keyboardMusic() {
        return Icon.create()
                .element("rect", "width", "20", "height", "16", "x", "2", "y", "4", "rx", "2")
                .element("path", "d", "M6 8h4")
                .element("path", "d", "M14 8h.01")
                .element("path", "d", "M18 8h.01")
                .element("path", "d", "M2 12h20")
                .element("path", "d", "M6 12v4")
                .element("path", "d", "M10 12v4")
                .element("path", "d", "M14 12v4")
                .element("path", "d", "M18 12v4");
    }

    static Icon keyboardOff() {
        return Icon.create()
                .element("path", "d", "M 20 4 A2 2 0 0 1 22 6")
                .element("path", "d", "M 22 6 L 22 16.41")
                .element("path", "d", "M 7 16 L 16 16")
                .element("path", "d", "M 9.69 4 L 20 4")
                .element("path", "d", "M14 8h.01")
                .element("path", "d", "M18 8h.01")
                .element("path", "d", "m2 2 20 20")
                .element("path", "d", "M20 20H4a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2")
                .element("path", "d", "M6 8h.01")
                .element("path", "d", "M8 12h.01");
    }
}
