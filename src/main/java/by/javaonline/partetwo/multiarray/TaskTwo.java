package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskTwo {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы 'n': ");
        n = scan.nextInt();
        System.out.println("Сгенерированная матрица: ");
        int[][] array = getRandomArr(n);
        printArr(array, n);
        printDiagonal(array, n);
        scan.close();
    }

    public static int[][] getRandomArr(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = 0;
                int max = 9;
                array[i][j] = min + (int) (random() * ((max - min) + 1));
            }
        }
        return array;
    }

    public static void printArr(int[][] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void printDiagonal(int[][] array, int n) {
        System.out.print("Первая диагональ: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][i] + "  ");
        }
        System.out.println();
        System.out.print("Вторая диагональ: ");
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i][count++] + "  ");
        }
    }
}
