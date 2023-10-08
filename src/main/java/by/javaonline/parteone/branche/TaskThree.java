package by.javaonline.parteone.branche;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки 'A':");
        System.out.print("x1 = ");
        x1 = scan.nextDouble();
        System.out.print("y1 = ");
        y1 = scan.nextDouble();
        System.out.println("Введите координаты точки 'B':");
        System.out.print("x2 = ");
        x2 = scan.nextDouble();
        System.out.print("y2 = ");
        y2 = scan.nextDouble();
        System.out.println("Введите координаты точки 'C':");
        System.out.print("x3 = ");
        x3 = scan.nextDouble();
        System.out.print("y3 = ");
        y3 = scan.nextDouble();
        // Условие, при котором три точки лежат на одной прямой.
        if ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1) == 0) {
            System.out.println("Точки лежат на одной прямой!");
        } else {
            System.out.println("Точки не лежат на одной прямой!");
        }
        scan.close();
    }
}
