package by.javaonline.parteone.branche;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        double x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение 'x': ");
        x = scan.nextDouble();
        if (x <= 3) {
            System.out.println("F(x) = " + firstFunction(x));
        } else if (x > 3) {
            System.out.println("F(x) = " + secondFunction(x));
        }
        scan.close();
    }

    public static double firstFunction(double x) {
        return (x * x - 3 * x + 9);
    }

    public static double secondFunction(double x) {
        return (1 / (Math.pow(x, 3) + 6));
    }
}
