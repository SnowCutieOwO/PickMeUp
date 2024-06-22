package de.eldoria.pickmeup.scheduler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import be.seeseemelk.mockbukkit.MockBukkit;

class ThrowBarHandlerTest {
    @Test
    @Disabled
    public void calcTest() {
        MockBukkit.mock();
        for (int i = 0; i < 60; i++) {
            Assertions.assertEquals(ThrowBarHandler.calculateIndex(i), ThrowBarHandler.calculateIndex(60 - i));
        }
        Assertions.assertEquals(0, ThrowBarHandler.calculateIndex(0));
        Assertions.assertEquals(0, ThrowBarHandler.calculateIndex(1));
        Assertions.assertEquals(28, ThrowBarHandler.calculateIndex(29));
        Assertions.assertEquals(30, ThrowBarHandler.calculateIndex(30));
        Assertions.assertEquals(28, ThrowBarHandler.calculateIndex(31));
        Assertions.assertEquals(0, ThrowBarHandler.calculateIndex(60));
        Assertions.assertEquals(0, ThrowBarHandler.calculateIndex(59));
    }
}
