import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");    //Первое задание
        printThreeWords();

        System.out.println("Задание 2");   //Второе задание
        chekSumSign();

        System.out.println("Задание 3");    //Третье задание
        printColor();

        System.out.println("Задание 4");     //Четвертое задание
        compareNumbers();

        System.out.println("Задание 5");   //Пятое задание
        method_5();

        System.out.println("Задание 6");    //Шестое задание
        metod_6(-50);

        System.out.println("Задание 7");      //Седьмое задание
        System.out.println(metod_7(-50));

        System.out.println("Задание 8");      //Восьмое задание
        stringNumber("Don't woory, be happy", 4);

        System.out.println("Задание 9");   //Девятое задание
        System.out.println(leapYear());

        System.out.println("Задание 10");   //Десятое задание
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.print("Перевернутый массив:   ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else  {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

        System.out.println("Задание 11");    //11 задание
        int [] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = i + 1;
            System.out.println("arr1[" + i +"] = " + arr1[i]);
        }

        System.out.println("Задание 12");        //12 задание
        int [] arr3 = {1, 5, 3, 22, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(arr3));
        System.out.print("Массив, где числа меньшие 6 были увеличены в 2 раза:   ");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }

        System.out.println("Задание 13");       //13 задание
        int [] [] arr4 = new int [4] [4];
        for (int i = 0; i < 4; i++)  {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Задание 14");       //14 задание
        arr_len_value(10, 5);
    }

    public static void printThreeWords()  {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSign() {
        int a = 5;
        int b = - 50;
        if ((a + b) >=0) {
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 1002;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if  (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        else   {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 100;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void method_5() {
        System.out.println("Введите числа a и b:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((10 <= (a+b)) && ((a+b) <= 20)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        };
    }

    public static void metod_6(int a) {
        if (a >= 0)   {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

    public static boolean metod_7(int a) {
        if (a >= 0) {
            return true;
        }  else {
            return false;
        }
    }

    public  static void stringNumber(String str, int n) {
        for (int i = 1; i <= n; i++)  {
            System.out.println(str);
        }
    }

    public  static boolean leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int y = scanner.nextInt();
        if ( ( (y % 4 == 0) && (y % 100 != 0) ) || (y % 400 == 0 ) ){
            return true;
        } else {
            return false;
        }
    }

    public static void arr_len_value(int len, int initialValue) {
        int[] arr14 = new int[len];
        System.out.println("Массив длиною "+ len + " элементов и состоящий из " + initialValue);
        for (int i = 0; i < len; i++) {
            arr14[i] = initialValue;
            System.out.print(arr14[i] + " ");
        }
    }
}
