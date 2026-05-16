package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsW {
    private static final String[] NAMES = {"wallet", "wallet-2", "wallet-cards", "wallet-minimal", "wallpaper", "wand", "wand-2", "wand-sparkles", "warehouse", "washing-machine", "watch", "waves", "waves-arrow-down", "waves-arrow-up", "waves-horizontal", "waves-ladder", "waves-vertical", "waypoints", "webcam", "webhook", "webhook-off", "weight", "weight-tilde", "wheat", "wheat-off", "whole-word", "wifi", "wifi-cog", "wifi-high", "wifi-low", "wifi-off", "wifi-pen", "wifi-sync", "wifi-zero", "wind", "wind-arrow-down", "wine", "wine-off", "workflow", "worm", "wrap-text", "wrench"};

    private LucideIconsW() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("wallet".equals(name)) {
            return wallet();
        }
        if ("wallet-2".equals(name)) {
            return walletN2();
        }
        if ("wallet-cards".equals(name)) {
            return walletCards();
        }
        if ("wallet-minimal".equals(name)) {
            return walletMinimal();
        }
        if ("wallpaper".equals(name)) {
            return wallpaper();
        }
        if ("wand".equals(name)) {
            return wand();
        }
        if ("wand-2".equals(name)) {
            return wandN2();
        }
        if ("wand-sparkles".equals(name)) {
            return wandSparkles();
        }
        if ("warehouse".equals(name)) {
            return warehouse();
        }
        if ("washing-machine".equals(name)) {
            return washingMachine();
        }
        if ("watch".equals(name)) {
            return watch();
        }
        if ("waves".equals(name)) {
            return waves();
        }
        if ("waves-arrow-down".equals(name)) {
            return wavesArrowDown();
        }
        if ("waves-arrow-up".equals(name)) {
            return wavesArrowUp();
        }
        if ("waves-horizontal".equals(name)) {
            return wavesHorizontal();
        }
        if ("waves-ladder".equals(name)) {
            return wavesLadder();
        }
        if ("waves-vertical".equals(name)) {
            return wavesVertical();
        }
        if ("waypoints".equals(name)) {
            return waypoints();
        }
        if ("webcam".equals(name)) {
            return webcam();
        }
        if ("webhook".equals(name)) {
            return webhook();
        }
        if ("webhook-off".equals(name)) {
            return webhookOff();
        }
        if ("weight".equals(name)) {
            return weight();
        }
        if ("weight-tilde".equals(name)) {
            return weightTilde();
        }
        if ("wheat".equals(name)) {
            return wheat();
        }
        if ("wheat-off".equals(name)) {
            return wheatOff();
        }
        if ("whole-word".equals(name)) {
            return wholeWord();
        }
        if ("wifi".equals(name)) {
            return wifi();
        }
        if ("wifi-cog".equals(name)) {
            return wifiCog();
        }
        if ("wifi-high".equals(name)) {
            return wifiHigh();
        }
        if ("wifi-low".equals(name)) {
            return wifiLow();
        }
        if ("wifi-off".equals(name)) {
            return wifiOff();
        }
        if ("wifi-pen".equals(name)) {
            return wifiPen();
        }
        if ("wifi-sync".equals(name)) {
            return wifiSync();
        }
        if ("wifi-zero".equals(name)) {
            return wifiZero();
        }
        if ("wind".equals(name)) {
            return wind();
        }
        if ("wind-arrow-down".equals(name)) {
            return windArrowDown();
        }
        if ("wine".equals(name)) {
            return wine();
        }
        if ("wine-off".equals(name)) {
            return wineOff();
        }
        if ("workflow".equals(name)) {
            return workflow();
        }
        if ("worm".equals(name)) {
            return worm();
        }
        if ("wrap-text".equals(name)) {
            return wrapText();
        }
        if ("wrench".equals(name)) {
            return wrench();
        }
        return null;
    }

    static Icon wallet() {
        return Icon.create()
                .element("path", "d", "M19 7V4a1 1 0 0 0-1-1H5a2 2 0 0 0 0 4h15a1 1 0 0 1 1 1v4h-3a2 2 0 0 0 0 4h3a1 1 0 0 0 1-1v-2a1 1 0 0 0-1-1")
                .element("path", "d", "M3 5v14a2 2 0 0 0 2 2h15a1 1 0 0 0 1-1v-4");
    }

    static Icon walletN2() {
        return Icon.create()
                .element("path", "d", "M17 14h.01")
                .element("path", "d", "M7 7h12a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h14");
    }

    static Icon walletCards() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("path", "d", "M3 9a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2")
                .element("path", "d", "M3 11h3c.8 0 1.6.3 2.1.9l1.1.9c1.6 1.6 4.1 1.6 5.7 0l1.1-.9c.5-.5 1.3-.9 2.1-.9H21");
    }

    static Icon walletMinimal() {
        return Icon.create()
                .element("path", "d", "M17 14h.01")
                .element("path", "d", "M7 7h12a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h14");
    }

    static Icon wallpaper() {
        return Icon.create()
                .element("path", "d", "M12 17v4")
                .element("path", "d", "M8 21h8")
                .element("path", "d", "m9 17 6.1-6.1a2 2 0 0 1 2.81.01L22 15")
                .element("circle", "cx", "8", "cy", "9", "r", "2")
                .element("rect", "x", "2", "y", "3", "width", "20", "height", "14", "rx", "2");
    }

    static Icon wand() {
        return Icon.create()
                .element("path", "d", "M15 4V2")
                .element("path", "d", "M15 16v-2")
                .element("path", "d", "M8 9h2")
                .element("path", "d", "M20 9h2")
                .element("path", "d", "M17.8 11.8 19 13")
                .element("path", "d", "M15 9h.01")
                .element("path", "d", "M17.8 6.2 19 5")
                .element("path", "d", "m3 21 9-9")
                .element("path", "d", "M12.2 6.2 11 5");
    }

    static Icon wandN2() {
        return Icon.create()
                .element("path", "d", "m21.64 3.64-1.28-1.28a1.21 1.21 0 0 0-1.72 0L2.36 18.64a1.21 1.21 0 0 0 0 1.72l1.28 1.28a1.2 1.2 0 0 0 1.72 0L21.64 5.36a1.2 1.2 0 0 0 0-1.72")
                .element("path", "d", "m14 7 3 3")
                .element("path", "d", "M5 6v4")
                .element("path", "d", "M19 14v4")
                .element("path", "d", "M10 2v2")
                .element("path", "d", "M7 8H3")
                .element("path", "d", "M21 16h-4")
                .element("path", "d", "M11 3H9");
    }

    static Icon wandSparkles() {
        return Icon.create()
                .element("path", "d", "m21.64 3.64-1.28-1.28a1.21 1.21 0 0 0-1.72 0L2.36 18.64a1.21 1.21 0 0 0 0 1.72l1.28 1.28a1.2 1.2 0 0 0 1.72 0L21.64 5.36a1.2 1.2 0 0 0 0-1.72")
                .element("path", "d", "m14 7 3 3")
                .element("path", "d", "M5 6v4")
                .element("path", "d", "M19 14v4")
                .element("path", "d", "M10 2v2")
                .element("path", "d", "M7 8H3")
                .element("path", "d", "M21 16h-4")
                .element("path", "d", "M11 3H9");
    }

    static Icon warehouse() {
        return Icon.create()
                .element("path", "d", "M18 21V10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1v11")
                .element("path", "d", "M22 19a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V8a2 2 0 0 1 1.132-1.803l7.95-3.974a2 2 0 0 1 1.837 0l7.948 3.974A2 2 0 0 1 22 8z")
                .element("path", "d", "M6 13h12")
                .element("path", "d", "M6 17h12");
    }

    static Icon washingMachine() {
        return Icon.create()
                .element("path", "d", "M3 6h3")
                .element("path", "d", "M17 6h.01")
                .element("rect", "width", "18", "height", "20", "x", "3", "y", "2", "rx", "2")
                .element("circle", "cx", "12", "cy", "13", "r", "5")
                .element("path", "d", "M12 18a2.5 2.5 0 0 0 0-5 2.5 2.5 0 0 1 0-5");
    }

    static Icon watch() {
        return Icon.create()
                .element("path", "d", "M12 10v2.2l1.6 1")
                .element("path", "d", "m16.13 7.66-.81-4.05a2 2 0 0 0-2-1.61h-2.68a2 2 0 0 0-2 1.61l-.78 4.05")
                .element("path", "d", "m7.88 16.36.8 4a2 2 0 0 0 2 1.61h2.72a2 2 0 0 0 2-1.61l.81-4.05")
                .element("circle", "cx", "12", "cy", "12", "r", "6");
    }

    static Icon waves() {
        return Icon.create()
                .element("path", "d", "M2 12q2.5 2 5 0t5 0 5 0 5 0")
                .element("path", "d", "M2 19q2.5 2 5 0t5 0 5 0 5 0")
                .element("path", "d", "M2 5q2.5 2 5 0t5 0 5 0 5 0");
    }

    static Icon wavesArrowDown() {
        return Icon.create()
                .element("path", "d", "M12 10L12 2")
                .element("path", "d", "M16 6L12 10L8 6")
                .element("path", "d", "M2 15C2.6 15.5 3.2 16 4.5 16C7 16 7 14 9.5 14C12.1 14 11.9 16 14.5 16C17 16 17 14 19.5 14C20.8 14 21.4 14.5 22 15")
                .element("path", "d", "M2 21C2.6 21.5 3.2 22 4.5 22C7 22 7 20 9.5 20C12.1 20 11.9 22 14.5 22C17 22 17 20 19.5 20C20.8 20 21.4 20.5 22 21");
    }

    static Icon wavesArrowUp() {
        return Icon.create()
                .element("path", "d", "M12 2v8")
                .element("path", "d", "M2 15c.6.5 1.2 1 2.5 1 2.5 0 2.5-2 5-2 2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9.5 2.5 1")
                .element("path", "d", "M2 21c.6.5 1.2 1 2.5 1 2.5 0 2.5-2 5-2 2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9.5 2.5 1")
                .element("path", "d", "m8 6 4-4 4 4");
    }

    static Icon wavesHorizontal() {
        return Icon.create()
                .element("path", "d", "M2 12q2.5 2 5 0t5 0 5 0 5 0")
                .element("path", "d", "M2 19q2.5 2 5 0t5 0 5 0 5 0")
                .element("path", "d", "M2 5q2.5 2 5 0t5 0 5 0 5 0");
    }

    static Icon wavesLadder() {
        return Icon.create()
                .element("path", "d", "M19 5a2 2 0 0 0-2 2v11")
                .element("path", "d", "M2 18c.6.5 1.2 1 2.5 1 2.5 0 2.5-2 5-2 2.6 0 2.4 2 5 2 2.5 0 2.5-2 5-2 1.3 0 1.9.5 2.5 1")
                .element("path", "d", "M7 13h10")
                .element("path", "d", "M7 9h10")
                .element("path", "d", "M9 5a2 2 0 0 0-2 2v11");
    }

    static Icon wavesVertical() {
        return Icon.create()
                .element("path", "d", "M12 2q2 2.5 0 5t0 5 0 5 0 5")
                .element("path", "d", "M19 2q2 2.5 0 5t0 5 0 5 0 5")
                .element("path", "d", "M5 2q2 2.5 0 5t0 5 0 5 0 5");
    }

    static Icon waypoints() {
        return Icon.create()
                .element("path", "d", "m10.586 5.414-5.172 5.172")
                .element("path", "d", "m18.586 13.414-5.172 5.172")
                .element("path", "d", "M6 12h12")
                .element("circle", "cx", "12", "cy", "20", "r", "2")
                .element("circle", "cx", "12", "cy", "4", "r", "2")
                .element("circle", "cx", "20", "cy", "12", "r", "2")
                .element("circle", "cx", "4", "cy", "12", "r", "2");
    }

    static Icon webcam() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "10", "r", "8")
                .element("circle", "cx", "12", "cy", "10", "r", "3")
                .element("path", "d", "M7 22h10")
                .element("path", "d", "M12 22v-4");
    }

    static Icon webhook() {
        return Icon.create()
                .element("path", "d", "M18 16.98h-5.99c-1.1 0-1.95.94-2.48 1.9A4 4 0 0 1 2 17c.01-.7.2-1.4.57-2")
                .element("path", "d", "m6 17 3.13-5.78c.53-.97.1-2.18-.5-3.1a4 4 0 1 1 6.89-4.06")
                .element("path", "d", "m12 6 3.13 5.73C15.66 12.7 16.9 13 18 13a4 4 0 0 1 0 8");
    }

    static Icon webhookOff() {
        return Icon.create()
                .element("path", "d", "M17 17h-5c-1.09-.02-1.94.92-2.5 1.9A3 3 0 1 1 2.57 15")
                .element("path", "d", "M9 3.4a4 4 0 0 1 6.52.66")
                .element("path", "d", "m6 17 3.1-5.8a2.5 2.5 0 0 0 .057-2.05")
                .element("path", "d", "M20.3 20.3a4 4 0 0 1-2.3.7")
                .element("path", "d", "M18.6 13a4 4 0 0 1 3.357 3.414")
                .element("path", "d", "m12 6 .6 1")
                .element("path", "d", "m2 2 20 20");
    }

    static Icon weight() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "5", "r", "3")
                .element("path", "d", "M6.5 8a2 2 0 0 0-1.905 1.46L2.1 18.5A2 2 0 0 0 4 21h16a2 2 0 0 0 1.925-2.54L19.4 9.5A2 2 0 0 0 17.48 8Z");
    }

    static Icon weightTilde() {
        return Icon.create()
                .element("path", "d", "M6.5 8a2 2 0 0 0-1.906 1.46L2.1 18.5A2 2 0 0 0 4 21h16a2 2 0 0 0 1.925-2.54L19.4 9.5A2 2 0 0 0 17.48 8z")
                .element("path", "d", "M7.999 15a2.5 2.5 0 0 1 4 0 2.5 2.5 0 0 0 4 0")
                .element("circle", "cx", "12", "cy", "5", "r", "3");
    }

    static Icon wheat() {
        return Icon.create()
                .element("path", "d", "M2 22 16 8")
                .element("path", "d", "M3.47 12.53 5 11l1.53 1.53a3.5 3.5 0 0 1 0 4.94L5 19l-1.53-1.53a3.5 3.5 0 0 1 0-4.94Z")
                .element("path", "d", "M7.47 8.53 9 7l1.53 1.53a3.5 3.5 0 0 1 0 4.94L9 15l-1.53-1.53a3.5 3.5 0 0 1 0-4.94Z")
                .element("path", "d", "M11.47 4.53 13 3l1.53 1.53a3.5 3.5 0 0 1 0 4.94L13 11l-1.53-1.53a3.5 3.5 0 0 1 0-4.94Z")
                .element("path", "d", "M20 2h2v2a4 4 0 0 1-4 4h-2V6a4 4 0 0 1 4-4Z")
                .element("path", "d", "M11.47 17.47 13 19l-1.53 1.53a3.5 3.5 0 0 1-4.94 0L5 19l1.53-1.53a3.5 3.5 0 0 1 4.94 0Z")
                .element("path", "d", "M15.47 13.47 17 15l-1.53 1.53a3.5 3.5 0 0 1-4.94 0L9 15l1.53-1.53a3.5 3.5 0 0 1 4.94 0Z")
                .element("path", "d", "M19.47 9.47 21 11l-1.53 1.53a3.5 3.5 0 0 1-4.94 0L13 11l1.53-1.53a3.5 3.5 0 0 1 4.94 0Z");
    }

    static Icon wheatOff() {
        return Icon.create()
                .element("path", "d", "m2 22 10-10")
                .element("path", "d", "m16 8-1.17 1.17")
                .element("path", "d", "M3.47 12.53 5 11l1.53 1.53a3.5 3.5 0 0 1 0 4.94L5 19l-1.53-1.53a3.5 3.5 0 0 1 0-4.94Z")
                .element("path", "d", "m8 8-.53.53a3.5 3.5 0 0 0 0 4.94L9 15l1.53-1.53c.55-.55.88-1.25.98-1.97")
                .element("path", "d", "M10.91 5.26c.15-.26.34-.51.56-.73L13 3l1.53 1.53a3.5 3.5 0 0 1 .28 4.62")
                .element("path", "d", "M20 2h2v2a4 4 0 0 1-4 4h-2V6a4 4 0 0 1 4-4Z")
                .element("path", "d", "M11.47 17.47 13 19l-1.53 1.53a3.5 3.5 0 0 1-4.94 0L5 19l1.53-1.53a3.5 3.5 0 0 1 4.94 0Z")
                .element("path", "d", "m16 16-.53.53a3.5 3.5 0 0 1-4.94 0L9 15l1.53-1.53a3.49 3.49 0 0 1 1.97-.98")
                .element("path", "d", "M18.74 13.09c.26-.15.51-.34.73-.56L21 11l-1.53-1.53a3.5 3.5 0 0 0-4.62-.28")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }

    static Icon wholeWord() {
        return Icon.create()
                .element("circle", "cx", "7", "cy", "12", "r", "3")
                .element("path", "d", "M10 9v6")
                .element("circle", "cx", "17", "cy", "12", "r", "3")
                .element("path", "d", "M14 7v8")
                .element("path", "d", "M22 17v1c0 .5-.5 1-1 1H3c-.5 0-1-.5-1-1v-1");
    }

    static Icon wifi() {
        return Icon.create()
                .element("path", "d", "M12 20h.01")
                .element("path", "d", "M2 8.82a15 15 0 0 1 20 0")
                .element("path", "d", "M5 12.859a10 10 0 0 1 14 0")
                .element("path", "d", "M8.5 16.429a5 5 0 0 1 7 0");
    }

    static Icon wifiCog() {
        return Icon.create()
                .element("path", "d", "m14.305 19.53.923-.382")
                .element("path", "d", "m15.228 16.852-.923-.383")
                .element("path", "d", "m16.852 15.228-.383-.923")
                .element("path", "d", "m16.852 20.772-.383.924")
                .element("path", "d", "m19.148 15.228.383-.923")
                .element("path", "d", "m19.53 21.696-.382-.924")
                .element("path", "d", "M2 7.82a15 15 0 0 1 20 0")
                .element("path", "d", "m20.772 16.852.924-.383")
                .element("path", "d", "m20.772 19.148.924.383")
                .element("path", "d", "M5 11.858a10 10 0 0 1 11.5-1.785")
                .element("path", "d", "M8.5 15.429a5 5 0 0 1 2.413-1.31")
                .element("circle", "cx", "18", "cy", "18", "r", "3");
    }

    static Icon wifiHigh() {
        return Icon.create()
                .element("path", "d", "M12 20h.01")
                .element("path", "d", "M5 12.859a10 10 0 0 1 14 0")
                .element("path", "d", "M8.5 16.429a5 5 0 0 1 7 0");
    }

    static Icon wifiLow() {
        return Icon.create()
                .element("path", "d", "M12 20h.01")
                .element("path", "d", "M8.5 16.429a5 5 0 0 1 7 0");
    }

    static Icon wifiOff() {
        return Icon.create()
                .element("path", "d", "M12 20h.01")
                .element("path", "d", "M8.5 16.429a5 5 0 0 1 7 0")
                .element("path", "d", "M5 12.859a10 10 0 0 1 5.17-2.69")
                .element("path", "d", "M19 12.859a10 10 0 0 0-2.007-1.523")
                .element("path", "d", "M2 8.82a15 15 0 0 1 4.177-2.643")
                .element("path", "d", "M22 8.82a15 15 0 0 0-11.288-3.764")
                .element("path", "d", "m2 2 20 20");
    }

    static Icon wifiPen() {
        return Icon.create()
                .element("path", "d", "M2 8.82a15 15 0 0 1 20 0")
                .element("path", "d", "M21.378 16.626a1 1 0 0 0-3.004-3.004l-4.01 4.012a2 2 0 0 0-.506.854l-.837 2.87a.5.5 0 0 0 .62.62l2.87-.837a2 2 0 0 0 .854-.506z")
                .element("path", "d", "M5 12.859a10 10 0 0 1 10.5-2.222")
                .element("path", "d", "M8.5 16.429a5 5 0 0 1 3-1.406");
    }

    static Icon wifiSync() {
        return Icon.create()
                .element("path", "d", "M11.965 10.105v4L13.5 12.5a5 5 0 0 1 8 1.5")
                .element("path", "d", "M11.965 14.105h4")
                .element("path", "d", "M17.965 18.105h4L20.43 19.71a5 5 0 0 1-8-1.5")
                .element("path", "d", "M2 8.82a15 15 0 0 1 20 0")
                .element("path", "d", "M21.965 22.105v-4")
                .element("path", "d", "M5 12.86a10 10 0 0 1 3-2.032")
                .element("path", "d", "M8.5 16.429h.01");
    }

    static Icon wifiZero() {
        return Icon.create()
                .element("path", "d", "M12 20h.01");
    }

    static Icon wind() {
        return Icon.create()
                .element("path", "d", "M12.8 19.6A2 2 0 1 0 14 16H2")
                .element("path", "d", "M17.5 8a2.5 2.5 0 1 1 2 4H2")
                .element("path", "d", "M9.8 4.4A2 2 0 1 1 11 8H2");
    }

    static Icon windArrowDown() {
        return Icon.create()
                .element("path", "d", "M10 2v8")
                .element("path", "d", "M12.8 21.6A2 2 0 1 0 14 18H2")
                .element("path", "d", "M17.5 10a2.5 2.5 0 1 1 2 4H2")
                .element("path", "d", "m6 6 4 4 4-4");
    }

    static Icon wine() {
        return Icon.create()
                .element("path", "d", "M8 22h8")
                .element("path", "d", "M7 10h10")
                .element("path", "d", "M12 15v7")
                .element("path", "d", "M12 15a5 5 0 0 0 5-5c0-2-.5-4-2-8H9c-1.5 4-2 6-2 8a5 5 0 0 0 5 5Z");
    }

    static Icon wineOff() {
        return Icon.create()
                .element("path", "d", "M8 22h8")
                .element("path", "d", "M7 10h3m7 0h-1.343")
                .element("path", "d", "M12 15v7")
                .element("path", "d", "M7.307 7.307A12.33 12.33 0 0 0 7 10a5 5 0 0 0 7.391 4.391M8.638 2.981C8.75 2.668 8.872 2.34 9 2h6c1.5 4 2 6 2 8 0 .407-.05.809-.145 1.198")
                .element("line", "x1", "2", "x2", "22", "y1", "2", "y2", "22");
    }

    static Icon workflow() {
        return Icon.create()
                .element("rect", "width", "8", "height", "8", "x", "3", "y", "3", "rx", "2")
                .element("path", "d", "M7 11v4a2 2 0 0 0 2 2h4")
                .element("rect", "width", "8", "height", "8", "x", "13", "y", "13", "rx", "2");
    }

    static Icon worm() {
        return Icon.create()
                .element("path", "d", "m19 12-1.5 3")
                .element("path", "d", "M19.63 18.81 22 20")
                .element("path", "d", "M6.47 8.23a1.68 1.68 0 0 1 2.44 1.93l-.64 2.08a6.76 6.76 0 0 0 10.16 7.67l.42-.27a1 1 0 1 0-2.73-4.21l-.42.27a1.76 1.76 0 0 1-2.63-1.99l.64-2.08A6.66 6.66 0 0 0 3.94 3.9l-.7.4a1 1 0 1 0 2.55 4.34z");
    }

    static Icon wrapText() {
        return Icon.create()
                .element("path", "d", "m16 16-3 3 3 3")
                .element("path", "d", "M3 12h14.5a1 1 0 0 1 0 7H13")
                .element("path", "d", "M3 19h6")
                .element("path", "d", "M3 5h18");
    }

    static Icon wrench() {
        return Icon.create()
                .element("path", "d", "M14.7 6.3a1 1 0 0 0 0 1.4l1.6 1.6a1 1 0 0 0 1.4 0l3.106-3.105c.32-.322.863-.22.983.218a6 6 0 0 1-8.259 7.057l-7.91 7.91a1 1 0 0 1-2.999-3l7.91-7.91a6 6 0 0 1 7.057-8.259c.438.12.54.662.219.984z");
    }
}
