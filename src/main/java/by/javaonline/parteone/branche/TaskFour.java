package by.javaonline.parteone.branche;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        double x, y, z;
        double a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия:");
        System.out.print("Введите размер 'A': ");
        a = scan.nextDouble();
        System.out.print("Введите размер 'B': ");
        b = scan.nextDouble();
        System.out.println("Введите размеры кирпича:");
        System.out.print("Введите размер 'x': ");
        x = scan.nextDouble();
        System.out.print("Введите размер 'y': ");
        y = scan.nextDouble();
        System.out.print("Введите размер 'z': ");
        z = scan.nextDouble();
        if ((a >= x && b >= y)
                || (a >= y && b >= x)
                || (a >= x && b >= z)
                || (a >= z && b >= x)
                || (a >= z && b >= y)
                || (a >= y && b >= z)) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }
        scan.close();
    }
}
