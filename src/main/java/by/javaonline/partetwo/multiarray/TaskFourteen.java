package by.javaonline.partetwo.multiarray;

import java.util.Random;

import static java.lang.Math.random;

public class TaskFourteen {
    public static void main(String[] args) {
        int n = getRandomNum(1, 10);
        int m = getRandomNum(n, 15);
        int[][] array = fillArrZero(m, n);
        fillArr(array, m, n);
        System.out.println("Сгенерированная матрица: ");
        printArr(array, m, n);
    }

    public static int[][] fillArrZero(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }

    /** Резервуарная выборка */

    public static int[] getReservoirSample(int n, int k) {
        Random r = new Random();
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = i;
        }

        for (int i = k; i < n; i++) {
            int j = r.nextInt(i + 1);
            if (j < k) {
                result[j] = i + 1;
            }
        }
        return result;
    }

    public static void fillArr(int[][] array, int m, int n) {
        int j;
        for (int i = 0; i < n; i++) {
            int[] sample = getReservoirSample(m - 1, i + 1);
            for (int k = 0; k <= i; k++) {
                j = sample[k];
                array[j][i] = 1;
            }
        }
    }

    public static int getRandomNum(int min, int max) {
        int randomNum;
        randomNum = min + (int) (random() * ((max - min) + 1));
        return randomNum;
    }

    public static void printArr(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
