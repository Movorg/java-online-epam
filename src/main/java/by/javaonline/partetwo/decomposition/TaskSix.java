package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите три числа через пробел: ");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.print("Результат: ");
        checkCoprimeIntegers(numbers);
        scan.close();
    }

    public static void checkCoprimeIntegers(int[] numbers) {
        int gcd = getGCD(numbers[0], numbers[1]);
        for (int i = 2; i < numbers.length; i++) {
            gcd = getGCD(gcd, numbers[i]);
        }
        if (gcd == 1) {
            System.out.print("Введенные числа взаимно простые!");
        } else {
            System.out.print("Введенные числа не взаимно простые!");
        }
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (getGCD(b, a % b));
        }
    }
}
