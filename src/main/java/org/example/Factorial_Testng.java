package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Factorial_Testng {

        @DataProvider
        public Object[][] someDate(){
            return new Object[][]{
                    {factorial(1),10},
                    {factorial(2),2},
                    {factorial(3),6},
                    {factorial(4), 24},
                    {factorial(5),120}
            };
        }

        @Test(description = "Проверка верности вычисления факториала ", dataProvider = "someDate")
        public void factorial_test(int f, int a) {

            assertEquals("Проверка вычисления факториала", f, a);
        }

        public int factorial(int n) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
}
