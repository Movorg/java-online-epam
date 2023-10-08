package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length;
        System.out.print("Введите размерность последовательности: ");
        length = scan.nextInt();
        int[] array = new int[length];
        getRandomSequence(array);
        System.out.println("Сгенерированная последовательность: " + Arrays.toString(array));
        selectionSortMaxToMin(array);
        System.out.println("Результат: " + Arrays.toString(array));
        scan.close();
    }

    public static void getRandomSequence(int[] array) {
        Random random = new Random();
        int value = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(value);
        }
    }

    public static void selectionSortMaxToMin(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }
}
