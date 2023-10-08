package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length;
        System.out.print("Введите размерность последовательности: ");
        length = scan.nextInt();
        int[] array = new int[length];
        getRandomSequence(array);
        System.out.println("Сгенерированная последовательность: " + Arrays.toString(array));
        bubbleSort(array);
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

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
