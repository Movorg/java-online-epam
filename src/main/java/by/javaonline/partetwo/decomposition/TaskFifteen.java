package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskFifteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int max;
        System.out.print("Введите количество знаков числа (разрядность) [2, 9]: ");
        n = scan.nextInt();
        max = getMaxNumber(n);
        System.out.print("Результат: ");
        checkNumbers(n, max);
        scan.close();
    }

    public static int[] getArray(int number, int length) {
        int digit;
        int[] array = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digit = number % 10;
            array[i] = digit;
            number = number / 10;
        }
        return array;
    }

    public static int getLength(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public static void checkNumbers(int n, int max) {
        int[] tempArray;
        int difference;
        int start = (int) pow(10, n - 1);
        for (int i = start; i < max; i++) {
            tempArray = getArray(i, getLength(i));
            for (int j = 0, k = 1; k < tempArray.length; j++, k++) {
                difference = tempArray[k] - tempArray[j];
                if (difference <= 0) {
                    break;
                }
                if (difference > 0 & k == tempArray.length - 1) {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    public static int getMaxNumber(int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += 9 * pow(10, i);
        }
        return max;
    }
}
