package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1, arr2;
        int length1, length2;
        int k;
        System.out.print("Введите кол-во элементов 1-го массива: ");
        length1 = scan.nextInt();
        System.out.print("Введите кол-во элементов 2-го массива: ");
        length2 = scan.nextInt();
        arr1 = new int[length1];
        arr2 = new int[length2];
        System.out.print("Введите " + length1 + " элемента(ов) 1-го массива: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.print("Введите " + length2 + " элемента(ов) 2-го массива: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        System.out.print("Массив №1: " + Arrays.toString(arr1) + "\n");
        System.out.print("Массив №2: " + Arrays.toString(arr2) + "\n");
        System.out.print("Введите нат. число k от 1 до " + length1 + ": ");
        k = scan.nextInt();
        int tempLength = arr1.length;
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = tempLength - 1, j = arr1.length - 1; i >= k; i--, j--) {
            arr1[j] = arr1[i];
        }
        for (int i = k, j = 0; j < arr2.length; i++, j++) {
            arr1[i] = arr2[j];
        }
        System.out.println("Результат: " + Arrays.toString(arr1));
        scan.close();
    }
}
