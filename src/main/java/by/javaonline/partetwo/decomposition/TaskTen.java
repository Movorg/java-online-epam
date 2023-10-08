package by.javaonline.partetwo.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;
        int length;
        long[] array;
        System.out.print("Введите натуральное число: ");
        number = scan.nextLong();
        length = getLength(number);
        array = getArray(number, length);
        System.out.println(Arrays.toString(array));
        scan.close();
    }

    public static long[] getArray(long number, int length) {
        long digit;
        long[] array = new long[length];
        for (int i = length - 1; i >= 0; i--) {
            digit = number % 10;
            array[i] = digit;
            number = number / 10;
        }
        return array;
    }

    public static int getLength(long number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }
}
