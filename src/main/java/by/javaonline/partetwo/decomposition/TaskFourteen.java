package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

public class TaskFourteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;
        System.out.print("Введите значение конца диапазона 'k': ");
        k = scan.nextInt();
        System.out.println("Числа Армстронга в диапазоне [1, " + k + "]:");
        calcArmstrongNumber(k);
        scan.close();
    }

    public static int[] getArray(int number, int length) {
        int digit;
        int[] array = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digit = number % 10;
            array[i] = digit;
            number = number / 10;
        }
        return array;
    }

    public static int getLength(int number) {
        int length = 0;
        while (number > 0) {
            number /= 10;
            length++;
        }
        return length;
    }

    public static void calcArmstrongNumber(int k){
        int exponent;
        int sum;
        int[] tempArray;
        for (int i = 1; i <= k; i++) {
            sum = 0;
            exponent = getLength(i);
            tempArray = getArray(i, exponent);                //exponent = length
            for (int j = 0; j < tempArray.length; j++) {
                sum += Math.pow(tempArray[j], exponent);
                if (sum > i & j != tempArray.length - 1) {    //выходим из цикла, если сумма уже превышает число,
                    break;                                    //а текущий индекс еще не является последним
                }
            }
            if (sum == i) {
                System.out.print(i + ", ");
            }
        }
    }
}
