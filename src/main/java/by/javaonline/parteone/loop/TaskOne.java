package by.javaonline.parteone.loop;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        long x;
        long result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        x = scan.nextInt();
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        System.out.println("Результат: " + result);
        scan.close();
    }
}
