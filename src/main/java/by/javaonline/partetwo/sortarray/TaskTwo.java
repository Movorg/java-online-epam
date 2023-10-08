package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1, arr2;
        int length1, length2;
        System.out.print("Введите кол-во элементов 1-й последовательности: ");
        length1 = scan.nextInt();
        System.out.print("Введите кол-во элементов 2-й последовательности: ");
        length2 = scan.nextInt();
        arr1 = getIncreasingSequence(length1);
        arr2 = getIncreasingSequence(length2);
        System.out.println("Первая последовательность: " + Arrays.toString(arr1));
        System.out.println("Вторая последовательность: " + Arrays.toString(arr2));
        arr1 = Arrays.copyOf(arr1, length1 + length2);
        java.lang.System.arraycopy(arr2, 0, arr1, length1, length2);
        Arrays.sort(arr1);
        System.out.println("Результат: " + Arrays.toString(arr1));
        scan.close();
    }

    public static int[] getIncreasingSequence(int length) {
        Random random = new Random();
        int value = 100;
        int[] array = new int[length];
        array[0] = random.nextInt(value);
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + random.nextInt(value);
        }
        return array;
    }
}
