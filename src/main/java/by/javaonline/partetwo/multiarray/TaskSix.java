package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы 'n' (четное число): ");
        n = scan.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Результат: ");
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
        int count = n - 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j <= count; j++) {
                array[i][j] = 1;
            }
            count--;
        }
        count = 0;
        for (int i = n - 1; i >= n / 2; i--) {
            for (int j = count; j <= i; j++) {
                array[i][j] = 1;
            }
            count++;
        }
    }
}
