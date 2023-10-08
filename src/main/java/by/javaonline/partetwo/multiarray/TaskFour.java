package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы 'n': ");
        n = scan.nextInt();
        int[][] array = new int[n][n];
        fillArr(array, n);
        printArr(array, n);
        scan.close();
    }

    public static void printArr(int[][] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void fillArr(int[][] array, int n) {
        for (int i = 0; i < n; i += 2) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                array[i][j] = count++;
            }
        }
        for (int i = 1; i < n; i += 2) {
            int count = n;
            for (int j = 0; j < n; j++) {
                array[i][j] = count--;
            }
        }
    }
}
