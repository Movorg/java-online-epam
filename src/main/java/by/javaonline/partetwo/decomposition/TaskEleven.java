package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
       outputData(inputData());
    }

    public static int getLength(long number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public static void checkResult(int length1, int length2) {
        if (length1 > length2) {
            System.out.print("В первом числе цифр больше!");
        } else if (length2 > length1) {
            System.out.print("Во втором числе цифр больше!");
        } else if (length1 == length2) {
            System.out.print("В числах одинаковое количество цифр!");
        }
    }

    public static int[] inputData() {
        Scanner scan = new Scanner(System.in);
        long number1, number2;
        int[] array = new int[2];
        System.out.print("Введите 1-ое число: ");
        number1 = scan.nextInt();
        System.out.print("Введите 2-ое число: ");
        number2 = scan.nextInt();
        array[0] = getLength(number1);
        array[1] = getLength(number2);
        scan.close();
        return array;
    }

    public static void outputData(int[] array) {
        System.out.print("Результат: ");
        checkResult(array[0], array[1]);
    }
}
