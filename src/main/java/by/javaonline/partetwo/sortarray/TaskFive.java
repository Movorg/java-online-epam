package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        int length;
        System.out.print("Введите кол-во элементов случайной последовательности: ");
        length = scan.nextInt();
        array = getRandomSequence(length);
        System.out.println(Arrays.toString(array));
        insertionSortBinary(array);
        scan.close();
    }

    /** Сортировка вставками c бинарным поиском */

    public static void insertionSortBinary(int[] array) {
        int temp;
        int index;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            index = getIndexBinarySearch(Arrays.copyOfRange(array, 0, i), temp);        //получаем позицию очередного элемента;
            java.lang.System.arraycopy(array, index, array, index + 1, i - index);  //смещаем элементы внутри массива;
            array[index] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    /** Сортировка вставками без бинарного поиска */

    public static void insertionSort(int[] array) {
        int temp;
        int j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
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

    public static int getIndexBinarySearch(int[] array, int key) {
        int index;
        index = Arrays.binarySearch(array, key);
        if (index < 0) {
            index = -1 * index - 1;
        }
        return index;
    }
}
