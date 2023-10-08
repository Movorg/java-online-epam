package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskOne {
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
        System.out.println("Результат: ");
        checkArr(array, m, n);
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

    public static void checkArr(int[][] array, int m, int n) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (array[0][j] > array[m - 1][j]) {
                    System.out.print(array[i][j] + "  ");
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Нет нечетных столбцов, у которых первый элемент больше последнего!");
                break;
            }
            System.out.println();
        }
    }
}

