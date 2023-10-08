package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

import static java.lang.Math.pow;

public class TaskSixteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, max, sum;
        System.out.print("Введите количество знаков числа (разрядность) [2, 9]: ");
        n = scan.nextInt();
        max = getMaxNumber(n);
        System.out.print("Числа: ");
        sum = checkNumbers(n, max);                              //выводим числа и получаем сумму
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Количество четных цифр в сумме чисел: " + getQuantityEvenNumbers(sum));
        scan.close();
    }

    public static int getQuantityEvenNumbers(int sum) {
        int count = 0;
        int remainder;
        while (sum > 0) {
            remainder = sum % 10;
            if (remainder % 2 == 0) {
                count++;
            }
            sum /= 10;
        }
        return count;
    }

    public static int checkNumbers(int n, int max) {
        int[] tempArray;
        int sum = 0;
        int remainder;
        int start = (int) pow(10, n - 1);
        for (int i = start; i < max; i++) {
            tempArray = getArray(i, getLength(i));
            for (int j = 0; j < tempArray.length; j++) {
                remainder = tempArray[j] % 2;
                if (remainder == 0) {
                    break;
                }
                if (remainder != 0 & j == tempArray.length - 1) {
                    System.out.print(i + ", ");
                    sum += i;
                }
            }
        }
        System.out.println();
        return sum;
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

    public static int getMaxNumber(int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max += 9 * Math.pow(10, i); // максимальное число указанной разрядости
        }
        return max;
    }
}
