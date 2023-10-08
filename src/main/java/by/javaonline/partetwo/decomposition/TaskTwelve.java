package by.javaonline.partetwo.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k;
        System.out.print("Введите число 'K': ");
        k = scan.nextInt();
        System.out.print("Введите число 'N': ");
        n = scan.nextInt();
        getResultArray(k, n);
        scan.close();
    }

    private static int sumDigits(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    public static void getResultArray(int number, int n) {
        int[] result = new int[20];
        for (int i = 0, j = 0; i <= n; i++) {
            if (sumDigits(i) == number) {
                if (j == result.length - 1) {
                    result = increaseArray(result);
                }
                result[j] = i;
                j++;
            }
        }
        System.out.println("Готово!");
        if (result[0] == 0) {
            System.out.println("Нет чисел, соответствующих условию!");
        } else {
            result = decreaseArray(result);
            System.out.println(Arrays.toString(result));
        }
    }

    public static int[] increaseArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static int[] decreaseArray(int[] array) {
        int[] newArray;
        int length = array.length;
        while (array[length - 1] == 0) {
            length--;
        }
        newArray = new int[length];
        System.arraycopy(array, 0, newArray, 0, length);
        return newArray;
    }
}

