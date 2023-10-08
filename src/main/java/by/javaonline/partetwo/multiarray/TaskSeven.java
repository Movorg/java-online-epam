package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskSeven {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы 'n': ");
        n = scan.nextInt();
        double[][] array = new double[n][n];
        System.out.println("Результат: ");
        fillArr(array, n);
        printArr(array, n);
        scan.close();
    }

    public static void printArr(double[][] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%7.2f", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void fillArr(double[][] array, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sin((i * i - j * j) / n);
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество положительных элементов - " + count);
    }
}
