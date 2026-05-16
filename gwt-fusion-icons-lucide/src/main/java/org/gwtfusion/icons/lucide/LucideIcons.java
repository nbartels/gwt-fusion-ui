package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class LucideIcons {
    public static final int COUNT = 1960;

    private LucideIcons() {
    }

    public static IconProvider provider() {
        return new LucideIconProvider();
    }

    public static String[] names() {
        String[] names = new String[COUNT];
        int offset = 0;
        offset = copy(LucideIconsA.names(), names, offset);
        offset = copy(LucideIconsB.names(), names, offset);
        offset = copy(LucideIconsC.names(), names, offset);
        offset = copy(LucideIconsD.names(), names, offset);
        offset = copy(LucideIconsE.names(), names, offset);
        offset = copy(LucideIconsF.names(), names, offset);
        offset = copy(LucideIconsG.names(), names, offset);
        offset = copy(LucideIconsH.names(), names, offset);
        offset = copy(LucideIconsI.names(), names, offset);
        offset = copy(LucideIconsJ.names(), names, offset);
        offset = copy(LucideIconsK.names(), names, offset);
        offset = copy(LucideIconsL.names(), names, offset);
        offset = copy(LucideIconsM.names(), names, offset);
        offset = copy(LucideIconsN.names(), names, offset);
        offset = copy(LucideIconsO.names(), names, offset);
        offset = copy(LucideIconsP.names(), names, offset);
        offset = copy(LucideIconsQ.names(), names, offset);
        offset = copy(LucideIconsR.names(), names, offset);
        offset = copy(LucideIconsS.names(), names, offset);
        offset = copy(LucideIconsT.names(), names, offset);
        offset = copy(LucideIconsU.names(), names, offset);
        offset = copy(LucideIconsV.names(), names, offset);
        offset = copy(LucideIconsW.names(), names, offset);
        offset = copy(LucideIconsX.names(), names, offset);
        offset = copy(LucideIconsZ.names(), names, offset);
        return names;
    }

    public static Icon icon(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        switch (name.charAt(0)) {
            case 'a':
                return LucideIconsA.icon(name);
            case 'b':
                return LucideIconsB.icon(name);
            case 'c':
                return LucideIconsC.icon(name);
            case 'd':
                return LucideIconsD.icon(name);
            case 'e':
                return LucideIconsE.icon(name);
            case 'f':
                return LucideIconsF.icon(name);
            case 'g':
                return LucideIconsG.icon(name);
            case 'h':
                return LucideIconsH.icon(name);
            case 'i':
                return LucideIconsI.icon(name);
            case 'j':
                return LucideIconsJ.icon(name);
            case 'k':
                return LucideIconsK.icon(name);
            case 'l':
                return LucideIconsL.icon(name);
            case 'm':
                return LucideIconsM.icon(name);
            case 'n':
                return LucideIconsN.icon(name);
            case 'o':
                return LucideIconsO.icon(name);
            case 'p':
                return LucideIconsP.icon(name);
            case 'q':
                return LucideIconsQ.icon(name);
            case 'r':
                return LucideIconsR.icon(name);
            case 's':
                return LucideIconsS.icon(name);
            case 't':
                return LucideIconsT.icon(name);
            case 'u':
                return LucideIconsU.icon(name);
            case 'v':
                return LucideIconsV.icon(name);
            case 'w':
                return LucideIconsW.icon(name);
            case 'x':
                return LucideIconsX.icon(name);
            case 'z':
                return LucideIconsZ.icon(name);
            default:
                return null;
        }
    }

    private static int copy(String[] source, String[] target, int offset) {
        for (int i = 0; i < source.length; i++) {
            target[offset + i] = source[i];
        }
        return offset + source.length;
    }

    public static Icon aArrowDown() {
        return LucideIconsA.aArrowDown();
    }

    public static Icon aArrowUp() {
        return LucideIconsA.aArrowUp();
    }

    public static Icon aLargeSmall() {
        return LucideIconsA.aLargeSmall();
    }

    public static Icon accessibility() {
        return LucideIconsA.accessibility();
    }

    public static Icon activity() {
        return LucideIconsA.activity();
    }

    public static Icon activitySquare() {
        return LucideIconsA.activitySquare();
    }

    public static Icon airVent() {
        return LucideIconsA.airVent();
    }

    public static Icon airplay() {
        return LucideIconsA.airplay();
    }

    public static Icon alarmCheck() {
        return LucideIconsA.alarmCheck();
    }

    public static Icon alarmClock() {
        return LucideIconsA.alarmClock();
    }

    public static Icon alarmClockCheck() {
        return LucideIconsA.alarmClockCheck();
    }

    public static Icon alarmClockMinus() {
        return LucideIconsA.alarmClockMinus();
    }

    public static Icon alarmClockOff() {
        return LucideIconsA.alarmClockOff();
    }

    public static Icon alarmClockPlus() {
        return LucideIconsA.alarmClockPlus();
    }

    public static Icon alarmMinus() {
        return LucideIconsA.alarmMinus();
    }

    public static Icon alarmPlus() {
        return LucideIconsA.alarmPlus();
    }

    public static Icon alarmSmoke() {
        return LucideIconsA.alarmSmoke();
    }

    public static Icon album() {
        return LucideIconsA.album();
    }

    public static Icon alertCircle() {
        return LucideIconsA.alertCircle();
    }

    public static Icon alertOctagon() {
        return LucideIconsA.alertOctagon();
    }

    public static Icon alertTriangle() {
        return LucideIconsA.alertTriangle();
    }

    public static Icon alignCenter() {
        return LucideIconsA.alignCenter();
    }

    public static Icon alignCenterHorizontal() {
        return LucideIconsA.alignCenterHorizontal();
    }

    public static Icon alignCenterVertical() {
        return LucideIconsA.alignCenterVertical();
    }

    public static Icon alignEndHorizontal() {
        return LucideIconsA.alignEndHorizontal();
    }

    public static Icon alignEndVertical() {
        return LucideIconsA.alignEndVertical();
    }

    public static Icon alignHorizontalDistributeCenter() {
        return LucideIconsA.alignHorizontalDistributeCenter();
    }

    public static Icon alignHorizontalDistributeEnd() {
        return LucideIconsA.alignHorizontalDistributeEnd();
    }

    public static Icon alignHorizontalDistributeStart() {
        return LucideIconsA.alignHorizontalDistributeStart();
    }

    public static Icon alignHorizontalJustifyCenter() {
        return LucideIconsA.alignHorizontalJustifyCenter();
    }

    public static Icon alignHorizontalJustifyEnd() {
        return LucideIconsA.alignHorizontalJustifyEnd();
    }

    public static Icon alignHorizontalJustifyStart() {
        return LucideIconsA.alignHorizontalJustifyStart();
    }

    public static Icon alignHorizontalSpaceAround() {
        return LucideIconsA.alignHorizontalSpaceAround();
    }

    public static Icon alignHorizontalSpaceBetween() {
        return LucideIconsA.alignHorizontalSpaceBetween();
    }

    public static Icon alignJustify() {
        return LucideIconsA.alignJustify();
    }

    public static Icon alignLeft() {
        return LucideIconsA.alignLeft();
    }

    public static Icon alignRight() {
        return LucideIconsA.alignRight();
    }

    public static Icon alignStartHorizontal() {
        return LucideIconsA.alignStartHorizontal();
    }

    public static Icon alignStartVertical() {
        return LucideIconsA.alignStartVertical();
    }

    public static Icon alignVerticalDistributeCenter() {
        return LucideIconsA.alignVerticalDistributeCenter();
    }

    public static Icon alignVerticalDistributeEnd() {
        return LucideIconsA.alignVerticalDistributeEnd();
    }

    public static Icon alignVerticalDistributeStart() {
        return LucideIconsA.alignVerticalDistributeStart();
    }

    public static Icon alignVerticalJustifyCenter() {
        return LucideIconsA.alignVerticalJustifyCenter();
    }

    public static Icon alignVerticalJustifyEnd() {
        return LucideIconsA.alignVerticalJustifyEnd();
    }

    public static Icon alignVerticalJustifyStart() {
        return LucideIconsA.alignVerticalJustifyStart();
    }

    public static Icon alignVerticalSpaceAround() {
        return LucideIconsA.alignVerticalSpaceAround();
    }

    public static Icon alignVerticalSpaceBetween() {
        return LucideIconsA.alignVerticalSpaceBetween();
    }

    public static Icon ambulance() {
        return LucideIconsA.ambulance();
    }

    public static Icon ampersand() {
        return LucideIconsA.ampersand();
    }

    public static Icon ampersands() {
        return LucideIconsA.ampersands();
    }

    public static Icon amphora() {
        return LucideIconsA.amphora();
    }

    public static Icon anchor() {
        return LucideIconsA.anchor();
    }

    public static Icon angry() {
        return LucideIconsA.angry();
    }

    public static Icon annoyed() {
        return LucideIconsA.annoyed();
    }

    public static Icon antenna() {
        return LucideIconsA.antenna();
    }

    public static Icon anvil() {
        return LucideIconsA.anvil();
    }

    public static Icon aperture() {
        return LucideIconsA.aperture();
    }

    public static Icon appWindow() {
        return LucideIconsA.appWindow();
    }

    public static Icon appWindowMac() {
        return LucideIconsA.appWindowMac();
    }

    public static Icon apple() {
        return LucideIconsA.apple();
    }

    public static Icon archive() {
        return LucideIconsA.archive();
    }

    public static Icon archiveRestore() {
        return LucideIconsA.archiveRestore();
    }

    public static Icon archiveX() {
        return LucideIconsA.archiveX();
    }

    public static Icon areaChart() {
        return LucideIconsA.areaChart();
    }

    public static Icon armchair() {
        return LucideIconsA.armchair();
    }

    public static Icon arrowBigDown() {
        return LucideIconsA.arrowBigDown();
    }

    public static Icon arrowBigDownDash() {
        return LucideIconsA.arrowBigDownDash();
    }

    public static Icon arrowBigLeft() {
        return LucideIconsA.arrowBigLeft();
    }

    public static Icon arrowBigLeftDash() {
        return LucideIconsA.arrowBigLeftDash();
    }

    public static Icon arrowBigRight() {
        return LucideIconsA.arrowBigRight();
    }

    public static Icon arrowBigRightDash() {
        return LucideIconsA.arrowBigRightDash();
    }

    public static Icon arrowBigUp() {
        return LucideIconsA.arrowBigUp();
    }

    public static Icon arrowBigUpDash() {
        return LucideIconsA.arrowBigUpDash();
    }

    public static Icon arrowDown() {
        return LucideIconsA.arrowDown();
    }

    public static Icon arrowDownN0N1() {
        return LucideIconsA.arrowDownN0N1();
    }

    public static Icon arrowDownN01() {
        return LucideIconsA.arrowDownN01();
    }

    public static Icon arrowDownN1N0() {
        return LucideIconsA.arrowDownN1N0();
    }

    public static Icon arrowDownN10() {
        return LucideIconsA.arrowDownN10();
    }

    public static Icon arrowDownAZ() {
        return LucideIconsA.arrowDownAZ();
    }

    public static Icon arrowDownAz() {
        return LucideIconsA.arrowDownAz();
    }

    public static Icon arrowDownCircle() {
        return LucideIconsA.arrowDownCircle();
    }

    public static Icon arrowDownFromLine() {
        return LucideIconsA.arrowDownFromLine();
    }

    public static Icon arrowDownLeft() {
        return LucideIconsA.arrowDownLeft();
    }

    public static Icon arrowDownLeftFromCircle() {
        return LucideIconsA.arrowDownLeftFromCircle();
    }

    public static Icon arrowDownLeftFromSquare() {
        return LucideIconsA.arrowDownLeftFromSquare();
    }

    public static Icon arrowDownLeftSquare() {
        return LucideIconsA.arrowDownLeftSquare();
    }

    public static Icon arrowDownNarrowWide() {
        return LucideIconsA.arrowDownNarrowWide();
    }

    public static Icon arrowDownRight() {
        return LucideIconsA.arrowDownRight();
    }

    public static Icon arrowDownRightFromCircle() {
        return LucideIconsA.arrowDownRightFromCircle();
    }

    public static Icon arrowDownRightFromSquare() {
        return LucideIconsA.arrowDownRightFromSquare();
    }

    public static Icon arrowDownRightSquare() {
        return LucideIconsA.arrowDownRightSquare();
    }

    public static Icon arrowDownSquare() {
        return LucideIconsA.arrowDownSquare();
    }

    public static Icon arrowDownToDot() {
        return LucideIconsA.arrowDownToDot();
    }

    public static Icon arrowDownToLine() {
        return LucideIconsA.arrowDownToLine();
    }

    public static Icon arrowDownUp() {
        return LucideIconsA.arrowDownUp();
    }

    public static Icon arrowDownWideNarrow() {
        return LucideIconsA.arrowDownWideNarrow();
    }

    public static Icon arrowDownZA() {
        return LucideIconsA.arrowDownZA();
    }

    public static Icon arrowDownZa() {
        return LucideIconsA.arrowDownZa();
    }

    public static Icon arrowLeft() {
        return LucideIconsA.arrowLeft();
    }

    public static Icon arrowLeftCircle() {
        return LucideIconsA.arrowLeftCircle();
    }

    public static Icon arrowLeftFromLine() {
        return LucideIconsA.arrowLeftFromLine();
    }

    public static Icon arrowLeftRight() {
        return LucideIconsA.arrowLeftRight();
    }

    public static Icon arrowLeftSquare() {
        return LucideIconsA.arrowLeftSquare();
    }

    public static Icon arrowLeftToLine() {
        return LucideIconsA.arrowLeftToLine();
    }

    public static Icon arrowRight() {
        return LucideIconsA.arrowRight();
    }

    public static Icon arrowRightCircle() {
        return LucideIconsA.arrowRightCircle();
    }

    public static Icon arrowRightFromLine() {
        return LucideIconsA.arrowRightFromLine();
    }

    public static Icon arrowRightLeft() {
        return LucideIconsA.arrowRightLeft();
    }

    public static Icon arrowRightSquare() {
        return LucideIconsA.arrowRightSquare();
    }

    public static Icon arrowRightToLine() {
        return LucideIconsA.arrowRightToLine();
    }

    public static Icon arrowUp() {
        return LucideIconsA.arrowUp();
    }

    public static Icon arrowUpN0N1() {
        return LucideIconsA.arrowUpN0N1();
    }

    public static Icon arrowUpN01() {
        return LucideIconsA.arrowUpN01();
    }

    public static Icon arrowUpN1N0() {
        return LucideIconsA.arrowUpN1N0();
    }

    public static Icon arrowUpN10() {
        return LucideIconsA.arrowUpN10();
    }

    public static Icon arrowUpAZ() {
        return LucideIconsA.arrowUpAZ();
    }

    public static Icon arrowUpAz() {
        return LucideIconsA.arrowUpAz();
    }

    public static Icon arrowUpCircle() {
        return LucideIconsA.arrowUpCircle();
    }

    public static Icon arrowUpDown() {
        return LucideIconsA.arrowUpDown();
    }

    public static Icon arrowUpFromDot() {
        return LucideIconsA.arrowUpFromDot();
    }

    public static Icon arrowUpFromLine() {
        return LucideIconsA.arrowUpFromLine();
    }

    public static Icon arrowUpLeft() {
        return LucideIconsA.arrowUpLeft();
    }

    public static Icon arrowUpLeftFromCircle() {
        return LucideIconsA.arrowUpLeftFromCircle();
    }

    public static Icon arrowUpLeftFromSquare() {
        return LucideIconsA.arrowUpLeftFromSquare();
    }

    public static Icon arrowUpLeftSquare() {
        return LucideIconsA.arrowUpLeftSquare();
    }

    public static Icon arrowUpNarrowWide() {
        return LucideIconsA.arrowUpNarrowWide();
    }

    public static Icon arrowUpRight() {
        return LucideIconsA.arrowUpRight();
    }

    public static Icon arrowUpRightFromCircle() {
        return LucideIconsA.arrowUpRightFromCircle();
    }

    public static Icon arrowUpRightFromSquare() {
        return LucideIconsA.arrowUpRightFromSquare();
    }

    public static Icon arrowUpRightSquare() {
        return LucideIconsA.arrowUpRightSquare();
    }

    public static Icon arrowUpSquare() {
        return LucideIconsA.arrowUpSquare();
    }

    public static Icon arrowUpToLine() {
        return LucideIconsA.arrowUpToLine();
    }

    public static Icon arrowUpWideNarrow() {
        return LucideIconsA.arrowUpWideNarrow();
    }

    public static Icon arrowUpZA() {
        return LucideIconsA.arrowUpZA();
    }

    public static Icon arrowUpZa() {
        return LucideIconsA.arrowUpZa();
    }

    public static Icon arrowsUpFromLine() {
        return LucideIconsA.arrowsUpFromLine();
    }

    public static Icon asterisk() {
        return LucideIconsA.asterisk();
    }

    public static Icon asteriskSquare() {
        return LucideIconsA.asteriskSquare();
    }

    public static Icon astroid() {
        return LucideIconsA.astroid();
    }

    public static Icon atSign() {
        return LucideIconsA.atSign();
    }

    public static Icon atom() {
        return LucideIconsA.atom();
    }

    public static Icon audioLines() {
        return LucideIconsA.audioLines();
    }

    public static Icon audioWaveform() {
        return LucideIconsA.audioWaveform();
    }

    public static Icon award() {
        return LucideIconsA.award();
    }

    public static Icon axe() {
        return LucideIconsA.axe();
    }

    public static Icon axisN3D() {
        return LucideIconsA.axisN3D();
    }

    public static Icon axis3d() {
        return LucideIconsA.axis3d();
    }

    public static Icon baby() {
        return LucideIconsB.baby();
    }

    public static Icon backpack() {
        return LucideIconsB.backpack();
    }

    public static Icon badge() {
        return LucideIconsB.badge();
    }

    public static Icon badgeAlert() {
        return LucideIconsB.badgeAlert();
    }

    public static Icon badgeCent() {
        return LucideIconsB.badgeCent();
    }

    public static Icon badgeCheck() {
        return LucideIconsB.badgeCheck();
    }

    public static Icon badgeDollarSign() {
        return LucideIconsB.badgeDollarSign();
    }

    public static Icon badgeEuro() {
        return LucideIconsB.badgeEuro();
    }

    public static Icon badgeHelp() {
        return LucideIconsB.badgeHelp();
    }

    public static Icon badgeIndianRupee() {
        return LucideIconsB.badgeIndianRupee();
    }

    public static Icon badgeInfo() {
        return LucideIconsB.badgeInfo();
    }

    public static Icon badgeJapaneseYen() {
        return LucideIconsB.badgeJapaneseYen();
    }

    public static Icon badgeMinus() {
        return LucideIconsB.badgeMinus();
    }

    public static Icon badgePercent() {
        return LucideIconsB.badgePercent();
    }

    public static Icon badgePlus() {
        return LucideIconsB.badgePlus();
    }

    public static Icon badgePoundSterling() {
        return LucideIconsB.badgePoundSterling();
    }

    public static Icon badgeQuestionMark() {
        return LucideIconsB.badgeQuestionMark();
    }

    public static Icon badgeRussianRuble() {
        return LucideIconsB.badgeRussianRuble();
    }

    public static Icon badgeSwissFranc() {
        return LucideIconsB.badgeSwissFranc();
    }

    public static Icon badgeTurkishLira() {
        return LucideIconsB.badgeTurkishLira();
    }

    public static Icon badgeX() {
        return LucideIconsB.badgeX();
    }

    public static Icon baggageClaim() {
        return LucideIconsB.baggageClaim();
    }

    public static Icon balloon() {
        return LucideIconsB.balloon();
    }

    public static Icon ban() {
        return LucideIconsB.ban();
    }

    public static Icon banana() {
        return LucideIconsB.banana();
    }

    public static Icon bandage() {
        return LucideIconsB.bandage();
    }

    public static Icon banknote() {
        return LucideIconsB.banknote();
    }

    public static Icon banknoteArrowDown() {
        return LucideIconsB.banknoteArrowDown();
    }

    public static Icon banknoteArrowUp() {
        return LucideIconsB.banknoteArrowUp();
    }

    public static Icon banknoteX() {
        return LucideIconsB.banknoteX();
    }

    public static Icon barChart() {
        return LucideIconsB.barChart();
    }

    public static Icon barChartN2() {
        return LucideIconsB.barChartN2();
    }

    public static Icon barChartN3() {
        return LucideIconsB.barChartN3();
    }

    public static Icon barChartN4() {
        return LucideIconsB.barChartN4();
    }

    public static Icon barChartBig() {
        return LucideIconsB.barChartBig();
    }

    public static Icon barChartHorizontal() {
        return LucideIconsB.barChartHorizontal();
    }

    public static Icon barChartHorizontalBig() {
        return LucideIconsB.barChartHorizontalBig();
    }

    public static Icon barcode() {
        return LucideIconsB.barcode();
    }

    public static Icon barrel() {
        return LucideIconsB.barrel();
    }

    public static Icon baseline() {
        return LucideIconsB.baseline();
    }

    public static Icon bath() {
        return LucideIconsB.bath();
    }

    public static Icon battery() {
        return LucideIconsB.battery();
    }

    public static Icon batteryCharging() {
        return LucideIconsB.batteryCharging();
    }

    public static Icon batteryFull() {
        return LucideIconsB.batteryFull();
    }

    public static Icon batteryLow() {
        return LucideIconsB.batteryLow();
    }

    public static Icon batteryMedium() {
        return LucideIconsB.batteryMedium();
    }

    public static Icon batteryPlus() {
        return LucideIconsB.batteryPlus();
    }

    public static Icon batteryWarning() {
        return LucideIconsB.batteryWarning();
    }

    public static Icon beaker() {
        return LucideIconsB.beaker();
    }

    public static Icon bean() {
        return LucideIconsB.bean();
    }

    public static Icon beanOff() {
        return LucideIconsB.beanOff();
    }

    public static Icon bed() {
        return LucideIconsB.bed();
    }

    public static Icon bedDouble() {
        return LucideIconsB.bedDouble();
    }

    public static Icon bedSingle() {
        return LucideIconsB.bedSingle();
    }

    public static Icon beef() {
        return LucideIconsB.beef();
    }

    public static Icon beefOff() {
        return LucideIconsB.beefOff();
    }

    public static Icon beer() {
        return LucideIconsB.beer();
    }

    public static Icon beerOff() {
        return LucideIconsB.beerOff();
    }

    public static Icon bell() {
        return LucideIconsB.bell();
    }

    public static Icon bellCheck() {
        return LucideIconsB.bellCheck();
    }

    public static Icon bellDot() {
        return LucideIconsB.bellDot();
    }

    public static Icon bellElectric() {
        return LucideIconsB.bellElectric();
    }

    public static Icon bellMinus() {
        return LucideIconsB.bellMinus();
    }

    public static Icon bellOff() {
        return LucideIconsB.bellOff();
    }

    public static Icon bellPlus() {
        return LucideIconsB.bellPlus();
    }

    public static Icon bellRing() {
        return LucideIconsB.bellRing();
    }

    public static Icon betweenHorizonalEnd() {
        return LucideIconsB.betweenHorizonalEnd();
    }

    public static Icon betweenHorizonalStart() {
        return LucideIconsB.betweenHorizonalStart();
    }

    public static Icon betweenHorizontalEnd() {
        return LucideIconsB.betweenHorizontalEnd();
    }

    public static Icon betweenHorizontalStart() {
        return LucideIconsB.betweenHorizontalStart();
    }

    public static Icon betweenVerticalEnd() {
        return LucideIconsB.betweenVerticalEnd();
    }

    public static Icon betweenVerticalStart() {
        return LucideIconsB.betweenVerticalStart();
    }

    public static Icon bicepsFlexed() {
        return LucideIconsB.bicepsFlexed();
    }

    public static Icon bike() {
        return LucideIconsB.bike();
    }

    public static Icon binary() {
        return LucideIconsB.binary();
    }

    public static Icon binoculars() {
        return LucideIconsB.binoculars();
    }

    public static Icon biohazard() {
        return LucideIconsB.biohazard();
    }

    public static Icon bird() {
        return LucideIconsB.bird();
    }

    public static Icon birdhouse() {
        return LucideIconsB.birdhouse();
    }

    public static Icon bitcoin() {
        return LucideIconsB.bitcoin();
    }

    public static Icon blend() {
        return LucideIconsB.blend();
    }

    public static Icon blender() {
        return LucideIconsB.blender();
    }

    public static Icon blinds() {
        return LucideIconsB.blinds();
    }

    public static Icon blocks() {
        return LucideIconsB.blocks();
    }

    public static Icon bluetooth() {
        return LucideIconsB.bluetooth();
    }

    public static Icon bluetoothConnected() {
        return LucideIconsB.bluetoothConnected();
    }

    public static Icon bluetoothOff() {
        return LucideIconsB.bluetoothOff();
    }

    public static Icon bluetoothSearching() {
        return LucideIconsB.bluetoothSearching();
    }

    public static Icon bold() {
        return LucideIconsB.bold();
    }

    public static Icon bolt() {
        return LucideIconsB.bolt();
    }

    public static Icon bomb() {
        return LucideIconsB.bomb();
    }

    public static Icon bone() {
        return LucideIconsB.bone();
    }

    public static Icon book() {
        return LucideIconsB.book();
    }

    public static Icon bookA() {
        return LucideIconsB.bookA();
    }

    public static Icon bookAlert() {
        return LucideIconsB.bookAlert();
    }

    public static Icon bookAudio() {
        return LucideIconsB.bookAudio();
    }

    public static Icon bookCheck() {
        return LucideIconsB.bookCheck();
    }

    public static Icon bookCopy() {
        return LucideIconsB.bookCopy();
    }

    public static Icon bookDashed() {
        return LucideIconsB.bookDashed();
    }

    public static Icon bookDown() {
        return LucideIconsB.bookDown();
    }

    public static Icon bookHeadphones() {
        return LucideIconsB.bookHeadphones();
    }

    public static Icon bookHeart() {
        return LucideIconsB.bookHeart();
    }

    public static Icon bookImage() {
        return LucideIconsB.bookImage();
    }

    public static Icon bookKey() {
        return LucideIconsB.bookKey();
    }

    public static Icon bookLock() {
        return LucideIconsB.bookLock();
    }

    public static Icon bookMarked() {
        return LucideIconsB.bookMarked();
    }

    public static Icon bookMinus() {
        return LucideIconsB.bookMinus();
    }

    public static Icon bookOpen() {
        return LucideIconsB.bookOpen();
    }

    public static Icon bookOpenCheck() {
        return LucideIconsB.bookOpenCheck();
    }

    public static Icon bookOpenText() {
        return LucideIconsB.bookOpenText();
    }

    public static Icon bookPlus() {
        return LucideIconsB.bookPlus();
    }

    public static Icon bookSearch() {
        return LucideIconsB.bookSearch();
    }

    public static Icon bookTemplate() {
        return LucideIconsB.bookTemplate();
    }

    public static Icon bookText() {
        return LucideIconsB.bookText();
    }

    public static Icon bookType() {
        return LucideIconsB.bookType();
    }

    public static Icon bookUp() {
        return LucideIconsB.bookUp();
    }

    public static Icon bookUpN2() {
        return LucideIconsB.bookUpN2();
    }

    public static Icon bookUser() {
        return LucideIconsB.bookUser();
    }

    public static Icon bookX() {
        return LucideIconsB.bookX();
    }

    public static Icon bookmark() {
        return LucideIconsB.bookmark();
    }

    public static Icon bookmarkCheck() {
        return LucideIconsB.bookmarkCheck();
    }

    public static Icon bookmarkMinus() {
        return LucideIconsB.bookmarkMinus();
    }

    public static Icon bookmarkOff() {
        return LucideIconsB.bookmarkOff();
    }

    public static Icon bookmarkPlus() {
        return LucideIconsB.bookmarkPlus();
    }

    public static Icon bookmarkX() {
        return LucideIconsB.bookmarkX();
    }

    public static Icon boomBox() {
        return LucideIconsB.boomBox();
    }

    public static Icon bot() {
        return LucideIconsB.bot();
    }

    public static Icon botMessageSquare() {
        return LucideIconsB.botMessageSquare();
    }

    public static Icon botOff() {
        return LucideIconsB.botOff();
    }

    public static Icon bottleWine() {
        return LucideIconsB.bottleWine();
    }

    public static Icon bowArrow() {
        return LucideIconsB.bowArrow();
    }

    public static Icon box() {
        return LucideIconsB.box();
    }

    public static Icon boxSelect() {
        return LucideIconsB.boxSelect();
    }

    public static Icon boxes() {
        return LucideIconsB.boxes();
    }

    public static Icon braces() {
        return LucideIconsB.braces();
    }

    public static Icon brackets() {
        return LucideIconsB.brackets();
    }

    public static Icon brain() {
        return LucideIconsB.brain();
    }

    public static Icon brainCircuit() {
        return LucideIconsB.brainCircuit();
    }

    public static Icon brainCog() {
        return LucideIconsB.brainCog();
    }

    public static Icon brickWall() {
        return LucideIconsB.brickWall();
    }

    public static Icon brickWallFire() {
        return LucideIconsB.brickWallFire();
    }

    public static Icon brickWallShield() {
        return LucideIconsB.brickWallShield();
    }

    public static Icon briefcase() {
        return LucideIconsB.briefcase();
    }

    public static Icon briefcaseBusiness() {
        return LucideIconsB.briefcaseBusiness();
    }

    public static Icon briefcaseConveyorBelt() {
        return LucideIconsB.briefcaseConveyorBelt();
    }

    public static Icon briefcaseMedical() {
        return LucideIconsB.briefcaseMedical();
    }

    public static Icon bringToFront() {
        return LucideIconsB.bringToFront();
    }

    public static Icon broccoli() {
        return LucideIconsB.broccoli();
    }

    public static Icon brush() {
        return LucideIconsB.brush();
    }

    public static Icon brushCleaning() {
        return LucideIconsB.brushCleaning();
    }

    public static Icon bubbles() {
        return LucideIconsB.bubbles();
    }

    public static Icon bug() {
        return LucideIconsB.bug();
    }

    public static Icon bugOff() {
        return LucideIconsB.bugOff();
    }

    public static Icon bugPlay() {
        return LucideIconsB.bugPlay();
    }

    public static Icon building() {
        return LucideIconsB.building();
    }

    public static Icon buildingN2() {
        return LucideIconsB.buildingN2();
    }

    public static Icon bus() {
        return LucideIconsB.bus();
    }

    public static Icon busFront() {
        return LucideIconsB.busFront();
    }

    public static Icon cable() {
        return LucideIconsC.cable();
    }

    public static Icon cableCar() {
        return LucideIconsC.cableCar();
    }

    public static Icon cake() {
        return LucideIconsC.cake();
    }

    public static Icon cakeSlice() {
        return LucideIconsC.cakeSlice();
    }

    public static Icon calculator() {
        return LucideIconsC.calculator();
    }

    public static Icon calendar() {
        return LucideIconsC.calendar();
    }

    public static Icon calendarN1() {
        return LucideIconsC.calendarN1();
    }

    public static Icon calendarArrowDown() {
        return LucideIconsC.calendarArrowDown();
    }

    public static Icon calendarArrowUp() {
        return LucideIconsC.calendarArrowUp();
    }

    public static Icon calendarCheck() {
        return LucideIconsC.calendarCheck();
    }

    public static Icon calendarCheckN2() {
        return LucideIconsC.calendarCheckN2();
    }

    public static Icon calendarClock() {
        return LucideIconsC.calendarClock();
    }

    public static Icon calendarCog() {
        return LucideIconsC.calendarCog();
    }

    public static Icon calendarDays() {
        return LucideIconsC.calendarDays();
    }

    public static Icon calendarFold() {
        return LucideIconsC.calendarFold();
    }

    public static Icon calendarHeart() {
        return LucideIconsC.calendarHeart();
    }

    public static Icon calendarMinus() {
        return LucideIconsC.calendarMinus();
    }

    public static Icon calendarMinusN2() {
        return LucideIconsC.calendarMinusN2();
    }

    public static Icon calendarOff() {
        return LucideIconsC.calendarOff();
    }

    public static Icon calendarPlus() {
        return LucideIconsC.calendarPlus();
    }

    public static Icon calendarPlusN2() {
        return LucideIconsC.calendarPlusN2();
    }

    public static Icon calendarRange() {
        return LucideIconsC.calendarRange();
    }

    public static Icon calendarSearch() {
        return LucideIconsC.calendarSearch();
    }

    public static Icon calendarSync() {
        return LucideIconsC.calendarSync();
    }

    public static Icon calendarX() {
        return LucideIconsC.calendarX();
    }

    public static Icon calendarXN2() {
        return LucideIconsC.calendarXN2();
    }

    public static Icon calendars() {
        return LucideIconsC.calendars();
    }

    public static Icon camera() {
        return LucideIconsC.camera();
    }

    public static Icon cameraOff() {
        return LucideIconsC.cameraOff();
    }

    public static Icon candlestickChart() {
        return LucideIconsC.candlestickChart();
    }

    public static Icon candy() {
        return LucideIconsC.candy();
    }

    public static Icon candyCane() {
        return LucideIconsC.candyCane();
    }

    public static Icon candyOff() {
        return LucideIconsC.candyOff();
    }

    public static Icon cannabis() {
        return LucideIconsC.cannabis();
    }

    public static Icon cannabisOff() {
        return LucideIconsC.cannabisOff();
    }

    public static Icon captions() {
        return LucideIconsC.captions();
    }

    public static Icon captionsOff() {
        return LucideIconsC.captionsOff();
    }

    public static Icon car() {
        return LucideIconsC.car();
    }

    public static Icon carFront() {
        return LucideIconsC.carFront();
    }

    public static Icon carTaxiFront() {
        return LucideIconsC.carTaxiFront();
    }

    public static Icon caravan() {
        return LucideIconsC.caravan();
    }

    public static Icon cardSim() {
        return LucideIconsC.cardSim();
    }

    public static Icon carrot() {
        return LucideIconsC.carrot();
    }

    public static Icon caseLower() {
        return LucideIconsC.caseLower();
    }

    public static Icon caseSensitive() {
        return LucideIconsC.caseSensitive();
    }

    public static Icon caseUpper() {
        return LucideIconsC.caseUpper();
    }

    public static Icon cassetteTape() {
        return LucideIconsC.cassetteTape();
    }

    public static Icon cast() {
        return LucideIconsC.cast();
    }

    public static Icon castle() {
        return LucideIconsC.castle();
    }

    public static Icon cat() {
        return LucideIconsC.cat();
    }

    public static Icon cctv() {
        return LucideIconsC.cctv();
    }

    public static Icon cctvOff() {
        return LucideIconsC.cctvOff();
    }

    public static Icon chartArea() {
        return LucideIconsC.chartArea();
    }

    public static Icon chartBar() {
        return LucideIconsC.chartBar();
    }

    public static Icon chartBarBig() {
        return LucideIconsC.chartBarBig();
    }

    public static Icon chartBarDecreasing() {
        return LucideIconsC.chartBarDecreasing();
    }

    public static Icon chartBarIncreasing() {
        return LucideIconsC.chartBarIncreasing();
    }

    public static Icon chartBarStacked() {
        return LucideIconsC.chartBarStacked();
    }

    public static Icon chartCandlestick() {
        return LucideIconsC.chartCandlestick();
    }

    public static Icon chartColumn() {
        return LucideIconsC.chartColumn();
    }

    public static Icon chartColumnBig() {
        return LucideIconsC.chartColumnBig();
    }

    public static Icon chartColumnDecreasing() {
        return LucideIconsC.chartColumnDecreasing();
    }

    public static Icon chartColumnIncreasing() {
        return LucideIconsC.chartColumnIncreasing();
    }

    public static Icon chartColumnStacked() {
        return LucideIconsC.chartColumnStacked();
    }

    public static Icon chartGantt() {
        return LucideIconsC.chartGantt();
    }

    public static Icon chartLine() {
        return LucideIconsC.chartLine();
    }

    public static Icon chartNetwork() {
        return LucideIconsC.chartNetwork();
    }

    public static Icon chartNoAxesColumn() {
        return LucideIconsC.chartNoAxesColumn();
    }

    public static Icon chartNoAxesColumnDecreasing() {
        return LucideIconsC.chartNoAxesColumnDecreasing();
    }

    public static Icon chartNoAxesColumnIncreasing() {
        return LucideIconsC.chartNoAxesColumnIncreasing();
    }

    public static Icon chartNoAxesCombined() {
        return LucideIconsC.chartNoAxesCombined();
    }

    public static Icon chartNoAxesGantt() {
        return LucideIconsC.chartNoAxesGantt();
    }

    public static Icon chartPie() {
        return LucideIconsC.chartPie();
    }

    public static Icon chartScatter() {
        return LucideIconsC.chartScatter();
    }

    public static Icon chartSpline() {
        return LucideIconsC.chartSpline();
    }

    public static Icon check() {
        return LucideIconsC.check();
    }

    public static Icon checkCheck() {
        return LucideIconsC.checkCheck();
    }

    public static Icon checkCircle() {
        return LucideIconsC.checkCircle();
    }

    public static Icon checkCircleN2() {
        return LucideIconsC.checkCircleN2();
    }

    public static Icon checkLine() {
        return LucideIconsC.checkLine();
    }

    public static Icon checkSquare() {
        return LucideIconsC.checkSquare();
    }

    public static Icon checkSquareN2() {
        return LucideIconsC.checkSquareN2();
    }

    public static Icon chefHat() {
        return LucideIconsC.chefHat();
    }

    public static Icon cherry() {
        return LucideIconsC.cherry();
    }

    public static Icon chessBishop() {
        return LucideIconsC.chessBishop();
    }

    public static Icon chessKing() {
        return LucideIconsC.chessKing();
    }

    public static Icon chessKnight() {
        return LucideIconsC.chessKnight();
    }

    public static Icon chessPawn() {
        return LucideIconsC.chessPawn();
    }

    public static Icon chessQueen() {
        return LucideIconsC.chessQueen();
    }

    public static Icon chessRook() {
        return LucideIconsC.chessRook();
    }

    public static Icon chevronDown() {
        return LucideIconsC.chevronDown();
    }

    public static Icon chevronDownCircle() {
        return LucideIconsC.chevronDownCircle();
    }

    public static Icon chevronDownSquare() {
        return LucideIconsC.chevronDownSquare();
    }

    public static Icon chevronFirst() {
        return LucideIconsC.chevronFirst();
    }

    public static Icon chevronLast() {
        return LucideIconsC.chevronLast();
    }

    public static Icon chevronLeft() {
        return LucideIconsC.chevronLeft();
    }

    public static Icon chevronLeftCircle() {
        return LucideIconsC.chevronLeftCircle();
    }

    public static Icon chevronLeftSquare() {
        return LucideIconsC.chevronLeftSquare();
    }

    public static Icon chevronRight() {
        return LucideIconsC.chevronRight();
    }

    public static Icon chevronRightCircle() {
        return LucideIconsC.chevronRightCircle();
    }

    public static Icon chevronRightSquare() {
        return LucideIconsC.chevronRightSquare();
    }

    public static Icon chevronUp() {
        return LucideIconsC.chevronUp();
    }

    public static Icon chevronUpCircle() {
        return LucideIconsC.chevronUpCircle();
    }

    public static Icon chevronUpSquare() {
        return LucideIconsC.chevronUpSquare();
    }

    public static Icon chevronsDown() {
        return LucideIconsC.chevronsDown();
    }

    public static Icon chevronsDownUp() {
        return LucideIconsC.chevronsDownUp();
    }

    public static Icon chevronsLeft() {
        return LucideIconsC.chevronsLeft();
    }

    public static Icon chevronsLeftRight() {
        return LucideIconsC.chevronsLeftRight();
    }

    public static Icon chevronsLeftRightEllipsis() {
        return LucideIconsC.chevronsLeftRightEllipsis();
    }

    public static Icon chevronsRight() {
        return LucideIconsC.chevronsRight();
    }

    public static Icon chevronsRightLeft() {
        return LucideIconsC.chevronsRightLeft();
    }

    public static Icon chevronsUp() {
        return LucideIconsC.chevronsUp();
    }

    public static Icon chevronsUpDown() {
        return LucideIconsC.chevronsUpDown();
    }

    public static Icon church() {
        return LucideIconsC.church();
    }

    public static Icon cigarette() {
        return LucideIconsC.cigarette();
    }

    public static Icon cigaretteOff() {
        return LucideIconsC.cigaretteOff();
    }

    public static Icon circle() {
        return LucideIconsC.circle();
    }

    public static Icon circleAlert() {
        return LucideIconsC.circleAlert();
    }

    public static Icon circleArrowDown() {
        return LucideIconsC.circleArrowDown();
    }

    public static Icon circleArrowLeft() {
        return LucideIconsC.circleArrowLeft();
    }

    public static Icon circleArrowOutDownLeft() {
        return LucideIconsC.circleArrowOutDownLeft();
    }

    public static Icon circleArrowOutDownRight() {
        return LucideIconsC.circleArrowOutDownRight();
    }

    public static Icon circleArrowOutUpLeft() {
        return LucideIconsC.circleArrowOutUpLeft();
    }

    public static Icon circleArrowOutUpRight() {
        return LucideIconsC.circleArrowOutUpRight();
    }

    public static Icon circleArrowRight() {
        return LucideIconsC.circleArrowRight();
    }

    public static Icon circleArrowUp() {
        return LucideIconsC.circleArrowUp();
    }

    public static Icon circleCheck() {
        return LucideIconsC.circleCheck();
    }

    public static Icon circleCheckBig() {
        return LucideIconsC.circleCheckBig();
    }

    public static Icon circleChevronDown() {
        return LucideIconsC.circleChevronDown();
    }

    public static Icon circleChevronLeft() {
        return LucideIconsC.circleChevronLeft();
    }

    public static Icon circleChevronRight() {
        return LucideIconsC.circleChevronRight();
    }

    public static Icon circleChevronUp() {
        return LucideIconsC.circleChevronUp();
    }

    public static Icon circleDashed() {
        return LucideIconsC.circleDashed();
    }

    public static Icon circleDivide() {
        return LucideIconsC.circleDivide();
    }

    public static Icon circleDollarSign() {
        return LucideIconsC.circleDollarSign();
    }

    public static Icon circleDot() {
        return LucideIconsC.circleDot();
    }

    public static Icon circleDotDashed() {
        return LucideIconsC.circleDotDashed();
    }

    public static Icon circleEllipsis() {
        return LucideIconsC.circleEllipsis();
    }

    public static Icon circleEqual() {
        return LucideIconsC.circleEqual();
    }

    public static Icon circleFadingArrowUp() {
        return LucideIconsC.circleFadingArrowUp();
    }

    public static Icon circleFadingPlus() {
        return LucideIconsC.circleFadingPlus();
    }

    public static Icon circleGauge() {
        return LucideIconsC.circleGauge();
    }

    public static Icon circleHelp() {
        return LucideIconsC.circleHelp();
    }

    public static Icon circleMinus() {
        return LucideIconsC.circleMinus();
    }

    public static Icon circleOff() {
        return LucideIconsC.circleOff();
    }

    public static Icon circleParking() {
        return LucideIconsC.circleParking();
    }

    public static Icon circleParkingOff() {
        return LucideIconsC.circleParkingOff();
    }

    public static Icon circlePause() {
        return LucideIconsC.circlePause();
    }

    public static Icon circlePercent() {
        return LucideIconsC.circlePercent();
    }

    public static Icon circlePile() {
        return LucideIconsC.circlePile();
    }

    public static Icon circlePlay() {
        return LucideIconsC.circlePlay();
    }

    public static Icon circlePlus() {
        return LucideIconsC.circlePlus();
    }

    public static Icon circlePoundSterling() {
        return LucideIconsC.circlePoundSterling();
    }

    public static Icon circlePower() {
        return LucideIconsC.circlePower();
    }

    public static Icon circleQuestionMark() {
        return LucideIconsC.circleQuestionMark();
    }

    public static Icon circleSlash() {
        return LucideIconsC.circleSlash();
    }

    public static Icon circleSlashN2() {
        return LucideIconsC.circleSlashN2();
    }

    public static Icon circleSlashed() {
        return LucideIconsC.circleSlashed();
    }

    public static Icon circleSmall() {
        return LucideIconsC.circleSmall();
    }

    public static Icon circleStar() {
        return LucideIconsC.circleStar();
    }

    public static Icon circleStop() {
        return LucideIconsC.circleStop();
    }

    public static Icon circleUser() {
        return LucideIconsC.circleUser();
    }

    public static Icon circleUserRound() {
        return LucideIconsC.circleUserRound();
    }

    public static Icon circleX() {
        return LucideIconsC.circleX();
    }

    public static Icon circuitBoard() {
        return LucideIconsC.circuitBoard();
    }

    public static Icon citrus() {
        return LucideIconsC.citrus();
    }

    public static Icon clapperboard() {
        return LucideIconsC.clapperboard();
    }

    public static Icon clipboard() {
        return LucideIconsC.clipboard();
    }

    public static Icon clipboardCheck() {
        return LucideIconsC.clipboardCheck();
    }

    public static Icon clipboardClock() {
        return LucideIconsC.clipboardClock();
    }

    public static Icon clipboardCopy() {
        return LucideIconsC.clipboardCopy();
    }

    public static Icon clipboardEdit() {
        return LucideIconsC.clipboardEdit();
    }

    public static Icon clipboardList() {
        return LucideIconsC.clipboardList();
    }

    public static Icon clipboardMinus() {
        return LucideIconsC.clipboardMinus();
    }

    public static Icon clipboardPaste() {
        return LucideIconsC.clipboardPaste();
    }

    public static Icon clipboardPen() {
        return LucideIconsC.clipboardPen();
    }

    public static Icon clipboardPenLine() {
        return LucideIconsC.clipboardPenLine();
    }

    public static Icon clipboardPlus() {
        return LucideIconsC.clipboardPlus();
    }

    public static Icon clipboardSignature() {
        return LucideIconsC.clipboardSignature();
    }

    public static Icon clipboardType() {
        return LucideIconsC.clipboardType();
    }

    public static Icon clipboardX() {
        return LucideIconsC.clipboardX();
    }

    public static Icon clock() {
        return LucideIconsC.clock();
    }

    public static Icon clockN1() {
        return LucideIconsC.clockN1();
    }

    public static Icon clockN10() {
        return LucideIconsC.clockN10();
    }

    public static Icon clockN11() {
        return LucideIconsC.clockN11();
    }

    public static Icon clockN12() {
        return LucideIconsC.clockN12();
    }

    public static Icon clockN2() {
        return LucideIconsC.clockN2();
    }

    public static Icon clockN3() {
        return LucideIconsC.clockN3();
    }

    public static Icon clockN4() {
        return LucideIconsC.clockN4();
    }

    public static Icon clockN5() {
        return LucideIconsC.clockN5();
    }

    public static Icon clockN6() {
        return LucideIconsC.clockN6();
    }

    public static Icon clockN7() {
        return LucideIconsC.clockN7();
    }

    public static Icon clockN8() {
        return LucideIconsC.clockN8();
    }

    public static Icon clockN9() {
        return LucideIconsC.clockN9();
    }

    public static Icon clockAlert() {
        return LucideIconsC.clockAlert();
    }

    public static Icon clockArrowDown() {
        return LucideIconsC.clockArrowDown();
    }

    public static Icon clockArrowUp() {
        return LucideIconsC.clockArrowUp();
    }

    public static Icon clockCheck() {
        return LucideIconsC.clockCheck();
    }

    public static Icon clockFading() {
        return LucideIconsC.clockFading();
    }

    public static Icon clockPlus() {
        return LucideIconsC.clockPlus();
    }

    public static Icon closedCaption() {
        return LucideIconsC.closedCaption();
    }

    public static Icon cloud() {
        return LucideIconsC.cloud();
    }

    public static Icon cloudAlert() {
        return LucideIconsC.cloudAlert();
    }

    public static Icon cloudBackup() {
        return LucideIconsC.cloudBackup();
    }

    public static Icon cloudCheck() {
        return LucideIconsC.cloudCheck();
    }

    public static Icon cloudCog() {
        return LucideIconsC.cloudCog();
    }

    public static Icon cloudDownload() {
        return LucideIconsC.cloudDownload();
    }

    public static Icon cloudDrizzle() {
        return LucideIconsC.cloudDrizzle();
    }

    public static Icon cloudFog() {
        return LucideIconsC.cloudFog();
    }

    public static Icon cloudHail() {
        return LucideIconsC.cloudHail();
    }

    public static Icon cloudLightning() {
        return LucideIconsC.cloudLightning();
    }

    public static Icon cloudMoon() {
        return LucideIconsC.cloudMoon();
    }

    public static Icon cloudMoonRain() {
        return LucideIconsC.cloudMoonRain();
    }

    public static Icon cloudOff() {
        return LucideIconsC.cloudOff();
    }

    public static Icon cloudRain() {
        return LucideIconsC.cloudRain();
    }

    public static Icon cloudRainWind() {
        return LucideIconsC.cloudRainWind();
    }

    public static Icon cloudSnow() {
        return LucideIconsC.cloudSnow();
    }

    public static Icon cloudSun() {
        return LucideIconsC.cloudSun();
    }

    public static Icon cloudSunRain() {
        return LucideIconsC.cloudSunRain();
    }

    public static Icon cloudSync() {
        return LucideIconsC.cloudSync();
    }

    public static Icon cloudUpload() {
        return LucideIconsC.cloudUpload();
    }

    public static Icon cloudy() {
        return LucideIconsC.cloudy();
    }

    public static Icon clover() {
        return LucideIconsC.clover();
    }

    public static Icon club() {
        return LucideIconsC.club();
    }

    public static Icon code() {
        return LucideIconsC.code();
    }

    public static Icon codeN2() {
        return LucideIconsC.codeN2();
    }

    public static Icon codeSquare() {
        return LucideIconsC.codeSquare();
    }

    public static Icon codeXml() {
        return LucideIconsC.codeXml();
    }

    public static Icon coffee() {
        return LucideIconsC.coffee();
    }

    public static Icon cog() {
        return LucideIconsC.cog();
    }

    public static Icon coins() {
        return LucideIconsC.coins();
    }

    public static Icon columns() {
        return LucideIconsC.columns();
    }

    public static Icon columnsN2() {
        return LucideIconsC.columnsN2();
    }

    public static Icon columnsN3() {
        return LucideIconsC.columnsN3();
    }

    public static Icon columnsN3Cog() {
        return LucideIconsC.columnsN3Cog();
    }

    public static Icon columnsN4() {
        return LucideIconsC.columnsN4();
    }

    public static Icon columnsSettings() {
        return LucideIconsC.columnsSettings();
    }

    public static Icon combine() {
        return LucideIconsC.combine();
    }

    public static Icon command() {
        return LucideIconsC.command();
    }

    public static Icon compass() {
        return LucideIconsC.compass();
    }

    public static Icon component() {
        return LucideIconsC.component();
    }

    public static Icon computer() {
        return LucideIconsC.computer();
    }

    public static Icon conciergeBell() {
        return LucideIconsC.conciergeBell();
    }

    public static Icon cone() {
        return LucideIconsC.cone();
    }

    public static Icon construction() {
        return LucideIconsC.construction();
    }

    public static Icon contact() {
        return LucideIconsC.contact();
    }

    public static Icon contactN2() {
        return LucideIconsC.contactN2();
    }

    public static Icon contactRound() {
        return LucideIconsC.contactRound();
    }

    public static Icon container() {
        return LucideIconsC.container();
    }

    public static Icon contrast() {
        return LucideIconsC.contrast();
    }

    public static Icon cookie() {
        return LucideIconsC.cookie();
    }

    public static Icon cookingPot() {
        return LucideIconsC.cookingPot();
    }

    public static Icon copy() {
        return LucideIconsC.copy();
    }

    public static Icon copyCheck() {
        return LucideIconsC.copyCheck();
    }

    public static Icon copyMinus() {
        return LucideIconsC.copyMinus();
    }

    public static Icon copyPlus() {
        return LucideIconsC.copyPlus();
    }

    public static Icon copySlash() {
        return LucideIconsC.copySlash();
    }

    public static Icon copyX() {
        return LucideIconsC.copyX();
    }

    public static Icon copyleft() {
        return LucideIconsC.copyleft();
    }

    public static Icon copyright() {
        return LucideIconsC.copyright();
    }

    public static Icon cornerDownLeft() {
        return LucideIconsC.cornerDownLeft();
    }

    public static Icon cornerDownRight() {
        return LucideIconsC.cornerDownRight();
    }

    public static Icon cornerLeftDown() {
        return LucideIconsC.cornerLeftDown();
    }

    public static Icon cornerLeftUp() {
        return LucideIconsC.cornerLeftUp();
    }

    public static Icon cornerRightDown() {
        return LucideIconsC.cornerRightDown();
    }

    public static Icon cornerRightUp() {
        return LucideIconsC.cornerRightUp();
    }

    public static Icon cornerUpLeft() {
        return LucideIconsC.cornerUpLeft();
    }

    public static Icon cornerUpRight() {
        return LucideIconsC.cornerUpRight();
    }

    public static Icon cpu() {
        return LucideIconsC.cpu();
    }

    public static Icon creativeCommons() {
        return LucideIconsC.creativeCommons();
    }

    public static Icon creditCard() {
        return LucideIconsC.creditCard();
    }

    public static Icon croissant() {
        return LucideIconsC.croissant();
    }

    public static Icon crop() {
        return LucideIconsC.crop();
    }

    public static Icon cross() {
        return LucideIconsC.cross();
    }

    public static Icon crosshair() {
        return LucideIconsC.crosshair();
    }

    public static Icon crown() {
        return LucideIconsC.crown();
    }

    public static Icon cuboid() {
        return LucideIconsC.cuboid();
    }

    public static Icon cupSoda() {
        return LucideIconsC.cupSoda();
    }

    public static Icon curlyBraces() {
        return LucideIconsC.curlyBraces();
    }

    public static Icon currency() {
        return LucideIconsC.currency();
    }

    public static Icon cylinder() {
        return LucideIconsC.cylinder();
    }

    public static Icon dam() {
        return LucideIconsD.dam();
    }

    public static Icon database() {
        return LucideIconsD.database();
    }

    public static Icon databaseBackup() {
        return LucideIconsD.databaseBackup();
    }

    public static Icon databaseSearch() {
        return LucideIconsD.databaseSearch();
    }

    public static Icon databaseZap() {
        return LucideIconsD.databaseZap();
    }

    public static Icon decimalsArrowLeft() {
        return LucideIconsD.decimalsArrowLeft();
    }

    public static Icon decimalsArrowRight() {
        return LucideIconsD.decimalsArrowRight();
    }

    public static Icon delete() {
        return LucideIconsD.delete();
    }

    public static Icon dessert() {
        return LucideIconsD.dessert();
    }

    public static Icon diameter() {
        return LucideIconsD.diameter();
    }

    public static Icon diamond() {
        return LucideIconsD.diamond();
    }

    public static Icon diamondMinus() {
        return LucideIconsD.diamondMinus();
    }

    public static Icon diamondPercent() {
        return LucideIconsD.diamondPercent();
    }

    public static Icon diamondPlus() {
        return LucideIconsD.diamondPlus();
    }

    public static Icon diceN1() {
        return LucideIconsD.diceN1();
    }

    public static Icon diceN2() {
        return LucideIconsD.diceN2();
    }

    public static Icon diceN3() {
        return LucideIconsD.diceN3();
    }

    public static Icon diceN4() {
        return LucideIconsD.diceN4();
    }

    public static Icon diceN5() {
        return LucideIconsD.diceN5();
    }

    public static Icon diceN6() {
        return LucideIconsD.diceN6();
    }

    public static Icon dices() {
        return LucideIconsD.dices();
    }

    public static Icon diff() {
        return LucideIconsD.diff();
    }

    public static Icon disc() {
        return LucideIconsD.disc();
    }

    public static Icon discN2() {
        return LucideIconsD.discN2();
    }

    public static Icon discN3() {
        return LucideIconsD.discN3();
    }

    public static Icon discAlbum() {
        return LucideIconsD.discAlbum();
    }

    public static Icon divide() {
        return LucideIconsD.divide();
    }

    public static Icon divideCircle() {
        return LucideIconsD.divideCircle();
    }

    public static Icon divideSquare() {
        return LucideIconsD.divideSquare();
    }

    public static Icon dna() {
        return LucideIconsD.dna();
    }

    public static Icon dnaOff() {
        return LucideIconsD.dnaOff();
    }

    public static Icon dock() {
        return LucideIconsD.dock();
    }

    public static Icon dog() {
        return LucideIconsD.dog();
    }

    public static Icon dollarSign() {
        return LucideIconsD.dollarSign();
    }

    public static Icon donut() {
        return LucideIconsD.donut();
    }

    public static Icon doorClosed() {
        return LucideIconsD.doorClosed();
    }

    public static Icon doorClosedLocked() {
        return LucideIconsD.doorClosedLocked();
    }

    public static Icon doorOpen() {
        return LucideIconsD.doorOpen();
    }

    public static Icon dot() {
        return LucideIconsD.dot();
    }

    public static Icon dotSquare() {
        return LucideIconsD.dotSquare();
    }

    public static Icon download() {
        return LucideIconsD.download();
    }

    public static Icon downloadCloud() {
        return LucideIconsD.downloadCloud();
    }

    public static Icon draftingCompass() {
        return LucideIconsD.draftingCompass();
    }

    public static Icon drama() {
        return LucideIconsD.drama();
    }

    public static Icon drill() {
        return LucideIconsD.drill();
    }

    public static Icon drone() {
        return LucideIconsD.drone();
    }

    public static Icon droplet() {
        return LucideIconsD.droplet();
    }

    public static Icon dropletOff() {
        return LucideIconsD.dropletOff();
    }

    public static Icon droplets() {
        return LucideIconsD.droplets();
    }

    public static Icon drum() {
        return LucideIconsD.drum();
    }

    public static Icon drumstick() {
        return LucideIconsD.drumstick();
    }

    public static Icon dumbbell() {
        return LucideIconsD.dumbbell();
    }

    public static Icon ear() {
        return LucideIconsE.ear();
    }

    public static Icon earOff() {
        return LucideIconsE.earOff();
    }

    public static Icon earth() {
        return LucideIconsE.earth();
    }

    public static Icon earthLock() {
        return LucideIconsE.earthLock();
    }

    public static Icon eclipse() {
        return LucideIconsE.eclipse();
    }

    public static Icon edit() {
        return LucideIconsE.edit();
    }

    public static Icon editN2() {
        return LucideIconsE.editN2();
    }

    public static Icon editN3() {
        return LucideIconsE.editN3();
    }

    public static Icon egg() {
        return LucideIconsE.egg();
    }

    public static Icon eggFried() {
        return LucideIconsE.eggFried();
    }

    public static Icon eggOff() {
        return LucideIconsE.eggOff();
    }

    public static Icon ellipse() {
        return LucideIconsE.ellipse();
    }

    public static Icon ellipsis() {
        return LucideIconsE.ellipsis();
    }

    public static Icon ellipsisVertical() {
        return LucideIconsE.ellipsisVertical();
    }

    public static Icon equal() {
        return LucideIconsE.equal();
    }

    public static Icon equalApproximately() {
        return LucideIconsE.equalApproximately();
    }

    public static Icon equalNot() {
        return LucideIconsE.equalNot();
    }

    public static Icon equalSquare() {
        return LucideIconsE.equalSquare();
    }

    public static Icon eraser() {
        return LucideIconsE.eraser();
    }

    public static Icon ethernetPort() {
        return LucideIconsE.ethernetPort();
    }

    public static Icon euro() {
        return LucideIconsE.euro();
    }

    public static Icon evCharger() {
        return LucideIconsE.evCharger();
    }

    public static Icon expand() {
        return LucideIconsE.expand();
    }

    public static Icon externalLink() {
        return LucideIconsE.externalLink();
    }

    public static Icon eye() {
        return LucideIconsE.eye();
    }

    public static Icon eyeClosed() {
        return LucideIconsE.eyeClosed();
    }

    public static Icon eyeOff() {
        return LucideIconsE.eyeOff();
    }

    public static Icon factory() {
        return LucideIconsF.factory();
    }

    public static Icon fan() {
        return LucideIconsF.fan();
    }

    public static Icon fastForward() {
        return LucideIconsF.fastForward();
    }

    public static Icon feather() {
        return LucideIconsF.feather();
    }

    public static Icon fence() {
        return LucideIconsF.fence();
    }

    public static Icon ferrisWheel() {
        return LucideIconsF.ferrisWheel();
    }

    public static Icon file() {
        return LucideIconsF.file();
    }

    public static Icon fileArchive() {
        return LucideIconsF.fileArchive();
    }

    public static Icon fileAudio() {
        return LucideIconsF.fileAudio();
    }

    public static Icon fileAudioN2() {
        return LucideIconsF.fileAudioN2();
    }

    public static Icon fileAxisN3D() {
        return LucideIconsF.fileAxisN3D();
    }

    public static Icon fileAxis3d() {
        return LucideIconsF.fileAxis3d();
    }

    public static Icon fileBadge() {
        return LucideIconsF.fileBadge();
    }

    public static Icon fileBadgeN2() {
        return LucideIconsF.fileBadgeN2();
    }

    public static Icon fileBarChart() {
        return LucideIconsF.fileBarChart();
    }

    public static Icon fileBarChartN2() {
        return LucideIconsF.fileBarChartN2();
    }

    public static Icon fileBox() {
        return LucideIconsF.fileBox();
    }

    public static Icon fileBraces() {
        return LucideIconsF.fileBraces();
    }

    public static Icon fileBracesCorner() {
        return LucideIconsF.fileBracesCorner();
    }

    public static Icon fileChartColumn() {
        return LucideIconsF.fileChartColumn();
    }

    public static Icon fileChartColumnIncreasing() {
        return LucideIconsF.fileChartColumnIncreasing();
    }

    public static Icon fileChartLine() {
        return LucideIconsF.fileChartLine();
    }

    public static Icon fileChartPie() {
        return LucideIconsF.fileChartPie();
    }

    public static Icon fileCheck() {
        return LucideIconsF.fileCheck();
    }

    public static Icon fileCheckN2() {
        return LucideIconsF.fileCheckN2();
    }

    public static Icon fileCheckCorner() {
        return LucideIconsF.fileCheckCorner();
    }

    public static Icon fileClock() {
        return LucideIconsF.fileClock();
    }

    public static Icon fileCode() {
        return LucideIconsF.fileCode();
    }

    public static Icon fileCodeN2() {
        return LucideIconsF.fileCodeN2();
    }

    public static Icon fileCodeCorner() {
        return LucideIconsF.fileCodeCorner();
    }

    public static Icon fileCog() {
        return LucideIconsF.fileCog();
    }

    public static Icon fileCogN2() {
        return LucideIconsF.fileCogN2();
    }

    public static Icon fileDiff() {
        return LucideIconsF.fileDiff();
    }

    public static Icon fileDigit() {
        return LucideIconsF.fileDigit();
    }

    public static Icon fileDown() {
        return LucideIconsF.fileDown();
    }

    public static Icon fileEdit() {
        return LucideIconsF.fileEdit();
    }

    public static Icon fileExclamationPoint() {
        return LucideIconsF.fileExclamationPoint();
    }

    public static Icon fileHeadphone() {
        return LucideIconsF.fileHeadphone();
    }

    public static Icon fileHeart() {
        return LucideIconsF.fileHeart();
    }

    public static Icon fileImage() {
        return LucideIconsF.fileImage();
    }

    public static Icon fileInput() {
        return LucideIconsF.fileInput();
    }

    public static Icon fileJson() {
        return LucideIconsF.fileJson();
    }

    public static Icon fileJsonN2() {
        return LucideIconsF.fileJsonN2();
    }

    public static Icon fileKey() {
        return LucideIconsF.fileKey();
    }

    public static Icon fileKeyN2() {
        return LucideIconsF.fileKeyN2();
    }

    public static Icon fileLineChart() {
        return LucideIconsF.fileLineChart();
    }

    public static Icon fileLock() {
        return LucideIconsF.fileLock();
    }

    public static Icon fileLockN2() {
        return LucideIconsF.fileLockN2();
    }

    public static Icon fileMinus() {
        return LucideIconsF.fileMinus();
    }

    public static Icon fileMinusN2() {
        return LucideIconsF.fileMinusN2();
    }

    public static Icon fileMinusCorner() {
        return LucideIconsF.fileMinusCorner();
    }

    public static Icon fileMusic() {
        return LucideIconsF.fileMusic();
    }

    public static Icon fileOutput() {
        return LucideIconsF.fileOutput();
    }

    public static Icon filePen() {
        return LucideIconsF.filePen();
    }

    public static Icon filePenLine() {
        return LucideIconsF.filePenLine();
    }

    public static Icon filePieChart() {
        return LucideIconsF.filePieChart();
    }

    public static Icon filePlay() {
        return LucideIconsF.filePlay();
    }

    public static Icon filePlus() {
        return LucideIconsF.filePlus();
    }

    public static Icon filePlusN2() {
        return LucideIconsF.filePlusN2();
    }

    public static Icon filePlusCorner() {
        return LucideIconsF.filePlusCorner();
    }

    public static Icon fileQuestion() {
        return LucideIconsF.fileQuestion();
    }

    public static Icon fileQuestionMark() {
        return LucideIconsF.fileQuestionMark();
    }

    public static Icon fileScan() {
        return LucideIconsF.fileScan();
    }

    public static Icon fileSearch() {
        return LucideIconsF.fileSearch();
    }

    public static Icon fileSearchN2() {
        return LucideIconsF.fileSearchN2();
    }

    public static Icon fileSearchCorner() {
        return LucideIconsF.fileSearchCorner();
    }

    public static Icon fileSignal() {
        return LucideIconsF.fileSignal();
    }

    public static Icon fileSignature() {
        return LucideIconsF.fileSignature();
    }

    public static Icon fileSliders() {
        return LucideIconsF.fileSliders();
    }

    public static Icon fileSpreadsheet() {
        return LucideIconsF.fileSpreadsheet();
    }

    public static Icon fileStack() {
        return LucideIconsF.fileStack();
    }

    public static Icon fileSymlink() {
        return LucideIconsF.fileSymlink();
    }

    public static Icon fileTerminal() {
        return LucideIconsF.fileTerminal();
    }

    public static Icon fileText() {
        return LucideIconsF.fileText();
    }

    public static Icon fileType() {
        return LucideIconsF.fileType();
    }

    public static Icon fileTypeN2() {
        return LucideIconsF.fileTypeN2();
    }

    public static Icon fileTypeCorner() {
        return LucideIconsF.fileTypeCorner();
    }

    public static Icon fileUp() {
        return LucideIconsF.fileUp();
    }

    public static Icon fileUser() {
        return LucideIconsF.fileUser();
    }

    public static Icon fileVideo() {
        return LucideIconsF.fileVideo();
    }

    public static Icon fileVideoN2() {
        return LucideIconsF.fileVideoN2();
    }

    public static Icon fileVideoCamera() {
        return LucideIconsF.fileVideoCamera();
    }

    public static Icon fileVolume() {
        return LucideIconsF.fileVolume();
    }

    public static Icon fileVolumeN2() {
        return LucideIconsF.fileVolumeN2();
    }

    public static Icon fileWarning() {
        return LucideIconsF.fileWarning();
    }

    public static Icon fileX() {
        return LucideIconsF.fileX();
    }

    public static Icon fileXN2() {
        return LucideIconsF.fileXN2();
    }

    public static Icon fileXCorner() {
        return LucideIconsF.fileXCorner();
    }

    public static Icon files() {
        return LucideIconsF.files();
    }

    public static Icon film() {
        return LucideIconsF.film();
    }

    public static Icon filter() {
        return LucideIconsF.filter();
    }

    public static Icon filterX() {
        return LucideIconsF.filterX();
    }

    public static Icon fingerprint() {
        return LucideIconsF.fingerprint();
    }

    public static Icon fingerprintPattern() {
        return LucideIconsF.fingerprintPattern();
    }

    public static Icon fireExtinguisher() {
        return LucideIconsF.fireExtinguisher();
    }

    public static Icon fish() {
        return LucideIconsF.fish();
    }

    public static Icon fishOff() {
        return LucideIconsF.fishOff();
    }

    public static Icon fishSymbol() {
        return LucideIconsF.fishSymbol();
    }

    public static Icon fishingHook() {
        return LucideIconsF.fishingHook();
    }

    public static Icon fishingRod() {
        return LucideIconsF.fishingRod();
    }

    public static Icon flag() {
        return LucideIconsF.flag();
    }

    public static Icon flagOff() {
        return LucideIconsF.flagOff();
    }

    public static Icon flagTriangleLeft() {
        return LucideIconsF.flagTriangleLeft();
    }

    public static Icon flagTriangleRight() {
        return LucideIconsF.flagTriangleRight();
    }

    public static Icon flame() {
        return LucideIconsF.flame();
    }

    public static Icon flameKindling() {
        return LucideIconsF.flameKindling();
    }

    public static Icon flashlight() {
        return LucideIconsF.flashlight();
    }

    public static Icon flashlightOff() {
        return LucideIconsF.flashlightOff();
    }

    public static Icon flaskConical() {
        return LucideIconsF.flaskConical();
    }

    public static Icon flaskConicalOff() {
        return LucideIconsF.flaskConicalOff();
    }

    public static Icon flaskRound() {
        return LucideIconsF.flaskRound();
    }

    public static Icon flipHorizontal() {
        return LucideIconsF.flipHorizontal();
    }

    public static Icon flipHorizontalN2() {
        return LucideIconsF.flipHorizontalN2();
    }

    public static Icon flipVertical() {
        return LucideIconsF.flipVertical();
    }

    public static Icon flipVerticalN2() {
        return LucideIconsF.flipVerticalN2();
    }

    public static Icon flower() {
        return LucideIconsF.flower();
    }

    public static Icon flowerN2() {
        return LucideIconsF.flowerN2();
    }

    public static Icon focus() {
        return LucideIconsF.focus();
    }

    public static Icon foldHorizontal() {
        return LucideIconsF.foldHorizontal();
    }

    public static Icon foldVertical() {
        return LucideIconsF.foldVertical();
    }

    public static Icon folder() {
        return LucideIconsF.folder();
    }

    public static Icon folderArchive() {
        return LucideIconsF.folderArchive();
    }

    public static Icon folderBookmark() {
        return LucideIconsF.folderBookmark();
    }

    public static Icon folderCheck() {
        return LucideIconsF.folderCheck();
    }

    public static Icon folderClock() {
        return LucideIconsF.folderClock();
    }

    public static Icon folderClosed() {
        return LucideIconsF.folderClosed();
    }

    public static Icon folderCode() {
        return LucideIconsF.folderCode();
    }

    public static Icon folderCog() {
        return LucideIconsF.folderCog();
    }

    public static Icon folderCogN2() {
        return LucideIconsF.folderCogN2();
    }

    public static Icon folderDot() {
        return LucideIconsF.folderDot();
    }

    public static Icon folderDown() {
        return LucideIconsF.folderDown();
    }

    public static Icon folderEdit() {
        return LucideIconsF.folderEdit();
    }

    public static Icon folderGit() {
        return LucideIconsF.folderGit();
    }

    public static Icon folderGitN2() {
        return LucideIconsF.folderGitN2();
    }

    public static Icon folderHeart() {
        return LucideIconsF.folderHeart();
    }

    public static Icon folderInput() {
        return LucideIconsF.folderInput();
    }

    public static Icon folderKanban() {
        return LucideIconsF.folderKanban();
    }

    public static Icon folderKey() {
        return LucideIconsF.folderKey();
    }

    public static Icon folderLock() {
        return LucideIconsF.folderLock();
    }

    public static Icon folderMinus() {
        return LucideIconsF.folderMinus();
    }

    public static Icon folderOpen() {
        return LucideIconsF.folderOpen();
    }

    public static Icon folderOpenDot() {
        return LucideIconsF.folderOpenDot();
    }

    public static Icon folderOutput() {
        return LucideIconsF.folderOutput();
    }

    public static Icon folderPen() {
        return LucideIconsF.folderPen();
    }

    public static Icon folderPlus() {
        return LucideIconsF.folderPlus();
    }

    public static Icon folderRoot() {
        return LucideIconsF.folderRoot();
    }

    public static Icon folderSearch() {
        return LucideIconsF.folderSearch();
    }

    public static Icon folderSearchN2() {
        return LucideIconsF.folderSearchN2();
    }

    public static Icon folderSymlink() {
        return LucideIconsF.folderSymlink();
    }

    public static Icon folderSync() {
        return LucideIconsF.folderSync();
    }

    public static Icon folderTree() {
        return LucideIconsF.folderTree();
    }

    public static Icon folderUp() {
        return LucideIconsF.folderUp();
    }

    public static Icon folderX() {
        return LucideIconsF.folderX();
    }

    public static Icon folders() {
        return LucideIconsF.folders();
    }

    public static Icon footprints() {
        return LucideIconsF.footprints();
    }

    public static Icon forkKnife() {
        return LucideIconsF.forkKnife();
    }

    public static Icon forkKnifeCrossed() {
        return LucideIconsF.forkKnifeCrossed();
    }

    public static Icon forklift() {
        return LucideIconsF.forklift();
    }

    public static Icon form() {
        return LucideIconsF.form();
    }

    public static Icon formInput() {
        return LucideIconsF.formInput();
    }

    public static Icon forward() {
        return LucideIconsF.forward();
    }

    public static Icon frame() {
        return LucideIconsF.frame();
    }

    public static Icon frown() {
        return LucideIconsF.frown();
    }

    public static Icon fuel() {
        return LucideIconsF.fuel();
    }

    public static Icon fullscreen() {
        return LucideIconsF.fullscreen();
    }

    public static Icon functionSquare() {
        return LucideIconsF.functionSquare();
    }

    public static Icon funnel() {
        return LucideIconsF.funnel();
    }

    public static Icon funnelPlus() {
        return LucideIconsF.funnelPlus();
    }

    public static Icon funnelX() {
        return LucideIconsF.funnelX();
    }

    public static Icon galleryHorizontal() {
        return LucideIconsG.galleryHorizontal();
    }

    public static Icon galleryHorizontalEnd() {
        return LucideIconsG.galleryHorizontalEnd();
    }

    public static Icon galleryThumbnails() {
        return LucideIconsG.galleryThumbnails();
    }

    public static Icon galleryVertical() {
        return LucideIconsG.galleryVertical();
    }

    public static Icon galleryVerticalEnd() {
        return LucideIconsG.galleryVerticalEnd();
    }

    public static Icon gamepad() {
        return LucideIconsG.gamepad();
    }

    public static Icon gamepadN2() {
        return LucideIconsG.gamepadN2();
    }

    public static Icon gamepadDirectional() {
        return LucideIconsG.gamepadDirectional();
    }

    public static Icon ganttChart() {
        return LucideIconsG.ganttChart();
    }

    public static Icon ganttChartSquare() {
        return LucideIconsG.ganttChartSquare();
    }

    public static Icon gauge() {
        return LucideIconsG.gauge();
    }

    public static Icon gaugeCircle() {
        return LucideIconsG.gaugeCircle();
    }

    public static Icon gavel() {
        return LucideIconsG.gavel();
    }

    public static Icon gem() {
        return LucideIconsG.gem();
    }

    public static Icon georgianLari() {
        return LucideIconsG.georgianLari();
    }

    public static Icon ghost() {
        return LucideIconsG.ghost();
    }

    public static Icon gift() {
        return LucideIconsG.gift();
    }

    public static Icon gitBranch() {
        return LucideIconsG.gitBranch();
    }

    public static Icon gitBranchMinus() {
        return LucideIconsG.gitBranchMinus();
    }

    public static Icon gitBranchPlus() {
        return LucideIconsG.gitBranchPlus();
    }

    public static Icon gitCommit() {
        return LucideIconsG.gitCommit();
    }

    public static Icon gitCommitHorizontal() {
        return LucideIconsG.gitCommitHorizontal();
    }

    public static Icon gitCommitVertical() {
        return LucideIconsG.gitCommitVertical();
    }

    public static Icon gitCompare() {
        return LucideIconsG.gitCompare();
    }

    public static Icon gitCompareArrows() {
        return LucideIconsG.gitCompareArrows();
    }

    public static Icon gitFork() {
        return LucideIconsG.gitFork();
    }

    public static Icon gitGraph() {
        return LucideIconsG.gitGraph();
    }

    public static Icon gitMerge() {
        return LucideIconsG.gitMerge();
    }

    public static Icon gitMergeConflict() {
        return LucideIconsG.gitMergeConflict();
    }

    public static Icon gitPullRequest() {
        return LucideIconsG.gitPullRequest();
    }

    public static Icon gitPullRequestArrow() {
        return LucideIconsG.gitPullRequestArrow();
    }

    public static Icon gitPullRequestClosed() {
        return LucideIconsG.gitPullRequestClosed();
    }

    public static Icon gitPullRequestCreate() {
        return LucideIconsG.gitPullRequestCreate();
    }

    public static Icon gitPullRequestCreateArrow() {
        return LucideIconsG.gitPullRequestCreateArrow();
    }

    public static Icon gitPullRequestDraft() {
        return LucideIconsG.gitPullRequestDraft();
    }

    public static Icon glassWater() {
        return LucideIconsG.glassWater();
    }

    public static Icon glasses() {
        return LucideIconsG.glasses();
    }

    public static Icon globe() {
        return LucideIconsG.globe();
    }

    public static Icon globeN2() {
        return LucideIconsG.globeN2();
    }

    public static Icon globeLock() {
        return LucideIconsG.globeLock();
    }

    public static Icon globeOff() {
        return LucideIconsG.globeOff();
    }

    public static Icon globeX() {
        return LucideIconsG.globeX();
    }

    public static Icon goal() {
        return LucideIconsG.goal();
    }

    public static Icon gpu() {
        return LucideIconsG.gpu();
    }

    public static Icon grab() {
        return LucideIconsG.grab();
    }

    public static Icon graduationCap() {
        return LucideIconsG.graduationCap();
    }

    public static Icon grape() {
        return LucideIconsG.grape();
    }

    public static Icon grid() {
        return LucideIconsG.grid();
    }

    public static Icon gridN2XN2() {
        return LucideIconsG.gridN2XN2();
    }

    public static Icon gridN2XN2Check() {
        return LucideIconsG.gridN2XN2Check();
    }

    public static Icon gridN2XN2Plus() {
        return LucideIconsG.gridN2XN2Plus();
    }

    public static Icon gridN2XN2X() {
        return LucideIconsG.gridN2XN2X();
    }

    public static Icon grid2x2() {
        return LucideIconsG.grid2x2();
    }

    public static Icon grid2x2Check() {
        return LucideIconsG.grid2x2Check();
    }

    public static Icon grid2x2Plus() {
        return LucideIconsG.grid2x2Plus();
    }

    public static Icon grid2x2X() {
        return LucideIconsG.grid2x2X();
    }

    public static Icon gridN3XN3() {
        return LucideIconsG.gridN3XN3();
    }

    public static Icon grid3x2() {
        return LucideIconsG.grid3x2();
    }

    public static Icon grid3x3() {
        return LucideIconsG.grid3x3();
    }

    public static Icon grip() {
        return LucideIconsG.grip();
    }

    public static Icon gripHorizontal() {
        return LucideIconsG.gripHorizontal();
    }

    public static Icon gripVertical() {
        return LucideIconsG.gripVertical();
    }

    public static Icon group() {
        return LucideIconsG.group();
    }

    public static Icon guitar() {
        return LucideIconsG.guitar();
    }

    public static Icon ham() {
        return LucideIconsH.ham();
    }

    public static Icon hamburger() {
        return LucideIconsH.hamburger();
    }

    public static Icon hammer() {
        return LucideIconsH.hammer();
    }

    public static Icon hand() {
        return LucideIconsH.hand();
    }

    public static Icon handCoins() {
        return LucideIconsH.handCoins();
    }

    public static Icon handFist() {
        return LucideIconsH.handFist();
    }

    public static Icon handGrab() {
        return LucideIconsH.handGrab();
    }

    public static Icon handHeart() {
        return LucideIconsH.handHeart();
    }

    public static Icon handHelping() {
        return LucideIconsH.handHelping();
    }

    public static Icon handMetal() {
        return LucideIconsH.handMetal();
    }

    public static Icon handPlatter() {
        return LucideIconsH.handPlatter();
    }

    public static Icon handbag() {
        return LucideIconsH.handbag();
    }

    public static Icon handshake() {
        return LucideIconsH.handshake();
    }

    public static Icon hardDrive() {
        return LucideIconsH.hardDrive();
    }

    public static Icon hardDriveDownload() {
        return LucideIconsH.hardDriveDownload();
    }

    public static Icon hardDriveUpload() {
        return LucideIconsH.hardDriveUpload();
    }

    public static Icon hardHat() {
        return LucideIconsH.hardHat();
    }

    public static Icon hash() {
        return LucideIconsH.hash();
    }

    public static Icon hatGlasses() {
        return LucideIconsH.hatGlasses();
    }

    public static Icon haze() {
        return LucideIconsH.haze();
    }

    public static Icon hd() {
        return LucideIconsH.hd();
    }

    public static Icon hdmiPort() {
        return LucideIconsH.hdmiPort();
    }

    public static Icon heading() {
        return LucideIconsH.heading();
    }

    public static Icon headingN1() {
        return LucideIconsH.headingN1();
    }

    public static Icon headingN2() {
        return LucideIconsH.headingN2();
    }

    public static Icon headingN3() {
        return LucideIconsH.headingN3();
    }

    public static Icon headingN4() {
        return LucideIconsH.headingN4();
    }

    public static Icon headingN5() {
        return LucideIconsH.headingN5();
    }

    public static Icon headingN6() {
        return LucideIconsH.headingN6();
    }

    public static Icon headphoneOff() {
        return LucideIconsH.headphoneOff();
    }

    public static Icon headphones() {
        return LucideIconsH.headphones();
    }

    public static Icon headset() {
        return LucideIconsH.headset();
    }

    public static Icon heart() {
        return LucideIconsH.heart();
    }

    public static Icon heartCrack() {
        return LucideIconsH.heartCrack();
    }

    public static Icon heartHandshake() {
        return LucideIconsH.heartHandshake();
    }

    public static Icon heartMinus() {
        return LucideIconsH.heartMinus();
    }

    public static Icon heartOff() {
        return LucideIconsH.heartOff();
    }

    public static Icon heartPlus() {
        return LucideIconsH.heartPlus();
    }

    public static Icon heartPulse() {
        return LucideIconsH.heartPulse();
    }

    public static Icon heartX() {
        return LucideIconsH.heartX();
    }

    public static Icon heater() {
        return LucideIconsH.heater();
    }

    public static Icon helicopter() {
        return LucideIconsH.helicopter();
    }

    public static Icon helpCircle() {
        return LucideIconsH.helpCircle();
    }

    public static Icon helpingHand() {
        return LucideIconsH.helpingHand();
    }

    public static Icon hexagon() {
        return LucideIconsH.hexagon();
    }

    public static Icon highlighter() {
        return LucideIconsH.highlighter();
    }

    public static Icon history() {
        return LucideIconsH.history();
    }

    public static Icon home() {
        return LucideIconsH.home();
    }

    public static Icon hop() {
        return LucideIconsH.hop();
    }

    public static Icon hopOff() {
        return LucideIconsH.hopOff();
    }

    public static Icon hospital() {
        return LucideIconsH.hospital();
    }

    public static Icon hotel() {
        return LucideIconsH.hotel();
    }

    public static Icon hourglass() {
        return LucideIconsH.hourglass();
    }

    public static Icon house() {
        return LucideIconsH.house();
    }

    public static Icon houseHeart() {
        return LucideIconsH.houseHeart();
    }

    public static Icon housePlug() {
        return LucideIconsH.housePlug();
    }

    public static Icon housePlus() {
        return LucideIconsH.housePlus();
    }

    public static Icon houseWifi() {
        return LucideIconsH.houseWifi();
    }

    public static Icon iceCream() {
        return LucideIconsI.iceCream();
    }

    public static Icon iceCreamN2() {
        return LucideIconsI.iceCreamN2();
    }

    public static Icon iceCreamBowl() {
        return LucideIconsI.iceCreamBowl();
    }

    public static Icon iceCreamCone() {
        return LucideIconsI.iceCreamCone();
    }

    public static Icon idCard() {
        return LucideIconsI.idCard();
    }

    public static Icon idCardLanyard() {
        return LucideIconsI.idCardLanyard();
    }

    public static Icon image() {
        return LucideIconsI.image();
    }

    public static Icon imageDown() {
        return LucideIconsI.imageDown();
    }

    public static Icon imageMinus() {
        return LucideIconsI.imageMinus();
    }

    public static Icon imageOff() {
        return LucideIconsI.imageOff();
    }

    public static Icon imagePlay() {
        return LucideIconsI.imagePlay();
    }

    public static Icon imagePlus() {
        return LucideIconsI.imagePlus();
    }

    public static Icon imageUp() {
        return LucideIconsI.imageUp();
    }

    public static Icon imageUpscale() {
        return LucideIconsI.imageUpscale();
    }

    public static Icon images() {
        return LucideIconsI.images();
    }

    public static Icon importIcon() {
        return LucideIconsI.importIcon();
    }

    public static Icon inbox() {
        return LucideIconsI.inbox();
    }

    public static Icon indent() {
        return LucideIconsI.indent();
    }

    public static Icon indentDecrease() {
        return LucideIconsI.indentDecrease();
    }

    public static Icon indentIncrease() {
        return LucideIconsI.indentIncrease();
    }

    public static Icon indianRupee() {
        return LucideIconsI.indianRupee();
    }

    public static Icon infinity() {
        return LucideIconsI.infinity();
    }

    public static Icon info() {
        return LucideIconsI.info();
    }

    public static Icon inspect() {
        return LucideIconsI.inspect();
    }

    public static Icon inspectionPanel() {
        return LucideIconsI.inspectionPanel();
    }

    public static Icon italic() {
        return LucideIconsI.italic();
    }

    public static Icon iterationCcw() {
        return LucideIconsI.iterationCcw();
    }

    public static Icon iterationCw() {
        return LucideIconsI.iterationCw();
    }

    public static Icon japaneseYen() {
        return LucideIconsJ.japaneseYen();
    }

    public static Icon joystick() {
        return LucideIconsJ.joystick();
    }

    public static Icon kanban() {
        return LucideIconsK.kanban();
    }

    public static Icon kanbanSquare() {
        return LucideIconsK.kanbanSquare();
    }

    public static Icon kanbanSquareDashed() {
        return LucideIconsK.kanbanSquareDashed();
    }

    public static Icon kayak() {
        return LucideIconsK.kayak();
    }

    public static Icon key() {
        return LucideIconsK.key();
    }

    public static Icon keyRound() {
        return LucideIconsK.keyRound();
    }

    public static Icon keySquare() {
        return LucideIconsK.keySquare();
    }

    public static Icon keyboard() {
        return LucideIconsK.keyboard();
    }

    public static Icon keyboardMusic() {
        return LucideIconsK.keyboardMusic();
    }

    public static Icon keyboardOff() {
        return LucideIconsK.keyboardOff();
    }

    public static Icon lamp() {
        return LucideIconsL.lamp();
    }

    public static Icon lampCeiling() {
        return LucideIconsL.lampCeiling();
    }

    public static Icon lampDesk() {
        return LucideIconsL.lampDesk();
    }

    public static Icon lampFloor() {
        return LucideIconsL.lampFloor();
    }

    public static Icon lampWallDown() {
        return LucideIconsL.lampWallDown();
    }

    public static Icon lampWallUp() {
        return LucideIconsL.lampWallUp();
    }

    public static Icon landPlot() {
        return LucideIconsL.landPlot();
    }

    public static Icon landmark() {
        return LucideIconsL.landmark();
    }

    public static Icon languages() {
        return LucideIconsL.languages();
    }

    public static Icon laptop() {
        return LucideIconsL.laptop();
    }

    public static Icon laptopN2() {
        return LucideIconsL.laptopN2();
    }

    public static Icon laptopMinimal() {
        return LucideIconsL.laptopMinimal();
    }

    public static Icon laptopMinimalCheck() {
        return LucideIconsL.laptopMinimalCheck();
    }

    public static Icon lasso() {
        return LucideIconsL.lasso();
    }

    public static Icon lassoSelect() {
        return LucideIconsL.lassoSelect();
    }

    public static Icon laugh() {
        return LucideIconsL.laugh();
    }

    public static Icon layers() {
        return LucideIconsL.layers();
    }

    public static Icon layersN2() {
        return LucideIconsL.layersN2();
    }

    public static Icon layersN3() {
        return LucideIconsL.layersN3();
    }

    public static Icon layersMinus() {
        return LucideIconsL.layersMinus();
    }

    public static Icon layersPlus() {
        return LucideIconsL.layersPlus();
    }

    public static Icon layout() {
        return LucideIconsL.layout();
    }

    public static Icon layoutDashboard() {
        return LucideIconsL.layoutDashboard();
    }

    public static Icon layoutGrid() {
        return LucideIconsL.layoutGrid();
    }

    public static Icon layoutList() {
        return LucideIconsL.layoutList();
    }

    public static Icon layoutPanelLeft() {
        return LucideIconsL.layoutPanelLeft();
    }

    public static Icon layoutPanelTop() {
        return LucideIconsL.layoutPanelTop();
    }

    public static Icon layoutTemplate() {
        return LucideIconsL.layoutTemplate();
    }

    public static Icon leaf() {
        return LucideIconsL.leaf();
    }

    public static Icon leafyGreen() {
        return LucideIconsL.leafyGreen();
    }

    public static Icon lectern() {
        return LucideIconsL.lectern();
    }

    public static Icon lensConcave() {
        return LucideIconsL.lensConcave();
    }

    public static Icon lensConvex() {
        return LucideIconsL.lensConvex();
    }

    public static Icon letterText() {
        return LucideIconsL.letterText();
    }

    public static Icon library() {
        return LucideIconsL.library();
    }

    public static Icon libraryBig() {
        return LucideIconsL.libraryBig();
    }

    public static Icon librarySquare() {
        return LucideIconsL.librarySquare();
    }

    public static Icon lifeBuoy() {
        return LucideIconsL.lifeBuoy();
    }

    public static Icon ligature() {
        return LucideIconsL.ligature();
    }

    public static Icon lightbulb() {
        return LucideIconsL.lightbulb();
    }

    public static Icon lightbulbOff() {
        return LucideIconsL.lightbulbOff();
    }

    public static Icon lineChart() {
        return LucideIconsL.lineChart();
    }

    public static Icon lineDotRightHorizontal() {
        return LucideIconsL.lineDotRightHorizontal();
    }

    public static Icon lineSquiggle() {
        return LucideIconsL.lineSquiggle();
    }

    public static Icon lineStyle() {
        return LucideIconsL.lineStyle();
    }

    public static Icon link() {
        return LucideIconsL.link();
    }

    public static Icon linkN2() {
        return LucideIconsL.linkN2();
    }

    public static Icon linkN2Off() {
        return LucideIconsL.linkN2Off();
    }

    public static Icon list() {
        return LucideIconsL.list();
    }

    public static Icon listCheck() {
        return LucideIconsL.listCheck();
    }

    public static Icon listChecks() {
        return LucideIconsL.listChecks();
    }

    public static Icon listChevronsDownUp() {
        return LucideIconsL.listChevronsDownUp();
    }

    public static Icon listChevronsUpDown() {
        return LucideIconsL.listChevronsUpDown();
    }

    public static Icon listCollapse() {
        return LucideIconsL.listCollapse();
    }

    public static Icon listEnd() {
        return LucideIconsL.listEnd();
    }

    public static Icon listFilter() {
        return LucideIconsL.listFilter();
    }

    public static Icon listFilterPlus() {
        return LucideIconsL.listFilterPlus();
    }

    public static Icon listIndentDecrease() {
        return LucideIconsL.listIndentDecrease();
    }

    public static Icon listIndentIncrease() {
        return LucideIconsL.listIndentIncrease();
    }

    public static Icon listMinus() {
        return LucideIconsL.listMinus();
    }

    public static Icon listMusic() {
        return LucideIconsL.listMusic();
    }

    public static Icon listOrdered() {
        return LucideIconsL.listOrdered();
    }

    public static Icon listPlus() {
        return LucideIconsL.listPlus();
    }

    public static Icon listRestart() {
        return LucideIconsL.listRestart();
    }

    public static Icon listStart() {
        return LucideIconsL.listStart();
    }

    public static Icon listTodo() {
        return LucideIconsL.listTodo();
    }

    public static Icon listTree() {
        return LucideIconsL.listTree();
    }

    public static Icon listVideo() {
        return LucideIconsL.listVideo();
    }

    public static Icon listX() {
        return LucideIconsL.listX();
    }

    public static Icon loader() {
        return LucideIconsL.loader();
    }

    public static Icon loaderN2() {
        return LucideIconsL.loaderN2();
    }

    public static Icon loaderCircle() {
        return LucideIconsL.loaderCircle();
    }

    public static Icon loaderPinwheel() {
        return LucideIconsL.loaderPinwheel();
    }

    public static Icon locate() {
        return LucideIconsL.locate();
    }

    public static Icon locateFixed() {
        return LucideIconsL.locateFixed();
    }

    public static Icon locateOff() {
        return LucideIconsL.locateOff();
    }

    public static Icon locationEdit() {
        return LucideIconsL.locationEdit();
    }

    public static Icon lock() {
        return LucideIconsL.lock();
    }

    public static Icon lockKeyhole() {
        return LucideIconsL.lockKeyhole();
    }

    public static Icon lockKeyholeOpen() {
        return LucideIconsL.lockKeyholeOpen();
    }

    public static Icon lockOpen() {
        return LucideIconsL.lockOpen();
    }

    public static Icon logIn() {
        return LucideIconsL.logIn();
    }

    public static Icon logOut() {
        return LucideIconsL.logOut();
    }

    public static Icon logs() {
        return LucideIconsL.logs();
    }

    public static Icon lollipop() {
        return LucideIconsL.lollipop();
    }

    public static Icon luggage() {
        return LucideIconsL.luggage();
    }

    public static Icon mSquare() {
        return LucideIconsM.mSquare();
    }

    public static Icon magnet() {
        return LucideIconsM.magnet();
    }

    public static Icon mail() {
        return LucideIconsM.mail();
    }

    public static Icon mailCheck() {
        return LucideIconsM.mailCheck();
    }

    public static Icon mailMinus() {
        return LucideIconsM.mailMinus();
    }

    public static Icon mailOpen() {
        return LucideIconsM.mailOpen();
    }

    public static Icon mailPlus() {
        return LucideIconsM.mailPlus();
    }

    public static Icon mailQuestion() {
        return LucideIconsM.mailQuestion();
    }

    public static Icon mailQuestionMark() {
        return LucideIconsM.mailQuestionMark();
    }

    public static Icon mailSearch() {
        return LucideIconsM.mailSearch();
    }

    public static Icon mailWarning() {
        return LucideIconsM.mailWarning();
    }

    public static Icon mailX() {
        return LucideIconsM.mailX();
    }

    public static Icon mailbox() {
        return LucideIconsM.mailbox();
    }

    public static Icon mails() {
        return LucideIconsM.mails();
    }

    public static Icon map() {
        return LucideIconsM.map();
    }

    public static Icon mapMinus() {
        return LucideIconsM.mapMinus();
    }

    public static Icon mapPin() {
        return LucideIconsM.mapPin();
    }

    public static Icon mapPinCheck() {
        return LucideIconsM.mapPinCheck();
    }

    public static Icon mapPinCheckInside() {
        return LucideIconsM.mapPinCheckInside();
    }

    public static Icon mapPinHouse() {
        return LucideIconsM.mapPinHouse();
    }

    public static Icon mapPinMinus() {
        return LucideIconsM.mapPinMinus();
    }

    public static Icon mapPinMinusInside() {
        return LucideIconsM.mapPinMinusInside();
    }

    public static Icon mapPinOff() {
        return LucideIconsM.mapPinOff();
    }

    public static Icon mapPinPen() {
        return LucideIconsM.mapPinPen();
    }

    public static Icon mapPinPlus() {
        return LucideIconsM.mapPinPlus();
    }

    public static Icon mapPinPlusInside() {
        return LucideIconsM.mapPinPlusInside();
    }

    public static Icon mapPinSearch() {
        return LucideIconsM.mapPinSearch();
    }

    public static Icon mapPinX() {
        return LucideIconsM.mapPinX();
    }

    public static Icon mapPinXInside() {
        return LucideIconsM.mapPinXInside();
    }

    public static Icon mapPinned() {
        return LucideIconsM.mapPinned();
    }

    public static Icon mapPlus() {
        return LucideIconsM.mapPlus();
    }

    public static Icon mars() {
        return LucideIconsM.mars();
    }

    public static Icon marsStroke() {
        return LucideIconsM.marsStroke();
    }

    public static Icon martini() {
        return LucideIconsM.martini();
    }

    public static Icon maximize() {
        return LucideIconsM.maximize();
    }

    public static Icon maximizeN2() {
        return LucideIconsM.maximizeN2();
    }

    public static Icon medal() {
        return LucideIconsM.medal();
    }

    public static Icon megaphone() {
        return LucideIconsM.megaphone();
    }

    public static Icon megaphoneOff() {
        return LucideIconsM.megaphoneOff();
    }

    public static Icon meh() {
        return LucideIconsM.meh();
    }

    public static Icon memoryStick() {
        return LucideIconsM.memoryStick();
    }

    public static Icon menu() {
        return LucideIconsM.menu();
    }

    public static Icon menuSquare() {
        return LucideIconsM.menuSquare();
    }

    public static Icon merge() {
        return LucideIconsM.merge();
    }

    public static Icon messageCircle() {
        return LucideIconsM.messageCircle();
    }

    public static Icon messageCircleCheck() {
        return LucideIconsM.messageCircleCheck();
    }

    public static Icon messageCircleCode() {
        return LucideIconsM.messageCircleCode();
    }

    public static Icon messageCircleDashed() {
        return LucideIconsM.messageCircleDashed();
    }

    public static Icon messageCircleHeart() {
        return LucideIconsM.messageCircleHeart();
    }

    public static Icon messageCircleMore() {
        return LucideIconsM.messageCircleMore();
    }

    public static Icon messageCircleOff() {
        return LucideIconsM.messageCircleOff();
    }

    public static Icon messageCirclePlus() {
        return LucideIconsM.messageCirclePlus();
    }

    public static Icon messageCircleQuestion() {
        return LucideIconsM.messageCircleQuestion();
    }

    public static Icon messageCircleQuestionMark() {
        return LucideIconsM.messageCircleQuestionMark();
    }

    public static Icon messageCircleReply() {
        return LucideIconsM.messageCircleReply();
    }

    public static Icon messageCircleWarning() {
        return LucideIconsM.messageCircleWarning();
    }

    public static Icon messageCircleX() {
        return LucideIconsM.messageCircleX();
    }

    public static Icon messageSquare() {
        return LucideIconsM.messageSquare();
    }

    public static Icon messageSquareCheck() {
        return LucideIconsM.messageSquareCheck();
    }

    public static Icon messageSquareCode() {
        return LucideIconsM.messageSquareCode();
    }

    public static Icon messageSquareDashed() {
        return LucideIconsM.messageSquareDashed();
    }

    public static Icon messageSquareDiff() {
        return LucideIconsM.messageSquareDiff();
    }

    public static Icon messageSquareDot() {
        return LucideIconsM.messageSquareDot();
    }

    public static Icon messageSquareHeart() {
        return LucideIconsM.messageSquareHeart();
    }

    public static Icon messageSquareLock() {
        return LucideIconsM.messageSquareLock();
    }

    public static Icon messageSquareMore() {
        return LucideIconsM.messageSquareMore();
    }

    public static Icon messageSquareOff() {
        return LucideIconsM.messageSquareOff();
    }

    public static Icon messageSquarePlus() {
        return LucideIconsM.messageSquarePlus();
    }

    public static Icon messageSquareQuote() {
        return LucideIconsM.messageSquareQuote();
    }

    public static Icon messageSquareReply() {
        return LucideIconsM.messageSquareReply();
    }

    public static Icon messageSquareShare() {
        return LucideIconsM.messageSquareShare();
    }

    public static Icon messageSquareText() {
        return LucideIconsM.messageSquareText();
    }

    public static Icon messageSquareWarning() {
        return LucideIconsM.messageSquareWarning();
    }

    public static Icon messageSquareX() {
        return LucideIconsM.messageSquareX();
    }

    public static Icon messagesSquare() {
        return LucideIconsM.messagesSquare();
    }

    public static Icon metronome() {
        return LucideIconsM.metronome();
    }

    public static Icon mic() {
        return LucideIconsM.mic();
    }

    public static Icon micN2() {
        return LucideIconsM.micN2();
    }

    public static Icon micOff() {
        return LucideIconsM.micOff();
    }

    public static Icon micVocal() {
        return LucideIconsM.micVocal();
    }

    public static Icon microchip() {
        return LucideIconsM.microchip();
    }

    public static Icon microscope() {
        return LucideIconsM.microscope();
    }

    public static Icon microwave() {
        return LucideIconsM.microwave();
    }

    public static Icon milestone() {
        return LucideIconsM.milestone();
    }

    public static Icon milk() {
        return LucideIconsM.milk();
    }

    public static Icon milkOff() {
        return LucideIconsM.milkOff();
    }

    public static Icon minimize() {
        return LucideIconsM.minimize();
    }

    public static Icon minimizeN2() {
        return LucideIconsM.minimizeN2();
    }

    public static Icon minus() {
        return LucideIconsM.minus();
    }

    public static Icon minusCircle() {
        return LucideIconsM.minusCircle();
    }

    public static Icon minusSquare() {
        return LucideIconsM.minusSquare();
    }

    public static Icon mirrorRectangular() {
        return LucideIconsM.mirrorRectangular();
    }

    public static Icon mirrorRound() {
        return LucideIconsM.mirrorRound();
    }

    public static Icon monitor() {
        return LucideIconsM.monitor();
    }

    public static Icon monitorCheck() {
        return LucideIconsM.monitorCheck();
    }

    public static Icon monitorCloud() {
        return LucideIconsM.monitorCloud();
    }

    public static Icon monitorCog() {
        return LucideIconsM.monitorCog();
    }

    public static Icon monitorDot() {
        return LucideIconsM.monitorDot();
    }

    public static Icon monitorDown() {
        return LucideIconsM.monitorDown();
    }

    public static Icon monitorOff() {
        return LucideIconsM.monitorOff();
    }

    public static Icon monitorPause() {
        return LucideIconsM.monitorPause();
    }

    public static Icon monitorPlay() {
        return LucideIconsM.monitorPlay();
    }

    public static Icon monitorSmartphone() {
        return LucideIconsM.monitorSmartphone();
    }

    public static Icon monitorSpeaker() {
        return LucideIconsM.monitorSpeaker();
    }

    public static Icon monitorStop() {
        return LucideIconsM.monitorStop();
    }

    public static Icon monitorUp() {
        return LucideIconsM.monitorUp();
    }

    public static Icon monitorX() {
        return LucideIconsM.monitorX();
    }

    public static Icon moon() {
        return LucideIconsM.moon();
    }

    public static Icon moonStar() {
        return LucideIconsM.moonStar();
    }

    public static Icon moreHorizontal() {
        return LucideIconsM.moreHorizontal();
    }

    public static Icon moreVertical() {
        return LucideIconsM.moreVertical();
    }

    public static Icon motorbike() {
        return LucideIconsM.motorbike();
    }

    public static Icon mountain() {
        return LucideIconsM.mountain();
    }

    public static Icon mountainSnow() {
        return LucideIconsM.mountainSnow();
    }

    public static Icon mouse() {
        return LucideIconsM.mouse();
    }

    public static Icon mouseLeft() {
        return LucideIconsM.mouseLeft();
    }

    public static Icon mouseOff() {
        return LucideIconsM.mouseOff();
    }

    public static Icon mousePointer() {
        return LucideIconsM.mousePointer();
    }

    public static Icon mousePointerN2() {
        return LucideIconsM.mousePointerN2();
    }

    public static Icon mousePointerN2Off() {
        return LucideIconsM.mousePointerN2Off();
    }

    public static Icon mousePointerBan() {
        return LucideIconsM.mousePointerBan();
    }

    public static Icon mousePointerClick() {
        return LucideIconsM.mousePointerClick();
    }

    public static Icon mousePointerSquareDashed() {
        return LucideIconsM.mousePointerSquareDashed();
    }

    public static Icon mouseRight() {
        return LucideIconsM.mouseRight();
    }

    public static Icon move() {
        return LucideIconsM.move();
    }

    public static Icon moveN3D() {
        return LucideIconsM.moveN3D();
    }

    public static Icon move3d() {
        return LucideIconsM.move3d();
    }

    public static Icon moveDiagonal() {
        return LucideIconsM.moveDiagonal();
    }

    public static Icon moveDiagonalN2() {
        return LucideIconsM.moveDiagonalN2();
    }

    public static Icon moveDown() {
        return LucideIconsM.moveDown();
    }

    public static Icon moveDownLeft() {
        return LucideIconsM.moveDownLeft();
    }

    public static Icon moveDownRight() {
        return LucideIconsM.moveDownRight();
    }

    public static Icon moveHorizontal() {
        return LucideIconsM.moveHorizontal();
    }

    public static Icon moveLeft() {
        return LucideIconsM.moveLeft();
    }

    public static Icon moveRight() {
        return LucideIconsM.moveRight();
    }

    public static Icon moveUp() {
        return LucideIconsM.moveUp();
    }

    public static Icon moveUpLeft() {
        return LucideIconsM.moveUpLeft();
    }

    public static Icon moveUpRight() {
        return LucideIconsM.moveUpRight();
    }

    public static Icon moveVertical() {
        return LucideIconsM.moveVertical();
    }

    public static Icon music() {
        return LucideIconsM.music();
    }

    public static Icon musicN2() {
        return LucideIconsM.musicN2();
    }

    public static Icon musicN3() {
        return LucideIconsM.musicN3();
    }

    public static Icon musicN4() {
        return LucideIconsM.musicN4();
    }

    public static Icon navigation() {
        return LucideIconsN.navigation();
    }

    public static Icon navigationN2() {
        return LucideIconsN.navigationN2();
    }

    public static Icon navigationN2Off() {
        return LucideIconsN.navigationN2Off();
    }

    public static Icon navigationOff() {
        return LucideIconsN.navigationOff();
    }

    public static Icon network() {
        return LucideIconsN.network();
    }

    public static Icon newspaper() {
        return LucideIconsN.newspaper();
    }

    public static Icon nfc() {
        return LucideIconsN.nfc();
    }

    public static Icon nonBinary() {
        return LucideIconsN.nonBinary();
    }

    public static Icon notebook() {
        return LucideIconsN.notebook();
    }

    public static Icon notebookPen() {
        return LucideIconsN.notebookPen();
    }

    public static Icon notebookTabs() {
        return LucideIconsN.notebookTabs();
    }

    public static Icon notebookText() {
        return LucideIconsN.notebookText();
    }

    public static Icon notepadText() {
        return LucideIconsN.notepadText();
    }

    public static Icon notepadTextDashed() {
        return LucideIconsN.notepadTextDashed();
    }

    public static Icon nut() {
        return LucideIconsN.nut();
    }

    public static Icon nutOff() {
        return LucideIconsN.nutOff();
    }

    public static Icon octagon() {
        return LucideIconsO.octagon();
    }

    public static Icon octagonAlert() {
        return LucideIconsO.octagonAlert();
    }

    public static Icon octagonMinus() {
        return LucideIconsO.octagonMinus();
    }

    public static Icon octagonPause() {
        return LucideIconsO.octagonPause();
    }

    public static Icon octagonX() {
        return LucideIconsO.octagonX();
    }

    public static Icon omega() {
        return LucideIconsO.omega();
    }

    public static Icon option() {
        return LucideIconsO.option();
    }

    public static Icon orbit() {
        return LucideIconsO.orbit();
    }

    public static Icon origami() {
        return LucideIconsO.origami();
    }

    public static Icon outdent() {
        return LucideIconsO.outdent();
    }

    public static Icon packageIcon() {
        return LucideIconsP.packageIcon();
    }

    public static Icon packageN2() {
        return LucideIconsP.packageN2();
    }

    public static Icon packageCheck() {
        return LucideIconsP.packageCheck();
    }

    public static Icon packageMinus() {
        return LucideIconsP.packageMinus();
    }

    public static Icon packageOpen() {
        return LucideIconsP.packageOpen();
    }

    public static Icon packagePlus() {
        return LucideIconsP.packagePlus();
    }

    public static Icon packageSearch() {
        return LucideIconsP.packageSearch();
    }

    public static Icon packageX() {
        return LucideIconsP.packageX();
    }

    public static Icon paintBucket() {
        return LucideIconsP.paintBucket();
    }

    public static Icon paintRoller() {
        return LucideIconsP.paintRoller();
    }

    public static Icon paintbrush() {
        return LucideIconsP.paintbrush();
    }

    public static Icon paintbrushN2() {
        return LucideIconsP.paintbrushN2();
    }

    public static Icon paintbrushVertical() {
        return LucideIconsP.paintbrushVertical();
    }

    public static Icon palette() {
        return LucideIconsP.palette();
    }

    public static Icon palmtree() {
        return LucideIconsP.palmtree();
    }

    public static Icon panda() {
        return LucideIconsP.panda();
    }

    public static Icon panelBottom() {
        return LucideIconsP.panelBottom();
    }

    public static Icon panelBottomClose() {
        return LucideIconsP.panelBottomClose();
    }

    public static Icon panelBottomDashed() {
        return LucideIconsP.panelBottomDashed();
    }

    public static Icon panelBottomInactive() {
        return LucideIconsP.panelBottomInactive();
    }

    public static Icon panelBottomOpen() {
        return LucideIconsP.panelBottomOpen();
    }

    public static Icon panelLeft() {
        return LucideIconsP.panelLeft();
    }

    public static Icon panelLeftClose() {
        return LucideIconsP.panelLeftClose();
    }

    public static Icon panelLeftDashed() {
        return LucideIconsP.panelLeftDashed();
    }

    public static Icon panelLeftInactive() {
        return LucideIconsP.panelLeftInactive();
    }

    public static Icon panelLeftOpen() {
        return LucideIconsP.panelLeftOpen();
    }

    public static Icon panelLeftRightDashed() {
        return LucideIconsP.panelLeftRightDashed();
    }

    public static Icon panelRight() {
        return LucideIconsP.panelRight();
    }

    public static Icon panelRightClose() {
        return LucideIconsP.panelRightClose();
    }

    public static Icon panelRightDashed() {
        return LucideIconsP.panelRightDashed();
    }

    public static Icon panelRightInactive() {
        return LucideIconsP.panelRightInactive();
    }

    public static Icon panelRightOpen() {
        return LucideIconsP.panelRightOpen();
    }

    public static Icon panelTop() {
        return LucideIconsP.panelTop();
    }

    public static Icon panelTopBottomDashed() {
        return LucideIconsP.panelTopBottomDashed();
    }

    public static Icon panelTopClose() {
        return LucideIconsP.panelTopClose();
    }

    public static Icon panelTopDashed() {
        return LucideIconsP.panelTopDashed();
    }

    public static Icon panelTopInactive() {
        return LucideIconsP.panelTopInactive();
    }

    public static Icon panelTopOpen() {
        return LucideIconsP.panelTopOpen();
    }

    public static Icon panelsLeftBottom() {
        return LucideIconsP.panelsLeftBottom();
    }

    public static Icon panelsLeftRight() {
        return LucideIconsP.panelsLeftRight();
    }

    public static Icon panelsRightBottom() {
        return LucideIconsP.panelsRightBottom();
    }

    public static Icon panelsTopBottom() {
        return LucideIconsP.panelsTopBottom();
    }

    public static Icon panelsTopLeft() {
        return LucideIconsP.panelsTopLeft();
    }

    public static Icon paperclip() {
        return LucideIconsP.paperclip();
    }

    public static Icon parentheses() {
        return LucideIconsP.parentheses();
    }

    public static Icon parkingCircle() {
        return LucideIconsP.parkingCircle();
    }

    public static Icon parkingCircleOff() {
        return LucideIconsP.parkingCircleOff();
    }

    public static Icon parkingMeter() {
        return LucideIconsP.parkingMeter();
    }

    public static Icon parkingSquare() {
        return LucideIconsP.parkingSquare();
    }

    public static Icon parkingSquareOff() {
        return LucideIconsP.parkingSquareOff();
    }

    public static Icon partyPopper() {
        return LucideIconsP.partyPopper();
    }

    public static Icon pause() {
        return LucideIconsP.pause();
    }

    public static Icon pauseCircle() {
        return LucideIconsP.pauseCircle();
    }

    public static Icon pauseOctagon() {
        return LucideIconsP.pauseOctagon();
    }

    public static Icon pawPrint() {
        return LucideIconsP.pawPrint();
    }

    public static Icon pcCase() {
        return LucideIconsP.pcCase();
    }

    public static Icon pen() {
        return LucideIconsP.pen();
    }

    public static Icon penBox() {
        return LucideIconsP.penBox();
    }

    public static Icon penLine() {
        return LucideIconsP.penLine();
    }

    public static Icon penOff() {
        return LucideIconsP.penOff();
    }

    public static Icon penSquare() {
        return LucideIconsP.penSquare();
    }

    public static Icon penTool() {
        return LucideIconsP.penTool();
    }

    public static Icon pencil() {
        return LucideIconsP.pencil();
    }

    public static Icon pencilLine() {
        return LucideIconsP.pencilLine();
    }

    public static Icon pencilOff() {
        return LucideIconsP.pencilOff();
    }

    public static Icon pencilRuler() {
        return LucideIconsP.pencilRuler();
    }

    public static Icon pentagon() {
        return LucideIconsP.pentagon();
    }

    public static Icon percent() {
        return LucideIconsP.percent();
    }

    public static Icon percentCircle() {
        return LucideIconsP.percentCircle();
    }

    public static Icon percentDiamond() {
        return LucideIconsP.percentDiamond();
    }

    public static Icon percentSquare() {
        return LucideIconsP.percentSquare();
    }

    public static Icon personStanding() {
        return LucideIconsP.personStanding();
    }

    public static Icon philippinePeso() {
        return LucideIconsP.philippinePeso();
    }

    public static Icon phone() {
        return LucideIconsP.phone();
    }

    public static Icon phoneCall() {
        return LucideIconsP.phoneCall();
    }

    public static Icon phoneForwarded() {
        return LucideIconsP.phoneForwarded();
    }

    public static Icon phoneIncoming() {
        return LucideIconsP.phoneIncoming();
    }

    public static Icon phoneMissed() {
        return LucideIconsP.phoneMissed();
    }

    public static Icon phoneOff() {
        return LucideIconsP.phoneOff();
    }

    public static Icon phoneOutgoing() {
        return LucideIconsP.phoneOutgoing();
    }

    public static Icon pi() {
        return LucideIconsP.pi();
    }

    public static Icon piSquare() {
        return LucideIconsP.piSquare();
    }

    public static Icon piano() {
        return LucideIconsP.piano();
    }

    public static Icon pickaxe() {
        return LucideIconsP.pickaxe();
    }

    public static Icon pictureInPicture() {
        return LucideIconsP.pictureInPicture();
    }

    public static Icon pictureInPictureN2() {
        return LucideIconsP.pictureInPictureN2();
    }

    public static Icon pieChart() {
        return LucideIconsP.pieChart();
    }

    public static Icon piggyBank() {
        return LucideIconsP.piggyBank();
    }

    public static Icon pilcrow() {
        return LucideIconsP.pilcrow();
    }

    public static Icon pilcrowLeft() {
        return LucideIconsP.pilcrowLeft();
    }

    public static Icon pilcrowRight() {
        return LucideIconsP.pilcrowRight();
    }

    public static Icon pilcrowSquare() {
        return LucideIconsP.pilcrowSquare();
    }

    public static Icon pill() {
        return LucideIconsP.pill();
    }

    public static Icon pillBottle() {
        return LucideIconsP.pillBottle();
    }

    public static Icon pin() {
        return LucideIconsP.pin();
    }

    public static Icon pinOff() {
        return LucideIconsP.pinOff();
    }

    public static Icon pipette() {
        return LucideIconsP.pipette();
    }

    public static Icon pizza() {
        return LucideIconsP.pizza();
    }

    public static Icon plane() {
        return LucideIconsP.plane();
    }

    public static Icon planeLanding() {
        return LucideIconsP.planeLanding();
    }

    public static Icon planeTakeoff() {
        return LucideIconsP.planeTakeoff();
    }

    public static Icon play() {
        return LucideIconsP.play();
    }

    public static Icon playCircle() {
        return LucideIconsP.playCircle();
    }

    public static Icon playSquare() {
        return LucideIconsP.playSquare();
    }

    public static Icon plug() {
        return LucideIconsP.plug();
    }

    public static Icon plugN2() {
        return LucideIconsP.plugN2();
    }

    public static Icon plugZap() {
        return LucideIconsP.plugZap();
    }

    public static Icon plugZapN2() {
        return LucideIconsP.plugZapN2();
    }

    public static Icon plus() {
        return LucideIconsP.plus();
    }

    public static Icon plusCircle() {
        return LucideIconsP.plusCircle();
    }

    public static Icon plusSquare() {
        return LucideIconsP.plusSquare();
    }

    public static Icon pocketKnife() {
        return LucideIconsP.pocketKnife();
    }

    public static Icon podcast() {
        return LucideIconsP.podcast();
    }

    public static Icon pointer() {
        return LucideIconsP.pointer();
    }

    public static Icon pointerOff() {
        return LucideIconsP.pointerOff();
    }

    public static Icon popcorn() {
        return LucideIconsP.popcorn();
    }

    public static Icon popsicle() {
        return LucideIconsP.popsicle();
    }

    public static Icon poundSterling() {
        return LucideIconsP.poundSterling();
    }

    public static Icon power() {
        return LucideIconsP.power();
    }

    public static Icon powerCircle() {
        return LucideIconsP.powerCircle();
    }

    public static Icon powerOff() {
        return LucideIconsP.powerOff();
    }

    public static Icon powerSquare() {
        return LucideIconsP.powerSquare();
    }

    public static Icon presentation() {
        return LucideIconsP.presentation();
    }

    public static Icon printer() {
        return LucideIconsP.printer();
    }

    public static Icon printerCheck() {
        return LucideIconsP.printerCheck();
    }

    public static Icon printerX() {
        return LucideIconsP.printerX();
    }

    public static Icon projector() {
        return LucideIconsP.projector();
    }

    public static Icon proportions() {
        return LucideIconsP.proportions();
    }

    public static Icon puzzle() {
        return LucideIconsP.puzzle();
    }

    public static Icon pyramid() {
        return LucideIconsP.pyramid();
    }

    public static Icon qrCode() {
        return LucideIconsQ.qrCode();
    }

    public static Icon quote() {
        return LucideIconsQ.quote();
    }

    public static Icon rabbit() {
        return LucideIconsR.rabbit();
    }

    public static Icon radar() {
        return LucideIconsR.radar();
    }

    public static Icon radiation() {
        return LucideIconsR.radiation();
    }

    public static Icon radical() {
        return LucideIconsR.radical();
    }

    public static Icon radio() {
        return LucideIconsR.radio();
    }

    public static Icon radioOff() {
        return LucideIconsR.radioOff();
    }

    public static Icon radioReceiver() {
        return LucideIconsR.radioReceiver();
    }

    public static Icon radioTower() {
        return LucideIconsR.radioTower();
    }

    public static Icon radius() {
        return LucideIconsR.radius();
    }

    public static Icon rainbow() {
        return LucideIconsR.rainbow();
    }

    public static Icon rat() {
        return LucideIconsR.rat();
    }

    public static Icon ratio() {
        return LucideIconsR.ratio();
    }

    public static Icon receipt() {
        return LucideIconsR.receipt();
    }

    public static Icon receiptCent() {
        return LucideIconsR.receiptCent();
    }

    public static Icon receiptEuro() {
        return LucideIconsR.receiptEuro();
    }

    public static Icon receiptIndianRupee() {
        return LucideIconsR.receiptIndianRupee();
    }

    public static Icon receiptJapaneseYen() {
        return LucideIconsR.receiptJapaneseYen();
    }

    public static Icon receiptPoundSterling() {
        return LucideIconsR.receiptPoundSterling();
    }

    public static Icon receiptRussianRuble() {
        return LucideIconsR.receiptRussianRuble();
    }

    public static Icon receiptSwissFranc() {
        return LucideIconsR.receiptSwissFranc();
    }

    public static Icon receiptText() {
        return LucideIconsR.receiptText();
    }

    public static Icon receiptTurkishLira() {
        return LucideIconsR.receiptTurkishLira();
    }

    public static Icon rectangleCircle() {
        return LucideIconsR.rectangleCircle();
    }

    public static Icon rectangleEllipsis() {
        return LucideIconsR.rectangleEllipsis();
    }

    public static Icon rectangleGoggles() {
        return LucideIconsR.rectangleGoggles();
    }

    public static Icon rectangleHorizontal() {
        return LucideIconsR.rectangleHorizontal();
    }

    public static Icon rectangleVertical() {
        return LucideIconsR.rectangleVertical();
    }

    public static Icon recycle() {
        return LucideIconsR.recycle();
    }

    public static Icon redo() {
        return LucideIconsR.redo();
    }

    public static Icon redoN2() {
        return LucideIconsR.redoN2();
    }

    public static Icon redoDot() {
        return LucideIconsR.redoDot();
    }

    public static Icon refreshCcw() {
        return LucideIconsR.refreshCcw();
    }

    public static Icon refreshCcwDot() {
        return LucideIconsR.refreshCcwDot();
    }

    public static Icon refreshCw() {
        return LucideIconsR.refreshCw();
    }

    public static Icon refreshCwOff() {
        return LucideIconsR.refreshCwOff();
    }

    public static Icon refrigerator() {
        return LucideIconsR.refrigerator();
    }

    public static Icon regex() {
        return LucideIconsR.regex();
    }

    public static Icon removeFormatting() {
        return LucideIconsR.removeFormatting();
    }

    public static Icon repeat() {
        return LucideIconsR.repeat();
    }

    public static Icon repeatN1() {
        return LucideIconsR.repeatN1();
    }

    public static Icon repeatN2() {
        return LucideIconsR.repeatN2();
    }

    public static Icon repeatOff() {
        return LucideIconsR.repeatOff();
    }

    public static Icon replace() {
        return LucideIconsR.replace();
    }

    public static Icon replaceAll() {
        return LucideIconsR.replaceAll();
    }

    public static Icon reply() {
        return LucideIconsR.reply();
    }

    public static Icon replyAll() {
        return LucideIconsR.replyAll();
    }

    public static Icon rewind() {
        return LucideIconsR.rewind();
    }

    public static Icon ribbon() {
        return LucideIconsR.ribbon();
    }

    public static Icon road() {
        return LucideIconsR.road();
    }

    public static Icon rocket() {
        return LucideIconsR.rocket();
    }

    public static Icon rockingChair() {
        return LucideIconsR.rockingChair();
    }

    public static Icon rollerCoaster() {
        return LucideIconsR.rollerCoaster();
    }

    public static Icon rose() {
        return LucideIconsR.rose();
    }

    public static Icon rotateN3D() {
        return LucideIconsR.rotateN3D();
    }

    public static Icon rotate3d() {
        return LucideIconsR.rotate3d();
    }

    public static Icon rotateCcw() {
        return LucideIconsR.rotateCcw();
    }

    public static Icon rotateCcwKey() {
        return LucideIconsR.rotateCcwKey();
    }

    public static Icon rotateCcwSquare() {
        return LucideIconsR.rotateCcwSquare();
    }

    public static Icon rotateCw() {
        return LucideIconsR.rotateCw();
    }

    public static Icon rotateCwSquare() {
        return LucideIconsR.rotateCwSquare();
    }

    public static Icon route() {
        return LucideIconsR.route();
    }

    public static Icon routeOff() {
        return LucideIconsR.routeOff();
    }

    public static Icon router() {
        return LucideIconsR.router();
    }

    public static Icon rows() {
        return LucideIconsR.rows();
    }

    public static Icon rowsN2() {
        return LucideIconsR.rowsN2();
    }

    public static Icon rowsN3() {
        return LucideIconsR.rowsN3();
    }

    public static Icon rowsN4() {
        return LucideIconsR.rowsN4();
    }

    public static Icon rss() {
        return LucideIconsR.rss();
    }

    public static Icon ruler() {
        return LucideIconsR.ruler();
    }

    public static Icon rulerDimensionLine() {
        return LucideIconsR.rulerDimensionLine();
    }

    public static Icon russianRuble() {
        return LucideIconsR.russianRuble();
    }

    public static Icon sailboat() {
        return LucideIconsS.sailboat();
    }

    public static Icon salad() {
        return LucideIconsS.salad();
    }

    public static Icon sandwich() {
        return LucideIconsS.sandwich();
    }

    public static Icon satellite() {
        return LucideIconsS.satellite();
    }

    public static Icon satelliteDish() {
        return LucideIconsS.satelliteDish();
    }

    public static Icon saudiRiyal() {
        return LucideIconsS.saudiRiyal();
    }

    public static Icon save() {
        return LucideIconsS.save();
    }

    public static Icon saveAll() {
        return LucideIconsS.saveAll();
    }

    public static Icon saveOff() {
        return LucideIconsS.saveOff();
    }

    public static Icon scale() {
        return LucideIconsS.scale();
    }

    public static Icon scaleN3D() {
        return LucideIconsS.scaleN3D();
    }

    public static Icon scale3d() {
        return LucideIconsS.scale3d();
    }

    public static Icon scaling() {
        return LucideIconsS.scaling();
    }

    public static Icon scan() {
        return LucideIconsS.scan();
    }

    public static Icon scanBarcode() {
        return LucideIconsS.scanBarcode();
    }

    public static Icon scanEye() {
        return LucideIconsS.scanEye();
    }

    public static Icon scanFace() {
        return LucideIconsS.scanFace();
    }

    public static Icon scanHeart() {
        return LucideIconsS.scanHeart();
    }

    public static Icon scanLine() {
        return LucideIconsS.scanLine();
    }

    public static Icon scanQrCode() {
        return LucideIconsS.scanQrCode();
    }

    public static Icon scanSearch() {
        return LucideIconsS.scanSearch();
    }

    public static Icon scanText() {
        return LucideIconsS.scanText();
    }

    public static Icon scatterChart() {
        return LucideIconsS.scatterChart();
    }

    public static Icon school() {
        return LucideIconsS.school();
    }

    public static Icon schoolN2() {
        return LucideIconsS.schoolN2();
    }

    public static Icon scissors() {
        return LucideIconsS.scissors();
    }

    public static Icon scissorsLineDashed() {
        return LucideIconsS.scissorsLineDashed();
    }

    public static Icon scissorsSquare() {
        return LucideIconsS.scissorsSquare();
    }

    public static Icon scissorsSquareDashedBottom() {
        return LucideIconsS.scissorsSquareDashedBottom();
    }

    public static Icon scooter() {
        return LucideIconsS.scooter();
    }

    public static Icon screenShare() {
        return LucideIconsS.screenShare();
    }

    public static Icon screenShareOff() {
        return LucideIconsS.screenShareOff();
    }

    public static Icon scroll() {
        return LucideIconsS.scroll();
    }

    public static Icon scrollText() {
        return LucideIconsS.scrollText();
    }

    public static Icon search() {
        return LucideIconsS.search();
    }

    public static Icon searchAlert() {
        return LucideIconsS.searchAlert();
    }

    public static Icon searchCheck() {
        return LucideIconsS.searchCheck();
    }

    public static Icon searchCode() {
        return LucideIconsS.searchCode();
    }

    public static Icon searchSlash() {
        return LucideIconsS.searchSlash();
    }

    public static Icon searchX() {
        return LucideIconsS.searchX();
    }

    public static Icon section() {
        return LucideIconsS.section();
    }

    public static Icon send() {
        return LucideIconsS.send();
    }

    public static Icon sendHorizonal() {
        return LucideIconsS.sendHorizonal();
    }

    public static Icon sendHorizontal() {
        return LucideIconsS.sendHorizontal();
    }

    public static Icon sendToBack() {
        return LucideIconsS.sendToBack();
    }

    public static Icon separatorHorizontal() {
        return LucideIconsS.separatorHorizontal();
    }

    public static Icon separatorVertical() {
        return LucideIconsS.separatorVertical();
    }

    public static Icon server() {
        return LucideIconsS.server();
    }

    public static Icon serverCog() {
        return LucideIconsS.serverCog();
    }

    public static Icon serverCrash() {
        return LucideIconsS.serverCrash();
    }

    public static Icon serverOff() {
        return LucideIconsS.serverOff();
    }

    public static Icon settings() {
        return LucideIconsS.settings();
    }

    public static Icon settingsN2() {
        return LucideIconsS.settingsN2();
    }

    public static Icon shapes() {
        return LucideIconsS.shapes();
    }

    public static Icon share() {
        return LucideIconsS.share();
    }

    public static Icon shareN2() {
        return LucideIconsS.shareN2();
    }

    public static Icon sheet() {
        return LucideIconsS.sheet();
    }

    public static Icon shell() {
        return LucideIconsS.shell();
    }

    public static Icon shelvingUnit() {
        return LucideIconsS.shelvingUnit();
    }

    public static Icon shield() {
        return LucideIconsS.shield();
    }

    public static Icon shieldAlert() {
        return LucideIconsS.shieldAlert();
    }

    public static Icon shieldBan() {
        return LucideIconsS.shieldBan();
    }

    public static Icon shieldCheck() {
        return LucideIconsS.shieldCheck();
    }

    public static Icon shieldClose() {
        return LucideIconsS.shieldClose();
    }

    public static Icon shieldCog() {
        return LucideIconsS.shieldCog();
    }

    public static Icon shieldCogCorner() {
        return LucideIconsS.shieldCogCorner();
    }

    public static Icon shieldEllipsis() {
        return LucideIconsS.shieldEllipsis();
    }

    public static Icon shieldHalf() {
        return LucideIconsS.shieldHalf();
    }

    public static Icon shieldMinus() {
        return LucideIconsS.shieldMinus();
    }

    public static Icon shieldOff() {
        return LucideIconsS.shieldOff();
    }

    public static Icon shieldPlus() {
        return LucideIconsS.shieldPlus();
    }

    public static Icon shieldQuestion() {
        return LucideIconsS.shieldQuestion();
    }

    public static Icon shieldQuestionMark() {
        return LucideIconsS.shieldQuestionMark();
    }

    public static Icon shieldUser() {
        return LucideIconsS.shieldUser();
    }

    public static Icon shieldX() {
        return LucideIconsS.shieldX();
    }

    public static Icon ship() {
        return LucideIconsS.ship();
    }

    public static Icon shipWheel() {
        return LucideIconsS.shipWheel();
    }

    public static Icon shirt() {
        return LucideIconsS.shirt();
    }

    public static Icon shoppingBag() {
        return LucideIconsS.shoppingBag();
    }

    public static Icon shoppingBasket() {
        return LucideIconsS.shoppingBasket();
    }

    public static Icon shoppingCart() {
        return LucideIconsS.shoppingCart();
    }

    public static Icon shovel() {
        return LucideIconsS.shovel();
    }

    public static Icon showerHead() {
        return LucideIconsS.showerHead();
    }

    public static Icon shredder() {
        return LucideIconsS.shredder();
    }

    public static Icon shrimp() {
        return LucideIconsS.shrimp();
    }

    public static Icon shrink() {
        return LucideIconsS.shrink();
    }

    public static Icon shrub() {
        return LucideIconsS.shrub();
    }

    public static Icon shuffle() {
        return LucideIconsS.shuffle();
    }

    public static Icon sidebar() {
        return LucideIconsS.sidebar();
    }

    public static Icon sidebarClose() {
        return LucideIconsS.sidebarClose();
    }

    public static Icon sidebarOpen() {
        return LucideIconsS.sidebarOpen();
    }

    public static Icon sigma() {
        return LucideIconsS.sigma();
    }

    public static Icon sigmaSquare() {
        return LucideIconsS.sigmaSquare();
    }

    public static Icon signal() {
        return LucideIconsS.signal();
    }

    public static Icon signalHigh() {
        return LucideIconsS.signalHigh();
    }

    public static Icon signalLow() {
        return LucideIconsS.signalLow();
    }

    public static Icon signalMedium() {
        return LucideIconsS.signalMedium();
    }

    public static Icon signalZero() {
        return LucideIconsS.signalZero();
    }

    public static Icon signature() {
        return LucideIconsS.signature();
    }

    public static Icon signpost() {
        return LucideIconsS.signpost();
    }

    public static Icon signpostBig() {
        return LucideIconsS.signpostBig();
    }

    public static Icon siren() {
        return LucideIconsS.siren();
    }

    public static Icon skipBack() {
        return LucideIconsS.skipBack();
    }

    public static Icon skipForward() {
        return LucideIconsS.skipForward();
    }

    public static Icon skull() {
        return LucideIconsS.skull();
    }

    public static Icon slash() {
        return LucideIconsS.slash();
    }

    public static Icon slashSquare() {
        return LucideIconsS.slashSquare();
    }

    public static Icon slice() {
        return LucideIconsS.slice();
    }

    public static Icon sliders() {
        return LucideIconsS.sliders();
    }

    public static Icon slidersHorizontal() {
        return LucideIconsS.slidersHorizontal();
    }

    public static Icon slidersVertical() {
        return LucideIconsS.slidersVertical();
    }

    public static Icon smartphone() {
        return LucideIconsS.smartphone();
    }

    public static Icon smartphoneCharging() {
        return LucideIconsS.smartphoneCharging();
    }

    public static Icon smartphoneNfc() {
        return LucideIconsS.smartphoneNfc();
    }

    public static Icon smile() {
        return LucideIconsS.smile();
    }

    public static Icon smilePlus() {
        return LucideIconsS.smilePlus();
    }

    public static Icon snail() {
        return LucideIconsS.snail();
    }

    public static Icon snowflake() {
        return LucideIconsS.snowflake();
    }

    public static Icon soapDispenserDroplet() {
        return LucideIconsS.soapDispenserDroplet();
    }

    public static Icon sofa() {
        return LucideIconsS.sofa();
    }

    public static Icon solarPanel() {
        return LucideIconsS.solarPanel();
    }

    public static Icon sortAsc() {
        return LucideIconsS.sortAsc();
    }

    public static Icon sortDesc() {
        return LucideIconsS.sortDesc();
    }

    public static Icon soup() {
        return LucideIconsS.soup();
    }

    public static Icon space() {
        return LucideIconsS.space();
    }

    public static Icon spade() {
        return LucideIconsS.spade();
    }

    public static Icon sparkle() {
        return LucideIconsS.sparkle();
    }

    public static Icon sparkles() {
        return LucideIconsS.sparkles();
    }

    public static Icon speaker() {
        return LucideIconsS.speaker();
    }

    public static Icon speech() {
        return LucideIconsS.speech();
    }

    public static Icon spellCheck() {
        return LucideIconsS.spellCheck();
    }

    public static Icon spellCheckN2() {
        return LucideIconsS.spellCheckN2();
    }

    public static Icon spline() {
        return LucideIconsS.spline();
    }

    public static Icon splinePointer() {
        return LucideIconsS.splinePointer();
    }

    public static Icon split() {
        return LucideIconsS.split();
    }

    public static Icon splitSquareHorizontal() {
        return LucideIconsS.splitSquareHorizontal();
    }

    public static Icon splitSquareVertical() {
        return LucideIconsS.splitSquareVertical();
    }

    public static Icon spool() {
        return LucideIconsS.spool();
    }

    public static Icon sportShoe() {
        return LucideIconsS.sportShoe();
    }

    public static Icon spotlight() {
        return LucideIconsS.spotlight();
    }

    public static Icon sprayCan() {
        return LucideIconsS.sprayCan();
    }

    public static Icon sprout() {
        return LucideIconsS.sprout();
    }

    public static Icon square() {
        return LucideIconsS.square();
    }

    public static Icon squareActivity() {
        return LucideIconsS.squareActivity();
    }

    public static Icon squareArrowDown() {
        return LucideIconsS.squareArrowDown();
    }

    public static Icon squareArrowDownLeft() {
        return LucideIconsS.squareArrowDownLeft();
    }

    public static Icon squareArrowDownRight() {
        return LucideIconsS.squareArrowDownRight();
    }

    public static Icon squareArrowLeft() {
        return LucideIconsS.squareArrowLeft();
    }

    public static Icon squareArrowOutDownLeft() {
        return LucideIconsS.squareArrowOutDownLeft();
    }

    public static Icon squareArrowOutDownRight() {
        return LucideIconsS.squareArrowOutDownRight();
    }

    public static Icon squareArrowOutUpLeft() {
        return LucideIconsS.squareArrowOutUpLeft();
    }

    public static Icon squareArrowOutUpRight() {
        return LucideIconsS.squareArrowOutUpRight();
    }

    public static Icon squareArrowRight() {
        return LucideIconsS.squareArrowRight();
    }

    public static Icon squareArrowRightEnter() {
        return LucideIconsS.squareArrowRightEnter();
    }

    public static Icon squareArrowRightExit() {
        return LucideIconsS.squareArrowRightExit();
    }

    public static Icon squareArrowUp() {
        return LucideIconsS.squareArrowUp();
    }

    public static Icon squareArrowUpLeft() {
        return LucideIconsS.squareArrowUpLeft();
    }

    public static Icon squareArrowUpRight() {
        return LucideIconsS.squareArrowUpRight();
    }

    public static Icon squareAsterisk() {
        return LucideIconsS.squareAsterisk();
    }

    public static Icon squareBottomDashedScissors() {
        return LucideIconsS.squareBottomDashedScissors();
    }

    public static Icon squareCenterlineDashedHorizontal() {
        return LucideIconsS.squareCenterlineDashedHorizontal();
    }

    public static Icon squareCenterlineDashedVertical() {
        return LucideIconsS.squareCenterlineDashedVertical();
    }

    public static Icon squareChartGantt() {
        return LucideIconsS.squareChartGantt();
    }

    public static Icon squareCheck() {
        return LucideIconsS.squareCheck();
    }

    public static Icon squareCheckBig() {
        return LucideIconsS.squareCheckBig();
    }

    public static Icon squareChevronDown() {
        return LucideIconsS.squareChevronDown();
    }

    public static Icon squareChevronLeft() {
        return LucideIconsS.squareChevronLeft();
    }

    public static Icon squareChevronRight() {
        return LucideIconsS.squareChevronRight();
    }

    public static Icon squareChevronUp() {
        return LucideIconsS.squareChevronUp();
    }

    public static Icon squareCode() {
        return LucideIconsS.squareCode();
    }

    public static Icon squareDashed() {
        return LucideIconsS.squareDashed();
    }

    public static Icon squareDashedBottom() {
        return LucideIconsS.squareDashedBottom();
    }

    public static Icon squareDashedBottomCode() {
        return LucideIconsS.squareDashedBottomCode();
    }

    public static Icon squareDashedKanban() {
        return LucideIconsS.squareDashedKanban();
    }

    public static Icon squareDashedMousePointer() {
        return LucideIconsS.squareDashedMousePointer();
    }

    public static Icon squareDashedText() {
        return LucideIconsS.squareDashedText();
    }

    public static Icon squareDashedTopSolid() {
        return LucideIconsS.squareDashedTopSolid();
    }

    public static Icon squareDivide() {
        return LucideIconsS.squareDivide();
    }

    public static Icon squareDot() {
        return LucideIconsS.squareDot();
    }

    public static Icon squareEqual() {
        return LucideIconsS.squareEqual();
    }

    public static Icon squareFunction() {
        return LucideIconsS.squareFunction();
    }

    public static Icon squareGanttChart() {
        return LucideIconsS.squareGanttChart();
    }

    public static Icon squareKanban() {
        return LucideIconsS.squareKanban();
    }

    public static Icon squareLibrary() {
        return LucideIconsS.squareLibrary();
    }

    public static Icon squareM() {
        return LucideIconsS.squareM();
    }

    public static Icon squareMenu() {
        return LucideIconsS.squareMenu();
    }

    public static Icon squareMinus() {
        return LucideIconsS.squareMinus();
    }

    public static Icon squareMousePointer() {
        return LucideIconsS.squareMousePointer();
    }

    public static Icon squareParking() {
        return LucideIconsS.squareParking();
    }

    public static Icon squareParkingOff() {
        return LucideIconsS.squareParkingOff();
    }

    public static Icon squarePause() {
        return LucideIconsS.squarePause();
    }

    public static Icon squarePen() {
        return LucideIconsS.squarePen();
    }

    public static Icon squarePercent() {
        return LucideIconsS.squarePercent();
    }

    public static Icon squarePi() {
        return LucideIconsS.squarePi();
    }

    public static Icon squarePilcrow() {
        return LucideIconsS.squarePilcrow();
    }

    public static Icon squarePlay() {
        return LucideIconsS.squarePlay();
    }

    public static Icon squarePlus() {
        return LucideIconsS.squarePlus();
    }

    public static Icon squarePower() {
        return LucideIconsS.squarePower();
    }

    public static Icon squareRadical() {
        return LucideIconsS.squareRadical();
    }

    public static Icon squareRoundCorner() {
        return LucideIconsS.squareRoundCorner();
    }

    public static Icon squareScissors() {
        return LucideIconsS.squareScissors();
    }

    public static Icon squareSigma() {
        return LucideIconsS.squareSigma();
    }

    public static Icon squareSlash() {
        return LucideIconsS.squareSlash();
    }

    public static Icon squareSplitHorizontal() {
        return LucideIconsS.squareSplitHorizontal();
    }

    public static Icon squareSplitVertical() {
        return LucideIconsS.squareSplitVertical();
    }

    public static Icon squareSquare() {
        return LucideIconsS.squareSquare();
    }

    public static Icon squareStack() {
        return LucideIconsS.squareStack();
    }

    public static Icon squareStar() {
        return LucideIconsS.squareStar();
    }

    public static Icon squareStop() {
        return LucideIconsS.squareStop();
    }

    public static Icon squareTerminal() {
        return LucideIconsS.squareTerminal();
    }

    public static Icon squareUser() {
        return LucideIconsS.squareUser();
    }

    public static Icon squareUserRound() {
        return LucideIconsS.squareUserRound();
    }

    public static Icon squareX() {
        return LucideIconsS.squareX();
    }

    public static Icon squaresExclude() {
        return LucideIconsS.squaresExclude();
    }

    public static Icon squaresIntersect() {
        return LucideIconsS.squaresIntersect();
    }

    public static Icon squaresSubtract() {
        return LucideIconsS.squaresSubtract();
    }

    public static Icon squaresUnite() {
        return LucideIconsS.squaresUnite();
    }

    public static Icon squircle() {
        return LucideIconsS.squircle();
    }

    public static Icon squircleDashed() {
        return LucideIconsS.squircleDashed();
    }

    public static Icon squirrel() {
        return LucideIconsS.squirrel();
    }

    public static Icon stamp() {
        return LucideIconsS.stamp();
    }

    public static Icon star() {
        return LucideIconsS.star();
    }

    public static Icon starHalf() {
        return LucideIconsS.starHalf();
    }

    public static Icon starOff() {
        return LucideIconsS.starOff();
    }

    public static Icon stars() {
        return LucideIconsS.stars();
    }

    public static Icon stepBack() {
        return LucideIconsS.stepBack();
    }

    public static Icon stepForward() {
        return LucideIconsS.stepForward();
    }

    public static Icon stethoscope() {
        return LucideIconsS.stethoscope();
    }

    public static Icon sticker() {
        return LucideIconsS.sticker();
    }

    public static Icon stickyNote() {
        return LucideIconsS.stickyNote();
    }

    public static Icon stickyNoteCheck() {
        return LucideIconsS.stickyNoteCheck();
    }

    public static Icon stickyNoteMinus() {
        return LucideIconsS.stickyNoteMinus();
    }

    public static Icon stickyNoteOff() {
        return LucideIconsS.stickyNoteOff();
    }

    public static Icon stickyNotePlus() {
        return LucideIconsS.stickyNotePlus();
    }

    public static Icon stickyNoteX() {
        return LucideIconsS.stickyNoteX();
    }

    public static Icon stickyNotes() {
        return LucideIconsS.stickyNotes();
    }

    public static Icon stone() {
        return LucideIconsS.stone();
    }

    public static Icon stopCircle() {
        return LucideIconsS.stopCircle();
    }

    public static Icon store() {
        return LucideIconsS.store();
    }

    public static Icon stretchHorizontal() {
        return LucideIconsS.stretchHorizontal();
    }

    public static Icon stretchVertical() {
        return LucideIconsS.stretchVertical();
    }

    public static Icon strikethrough() {
        return LucideIconsS.strikethrough();
    }

    public static Icon subscript() {
        return LucideIconsS.subscript();
    }

    public static Icon subtitles() {
        return LucideIconsS.subtitles();
    }

    public static Icon sun() {
        return LucideIconsS.sun();
    }

    public static Icon sunDim() {
        return LucideIconsS.sunDim();
    }

    public static Icon sunMedium() {
        return LucideIconsS.sunMedium();
    }

    public static Icon sunMoon() {
        return LucideIconsS.sunMoon();
    }

    public static Icon sunSnow() {
        return LucideIconsS.sunSnow();
    }

    public static Icon sunrise() {
        return LucideIconsS.sunrise();
    }

    public static Icon sunset() {
        return LucideIconsS.sunset();
    }

    public static Icon superscript() {
        return LucideIconsS.superscript();
    }

    public static Icon swatchBook() {
        return LucideIconsS.swatchBook();
    }

    public static Icon swissFranc() {
        return LucideIconsS.swissFranc();
    }

    public static Icon switchCamera() {
        return LucideIconsS.switchCamera();
    }

    public static Icon sword() {
        return LucideIconsS.sword();
    }

    public static Icon swords() {
        return LucideIconsS.swords();
    }

    public static Icon syringe() {
        return LucideIconsS.syringe();
    }

    public static Icon table() {
        return LucideIconsT.table();
    }

    public static Icon tableN2() {
        return LucideIconsT.tableN2();
    }

    public static Icon tableCellsMerge() {
        return LucideIconsT.tableCellsMerge();
    }

    public static Icon tableCellsSplit() {
        return LucideIconsT.tableCellsSplit();
    }

    public static Icon tableColumnsSplit() {
        return LucideIconsT.tableColumnsSplit();
    }

    public static Icon tableConfig() {
        return LucideIconsT.tableConfig();
    }

    public static Icon tableOfContents() {
        return LucideIconsT.tableOfContents();
    }

    public static Icon tableProperties() {
        return LucideIconsT.tableProperties();
    }

    public static Icon tableRowsSplit() {
        return LucideIconsT.tableRowsSplit();
    }

    public static Icon tablet() {
        return LucideIconsT.tablet();
    }

    public static Icon tabletSmartphone() {
        return LucideIconsT.tabletSmartphone();
    }

    public static Icon tablets() {
        return LucideIconsT.tablets();
    }

    public static Icon tag() {
        return LucideIconsT.tag();
    }

    public static Icon tags() {
        return LucideIconsT.tags();
    }

    public static Icon tallyN1() {
        return LucideIconsT.tallyN1();
    }

    public static Icon tallyN2() {
        return LucideIconsT.tallyN2();
    }

    public static Icon tallyN3() {
        return LucideIconsT.tallyN3();
    }

    public static Icon tallyN4() {
        return LucideIconsT.tallyN4();
    }

    public static Icon tallyN5() {
        return LucideIconsT.tallyN5();
    }

    public static Icon tangent() {
        return LucideIconsT.tangent();
    }

    public static Icon target() {
        return LucideIconsT.target();
    }

    public static Icon telescope() {
        return LucideIconsT.telescope();
    }

    public static Icon tent() {
        return LucideIconsT.tent();
    }

    public static Icon tentTree() {
        return LucideIconsT.tentTree();
    }

    public static Icon terminal() {
        return LucideIconsT.terminal();
    }

    public static Icon terminalSquare() {
        return LucideIconsT.terminalSquare();
    }

    public static Icon testTube() {
        return LucideIconsT.testTube();
    }

    public static Icon testTubeN2() {
        return LucideIconsT.testTubeN2();
    }

    public static Icon testTubeDiagonal() {
        return LucideIconsT.testTubeDiagonal();
    }

    public static Icon testTubes() {
        return LucideIconsT.testTubes();
    }

    public static Icon text() {
        return LucideIconsT.text();
    }

    public static Icon textAlignCenter() {
        return LucideIconsT.textAlignCenter();
    }

    public static Icon textAlignEnd() {
        return LucideIconsT.textAlignEnd();
    }

    public static Icon textAlignJustify() {
        return LucideIconsT.textAlignJustify();
    }

    public static Icon textAlignStart() {
        return LucideIconsT.textAlignStart();
    }

    public static Icon textCursor() {
        return LucideIconsT.textCursor();
    }

    public static Icon textCursorInput() {
        return LucideIconsT.textCursorInput();
    }

    public static Icon textInitial() {
        return LucideIconsT.textInitial();
    }

    public static Icon textQuote() {
        return LucideIconsT.textQuote();
    }

    public static Icon textSearch() {
        return LucideIconsT.textSearch();
    }

    public static Icon textSelect() {
        return LucideIconsT.textSelect();
    }

    public static Icon textSelection() {
        return LucideIconsT.textSelection();
    }

    public static Icon textWrap() {
        return LucideIconsT.textWrap();
    }

    public static Icon theater() {
        return LucideIconsT.theater();
    }

    public static Icon thermometer() {
        return LucideIconsT.thermometer();
    }

    public static Icon thermometerSnowflake() {
        return LucideIconsT.thermometerSnowflake();
    }

    public static Icon thermometerSun() {
        return LucideIconsT.thermometerSun();
    }

    public static Icon thumbsDown() {
        return LucideIconsT.thumbsDown();
    }

    public static Icon thumbsUp() {
        return LucideIconsT.thumbsUp();
    }

    public static Icon ticket() {
        return LucideIconsT.ticket();
    }

    public static Icon ticketCheck() {
        return LucideIconsT.ticketCheck();
    }

    public static Icon ticketMinus() {
        return LucideIconsT.ticketMinus();
    }

    public static Icon ticketPercent() {
        return LucideIconsT.ticketPercent();
    }

    public static Icon ticketPlus() {
        return LucideIconsT.ticketPlus();
    }

    public static Icon ticketSlash() {
        return LucideIconsT.ticketSlash();
    }

    public static Icon ticketX() {
        return LucideIconsT.ticketX();
    }

    public static Icon tickets() {
        return LucideIconsT.tickets();
    }

    public static Icon ticketsPlane() {
        return LucideIconsT.ticketsPlane();
    }

    public static Icon timeline() {
        return LucideIconsT.timeline();
    }

    public static Icon timer() {
        return LucideIconsT.timer();
    }

    public static Icon timerOff() {
        return LucideIconsT.timerOff();
    }

    public static Icon timerReset() {
        return LucideIconsT.timerReset();
    }

    public static Icon toggleLeft() {
        return LucideIconsT.toggleLeft();
    }

    public static Icon toggleRight() {
        return LucideIconsT.toggleRight();
    }

    public static Icon toilet() {
        return LucideIconsT.toilet();
    }

    public static Icon toolCase() {
        return LucideIconsT.toolCase();
    }

    public static Icon toolbox() {
        return LucideIconsT.toolbox();
    }

    public static Icon tornado() {
        return LucideIconsT.tornado();
    }

    public static Icon torus() {
        return LucideIconsT.torus();
    }

    public static Icon touchpad() {
        return LucideIconsT.touchpad();
    }

    public static Icon touchpadOff() {
        return LucideIconsT.touchpadOff();
    }

    public static Icon towelRack() {
        return LucideIconsT.towelRack();
    }

    public static Icon towerControl() {
        return LucideIconsT.towerControl();
    }

    public static Icon toyBrick() {
        return LucideIconsT.toyBrick();
    }

    public static Icon tractor() {
        return LucideIconsT.tractor();
    }

    public static Icon trafficCone() {
        return LucideIconsT.trafficCone();
    }

    public static Icon train() {
        return LucideIconsT.train();
    }

    public static Icon trainFront() {
        return LucideIconsT.trainFront();
    }

    public static Icon trainFrontTunnel() {
        return LucideIconsT.trainFrontTunnel();
    }

    public static Icon trainTrack() {
        return LucideIconsT.trainTrack();
    }

    public static Icon tramFront() {
        return LucideIconsT.tramFront();
    }

    public static Icon transgender() {
        return LucideIconsT.transgender();
    }

    public static Icon trash() {
        return LucideIconsT.trash();
    }

    public static Icon trashN2() {
        return LucideIconsT.trashN2();
    }

    public static Icon treeDeciduous() {
        return LucideIconsT.treeDeciduous();
    }

    public static Icon treePalm() {
        return LucideIconsT.treePalm();
    }

    public static Icon treePine() {
        return LucideIconsT.treePine();
    }

    public static Icon trees() {
        return LucideIconsT.trees();
    }

    public static Icon trendingDown() {
        return LucideIconsT.trendingDown();
    }

    public static Icon trendingUp() {
        return LucideIconsT.trendingUp();
    }

    public static Icon trendingUpDown() {
        return LucideIconsT.trendingUpDown();
    }

    public static Icon triangle() {
        return LucideIconsT.triangle();
    }

    public static Icon triangleAlert() {
        return LucideIconsT.triangleAlert();
    }

    public static Icon triangleDashed() {
        return LucideIconsT.triangleDashed();
    }

    public static Icon triangleRight() {
        return LucideIconsT.triangleRight();
    }

    public static Icon trophy() {
        return LucideIconsT.trophy();
    }

    public static Icon truck() {
        return LucideIconsT.truck();
    }

    public static Icon truckElectric() {
        return LucideIconsT.truckElectric();
    }

    public static Icon turkishLira() {
        return LucideIconsT.turkishLira();
    }

    public static Icon turntable() {
        return LucideIconsT.turntable();
    }

    public static Icon turtle() {
        return LucideIconsT.turtle();
    }

    public static Icon tv() {
        return LucideIconsT.tv();
    }

    public static Icon tvN2() {
        return LucideIconsT.tvN2();
    }

    public static Icon tvMinimal() {
        return LucideIconsT.tvMinimal();
    }

    public static Icon tvMinimalPlay() {
        return LucideIconsT.tvMinimalPlay();
    }

    public static Icon type() {
        return LucideIconsT.type();
    }

    public static Icon typeOutline() {
        return LucideIconsT.typeOutline();
    }

    public static Icon umbrella() {
        return LucideIconsU.umbrella();
    }

    public static Icon umbrellaOff() {
        return LucideIconsU.umbrellaOff();
    }

    public static Icon underline() {
        return LucideIconsU.underline();
    }

    public static Icon undo() {
        return LucideIconsU.undo();
    }

    public static Icon undoN2() {
        return LucideIconsU.undoN2();
    }

    public static Icon undoDot() {
        return LucideIconsU.undoDot();
    }

    public static Icon unfoldHorizontal() {
        return LucideIconsU.unfoldHorizontal();
    }

    public static Icon unfoldVertical() {
        return LucideIconsU.unfoldVertical();
    }

    public static Icon ungroup() {
        return LucideIconsU.ungroup();
    }

    public static Icon university() {
        return LucideIconsU.university();
    }

    public static Icon unlink() {
        return LucideIconsU.unlink();
    }

    public static Icon unlinkN2() {
        return LucideIconsU.unlinkN2();
    }

    public static Icon unlock() {
        return LucideIconsU.unlock();
    }

    public static Icon unlockKeyhole() {
        return LucideIconsU.unlockKeyhole();
    }

    public static Icon unplug() {
        return LucideIconsU.unplug();
    }

    public static Icon upload() {
        return LucideIconsU.upload();
    }

    public static Icon uploadCloud() {
        return LucideIconsU.uploadCloud();
    }

    public static Icon usb() {
        return LucideIconsU.usb();
    }

    public static Icon user() {
        return LucideIconsU.user();
    }

    public static Icon userN2() {
        return LucideIconsU.userN2();
    }

    public static Icon userCheck() {
        return LucideIconsU.userCheck();
    }

    public static Icon userCheckN2() {
        return LucideIconsU.userCheckN2();
    }

    public static Icon userCircle() {
        return LucideIconsU.userCircle();
    }

    public static Icon userCircleN2() {
        return LucideIconsU.userCircleN2();
    }

    public static Icon userCog() {
        return LucideIconsU.userCog();
    }

    public static Icon userCogN2() {
        return LucideIconsU.userCogN2();
    }

    public static Icon userKey() {
        return LucideIconsU.userKey();
    }

    public static Icon userLock() {
        return LucideIconsU.userLock();
    }

    public static Icon userMinus() {
        return LucideIconsU.userMinus();
    }

    public static Icon userMinusN2() {
        return LucideIconsU.userMinusN2();
    }

    public static Icon userPen() {
        return LucideIconsU.userPen();
    }

    public static Icon userPlus() {
        return LucideIconsU.userPlus();
    }

    public static Icon userPlusN2() {
        return LucideIconsU.userPlusN2();
    }

    public static Icon userRound() {
        return LucideIconsU.userRound();
    }

    public static Icon userRoundCheck() {
        return LucideIconsU.userRoundCheck();
    }

    public static Icon userRoundCog() {
        return LucideIconsU.userRoundCog();
    }

    public static Icon userRoundKey() {
        return LucideIconsU.userRoundKey();
    }

    public static Icon userRoundMinus() {
        return LucideIconsU.userRoundMinus();
    }

    public static Icon userRoundPen() {
        return LucideIconsU.userRoundPen();
    }

    public static Icon userRoundPlus() {
        return LucideIconsU.userRoundPlus();
    }

    public static Icon userRoundSearch() {
        return LucideIconsU.userRoundSearch();
    }

    public static Icon userRoundX() {
        return LucideIconsU.userRoundX();
    }

    public static Icon userSearch() {
        return LucideIconsU.userSearch();
    }

    public static Icon userSquare() {
        return LucideIconsU.userSquare();
    }

    public static Icon userSquareN2() {
        return LucideIconsU.userSquareN2();
    }

    public static Icon userStar() {
        return LucideIconsU.userStar();
    }

    public static Icon userX() {
        return LucideIconsU.userX();
    }

    public static Icon userXN2() {
        return LucideIconsU.userXN2();
    }

    public static Icon users() {
        return LucideIconsU.users();
    }

    public static Icon usersN2() {
        return LucideIconsU.usersN2();
    }

    public static Icon usersRound() {
        return LucideIconsU.usersRound();
    }

    public static Icon utensils() {
        return LucideIconsU.utensils();
    }

    public static Icon utensilsCrossed() {
        return LucideIconsU.utensilsCrossed();
    }

    public static Icon utilityPole() {
        return LucideIconsU.utilityPole();
    }

    public static Icon van() {
        return LucideIconsV.van();
    }

    public static Icon variable() {
        return LucideIconsV.variable();
    }

    public static Icon vault() {
        return LucideIconsV.vault();
    }

    public static Icon vectorSquare() {
        return LucideIconsV.vectorSquare();
    }

    public static Icon vegan() {
        return LucideIconsV.vegan();
    }

    public static Icon venetianMask() {
        return LucideIconsV.venetianMask();
    }

    public static Icon venus() {
        return LucideIconsV.venus();
    }

    public static Icon venusAndMars() {
        return LucideIconsV.venusAndMars();
    }

    public static Icon verified() {
        return LucideIconsV.verified();
    }

    public static Icon vibrate() {
        return LucideIconsV.vibrate();
    }

    public static Icon vibrateOff() {
        return LucideIconsV.vibrateOff();
    }

    public static Icon video() {
        return LucideIconsV.video();
    }

    public static Icon videoOff() {
        return LucideIconsV.videoOff();
    }

    public static Icon videotape() {
        return LucideIconsV.videotape();
    }

    public static Icon view() {
        return LucideIconsV.view();
    }

    public static Icon voicemail() {
        return LucideIconsV.voicemail();
    }

    public static Icon volleyball() {
        return LucideIconsV.volleyball();
    }

    public static Icon volume() {
        return LucideIconsV.volume();
    }

    public static Icon volumeN1() {
        return LucideIconsV.volumeN1();
    }

    public static Icon volumeN2() {
        return LucideIconsV.volumeN2();
    }

    public static Icon volumeOff() {
        return LucideIconsV.volumeOff();
    }

    public static Icon volumeX() {
        return LucideIconsV.volumeX();
    }

    public static Icon vote() {
        return LucideIconsV.vote();
    }

    public static Icon wallet() {
        return LucideIconsW.wallet();
    }

    public static Icon walletN2() {
        return LucideIconsW.walletN2();
    }

    public static Icon walletCards() {
        return LucideIconsW.walletCards();
    }

    public static Icon walletMinimal() {
        return LucideIconsW.walletMinimal();
    }

    public static Icon wallpaper() {
        return LucideIconsW.wallpaper();
    }

    public static Icon wand() {
        return LucideIconsW.wand();
    }

    public static Icon wandN2() {
        return LucideIconsW.wandN2();
    }

    public static Icon wandSparkles() {
        return LucideIconsW.wandSparkles();
    }

    public static Icon warehouse() {
        return LucideIconsW.warehouse();
    }

    public static Icon washingMachine() {
        return LucideIconsW.washingMachine();
    }

    public static Icon watch() {
        return LucideIconsW.watch();
    }

    public static Icon waves() {
        return LucideIconsW.waves();
    }

    public static Icon wavesArrowDown() {
        return LucideIconsW.wavesArrowDown();
    }

    public static Icon wavesArrowUp() {
        return LucideIconsW.wavesArrowUp();
    }

    public static Icon wavesHorizontal() {
        return LucideIconsW.wavesHorizontal();
    }

    public static Icon wavesLadder() {
        return LucideIconsW.wavesLadder();
    }

    public static Icon wavesVertical() {
        return LucideIconsW.wavesVertical();
    }

    public static Icon waypoints() {
        return LucideIconsW.waypoints();
    }

    public static Icon webcam() {
        return LucideIconsW.webcam();
    }

    public static Icon webhook() {
        return LucideIconsW.webhook();
    }

    public static Icon webhookOff() {
        return LucideIconsW.webhookOff();
    }

    public static Icon weight() {
        return LucideIconsW.weight();
    }

    public static Icon weightTilde() {
        return LucideIconsW.weightTilde();
    }

    public static Icon wheat() {
        return LucideIconsW.wheat();
    }

    public static Icon wheatOff() {
        return LucideIconsW.wheatOff();
    }

    public static Icon wholeWord() {
        return LucideIconsW.wholeWord();
    }

    public static Icon wifi() {
        return LucideIconsW.wifi();
    }

    public static Icon wifiCog() {
        return LucideIconsW.wifiCog();
    }

    public static Icon wifiHigh() {
        return LucideIconsW.wifiHigh();
    }

    public static Icon wifiLow() {
        return LucideIconsW.wifiLow();
    }

    public static Icon wifiOff() {
        return LucideIconsW.wifiOff();
    }

    public static Icon wifiPen() {
        return LucideIconsW.wifiPen();
    }

    public static Icon wifiSync() {
        return LucideIconsW.wifiSync();
    }

    public static Icon wifiZero() {
        return LucideIconsW.wifiZero();
    }

    public static Icon wind() {
        return LucideIconsW.wind();
    }

    public static Icon windArrowDown() {
        return LucideIconsW.windArrowDown();
    }

    public static Icon wine() {
        return LucideIconsW.wine();
    }

    public static Icon wineOff() {
        return LucideIconsW.wineOff();
    }

    public static Icon workflow() {
        return LucideIconsW.workflow();
    }

    public static Icon worm() {
        return LucideIconsW.worm();
    }

    public static Icon wrapText() {
        return LucideIconsW.wrapText();
    }

    public static Icon wrench() {
        return LucideIconsW.wrench();
    }

    public static Icon x() {
        return LucideIconsX.x();
    }

    public static Icon xCircle() {
        return LucideIconsX.xCircle();
    }

    public static Icon xLineTop() {
        return LucideIconsX.xLineTop();
    }

    public static Icon xOctagon() {
        return LucideIconsX.xOctagon();
    }

    public static Icon xSquare() {
        return LucideIconsX.xSquare();
    }

    public static Icon zap() {
        return LucideIconsZ.zap();
    }

    public static Icon zapOff() {
        return LucideIconsZ.zapOff();
    }

    public static Icon zodiacAquarius() {
        return LucideIconsZ.zodiacAquarius();
    }

    public static Icon zodiacAries() {
        return LucideIconsZ.zodiacAries();
    }

    public static Icon zodiacCancer() {
        return LucideIconsZ.zodiacCancer();
    }

    public static Icon zodiacCapricorn() {
        return LucideIconsZ.zodiacCapricorn();
    }

    public static Icon zodiacGemini() {
        return LucideIconsZ.zodiacGemini();
    }

    public static Icon zodiacLeo() {
        return LucideIconsZ.zodiacLeo();
    }

    public static Icon zodiacLibra() {
        return LucideIconsZ.zodiacLibra();
    }

    public static Icon zodiacOphiuchus() {
        return LucideIconsZ.zodiacOphiuchus();
    }

    public static Icon zodiacPisces() {
        return LucideIconsZ.zodiacPisces();
    }

    public static Icon zodiacSagittarius() {
        return LucideIconsZ.zodiacSagittarius();
    }

    public static Icon zodiacScorpio() {
        return LucideIconsZ.zodiacScorpio();
    }

    public static Icon zodiacTaurus() {
        return LucideIconsZ.zodiacTaurus();
    }

    public static Icon zodiacVirgo() {
        return LucideIconsZ.zodiacVirgo();
    }

    public static Icon zoomIn() {
        return LucideIconsZ.zoomIn();
    }

    public static Icon zoomOut() {
        return LucideIconsZ.zoomOut();
    }
}
