package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskNine {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 'n': ");
        n = scan.nextInt();
        int[] array = getRandomArr(n);                                                        // получаем основной массив
        int[] arrayTemp = getTempArr(array, n);                                               // получаем вспомогательный массив
        System.out.println("Сгенерированная последовательность: " + Arrays.toString(array));
        int uniqueLength = getUniqueArrayLength(bubbleSort(arrayTemp));                       // получаем размер массива уник. чисел
        int[] arrayUnique = getArrayUnique(arrayTemp, uniqueLength);                          // получаем массив уник. чисел
        int[][] arrayRep = getArrayRep(arrayUnique, array, uniqueLength);                     // получаем 2-мерный массив с уник. числами и числом их повторений
        System.out.println("[Уникальные числа], [Повторения уникальных чисел]: " + Arrays.deepToString(arrayRep));
        findNumberRep(arrayRep);
        scan.close();
    }

    /** Получаем массив, заполненный псевдослучайными числами от min до max. */

    public static int[] getRandomArr(int n) {
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = 0;
            int max = 10;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        return array;
    }

    /** Получаем временный массив, идентичный основному. */

    public static int[] getTempArr(int[] array, int n) {
        int[] arrayTemp = new int[n];
        for (int i = 0; i < array.length; i++) {
            arrayTemp[i] = array[i];
        }
        return arrayTemp;
    }

    /** Получаем размерность массива с уникальными числами. */

    public static int getUniqueArrayLength(int[] array) {
        if (array.length <= 1) {
            return array.length;
        }
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[count++] = array[i];
            }
        }
        return count;
    }

    /** Сортируем массив пузырьковой сортировкой. */

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /** Получаем массив с уникальными числами последовательности. */

    public static int[] getArrayUnique(int[] array, int length) {
        int[] arrayUnique = new int[length];
        for (int i = 0; i < length; i++) {
            arrayUnique[i] = array[i];
        }
        return arrayUnique;
    }

    /** Получаем 2-мерный массив с уникальными числами и количеством их повторений. */

    public static int[][] getArrayRep(int[] arrayUnique, int[] array, int uniqueLength) {
        int[][] arrayRep = new int[2][uniqueLength];
        for (int i = 0; i < arrayUnique.length; i++) {
            arrayRep[0][i] = arrayUnique[i];
            int count = 0;
            for (int j : array) {
                if (arrayUnique[i] == j) {
                    arrayRep[1][i] = ++count;
                }
            }
        }
        return arrayRep;
    }

    /** Получаем максимальное число повторений уникальных чисел. */

    public static int getMaxNumRep(int[][] array) {
        int maxNumRep = array[1][0];
        for (int i = 1; i < array[1].length; i++) {
            if (array[1][i] > maxNumRep) {
                maxNumRep = array[1][i];
            }
        }
        return maxNumRep;
    }

    /** Ищем наиболее часто повторяющиеся числа и определяем наименьшее из них. */

    public static void findNumberRep(int[][] array) {
        int minNum = 0;
        int maxNumRep = getMaxNumRep(array);
        int countIdenticalRep = 0;
        int countMaxNumRep = 0;
        for (int i = 1; i < array[1].length; i++) {
            if (array[1][i] != array[1][i - 1]) {
                countIdenticalRep++;
            }
        }
        if (countIdenticalRep == 0) {
            System.out.println("Все элементы встречаются одинаковое количество раз!");
        } else {
            for (int i = 0; i < array[1].length; i++) {
                if (array[1][i] == maxNumRep) {
                    countMaxNumRep++;
                    System.out.println("Число " + array[0][i] + " встречается " + maxNumRep + " раз!");
                }
            }
        }
        if (countMaxNumRep > 1) {
            for (int i = 0; i < array[1].length; i++) {
                if (array[1][i] == maxNumRep) {
                    minNum = array[0][i];
                    break;
                }
            }
            System.out.println("Наименьшее число: " + minNum);
        }
    }
}
