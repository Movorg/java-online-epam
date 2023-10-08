package by.javaonline.partetwo.multiarray;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskNine {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк 'm': ");
        m = scan.nextInt();
        System.out.print("Введите количество столбцов 'n': ");
        n = scan.nextInt();
        int[][] array = getRandomArr(m, n);
        int[] sumArr = sumElementsColumnArr(array, m, n);
        System.out.println("Сгенерированная матрица: ");
        printArr(array, m, n);
        System.out.println("Результат: ");
        System.out.println(Arrays.toString(sumArr));
        maxSum(sumArr);
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

    public static int[] sumElementsColumnArr(int[][] array, int m, int n) {
        int[] sumArr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[j][i];
            }
            sumArr[i] = sum;
        }
        return sumArr;
    }

    public static void maxSum(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] == max) {
                System.out.println("Cумма элементов в столбце " + (j + 1) + " максимальная и равна " + max );
            }
        }
    }
}

