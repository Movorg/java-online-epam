package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskTen {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 'n': ");
        n = scan.nextInt();
        int[] array = getRandomArr(n);
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        replaceElement(array);
        compressArr(array);
        scan.close();
    }

    /** Получаем массив, заполненный псевдослучайными числами от min до max. */

    public static int[] getRandomArr(int n) {
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = 1;
            int max = 10;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        return array;
    }

    /** Изменяем значение каждого второго элемента на ноль. */

    public static void replaceElement(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
    }

    /** Перемещаем оставшиеся элементы влево, освободившиеся позиции обнуляем. */

    public static void compressArr(int[] array) {
        for (int i = 2; i < array.length; i += 2) {
            array[i / 2] = array[i];
            array[i] = 0;
        }
        System.out.println("Результат: " + Arrays.toString(array));
    }
}
