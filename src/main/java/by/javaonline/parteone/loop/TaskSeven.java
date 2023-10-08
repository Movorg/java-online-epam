package by.javaonline.parteone.loop;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите нижнюю границу 'm' больше единицы: ");
        m = scan.nextInt();
        System.out.print("Введите верхнюю границу 'n': ");
        n = scan.nextInt();
        for (int i = m; i <= n; i++) {
            int count = 0;
            System.out.print("Делители числа " + i + ": ");
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    count++;
                    System.out.print(k + ", ");
                }
            }
            if (count == 0) {
                System.out.print("Простое число!");
            }
            System.out.println();
        }
        scan.close();
    }
}
