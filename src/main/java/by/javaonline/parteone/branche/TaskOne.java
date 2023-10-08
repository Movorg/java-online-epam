package by.javaonline.parteone.branche;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение угла 'A' в градусах: ");
        a = scan.nextInt();
        System.out.print("Введите значение угла 'B' в градусах: ");
        b = scan.nextInt();
        if ((180 - a - b) > 0) {
            System.out.println("Прямоугольник с заданными углами существует!");
            if ((a + b) == 90) {
                System.out.println("Прямоугольник с заданными углами прямоугольный!");
            }
        } else {
            System.out.println("Не существует прямоугольника с заданными углами!");
        }
        scan.close();
    }
}
