package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class TaskThree {
    public static void main(String[] args) {
        int n;
        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива 'N': ");
        n = scan.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        for (int i : array) {
            if (i < 0) {
                countNegative++;
            } else if (i > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }
        System.out.println("Кол-во отрицательных элементов: " + countNegative);
        System.out.println("Кол-во положительных элементов: " + countPositive);
        System.out.println("Кол-во нулевых элементов: " + countZero);
        scan.close();
    }
}
