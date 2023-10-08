package by.javaonline.partetwo.decomposition;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class TaskFive {
    public static void main(String[] args) {
        int length;
        int[] array;
        int secondHighest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность последовательност случ. числе: ");
        length = scan.nextInt();
        array = new int[length];
        getRandomSequence(array);
        System.out.println("Последовательность случ. чисел: " + Arrays.toString(array));
        secondHighest = secondHighest(array);
        System.out.println("Второе по величине чило в последовательности: " + secondHighest);
        scan.close();
    }

    static int secondHighest(int[] array) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                if (num == high1) {
                    continue;
                }
                high2 = num;
            }
        }
        return high2;
    }

    public static void getRandomSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = -20;
            int max = 20;
            array[i] = min + (int) (random() * ((max - min) + 1));
        }
    }
}
