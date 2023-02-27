package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorJUnitTest {


    @ParameterizedTest
    @MethodSource("getParams")
    public void TestSum(double numberOne, char operation, double numberTwo, double expected) {
        Numbers numbers = new Numbers(numberOne, numberTwo);

        assertEquals(expected, numbers.getResult(operation));
    }

    static Stream<Arguments> getParams() {
        return Stream.of(
                arguments(2, "+", 2, 4),
                arguments(0, "+", -1, -1),
                arguments(-1, "-", -1, 0),
                arguments(1, "-", 0.5, 0.5),
                arguments(0, "*", 0, 0),
                arguments(2, "*", 3, 6),
                arguments(0, "/", 0.5, 0),
                arguments(1, "/", 1, 1)
        );
    }

}