package org.example;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Factorial_Test_junit{
    @Description("Проверка правильности вычисления 1!")
    @ParameterizedTest
    @ValueSource(ints = {1,120,45,23})
    public void factorial_test_junit1(int a) {
        assertEquals(factorial(1), a);
    }

    @Description("Проверка правильности вычисления 2!")
    @ParameterizedTest
    @ValueSource(ints = {10,120,2,2})
    public void factorial_test_junit2(int a) {
        assertEquals(factorial(2), a);
    }
    @Description("Проверка правильности вычисления 3!")
    @ParameterizedTest
    @ValueSource(ints = {6,120,6,23})
    public void factorial_test_junit3(int a) {
        assertEquals(factorial(3), a);
    }
    @Description("Проверка правильности вычисления 4!")
    @ParameterizedTest
    @ValueSource(ints = {10,120,45,24})
    public void factorial_test_junit4(int a) {
        assertEquals(factorial(4), a);
    }

    @Description("Проверка правильности вычисления 5!")
    @ParameterizedTest
    @ValueSource(ints = {10,120,45,23})
    public void factorial_test_junit5(int a) {
        assertEquals(factorial(5), a);
    }

    public int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
