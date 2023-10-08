package by.javaonline.parteone.linearprogram;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;
        System.out.println("Введите значения a, b, c для расчета функции:");
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();
        scan.close();
        z = (a - 3) * b / 2 + c;
        System.out.print("z = " + z);
    }

}
