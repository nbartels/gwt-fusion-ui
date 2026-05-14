package org.gwtfusion.ui.css;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class CssClasses {
    private CssClasses() {
    }

    public static List<String> tokens(String classes) {
        if (classes == null || classes.trim().isEmpty()) {
            return Collections.emptyList();
        }
        String[] split = classes.trim().split("\\s+");
        List<String> result = new ArrayList<>(split.length);
        for (String token : split) {
            if (!token.isEmpty()) {
                result.add(token);
            }
        }
        return result;
    }

    public static String join(String... classGroups) {
        Set<String> result = new LinkedHashSet<>();
        if (classGroups != null) {
            for (String classGroup : classGroups) {
                result.addAll(tokens(classGroup));
            }
        }
        return String.join(" ", result);
    }
}
