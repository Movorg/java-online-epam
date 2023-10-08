package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskThree {
    public static void main(String[] args) {
        int m;
        int n;
        int k;
        int p;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк 'm': ");
        m = scan.nextInt();
        System.out.print("Введите количество столбцов 'n': ");
        n = scan.nextInt();
        System.out.println("Сгенерированная матрица: ");
        int[][] array = getRandomArr(m, n);
        printArr(array, m, n);
        System.out.print("Введите номер строки 'k' для вывода (начиная с 1): ");
        k = scan.nextInt();
        System.out.print("Введите номер столбца 'p' для вывода (начиная с 1): ");
        p = scan.nextInt();
        printStringArr(array, m, n, k);
        printColumnArr(array, n, p);
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

    public static void printStringArr(int[][] array, int m, int n, int k) {
        if (k > m) {
            System.out.println("В массиве нет строки с таким номером!");
        } else {
            System.out.print("Строка " + k + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[k - 1][i] + "  ");
            }
            System.out.println();
        }
    }

    public static void printColumnArr(int[][] array, int n, int p) {
        if (p > n) {
            System.out.println("В матрице нет столбца с таким номером!");
        } else {
            System.out.println("Столбец " + p + ": ");
            for (int i = 0; i < n; i++) {
                System.out.println(array[i][p - 1]);
            }
        }
    }
}
