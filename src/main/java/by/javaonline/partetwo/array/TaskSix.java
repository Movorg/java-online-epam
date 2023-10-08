package by.javaonline.partetwo.array;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class TaskSix {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива 'N': ");
        n = scan.nextInt();
        int[] array = new int[n];
        for (int m = 0; m < array.length; m++) {
            int min = -20;
            int max = 20;
            array[m] = min + (int) (random() * ((max - min) + 1));
        }
        System.out.println("Сгенерированные числа: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int count = 0;
            int index = i + 1;
            if (index == 2) {
                System.out.println("Порядковый номер: " + index + ": " + array[i]);
                sum += array[i];
                continue;
            }
            for (int k = 2; k <= (int) (sqrt(index) + 1); k++) {
                if (index % k == 0) {
                    count = 0;
                    break;
                } else {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Порядковый номер: " + index + ": " + array[i]);
                sum += array[i];
            }
        }
        System.out.print("Сумма: " + sum);
        scan.close();
    }
}
