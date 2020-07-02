package com.github.aistomin.sexist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by aistomin on 02.07.20.
 * <p>
 * Test for {@link Dummy}
 */
class DummyTest {

    /**
     * Dummy test.
     */
    @Test
    void dummy() {
        Assertions.assertEquals("dummy", new Dummy().dummy());
    }
}
