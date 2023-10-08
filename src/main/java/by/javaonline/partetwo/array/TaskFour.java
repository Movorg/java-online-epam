package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskFour {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива 'N': ");
        n = scan.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        System.out.println("Сгенерированные числа: " + Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " +  max);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] = max;
            } else if (array[i] == max) {
                array[i] = min;
            }
        }
        System.out.println("Результат замены: " + Arrays.toString(array));
        scan.close();
    }
}
