package org.gwtfusion.ui.component.icon;

import java.util.HashMap;
import java.util.Map;

public final class IconRegistry {
    private final Map<String, IconProvider> providers = new HashMap<>();

    private IconRegistry() {
    }

    public static IconRegistry create() {
        return new IconRegistry();
    }

    public IconRegistry register(String name, IconProvider provider) {
        if (name != null && provider != null) {
            providers.put(name, provider);
        }
        return this;
    }

    public Icon icon(String providerName, String iconName) {
        IconProvider provider = providers.get(providerName == null ? "" : providerName);
        return provider == null ? null : provider.icon(iconName);
    }
}
