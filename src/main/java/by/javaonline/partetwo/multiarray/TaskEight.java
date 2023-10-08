package by.javaonline.partetwo.multiarray;

import java.util.Scanner;

import static java.lang.Math.random;

public class TaskEight {
    public static void main(String[] args) {
        int m;
        int n;
        int columnOne;
        int columnTwo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк 'm': ");
        m = scan.nextInt();
        System.out.print("Введите количество столбцов 'n': ");
        n = scan.nextInt();
        int[][] array = getRandomArr(m, n);
        System.out.println("Сгенерированная матрица: ");
        printArr(array, m, n);
        System.out.print("Введите номер перевого заменяемого столбца: ");
        columnOne = scan.nextInt();
        System.out.print("Введите номер второго заменяемого столбца: ");
        columnTwo = scan.nextInt();
        replaceColumnArr(array, m, columnOne, columnTwo);
        System.out.println("Результат замены: ");
        printArr(array, m, n);
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

    public static void replaceColumnArr(int[][] array, int m, int columnOne, int columnTwo) {
        int temp;
        for (int i = 0; i < m; i++) {
            temp =  array[i][columnOne - 1];
            array[i][columnOne - 1] = array[i][columnTwo - 1];
            array[i][columnTwo - 1] = temp;
        }
    }
}
