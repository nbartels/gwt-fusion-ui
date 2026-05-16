package org.gwtfusion.icons.lucide;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class LucideIconProvider implements IconProvider {
    @Override
    public Icon icon(String name) {
        return LucideIcons.icon(name);
    }

    public boolean supports(String name) {
        for (String supportedName : LucideIcons.names()) {
            if (supportedName.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
