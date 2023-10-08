package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class TaskOne {
    public static void main(String[] args) {
        int n;
        int k;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива 'N': ");
        n = scan.nextInt();
        System.out.print("Введите число 'K': ");
        k = scan.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int max = 1000;
            array[m] = (int) (random() * (max + 1));
        }
        for (int i : array) {
            if (i % k == 0) {
                sum += i;
            }
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        if (sum == 0) {
            System.out.println("В массиве нет чисел, кратых " + k);
        } else {
            System.out.println("Сумма чисел массива, кратных " + k + " равна " + sum);
        }
        scan.close();
    }
}
