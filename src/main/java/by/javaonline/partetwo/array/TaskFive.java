package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskFive {
    public static void main(String[] args) {
        int n;
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива 'N': ");
        n = scan.nextInt();
        System.out.print("Введите число 'i': ");
        i = scan.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        System.out.println("Сгенерированные числа: " + Arrays.toString(array));
        System.out.print("Числа > " + i + ": ");
        for (int k : array) {
            if (k > i) {
                System.out.print(k + ", ");
            }
        }
        scan.close();
    }
}
