package org.gwtfusion.ui.overlay;

public final class IdGenerator {
    private final String prefix;
    private int next;

    private IdGenerator(String prefix) {
        this.prefix = sanitize(prefix == null || prefix.isEmpty() ? "gfu" : prefix);
    }

    public static IdGenerator create(String prefix) {
        return new IdGenerator(prefix);
    }

    public String next() {
        return next("id");
    }

    public String next(String part) {
        next++;
        return prefix + "-" + sanitize(part == null || part.isEmpty() ? "id" : part) + "-" + next;
    }

    public int current() {
        return next;
    }

    public static String sanitize(String value) {
        StringBuilder builder = new StringBuilder();
        String safeValue = value == null ? "" : value.toLowerCase();
        boolean previousDash = false;
        for (int i = 0; i < safeValue.length(); i++) {
            char c = safeValue.charAt(i);
            boolean allowed = (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
            if (allowed) {
                builder.append(c);
                previousDash = false;
            } else if (!previousDash && builder.length() > 0) {
                builder.append('-');
                previousDash = true;
            }
        }
        int length = builder.length();
        if (length > 0 && builder.charAt(length - 1) == '-') {
            builder.deleteCharAt(length - 1);
        }
        return builder.length() == 0 ? "id" : builder.toString();
    }
}
