package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        int length;
        System.out.print("Введите кол-во элементов случайной последовательности: ");
        length = scan.nextInt();
        array = getRandomSequence(length);
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
        scan.close();
    }

    public static void shellSort(int[] array) {
        int size = array.length;
        for (int step = size / 2; step > 0; step /= 2) {
            for (int i = step; i < size; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                }
            }
        }
    }

    public static int[] getRandomSequence(int length) {
        Random random = new Random();
        int value = 100;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(value);
        }
        return array;
    }
}
