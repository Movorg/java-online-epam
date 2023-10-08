package by.javaonline.partetwo.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        int k, m;
        int length;
        int sum;
        int[] array;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        length = scan.nextInt();
        array = getRandomArray(length);
        System.out.print("Сгенерированный массив: " + Arrays.toString(array) + "\n");
        System.out.print("Введите индекс k (не больше " + (length - 2) + "): ");
        k = scan.nextInt();
        if (k > length - 2) {
            System.out.println("Вы ввели неверный идекс!");
            System.exit(0);
        }
        m = k + 2;
        sum = sumSequence(getSequence(array, k));
        System.out.println("Сумма элементов от k = " + k + " до m = " + m + ": " + sum);
        scan.close();
    }

    public static int[] getSequence(int[] array, int k) {
        int[] sequence = new int[3];
        for (int i = k - 1, j = 0; i < k + 2; i++, j++) {
            sequence[j] = array[i];
        }
        return sequence;
    }

    public static int sumSequence(int[] sequence) {
        int sum = 0;
        for (int i : sequence) {
            sum += i;
        }
        return sum;
    }

    public static int[] getRandomArray(int length) {
        int[] array = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(20);
        }
        return array;
    }
}
