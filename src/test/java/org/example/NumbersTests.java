package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTests {
    @Test
    void testSumPositive() {
        Numbers numbers = new Numbers(2, 2);

        Assertions.assertEquals(4, numbers.getSum());
    }
    @Test
    void testDiffPositive() {
        Numbers numbers = new Numbers(4, 2);

        Assertions.assertEquals(2, numbers.getDiff());
    }
    @Test
    void testMultiplicationPositive() {
        Numbers numbers = new Numbers(3, 3);

        Assertions.assertEquals(9, numbers.getMult());
    }
    @Test
    void testDivPositive() {
        Numbers numbers = new Numbers(1, 1);

        Assertions.assertEquals(1, numbers.getDivOnY());
    }
}