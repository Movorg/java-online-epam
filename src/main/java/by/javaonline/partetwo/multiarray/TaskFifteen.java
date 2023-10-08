package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskFifteen {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк 'm': ");
        m = scan.nextInt();
        System.out.print("Введите количество столбцов 'n': ");
        n = scan.nextInt();
        int[][] array = getRandomArr(m, n);
        System.out.println("Сгенерированная матрица: ");
        printArr(array, m, n);
        System.out.println("Результат: ");
        replaceElements(array, m, n);
        scan.close();
    }

    public static int[][] getRandomArr(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int min = 0;
                int max = 20;
                array[i][j] = min + (int) (random() * ((max - min) + 1));
            }
        }
        return array;
    }

    public static void printArr(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void replaceElements(int[][] array, int m, int n) {
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент матрицы: " + max);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] % 2 > 0) {
                    array[i][j] = max;
                }
            }
        }
        printArr(array, m, n);
    }
}


