package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;

final class LucideIconsU {
    private static final String[] NAMES = {"umbrella", "umbrella-off", "underline", "undo", "undo-2", "undo-dot", "unfold-horizontal", "unfold-vertical", "ungroup", "university", "unlink", "unlink-2", "unlock", "unlock-keyhole", "unplug", "upload", "upload-cloud", "usb", "user", "user-2", "user-check", "user-check-2", "user-circle", "user-circle-2", "user-cog", "user-cog-2", "user-key", "user-lock", "user-minus", "user-minus-2", "user-pen", "user-plus", "user-plus-2", "user-round", "user-round-check", "user-round-cog", "user-round-key", "user-round-minus", "user-round-pen", "user-round-plus", "user-round-search", "user-round-x", "user-search", "user-square", "user-square-2", "user-star", "user-x", "user-x-2", "users", "users-2", "users-round", "utensils", "utensils-crossed", "utility-pole"};

    private LucideIconsU() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("umbrella".equals(name)) {
            return umbrella();
        }
        if ("umbrella-off".equals(name)) {
            return umbrellaOff();
        }
        if ("underline".equals(name)) {
            return underline();
        }
        if ("undo".equals(name)) {
            return undo();
        }
        if ("undo-2".equals(name)) {
            return undoN2();
        }
        if ("undo-dot".equals(name)) {
            return undoDot();
        }
        if ("unfold-horizontal".equals(name)) {
            return unfoldHorizontal();
        }
        if ("unfold-vertical".equals(name)) {
            return unfoldVertical();
        }
        if ("ungroup".equals(name)) {
            return ungroup();
        }
        if ("university".equals(name)) {
            return university();
        }
        if ("unlink".equals(name)) {
            return unlink();
        }
        if ("unlink-2".equals(name)) {
            return unlinkN2();
        }
        if ("unlock".equals(name)) {
            return unlock();
        }
        if ("unlock-keyhole".equals(name)) {
            return unlockKeyhole();
        }
        if ("unplug".equals(name)) {
            return unplug();
        }
        if ("upload".equals(name)) {
            return upload();
        }
        if ("upload-cloud".equals(name)) {
            return uploadCloud();
        }
        if ("usb".equals(name)) {
            return usb();
        }
        if ("user".equals(name)) {
            return user();
        }
        if ("user-2".equals(name)) {
            return userN2();
        }
        if ("user-check".equals(name)) {
            return userCheck();
        }
        if ("user-check-2".equals(name)) {
            return userCheckN2();
        }
        if ("user-circle".equals(name)) {
            return userCircle();
        }
        if ("user-circle-2".equals(name)) {
            return userCircleN2();
        }
        if ("user-cog".equals(name)) {
            return userCog();
        }
        if ("user-cog-2".equals(name)) {
            return userCogN2();
        }
        if ("user-key".equals(name)) {
            return userKey();
        }
        if ("user-lock".equals(name)) {
            return userLock();
        }
        if ("user-minus".equals(name)) {
            return userMinus();
        }
        if ("user-minus-2".equals(name)) {
            return userMinusN2();
        }
        if ("user-pen".equals(name)) {
            return userPen();
        }
        if ("user-plus".equals(name)) {
            return userPlus();
        }
        if ("user-plus-2".equals(name)) {
            return userPlusN2();
        }
        if ("user-round".equals(name)) {
            return userRound();
        }
        if ("user-round-check".equals(name)) {
            return userRoundCheck();
        }
        if ("user-round-cog".equals(name)) {
            return userRoundCog();
        }
        if ("user-round-key".equals(name)) {
            return userRoundKey();
        }
        if ("user-round-minus".equals(name)) {
            return userRoundMinus();
        }
        if ("user-round-pen".equals(name)) {
            return userRoundPen();
        }
        if ("user-round-plus".equals(name)) {
            return userRoundPlus();
        }
        if ("user-round-search".equals(name)) {
            return userRoundSearch();
        }
        if ("user-round-x".equals(name)) {
            return userRoundX();
        }
        if ("user-search".equals(name)) {
            return userSearch();
        }
        if ("user-square".equals(name)) {
            return userSquare();
        }
        if ("user-square-2".equals(name)) {
            return userSquareN2();
        }
        if ("user-star".equals(name)) {
            return userStar();
        }
        if ("user-x".equals(name)) {
            return userX();
        }
        if ("user-x-2".equals(name)) {
            return userXN2();
        }
        if ("users".equals(name)) {
            return users();
        }
        if ("users-2".equals(name)) {
            return usersN2();
        }
        if ("users-round".equals(name)) {
            return usersRound();
        }
        if ("utensils".equals(name)) {
            return utensils();
        }
        if ("utensils-crossed".equals(name)) {
            return utensilsCrossed();
        }
        if ("utility-pole".equals(name)) {
            return utilityPole();
        }
        return null;
    }

    static Icon umbrella() {
        return Icon.create()
                .element("path", "d", "M12 13v7a2 2 0 0 0 4 0")
                .element("path", "d", "M12 2v2")
                .element("path", "d", "M20.992 13a1 1 0 0 0 .97-1.274 10.284 10.284 0 0 0-19.923 0A1 1 0 0 0 3 13z");
    }

    static Icon umbrellaOff() {
        return Icon.create()
                .element("path", "d", "M12 13v7a2 2 0 0 0 4 0")
                .element("path", "d", "M12 2v2")
                .element("path", "d", "M18.656 13h2.336a1 1 0 0 0 .97-1.274 10.284 10.284 0 0 0-12.07-7.51")
                .element("path", "d", "m2 2 20 20")
                .element("path", "d", "M5.961 5.957a10.28 10.28 0 0 0-3.922 5.769A1 1 0 0 0 3 13h10");
    }

    static Icon underline() {
        return Icon.create()
                .element("path", "d", "M6 4v6a6 6 0 0 0 12 0V4")
                .element("line", "x1", "4", "x2", "20", "y1", "20", "y2", "20");
    }

    static Icon undo() {
        return Icon.create()
                .element("path", "d", "M3 7v6h6")
                .element("path", "d", "M21 17a9 9 0 0 0-9-9 9 9 0 0 0-6 2.3L3 13");
    }

    static Icon undoN2() {
        return Icon.create()
                .element("path", "d", "M9 14 4 9l5-5")
                .element("path", "d", "M4 9h10.5a5.5 5.5 0 0 1 5.5 5.5a5.5 5.5 0 0 1-5.5 5.5H11");
    }

    static Icon undoDot() {
        return Icon.create()
                .element("path", "d", "M21 17a9 9 0 0 0-15-6.7L3 13")
                .element("path", "d", "M3 7v6h6")
                .element("circle", "cx", "12", "cy", "17", "r", "1");
    }

    static Icon unfoldHorizontal() {
        return Icon.create()
                .element("path", "d", "M16 12h6")
                .element("path", "d", "M8 12H2")
                .element("path", "d", "M12 2v2")
                .element("path", "d", "M12 8v2")
                .element("path", "d", "M12 14v2")
                .element("path", "d", "M12 20v2")
                .element("path", "d", "m19 15 3-3-3-3")
                .element("path", "d", "m5 9-3 3 3 3");
    }

    static Icon unfoldVertical() {
        return Icon.create()
                .element("path", "d", "M12 22v-6")
                .element("path", "d", "M12 8V2")
                .element("path", "d", "M4 12H2")
                .element("path", "d", "M10 12H8")
                .element("path", "d", "M16 12h-2")
                .element("path", "d", "M22 12h-2")
                .element("path", "d", "m15 19-3 3-3-3")
                .element("path", "d", "m15 5-3-3-3 3");
    }

    static Icon ungroup() {
        return Icon.create()
                .element("rect", "width", "8", "height", "6", "x", "5", "y", "4", "rx", "1")
                .element("rect", "width", "8", "height", "6", "x", "11", "y", "14", "rx", "1");
    }

    static Icon university() {
        return Icon.create()
                .element("path", "d", "M14 21v-3a2 2 0 0 0-4 0v3")
                .element("path", "d", "M18 12h.01")
                .element("path", "d", "M18 16h.01")
                .element("path", "d", "M22 7a1 1 0 0 0-1-1h-2a2 2 0 0 1-1.143-.359L13.143 2.36a2 2 0 0 0-2.286-.001L6.143 5.64A2 2 0 0 1 5 6H3a1 1 0 0 0-1 1v12a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2z")
                .element("path", "d", "M6 12h.01")
                .element("path", "d", "M6 16h.01")
                .element("circle", "cx", "12", "cy", "10", "r", "2");
    }

    static Icon unlink() {
        return Icon.create()
                .element("path", "d", "m18.84 12.25 1.72-1.71h-.02a5.004 5.004 0 0 0-.12-7.07 5.006 5.006 0 0 0-6.95 0l-1.72 1.71")
                .element("path", "d", "m5.17 11.75-1.71 1.71a5.004 5.004 0 0 0 .12 7.07 5.006 5.006 0 0 0 6.95 0l1.71-1.71")
                .element("line", "x1", "8", "x2", "8", "y1", "2", "y2", "5")
                .element("line", "x1", "2", "x2", "5", "y1", "8", "y2", "8")
                .element("line", "x1", "16", "x2", "16", "y1", "19", "y2", "22")
                .element("line", "x1", "19", "x2", "22", "y1", "16", "y2", "16");
    }

    static Icon unlinkN2() {
        return Icon.create()
                .element("path", "d", "M15 7h2a5 5 0 0 1 0 10h-2m-6 0H7A5 5 0 0 1 7 7h2");
    }

    static Icon unlock() {
        return Icon.create()
                .element("rect", "width", "18", "height", "11", "x", "3", "y", "11", "rx", "2", "ry", "2")
                .element("path", "d", "M7 11V7a5 5 0 0 1 9.9-1");
    }

    static Icon unlockKeyhole() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "16", "r", "1")
                .element("rect", "width", "18", "height", "12", "x", "3", "y", "10", "rx", "2")
                .element("path", "d", "M7 10V7a5 5 0 0 1 9.33-2.5");
    }

    static Icon unplug() {
        return Icon.create()
                .element("path", "d", "m19 5 3-3")
                .element("path", "d", "m2 22 3-3")
                .element("path", "d", "M6.3 20.3a2.4 2.4 0 0 0 3.4 0L12 18l-6-6-2.3 2.3a2.4 2.4 0 0 0 0 3.4Z")
                .element("path", "d", "M7.5 13.5 10 11")
                .element("path", "d", "M10.5 16.5 13 14")
                .element("path", "d", "m12 6 6 6 2.3-2.3a2.4 2.4 0 0 0 0-3.4l-2.6-2.6a2.4 2.4 0 0 0-3.4 0Z");
    }

    static Icon upload() {
        return Icon.create()
                .element("path", "d", "M12 3v12")
                .element("path", "d", "m17 8-5-5-5 5")
                .element("path", "d", "M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4");
    }

    static Icon uploadCloud() {
        return Icon.create()
                .element("path", "d", "M12 13v8")
                .element("path", "d", "M4 14.899A7 7 0 1 1 15.71 8h1.79a4.5 4.5 0 0 1 2.5 8.242")
                .element("path", "d", "m8 17 4-4 4 4");
    }

    static Icon usb() {
        return Icon.create()
                .element("circle", "cx", "10", "cy", "7", "r", "1")
                .element("circle", "cx", "4", "cy", "20", "r", "1")
                .element("path", "d", "M4.7 19.3 19 5")
                .element("path", "d", "m21 3-3 1 2 2Z")
                .element("path", "d", "M9.26 7.68 5 12l2 5")
                .element("path", "d", "m10 14 5 2 3.5-3.5")
                .element("path", "d", "m18 12 1-1 1 1-1 1Z");
    }

    static Icon user() {
        return Icon.create()
                .element("path", "d", "M19 21v-2a4 4 0 0 0-4-4H9a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "12", "cy", "7", "r", "4");
    }

    static Icon userN2() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "8", "r", "5")
                .element("path", "d", "M20 21a8 8 0 0 0-16 0");
    }

    static Icon userCheck() {
        return Icon.create()
                .element("path", "d", "m16 11 2 2 4-4")
                .element("path", "d", "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "9", "cy", "7", "r", "4");
    }

    static Icon userCheckN2() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 13.292-6")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "m16 19 2 2 4-4");
    }

    static Icon userCircle() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "12", "r", "10")
                .element("circle", "cx", "12", "cy", "10", "r", "3")
                .element("path", "d", "M7 20.662V19a2 2 0 0 1 2-2h6a2 2 0 0 1 2 2v1.662");
    }

    static Icon userCircleN2() {
        return Icon.create()
                .element("path", "d", "M17.925 20.056a6 6 0 0 0-11.851.001")
                .element("circle", "cx", "12", "cy", "11", "r", "4")
                .element("circle", "cx", "12", "cy", "12", "r", "10");
    }

    static Icon userCog() {
        return Icon.create()
                .element("path", "d", "M10 15H6a4 4 0 0 0-4 4v2")
                .element("path", "d", "m14.305 16.53.923-.382")
                .element("path", "d", "m15.228 13.852-.923-.383")
                .element("path", "d", "m16.852 12.228-.383-.923")
                .element("path", "d", "m16.852 17.772-.383.924")
                .element("path", "d", "m19.148 12.228.383-.923")
                .element("path", "d", "m19.53 18.696-.382-.924")
                .element("path", "d", "m20.772 13.852.924-.383")
                .element("path", "d", "m20.772 16.148.924.383")
                .element("circle", "cx", "18", "cy", "15", "r", "3")
                .element("circle", "cx", "9", "cy", "7", "r", "4");
    }

    static Icon userCogN2() {
        return Icon.create()
                .element("path", "d", "m14.305 19.53.923-.382")
                .element("path", "d", "m15.228 16.852-.923-.383")
                .element("path", "d", "m16.852 15.228-.383-.923")
                .element("path", "d", "m16.852 20.772-.383.924")
                .element("path", "d", "m19.148 15.228.383-.923")
                .element("path", "d", "m19.53 21.696-.382-.924")
                .element("path", "d", "M2 21a8 8 0 0 1 10.434-7.62")
                .element("path", "d", "m20.772 16.852.924-.383")
                .element("path", "d", "m20.772 19.148.924.383")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("circle", "cx", "18", "cy", "18", "r", "3");
    }

    static Icon userKey() {
        return Icon.create()
                .element("path", "d", "M20 11v6")
                .element("path", "d", "M20 13h2")
                .element("path", "d", "M3 21v-2a4 4 0 0 1 4-4h6a4 4 0 0 1 2.072.578")
                .element("circle", "cx", "10", "cy", "7", "r", "4")
                .element("circle", "cx", "20", "cy", "19", "r", "2");
    }

    static Icon userLock() {
        return Icon.create()
                .element("path", "d", "M19 16v-2a2 2 0 0 0-4 0v2")
                .element("path", "d", "M9.5 15H7a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "10", "cy", "7", "r", "4")
                .element("rect", "x", "13", "y", "16", "width", "8", "height", "5", "rx", ".899");
    }

    static Icon userMinus() {
        return Icon.create()
                .element("path", "d", "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "9", "cy", "7", "r", "4")
                .element("line", "x1", "22", "x2", "16", "y1", "11", "y2", "11");
    }

    static Icon userMinusN2() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 13.292-6")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M22 19h-6");
    }

    static Icon userPen() {
        return Icon.create()
                .element("path", "d", "M11.5 15H7a4 4 0 0 0-4 4v2")
                .element("path", "d", "M21.378 16.626a1 1 0 0 0-3.004-3.004l-4.01 4.012a2 2 0 0 0-.506.854l-.837 2.87a.5.5 0 0 0 .62.62l2.87-.837a2 2 0 0 0 .854-.506z")
                .element("circle", "cx", "10", "cy", "7", "r", "4");
    }

    static Icon userPlus() {
        return Icon.create()
                .element("path", "d", "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "9", "cy", "7", "r", "4")
                .element("line", "x1", "19", "x2", "19", "y1", "8", "y2", "14")
                .element("line", "x1", "22", "x2", "16", "y1", "11", "y2", "11");
    }

    static Icon userPlusN2() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 13.292-6")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M19 16v6")
                .element("path", "d", "M22 19h-6");
    }

    static Icon userRound() {
        return Icon.create()
                .element("circle", "cx", "12", "cy", "8", "r", "5")
                .element("path", "d", "M20 21a8 8 0 0 0-16 0");
    }

    static Icon userRoundCheck() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 13.292-6")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "m16 19 2 2 4-4");
    }

    static Icon userRoundCog() {
        return Icon.create()
                .element("path", "d", "m14.305 19.53.923-.382")
                .element("path", "d", "m15.228 16.852-.923-.383")
                .element("path", "d", "m16.852 15.228-.383-.923")
                .element("path", "d", "m16.852 20.772-.383.924")
                .element("path", "d", "m19.148 15.228.383-.923")
                .element("path", "d", "m19.53 21.696-.382-.924")
                .element("path", "d", "M2 21a8 8 0 0 1 10.434-7.62")
                .element("path", "d", "m20.772 16.852.924-.383")
                .element("path", "d", "m20.772 19.148.924.383")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("circle", "cx", "18", "cy", "18", "r", "3");
    }

    static Icon userRoundKey() {
        return Icon.create()
                .element("path", "d", "M19 11v6")
                .element("path", "d", "M19 13h2")
                .element("path", "d", "M2 21a8 8 0 0 1 12.868-6.349")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("circle", "cx", "19", "cy", "19", "r", "2");
    }

    static Icon userRoundMinus() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 13.292-6")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M22 19h-6");
    }

    static Icon userRoundPen() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 10.821-7.487")
                .element("path", "d", "M21.378 16.626a1 1 0 0 0-3.004-3.004l-4.01 4.012a2 2 0 0 0-.506.854l-.837 2.87a.5.5 0 0 0 .62.62l2.87-.837a2 2 0 0 0 .854-.506z")
                .element("circle", "cx", "10", "cy", "8", "r", "5");
    }

    static Icon userRoundPlus() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 13.292-6")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M19 16v6")
                .element("path", "d", "M22 19h-6");
    }

    static Icon userRoundSearch() {
        return Icon.create()
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M2 21a8 8 0 0 1 10.434-7.62")
                .element("circle", "cx", "18", "cy", "18", "r", "3")
                .element("path", "d", "m22 22-1.9-1.9");
    }

    static Icon userRoundX() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 11.873-7")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "m17 17 5 5")
                .element("path", "d", "m22 17-5 5");
    }

    static Icon userSearch() {
        return Icon.create()
                .element("circle", "cx", "10", "cy", "7", "r", "4")
                .element("path", "d", "M10.3 15H7a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "17", "cy", "17", "r", "3")
                .element("path", "d", "m21 21-1.9-1.9");
    }

    static Icon userSquare() {
        return Icon.create()
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2")
                .element("circle", "cx", "12", "cy", "10", "r", "3")
                .element("path", "d", "M7 21v-2a2 2 0 0 1 2-2h6a2 2 0 0 1 2 2v2");
    }

    static Icon userSquareN2() {
        return Icon.create()
                .element("path", "d", "M18 21a6 6 0 0 0-12 0")
                .element("circle", "cx", "12", "cy", "11", "r", "4")
                .element("rect", "width", "18", "height", "18", "x", "3", "y", "3", "rx", "2");
    }

    static Icon userStar() {
        return Icon.create()
                .element("path", "d", "M16.051 12.616a1 1 0 0 1 1.909.024l.737 1.452a1 1 0 0 0 .737.535l1.634.256a1 1 0 0 1 .588 1.806l-1.172 1.168a1 1 0 0 0-.282.866l.259 1.613a1 1 0 0 1-1.541 1.134l-1.465-.75a1 1 0 0 0-.912 0l-1.465.75a1 1 0 0 1-1.539-1.133l.258-1.613a1 1 0 0 0-.282-.866l-1.156-1.153a1 1 0 0 1 .572-1.822l1.633-.256a1 1 0 0 0 .737-.535z")
                .element("path", "d", "M8 15H7a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "10", "cy", "7", "r", "4");
    }

    static Icon userX() {
        return Icon.create()
                .element("path", "d", "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2")
                .element("circle", "cx", "9", "cy", "7", "r", "4")
                .element("line", "x1", "17", "x2", "22", "y1", "8", "y2", "13")
                .element("line", "x1", "22", "x2", "17", "y1", "8", "y2", "13");
    }

    static Icon userXN2() {
        return Icon.create()
                .element("path", "d", "M2 21a8 8 0 0 1 11.873-7")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "m17 17 5 5")
                .element("path", "d", "m22 17-5 5");
    }

    static Icon users() {
        return Icon.create()
                .element("path", "d", "M16 21v-2a4 4 0 0 0-4-4H6a4 4 0 0 0-4 4v2")
                .element("path", "d", "M16 3.128a4 4 0 0 1 0 7.744")
                .element("path", "d", "M22 21v-2a4 4 0 0 0-3-3.87")
                .element("circle", "cx", "9", "cy", "7", "r", "4");
    }

    static Icon usersN2() {
        return Icon.create()
                .element("path", "d", "M18 21a8 8 0 0 0-16 0")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M22 20c0-3.37-2-6.5-4-8a5 5 0 0 0-.45-8.3");
    }

    static Icon usersRound() {
        return Icon.create()
                .element("path", "d", "M18 21a8 8 0 0 0-16 0")
                .element("circle", "cx", "10", "cy", "8", "r", "5")
                .element("path", "d", "M22 20c0-3.37-2-6.5-4-8a5 5 0 0 0-.45-8.3");
    }

    static Icon utensils() {
        return Icon.create()
                .element("path", "d", "M3 2v7c0 1.1.9 2 2 2h4a2 2 0 0 0 2-2V2")
                .element("path", "d", "M7 2v20")
                .element("path", "d", "M21 15V2a5 5 0 0 0-5 5v6c0 1.1.9 2 2 2h3Zm0 0v7");
    }

    static Icon utensilsCrossed() {
        return Icon.create()
                .element("path", "d", "m16 2-2.3 2.3a3 3 0 0 0 0 4.2l1.8 1.8a3 3 0 0 0 4.2 0L22 8")
                .element("path", "d", "M15 15 3.3 3.3a4.2 4.2 0 0 0 0 6l7.3 7.3c.7.7 2 .7 2.8 0L15 15Zm0 0 7 7")
                .element("path", "d", "m2.1 21.8 6.4-6.3")
                .element("path", "d", "m19 5-7 7");
    }

    static Icon utilityPole() {
        return Icon.create()
                .element("path", "d", "M12 2v20")
                .element("path", "d", "M2 5h20")
                .element("path", "d", "M3 3v2")
                .element("path", "d", "M7 3v2")
                .element("path", "d", "M17 3v2")
                .element("path", "d", "M21 3v2")
                .element("path", "d", "m19 5-7 7-7-7");
    }
}
