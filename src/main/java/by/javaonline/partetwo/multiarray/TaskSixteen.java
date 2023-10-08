package by.javaonline.partetwo.multiarray;

import java.util.TreeSet;

public class TaskSixteen {
    public static void main(String[] args) {
        TreeSet<Integer> set11 = new TreeSet<>();

        for (int i = 1; i <= 9; i++) {
            set11.add(i);
        }

        int x11, x12, x13;
        int x21, x22, x23;
        int x31, x32, x33;

        int count = 1;

        for (Integer value1 : set11) {
            x11 = value1;

            TreeSet<Integer> set12 = new TreeSet<>();
            set12.addAll(set11);
            set12.remove(x11);

            for (Integer value2 : set12) {
                x12 = value2;

                x13 = 15 - x11 - x12; // 15 - магическая константа
                if (x13 < 1 || x13 > 9) continue;
                if (x13 == x11 || x13 == x12) continue;

                TreeSet<Integer> set21 = new TreeSet<>();
                set21.addAll(set12);
                set21.remove(x12);

                for (Integer value3 : set21) {
                    x21 = value3;

                    TreeSet<Integer> set22 = new TreeSet<>();
                    set22.addAll(set21);
                    set22.remove(x21);

                    for (Integer value4 : set22) {
                        x22 = value4;

                        x23 = 15 - x21 - x22;
                        if (x23 < 1 || x23 > 9) continue;
                        if (x23 == x11 || x23 == x12 || x23 == x13 || x23 == x21 || x23 == x22) continue;

                        x31 = 15 - x11 - x21;
                        x32 = 15 - x12 - x22;
                        x33 = 15 - x13 - x23;
                        if (x31 < 1 || x31 > 9 || x32 < 1 || x32 > 9 || x33 < 1 || x33 > 9) continue;
                        if (x31 == x11 || x31 == x12 || x31 == x13 || x31 == x21 || x31 == x22 || x31 == x23)
                            continue;
                        if (x32 == x11 || x32 == x12 || x32 == x13 || x32 == x21 || x32 == x22 || x32 == x23 || x32 == x31)
                            continue;
                        if (x33 == x11 || x33 == x12 || x33 == x13 || x33 == x21 || x33 == x22 || x33 == x23 || x33 == x31 || x33 == x32)
                            continue;

                        int sh1 = x11 + x12 + x13, sh2 = x21 + x22 + x23, sh3 = x31 + x32 + x33;
                        int sv1 = x11 + x21 + x31, sv2 = x12 + x22 + x32, sv3 = x13 + x23 + x33;
                        int sd1 = x11 + x22 + x33, sd2 = x13 + x22 + x31;

                        if (sh1 != 15 || sh2 != 15 || sh3 != 15 || sv1 != 15 || sv2 != 15 || sv3 != 15 || sd1 != 15 || sd2 != 15)
                            continue;

                        System.out.println("Магический квадрат №" + count);
                        int[][] result = new int[3][3];
                        result[0][0] = x11;
                        result[0][1] = x12;
                        result[0][2] = x13;
                        result[1][0] = x21;
                        result[1][1] = x22;
                        result[1][2] = x23;
                        result[2][0] = x31;
                        result[2][1] = x32;
                        result[2][2] = x33;
                        printArr(result, 3, 3);
                        count++;
                    }
                }
            }
        }
    }

    public static void printArr(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}

