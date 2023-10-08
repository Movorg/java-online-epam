package by.javaonline.partetwo.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[4];
        System.out.print("Введите четыре числа через пробел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("НОД: " + getGCD(array));
        scan.close();
    }

    public static int getGCD(int[] array) {
        int gcd = getGCD(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            gcd = getGCD(gcd, array[i]);
        }
        return gcd;
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (getGCD(b, a % b));
        }
    }

}
