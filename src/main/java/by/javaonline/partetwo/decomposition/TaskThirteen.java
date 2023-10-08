package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskThirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Введите значение начала диапазона 'n': ");
        n = scan.nextInt();
        System.out.println("Простые числа-близнецы в диапазоне [" + n + ", " + (2 * n) + "]:");
        print(getPrimeNumberArray(fillArray(n)));
        scan.close();
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n++;
        }
        return array;
    }

    public static int[] getPrimeNumberArray(int[] array) {
        int[] primeArray = new int[array.length];
        int count = 0;
        for (int i = 0, k = 0; i < array.length; i++) {
            for (int j = 2; j <= sqrt(array[i]) + 1; j++) {
                if (array[i] % j == 0) {
                    count = 0;
                    break;
                } else {
                    count++;
                }
            }
            if (count > 0) {
                primeArray[k] = array[i];
                k++;
            }
        }
        return decreaseArray(primeArray);
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

    public static void print(int[] array) {
        int count = 1;
        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            if (array[j] - array[i] == 2) {
                System.out.print(count++ + ". ");
                System.out.println("(" + array[i] + ", " + array[j] + ")");
            }
        }
    }
}
