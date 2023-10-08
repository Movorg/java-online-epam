package by.javaonline.parteone.branche;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 'a': ");
        a = scan.nextDouble();
        System.out.print("Введите число 'b': ");
        b = scan.nextDouble();
        System.out.print("Введите число 'c': ");
        c = scan.nextDouble();
        System.out.print("Введите число 'd': ");
        d = scan.nextDouble();
        System.out.println("Max = " + max(min(a, b), min(c, d)));
    }

    public static double min(double one, double two) {
        if (one < two) {
            return one;
        } else {
            return two;
        }
    }

    public static double max(double one, double two) {
        if (one > two) {
            return one;
        }
        else {
            return two;
        }
    }
}
