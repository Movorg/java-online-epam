package by.javaonline.partetwo.decomposition;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskFour {
    public static void main(String[] args) {
        int[][] array = {{1, 1}, {1, 9}, {1, -7}, {16, 1}};
        checkDistanceAllPoints(array);
    }

    public static double distancePoints(int x1, int x2, int y1, int y2) {
        double distance;
        distance = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        return distance;
    }

    public static void checkDistanceAllPoints(int[][] array) {
        int x1, x2;
        int y1, y2;
        double distance;
        double max = -1;
        int[][] result = new int[2][2];
        for (int i = 0; i < array.length - 1; i++) {
            x1 = array[i][0];
            y1 = array[i][1];
            for (int k = i + 1; k < array.length; k++) {
                x2 = array[k][0];
                y2 = array[k][1];
                distance = distancePoints(x1, x2, y1, y2);
                if (distance > max) {
                    max = distance;
                    result[0] = array[i];
                    result[1] = array[k];
                }
            }
        }
        System.out.println("Самые удаленные точки: " + Arrays.deepToString(result));
        System.out.print("Расстояние между точками: ");
        System.out.printf("%.3f", max);
    }
}
