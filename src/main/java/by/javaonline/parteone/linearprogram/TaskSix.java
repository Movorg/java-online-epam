package by.javaonline.parteone.linearprogram;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения 'x' и 'y':");
        System.out.print("x = ");
        x = scan.nextInt();
        System.out.print("y = ");
        y = scan.nextInt();
        if ((x <= 2 && x >= -2 && y <= 4 && y >= 0) || (x <=4 && x >= -4 && y >= -3 && y <= 0)) {
            System.out.println("True: указанная точка принадлежит области.");
        } else {
            System.out.println("False: указанная точка не принадлежит области.");
        }
        scan.close();
    }
}
