package org.gwtfusion.ui.event;

@FunctionalInterface
public interface ListenerRegistration {
    void remove();

    default void close() {
        remove();
    }

    static ListenerRegistration empty() {
        return () -> {
        };
    }

    static ListenerRegistration combine(ListenerRegistration... registrations) {
        return () -> {
            if (registrations == null) {
                return;
            }
            for (ListenerRegistration registration : registrations) {
                if (registration != null) {
                    registration.remove();
                }
            }
        };
    }
}
