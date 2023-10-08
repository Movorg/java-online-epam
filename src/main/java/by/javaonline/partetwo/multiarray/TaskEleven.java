package by.javaonline.partetwo.multiarray;

import static java.lang.Math.random;

public class TaskEleven {
    public static void main(String[] args) {
        int[][] array = getRandomArr(10, 20);
        printArr(array, 10, 20);
        checkArr(array, 10, 20);
    }

    public static int[][] getRandomArr(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int min = 0;
                int max = 15;
                array[i][j] = min + (int) (random() * ((max - min) + 1));
            }
        }
        return array;
    }

    public static void printArr(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void checkArr(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println("Число 5 встречается 3 раза в строке " + (i + 1));
            } else if (count > 3) {
                System.out.println("Число 5 встречается " + count + " раз в строке " + (i + 1));
            }
        }
    }
}

