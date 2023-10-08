package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class TaskTwo {
    public static void main(String[] args) {
        int n;
        int z;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива 'N': ");
        n = scan.nextInt();
        System.out.print("Введите число 'Z': ");
        z = scan.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        System.out.println("Сгенерированная последовательность: " + Arrays.toString(array));
        for (int k = 0; k < array.length; k++) {
            if (array[k] > z) {
                array[k] = z;
                count++;
            }
        }
        System.out.println("Результат замены: " + Arrays.toString(array));
        System.out.println("Количество замен: " + count);
        scan.close();
    }
}
