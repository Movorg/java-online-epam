package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskTwelve {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк 'm': ");
        m = scan.nextInt();
        System.out.print("Введите количество столбцов 'n': ");
        n = scan.nextInt();
        System.out.println("Сгенерированная матрица: ");
        int[][] array = getRandomArr(m, n);
        printArr(array, m, n);
        sortArr(array, m, n);
        scan.close();
    }

    public static int[][] getRandomArr(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int min = 0;
                int max = 9;
                array[i][j] = min + (int) (random() * ((max - min) + 1));
            }
        }
        return array;
    }

    public static void printArr(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void selectionSortMaxToMin(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }

    public static void selectionSortMinToMax(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void sortArr(int[][] array, int m, int n) {
        System.out.println("Отсортированная по строкам матрица (от мин. до макс.):");
        for (int i = 0; i < m; i++) {
            selectionSortMinToMax(array[i], n);
        }
        printArr(array, m, n);
        System.out.println("Отсортированный по строкам матрица (от макс. до мин.):");
        for (int i = 0; i < m; i++) {
            selectionSortMaxToMin(array[i], n);
        }
        printArr(array, m, n);
    }
}
