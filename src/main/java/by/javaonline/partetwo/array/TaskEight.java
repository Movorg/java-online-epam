package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskEight {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 'n': ");
        n = scan.nextInt();

        int[] array = new int[n];

        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }

        System.out.println("Сгенерированная последовательность: " + Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.print("min " + Arrays.toString(array) + " = " + min);
        System.out.println();
        System.out.print("Результат: ");

        for (int i : array) {
            if (i != min) {
                System.out.print(i + ", ");
            }
        }
        scan.close();
    }
}
