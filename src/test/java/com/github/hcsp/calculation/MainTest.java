package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        int n = new java.util.Random().nextInt(10);
        assertEquals(
                (int) org.apache.commons.math3.util.CombinatoricsUtils.factorial(n),
                Main.factorial(n));
        assertEquals(1, Main.factorial(0));
    }
}
