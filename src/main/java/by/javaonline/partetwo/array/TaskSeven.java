package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskSeven {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 'n': ");
        n = scan.nextInt();

        int[] array = new int[2 * n];
        int[] arraySum = new int[n];

        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }

        System.out.println("Сгенерированная последовательность: " + Arrays.toString(array));

        int count = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            arraySum[i] = array[i] + array[count];
            count--;
        }

        System.out.println("Результат сложения элементов: " + Arrays.toString(arraySum));

        int max = arraySum[0];

        for (int i = 1; i < arraySum.length; i++) {
            if (arraySum[i] > max) {
                max = arraySum[i];
            }
        }

        System.out.print("max " + Arrays.toString(arraySum) + " = " + max);

        scan.close();
    }
}
