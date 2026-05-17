package org.gwtfusion.ui.component.overlay;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.alertdialog.AlertDialog;
import org.gwtfusion.ui.component.contextmenu.ContextMenu;
import org.gwtfusion.ui.component.dialog.Dialog;
import org.gwtfusion.ui.component.drawer.Drawer;
import org.gwtfusion.ui.component.dropdown.DropdownMenu;
import org.gwtfusion.ui.component.hovercard.HoverCard;
import org.gwtfusion.ui.component.popover.Popover;
import org.gwtfusion.ui.component.sheet.Sheet;
import org.gwtfusion.ui.component.sheet.SheetSide;
import org.gwtfusion.ui.component.tooltip.Tooltip;
import org.junit.jupiter.api.Test;

class OverlayComponentsTest {
    @Test
    void dialogClassesExposeModalStructure() {
        assertTrue(Dialog.LAYER_CLASSES.contains("fixed"));
        assertTrue(Dialog.LAYER_CLASSES.contains("bg-background/80"));
        assertTrue(Dialog.PANEL_CLASSES.contains("bg-background"));
        assertTrue(Dialog.ACTIONS_CLASSES.contains("justify-end"));
    }

    @Test
    void alertDialogUsesDestructiveBorderContext() {
        assertTrue(AlertDialog.PANEL_CLASSES.contains("border-destructive/50"));
    }

    @Test
    void floatingOverlayClassesExposeRoleSpecificPresentation() {
        assertTrue(Popover.CONTENT_CLASSES.contains("border-border"));
        assertTrue(Tooltip.CONTENT_CLASSES.contains("bg-primary"));
        assertTrue(HoverCard.CONTENT_CLASSES.contains("w-80"));
    }

    @Test
    void menuClassesExposeKeyboardFocusableItems() {
        assertTrue(DropdownMenu.MENU_CLASSES.contains("min-w-40"));
        assertTrue(DropdownMenu.ITEM_CLASSES.contains("focus-visible:ring-ring"));
        assertTrue(ContextMenu.ITEM_CLASSES.contains("hover:bg-accent"));
    }

    @Test
    void sheetSidesMapToExpectedEdges() {
        assertTrue(Sheet.PANEL_BASE_CLASSES.contains("fixed"));
        assertTrue(SheetSide.TOP.classes().contains("top-0"));
        assertTrue(SheetSide.RIGHT.classes().contains("right-0"));
        assertTrue(SheetSide.BOTTOM.classes().contains("bottom-0"));
        assertTrue(SheetSide.LEFT.classes().contains("left-0"));
    }

    @Test
    void drawerUsesBottomSheetPresentation() {
        assertTrue(Drawer.PANEL_CLASSES.contains("bottom-0"));
        assertTrue(Drawer.PANEL_CLASSES.contains("rounded-t-lg"));
    }
}
