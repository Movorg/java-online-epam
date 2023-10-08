package by.javaonline.parteone.linearprogram;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskTwo {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double radicand;
        double result;
        System.out.println("Введите значения 'a', 'b', 'c' для вычисления значения выражения:");
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        a = scan.nextDouble();
        if (a == 0) {
            System.out.println("Значение 'a' не может равняться нулю. Введите другое значение!");
            System.out.print("a = ");
            a = scan.nextDouble();
        }
        System.out.print("b = ");
        b = scan.nextDouble();
        if (b == 0) {
            System.out.println("Значение 'b' не может равняться нулю. Введите другое значение!");
            System.out.print("b = ");
            b = scan.nextDouble();
        }
        System.out.print("c = ");
        c = scan.nextDouble();
        radicand = b * b + 4 * a * c;
        if (radicand < 0) {
            System.out.println("У выражения нет действительных значений!");
            scan.close();
            return;
        }
        scan.close();
        result = (b + sqrt(radicand)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
        System.out.print("Значение выражения: " + result);
    }
}
