package by.javaonline.parteone.linearprogram;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskThree {
    public static void main(String[] args) {
        double x;
        double y;
        double denominator;
        double result;
        System.out.println("Введите значения 'x' и 'y' для вычисления значения выражения:");
        Scanner scan = new Scanner(System.in);
        System.out.print("x = ");
        x = scan.nextDouble();
        System.out.print("y = ");
        y = scan.nextDouble();
        denominator = cos(x) - sin(y);
        if (denominator == 0) {
            System.out.println("Значение в знаменателе равно нулю!");
            scan.close();
            return;
        }
        scan.close();
        result = (sin(x) + cos(y))* tan(x*y)/denominator;
        System.out.print("Значение выражения: " + result);
    }
}
