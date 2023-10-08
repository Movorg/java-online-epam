package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskSeven {
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
        System.out.println("Вторая последовательность: " + Arrays.toString(arr2) + "\n");
        checkPosition(arr1, arr2);
    }

    public static void checkPosition(int[] arr1, int[] arr2) {
        int index;
        int element;
        System.out.println("* Номера позиций начинаютстя с нуля!");
        for (int j : arr2) {
            element = j;
            index = getIndexBinarySearch(arr1, element);                                            //получаем позицию очередного элемента;
            arr1 = Arrays.copyOf(arr1, arr1.length + 1);
            System.arraycopy(arr1, index, arr1, index + 1, arr1.length - index - 1);  //смещаем элементы внутри массива;
            arr1[index] = element;
            System.out.println("Элемент " + element + " необходимо вставить на позицию " + index + "!");
            System.out.println("Результат вставки: " + Arrays.toString(arr1) + "\n");
        }
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

    public static int getIndexBinarySearch(int[] array, int key) {
        int index;
        index = Arrays.binarySearch(array, key);
        if (index < 0) {
            index = -1 * index - 1;
        }
        return index;
    }
}
