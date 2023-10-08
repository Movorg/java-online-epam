package by.javaonline.parteone.loop;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите нижнюю границу 'a' отрезка: ");
        a = scan.nextDouble();
        System.out.print("Введите верхнюю границу 'b' отрезка: ");
        b = scan.nextDouble();
        System.out.print("Введите шаг для отрезка: ");
        h = scan.nextDouble();
        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                System.out.println("Значение функции при i = " + i + ": " + firstFunction(i));
            } else if (i <= 2) {
                System.out.println("Значение функции при i = " + i + ": " + secondFunction(i));
            }
            if (i + h > b) {
                System.out.println("Значение функции при i = " + b + ": " + secondFunction(b));
            }
        }
        scan.close();
    }

    public static double firstFunction(double i) {
        return i;
    }

    public static double secondFunction(double i) {
        return -i;
    }
}
