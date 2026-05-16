package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsD {
    private static final String[] NAMES = {"dam", "database", "database-backup", "database-search", "database-zap", "decimals-arrow-left", "decimals-arrow-right", "delete", "dessert", "diameter", "diamond", "diamond-minus", "diamond-percent", "diamond-plus", "dice-1", "dice-2", "dice-3", "dice-4", "dice-5", "dice-6", "dices", "diff", "disc", "disc-2", "disc-3", "disc-album", "divide", "divide-circle", "divide-square", "dna", "dna-off", "dock", "dog", "dollar-sign", "donut", "door-closed", "door-closed-locked", "door-open", "dot", "dot-square", "download", "download-cloud", "drafting-compass", "drama", "drill", "drone", "droplet", "droplet-off", "droplets", "drum", "drumstick", "dumbbell"};

    private LucideIconsD() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("dam".equals(name)) {
            return dam();
        }
        if ("database".equals(name)) {
            return database();
        }
        if ("database-backup".equals(name)) {
            return databaseBackup();
        }
        if ("database-search".equals(name)) {
            return databaseSearch();
        }
        if ("database-zap".equals(name)) {
            return databaseZap();
        }
        if ("decimals-arrow-left".equals(name)) {
            return decimalsArrowLeft();
        }
        if ("decimals-arrow-right".equals(name)) {
            return decimalsArrowRight();
        }
        if ("delete".equals(name)) {
            return delete();
        }
        if ("dessert".equals(name)) {
            return dessert();
        }
        if ("diameter".equals(name)) {
            return diameter();
        }
        if ("diamond".equals(name)) {
            return diamond();
        }
        if ("diamond-minus".equals(name)) {
            return diamondMinus();
        }
        if ("diamond-percent".equals(name)) {
            return diamondPercent();
        }
        if ("diamond-plus".equals(name)) {
            return diamondPlus();
        }
        if ("dice-1".equals(name)) {
            return diceN1();
        }
        if ("dice-2".equals(name)) {
            return diceN2();
        }
        if ("dice-3".equals(name)) {
            return diceN3();
        }
        if ("dice-4".equals(name)) {
            return diceN4();
        }
        if ("dice-5".equals(name)) {
            return diceN5();
        }
        if ("dice-6".equals(name)) {
            return diceN6();
        }
        if ("dices".equals(name)) {
            return dices();
        }
        if ("diff".equals(name)) {
            return diff();
        }
        if ("disc".equals(name)) {
            return disc();
        }
        if ("disc-2".equals(name)) {
            return discN2();
        }
        if ("disc-3".equals(name)) {
            return discN3();
        }
        if ("disc-album".equals(name)) {
            return discAlbum();
        }
        if ("divide".equals(name)) {
            return divide();
        }
        if ("divide-circle".equals(name)) {
            return divideCircle();
        }
        if ("divide-square".equals(name)) {
            return divideSquare();
        }
        if ("dna".equals(name)) {
            return dna();
        }
        if ("dna-off".equals(name)) {
            return dnaOff();
        }
        if ("dock".equals(name)) {
            return dock();
        }
        if ("dog".equals(name)) {
            return dog();
        }
        if ("dollar-sign".equals(name)) {
            return dollarSign();
        }
        if ("donut".equals(name)) {
            return donut();
        }
        if ("door-closed".equals(name)) {
            return doorClosed();
        }
        if ("door-closed-locked".equals(name)) {
            return doorClosedLocked();
        }
        if ("door-open".equals(name)) {
            return doorOpen();
        }
        if ("dot".equals(name)) {
            return dot();
        }
        if ("dot-square".equals(name)) {
            return dotSquare();
        }
        if ("download".equals(name)) {
            return download();
        }
        if ("download-cloud".equals(name)) {
            return downloadCloud();
        }
        if ("drafting-compass".equals(name)) {
            return draftingCompass();
        }
        if ("drama".equals(name)) {
            return drama();
        }
        if ("drill".equals(name)) {
            return drill();
        }
        if ("drone".equals(name)) {
            return drone();
        }
        if ("droplet".equals(name)) {
            return droplet();
        }
        if ("droplet-off".equals(name)) {
            return dropletOff();
        }
        if ("droplets".equals(name)) {
            return droplets();
        }
        if ("drum".equals(name)) {
            return drum();
        }
        if ("drumstick".equals(name)) {
            return drumstick();
        }
        if ("dumbbell".equals(name)) {
            return dumbbell();
        }
        return null;
    }

    static Icon dam() {
        return Icon.create()
                .element("path", "d", "M11 11.31c1.17.56 1.54 1.69 3.5 1.69 2.5 0 2.5-2 5-2 1.3 0 1.9.5 2.5 1")
                .element("path", "d", "M11.75 18c.35.5 1.45 1 2.75 1 2.5 0 2.5-2 5-2 1.3 0 1.9.5 2.5 1")
                .element("path", "d", "M2 10h4")
                .element("path", "d", "M2 14h4")
                .element("path", "d", "M2 18h4")
                .element("path", "d", "M2 6h4")
                .element("path", "d", "M7 3a1 1 0 0 0-1 1v16a1 1 0 0 0 1 1h4a1 1 0 0 0 1-1L10 4a1 1 0 0 0-1-1z");
    }

    static Icon database() {
        return Icon.create()
                .element("ellipse", "cx", "12", "cy", "5", "rx", "9", "ry", "3")
                .element("path", "d", "M3 5V19A9 3 0 0 0 21 19V5")
                .element("path", "d", "M3 12A9 3 0 0 0 21 12");
    }

    static Icon databaseBackup() {
        return Icon.create()
                .element("ellipse", "cx", "12", "cy", "5", "rx", "9", "ry", "3")
                .element("path", "d", "M3 12a9 3 0 0 0 5 2.69")
                .element("path", "d", "M21 9.3V5")
                .element("path", "d", "M3 5v14a9 3 0 0 0 6.47 2.88")
                .element("path", "d", "M12 12v4h4")
                .element("path", "d", "M13 20a5 5 0 0 0 9-3 4.5 4.5 0 0 0-4.5-4.5c-1.33 0-2.54.54-3.41 1.41L12 16");
    }

    static Icon databaseSearch() {
        return Icon.create()
                .element("path", "d", "M21 11.693V5")
                .element("path", "d", "m22 22-1.875-1.875")
                .element("path", "d", "M3 12a9 3 0 0 0 8.697 2.998")
                .element("path", "d", "M3 5v14a9 3 0 0 0 9.28 2.999")
                .element("circle", "cx", "18", "cy", "18", "r", "3")
                .element("ellipse", "cx", "12", "cy", "5", "rx", "9", "ry", "3");
    }

    static Icon databaseZap() {
        return Icon.create()
                .element("ellipse", "cx", "12", "cy", "5", "rx", "9", "ry", "3")
                .element("path", "d", "M3 5V19A9 3 0 0 0 15 21.84")
                .element("path", "d", "M21 5V8")
                .element("path", "d", "M21 12L18 17H22L19 22")
                .element("path", "d", "M3 12A9 3 0 0 0 14.59 14.87");
    }

    static Icon decimalsArrowLeft() {
        return Icon.create()
                .element("path", "d", "m13 21-3-3 3-3")
                .element("path", "d", "M20 18H10")
                .element("path", "d", "M3 11h.01")
                .element("rect", "x", "6", "y", "3", "width", "5", "height", "8", "rx", "2.5");
    }

    static Icon decimalsArrowRight() {
        return Icon.create()
                .element("path", "d", "M10 18h10")
                .element("path", "d", "m17 21 3-3-3-3")
                .element("path", "d", "M3 11h.01")
                .element("rect", "x", "15", "y", "3", "width", "5", "height", "8", "rx", "2.5")
                .element("rect", "x", "6", "y", "3", "width", "5", "height", "8", "rx", "2.5");
    }

    static Icon delete() {
        return Icon.create()
                .element("path", "d", "M10 5a2 2 0 0 0-1.344.519l-6.328 5.74a1 1 0 0 0 0 1.481l6.328 5.741A2 2 0 0 0 10 19h10a2 2 0 0 0 2-2V7a2 2 0 0 0-2-2z")
                .element("path", "d", "m12 9 6 6")
                .element("path", "d", "m18 9-6 6");
    }

    static Icon dessert() {
        return Icon.create()
                .element("path", "d", "M10.162 3.167A10 10 0 0 0 2 13a2 2 0 0 0 4 0v-1a2 2 0 0 1 4 0v4a2 2 0 0 0 4 0v-4a2 2 0 0 1 4 0v1a2 2 0 0 0 4-.006 10 10 0 0 0-8.161-9.826")
                .element("path", "d", "M20.804 14.869a9 9 0 0 1-17.608 0")
                .element("circle", "cx", "12", "cy", "4", "r", "2");
    }

    static Icon diameter() {
        return Icon.create()
                .element("circle", "cx", "19", "cy", "19", "r", "2")
                .element("circle", "cx", "5", "cy", "5", "r", "2")
                .element("path", "d", "M6.48 3.66a10 10 0 0 1 13.86 13.86")
                .element("path", "d", "m6.41 6.41 11.18 11.18")
                .element("path", "d", "M3.66 6.48a10 10 0 0 0 13.86 13.86");
    }

    static Icon diamond() {
        return Icon.create()
                .element("path", "d", "M2.7 10.3a2.41 2.41 0 0 0 0 3.41l7.59 7.59a2.41 2.41 0 0 0 3.41 0l7.59-7.59a2.41 2.41 0 0 0 0-3.41l-7.59-7.59a2.41 2.41 0 0 0-3.41 0Z");
    }

    static Icon diamondMinus() {
        return Icon.create()
                .element("path", "d", "M2.7 10.3a2.41 2.41 0 0 0 0 3.41l7.59 7.59a2.41 2.41 0 0 0 3.41 0l7.59-7.59a2.41 2.41 0 0 0 0-3.41L13.7 2.71a2.41 2.41 0 0 0-3.41 0z")
                .element("path", "d", "M8 12h8");
    }

    static Icon diamondPercent() {
        return Icon.create()
                .element("path", "d", "M2.7 10.3a2.41 2.41 0 0 0 0 3.41l7.59 7.59a2.41 2.41 0 0 0 3.41 0l7.59-7.59a2.41 2.41 0 0 0 0-3.41L13.7 2.71a2.41 2.41 0 0 0-3.41 0Z")
                .element("path", "d", "M9.2 9.2h.01")
                .element("path", "d", "m14.5 9.5-5 5")
                .element("path", "d", "M14.7 14.8h.01");
    }

    static Icon diamondPlus() {
        return Icon.create()
                .element("path", "d", "M12 8v8")
                .element("path", "d", "M2.7 10.3a2.41 2.41 0 0 0 0 3.41l7.59 7.59a2.41 2.41 0 0 0 3.41 0l7.59-7.59a2.41 2.41 0 0 0 0-3.41L13.7 2.71a2.41 2.41 0 0 0-3.41 0z")
                .element("path", "d", "M8 12h8");
    }

    static Icon diceN1() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "M12 12h.01");
    }

    static Icon diceN2() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "M15 9h.01")
                .element("path", "d", "M9 15h.01");
    }

    static Icon diceN3() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "M16 8h.01")
                .element("path", "d", "M12 12h.01")
                .element("path", "d", "M8 16h.01");
    }

    static Icon diceN4() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "M16 8h.01")
                .element("path", "d", "M8 8h.01")
                .element("path", "d", "M8 16h.01")
                .element("path", "d", "M16 16h.01");
    }

    static Icon diceN5() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "M16 8h.01")
                .element("path", "d", "M8 8h.01")
                .element("path", "d", "M8 16h.01")
                .element("path", "d", "M16 16h.01")
                .element("path", "d", "M12 12h.01");
    }

    static Icon diceN6() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("path", "d", "M16 8h.01")
                .element("path", "d", "M16 12h.01")
                .element("path", "d", "M16 16h.01")
                .element("path", "d", "M8 8h.01")
                .element("path", "d", "M8 12h.01")
                .element("path", "d", "M8 16h.01");
    }

    static Icon dices() {
        return Icon.create()
                .element("rect", "width", "12", "height", "12", "x", "2", "y", "10", "rx", "2", "ry", "2")
                .element("path", "d", "m17.92 14 3.5-3.5a2.24 2.24 0 0 0 0-3l-5-4.92a2.24 2.24 0 0 0-3 0L10 6")
                .element("path", "d", "M6 18h.01")
                .element("path", "d", "M10 14h.01")
                .element("path", "d", "M15 6h.01")
                .element("path", "d", "M18 9h.01");
    }

    static Icon diff() {
        return Icon.create()
                .element("path", "d", "M12 3v14")
                .element("path", "d", "M5 10h14")
                .element("path", "d", "M5 21h14");
    }

    static Icon disc() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("circle", "cx", "12", "cy", "12", "r", "2");
    }

    static Icon discN2() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("circle", "cx", "12", "cy", "12", "r", "4")
                .element("path", "d", "M12 12h.01");
    }

    static Icon discN3() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("path", "d", "M6 12c0-1.7.7-3.2 1.8-4.2")
                .element("circle", "cx", "12", "cy", "12", "r", "2")
                .element("path", "d", "M18 12c0 1.7-.7 3.2-1.8 4.2");
    }

    static Icon discAlbum() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("circle", "cx", "12", "cy", "12", "r", "5")
                .element("path", "d", "M12 12h.01");
    }

    static Icon divide() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "6", "r", "1")
                .element("line", "x1", "5", "x2", "19", "y1", "12", "y2", "12")
                .element("circle", "cx", "12", "cy", "18", "r", "1");
    }

    static Icon divideCircle() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("line", "x1", "8", "x2", "16", "y1", "12", "y2", "12")
                .element("line", "x1", "12", "x2", "12", "y1", "16", "y2", "16")
                .element("line", "x1", "12", "x2", "12", "y1", "8", "y2", "8");
    }

    static Icon divideSquare() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2", "ry", "2")
                .element("line", "x1", "8", "x2", "16", "y1", "12", "y2", "12")
                .element("line", "x1", "12", "x2", "12", "y1", "16", "y2", "16")
                .element("line", "x1", "12", "x2", "12", "y1", "8", "y2", "8");
    }

    static Icon dna() {
        return Icon.create()
                .element("path", "d", "m10 16 1.5 1.5")
                .element("path", "d", "m14 8-1.5-1.5")
                .element("path", "d", "M15 2c-1.798 1.998-2.518 3.995-2.807 5.993")
                .element("path", "d", "m16.5 10.5 1 1")
                .element("path", "d", "m17 6-2.891-2.891")
                .element("path", "d", "M2 15c6.667-6 13.333 0 20-6")
                .element("path", "d", "m20 9 .891.891")
                .element("path", "d", "M3.109 14.109 4 15")
                .element("path", "d", "m6.5 12.5 1 1")
                .element("path", "d", "m7 18 2.891 2.891")
                .element("path", "d", "M9 22c1.798-1.998 2.518-3.995 2.807-5.993");
    }

    static Icon dnaOff() {
        return Icon.create()
                .element("path", "d", "M15 2c-1.35 1.5-2.092 3-2.5 4.5L14 8")
                .element("path", "d", "m17 6-2.891-2.891")
                .element("path", "d", "M2 15c3.333-3 6.667-3 10-3")
                .element("path", "d", "m2 2 20 20")
                .element("path", "d", "m20 9 .891.891")
                .element("path", "d", "M22 9c-1.5 1.35-3 2.092-4.5 2.5l-1-1")
                .element("path", "d", "M3.109 14.109 4 15")
                .element("path", "d", "m6.5 12.5 1 1")
                .element("path", "d", "m7 18 2.891 2.891")
                .element("path", "d", "M9 22c1.35-1.5 2.092-3 2.5-4.5L10 16");
    }

    static Icon dock() {
        return Icon.create()
                .element("path", "d", "M2 8h20")
                .element("rect", "width", "20", "height", "16", "x", "2", "y", "4", "rx", "2")
                .element("path", "d", "M6 16h12");
    }

    static Icon dog() {
        return Icon.create()
                .element("path", "d", "M11.25 16.25h1.5L12 17z")
                .element("path", "d", "M16 14v.5")
                .element("path", "d", "M4.42 11.247A13.152 13.152 0 0 0 4 14.556C4 18.728 7.582 21 12 21s8-2.272 8-6.444a11.702 11.702 0 0 0-.493-3.309")
                .element("path", "d", "M8 14v.5")
                .element("path", "d", "M8.5 8.5c-.384 1.05-1.083 2.028-2.344 2.5-1.931.722-3.576-.297-3.656-1-.113-.994 1.177-6.53 4-7 1.923-.321 3.651.845 3.651 2.235A7.497 7.497 0 0 1 14 5.277c0-1.39 1.844-2.598 3.767-2.277 2.823.47 4.113 6.006 4 7-.08.703-1.725 1.722-3.656 1-1.261-.472-1.855-1.45-2.239-2.5");
    }

    static Icon dollarSign() {
        return Icon.create()
                .element("line", "x1", "12", "x2", "12", "y1", "2", "y2", "22")
                .element("path", "d", "M17 5H9.5a3.5 3.5 0 0 0 0 7h5a3.5 3.5 0 0 1 0 7H6");
    }

    static Icon donut() {
        return Icon.create()
                .element("path", "d", "M20.5 10a2.5 2.5 0 0 1-2.4-3H18a2.95 2.95 0 0 1-2.6-4.4 10 10 0 1 0 6.3 7.1c-.3.2-.8.3-1.2.3")
                .element("circle", "cx", "12", "cy", "12", "r", "3");
    }

    static Icon doorClosed() {
        return Icon.create()
                .element("path", "d", "M10 12h.01")
                .element("path", "d", "M18 20V6a2 2 0 0 0-2-2H8a2 2 0 0 0-2 2v14")
                .element("path", "d", "M2 20h20");
    }

    static Icon doorClosedLocked() {
        return Icon.create()
                .element("path", "d", "M10 12h.01")
                .element("path", "d", "M18 9V6a2 2 0 0 0-2-2H8a2 2 0 0 0-2 2v14")
                .element("path", "d", "M2 20h8")
                .element("path", "d", "M20 17v-2a2 2 0 1 0-4 0v2")
                .element("rect", "x", "14", "y", "17", "width", "8", "height", "5", "rx", "1");
    }

    static Icon doorOpen() {
        return Icon.create()
                .element("path", "d", "M11 20H2")
                .element("path", "d", "M11 4.562v16.157a1 1 0 0 0 1.242.97L19 20V5.562a2 2 0 0 0-1.515-1.94l-4-1A2 2 0 0 0 11 4.561z")
                .element("path", "d", "M11 4H8a2 2 0 0 0-2 2v14")
                .element("path", "d", "M14 12h.01")
                .element("path", "d", "M22 20h-3");
    }

    static Icon dot() {
        return Icon.create()
                .element("circle", "cx", "12.1", "cy", "12.1", "r", "1");
    }

    static Icon dotSquare() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("circle", "cx", "12", "cy", "12", "r", "1");
    }

    static Icon download() {
        return Icon.create()
                .element("path", "d", "M12 15V3")
                .element("path", "d", "M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4")
                .element("path", "d", "m7 10 5 5 5-5");
    }

    static Icon downloadCloud() {
        return Icon.create()
                .element("path", "d", "M12 13v8l-4-4")
                .element("path", "d", "m12 21 4-4")
                .element("path", "d", "M4.393 15.269A7 7 0 1 1 15.71 8h1.79a4.5 4.5 0 0 1 2.436 8.284");
    }

    static Icon draftingCompass() {
        return Icon.create()
                .element("path", "d", "m12.99 6.74 1.93 3.44")
                .element("path", "d", "M19.136 12a10 10 0 0 1-14.271 0")
                .element("path", "d", "m21 21-2.16-3.84")
                .element("path", "d", "m3 21 8.02-14.26")
                .element("circle", "cx", "12", "cy", "5", "r", "2");
    }

    static Icon drama() {
        return Icon.create()
                .element("path", "d", "M10 11h.01")
                .element("path", "d", "M14 6h.01")
                .element("path", "d", "M18 6h.01")
                .element("path", "d", "M6.5 13.1h.01")
                .element("path", "d", "M22 5c0 9-4 12-6 12s-6-3-6-12c0-2 2-3 6-3s6 1 6 3")
                .element("path", "d", "M17.4 9.9c-.8.8-2 .8-2.8 0")
                .element("path", "d", "M10.1 7.1C9 7.2 7.7 7.7 6 8.6c-3.5 2-4.7 3.9-3.7 5.6 4.5 7.8 9.5 8.4 11.2 7.4.9-.5 1.9-2.1 1.9-4.7")
                .element("path", "d", "M9.1 16.5c.3-1.1 1.4-1.7 2.4-1.4");
    }

    static Icon drill() {
        return Icon.create()
                .element("path", "d", "M10 18a1 1 0 0 1 1 1v2a1 1 0 0 1-1 1H5a3 3 0 0 1-3-3 1 1 0 0 1 1-1z")
                .element("path", "d", "M13 10H4a2 2 0 0 1-2-2V4a2 2 0 0 1 2-2h9a1 1 0 0 1 1 1v6a1 1 0 0 1-1 1l-.81 3.242a1 1 0 0 1-.97.758H8")
                .element("path", "d", "M14 4h3a1 1 0 0 1 1 1v2a1 1 0 0 1-1 1h-3")
                .element("path", "d", "M18 6h4")
                .element("path", "d", "m5 10-2 8")
                .element("path", "d", "m7 18 2-8");
    }

    static Icon drone() {
        return Icon.create()
                .element("path", "d", "M10 10 7 7")
                .element("path", "d", "m10 14-3 3")
                .element("path", "d", "m14 10 3-3")
                .element("path", "d", "m14 14 3 3")
                .element("path", "d", "M14.205 4.139a4 4 0 1 1 5.439 5.863")
                .element("path", "d", "M19.637 14a4 4 0 1 1-5.432 5.868")
                .element("path", "d", "M4.367 10a4 4 0 1 1 5.438-5.862")
                .element("path", "d", "M9.795 19.862a4 4 0 1 1-5.429-5.873")
                .element("rect", "x", "10", "y", "8", "width", "4", "height", "8", "rx", "1");
    }

    static Icon droplet() {
        return Icon.create()
                .element("path", "d", "M12 22a7 7 0 0 0 7-7c0-2-1-3.9-3-5.5s-3.5-4-4-6.5c-.5 2.5-2 4.9-4 6.5C6 11.1 5 13 5 15a7 7 0 0 0 7 7z");
    }

    static Icon dropletOff() {
        return Icon.create()
                .element("path", "d", "M18.715 13.186C18.29 11.858 17.384 10.607 16 9.5c-2-1.6-3.5-4-4-6.5a10.7 10.7 0 0 1-.884 2.586")
                .element("path", "d", "m2 2 20 20")
                .element("path", "d", "M8.795 8.797A11 11 0 0 1 8 9.5C6 11.1 5 13 5 15a7 7 0 0 0 13.222 3.208");
    }

    static Icon droplets() {
        return Icon.create()
                .element("path", "d", "M7 16.3c2.2 0 4-1.83 4-4.05 0-1.16-.57-2.26-1.71-3.19S7.29 6.75 7 5.3c-.29 1.45-1.14 2.84-2.29 3.76S3 11.1 3 12.25c0 2.22 1.8 4.05 4 4.05z")
                .element("path", "d", "M12.56 6.6A10.97 10.97 0 0 0 14 3.02c.5 2.5 2 4.9 4 6.5s3 3.5 3 5.5a6.98 6.98 0 0 1-11.91 4.97");
    }

    static Icon drum() {
        return Icon.create()
                .element("path", "d", "m2 2 8 8")
                .element("path", "d", "m22 2-8 8")
                .element("ellipse", "cx", "12", "cy", "9", "rx", "10", "ry", "5")
                .element("path", "d", "M7 13.4v7.9")
                .element("path", "d", "M12 14v8")
                .element("path", "d", "M17 13.4v7.9")
                .element("path", "d", "M2 9v8a10 5 0 0 0 20 0V9");
    }

    static Icon drumstick() {
        return Icon.create()
                .element("path", "d", "M15.4 15.63a7.875 6 135 1 1 6.23-6.23 4.5 3.43 135 0 0-6.23 6.23")
                .element("path", "d", "m8.29 12.71-2.6 2.6a2.5 2.5 0 1 0-1.65 4.65A2.5 2.5 0 1 0 8.7 18.3l2.59-2.59");
    }

    static Icon dumbbell() {
        return Icon.create()
                .element("path", "d", "M17.596 12.768a2 2 0 1 0 2.829-2.829l-1.768-1.767a2 2 0 0 0 2.828-2.829l-2.828-2.828a2 2 0 0 0-2.829 2.828l-1.767-1.768a2 2 0 1 0-2.829 2.829z")
                .element("path", "d", "m2.5 21.5 1.4-1.4")
                .element("path", "d", "m20.1 3.9 1.4-1.4")
                .element("path", "d", "M5.343 21.485a2 2 0 1 0 2.829-2.828l1.767 1.768a2 2 0 1 0 2.829-2.829l-6.364-6.364a2 2 0 1 0-2.829 2.829l1.768 1.767a2 2 0 0 0-2.828 2.829z")
                .element("path", "d", "m9.6 14.4 4.8-4.8");
    }
}
