package org.gwtfusion.ui.event;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class ListenerRegistrationTest {
    @Test
    void closeDelegatesToRemove() {
        AtomicInteger removals = new AtomicInteger();

        ListenerRegistration registration = removals::incrementAndGet;
        registration.close();

        assertEquals(1, removals.get());
    }

    @Test
    void combineRemovesAllRegistrations() {
        AtomicInteger removals = new AtomicInteger();

        ListenerRegistration.combine(
                removals::incrementAndGet,
                null,
                removals::incrementAndGet)
                .remove();

        assertEquals(2, removals.get());
    }
}
