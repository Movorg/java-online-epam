package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskThirteen {
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
        sortArr(array, m, n, 1); // Key 1: Сортировка от мин. до макс.
        sortArr(array, m, n, 2); // Key 2: Сортировка от макс. до мин.
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

    public static void sortArr(int[][] array, int m, int n, int key) {
        int[] tempArr = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempArr[j] = array[j][i];
            }
            if (key == 1) {
                selectionSortMinToMax(tempArr, m);
            } else if (key == 2) {
                selectionSortMaxToMin(tempArr, m);
            }
            for (int k = 0; k < m; k++) {
                array[k][i] = tempArr[k];
            }
        }
        if (key == 1) {
            System.out.println("Отсортированная по столбцам матрица (от мин. до макс.):");
        } else if (key == 2) {
            System.out.println("Отсортированная по столбцам матрица (от макс. до мин.):");
        }
        printArr(array, m , n);
    }
}
