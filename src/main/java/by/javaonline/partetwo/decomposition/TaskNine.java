package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskNine {
    public static void main(String[] args) {
        double x, y, z, t, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения сторон четырехугольника:");
        System.out.print("Введите 'X': ");
        x = scan.nextDouble();
        System.out.print("Введите 'Y': ");
        y = scan.nextDouble();
        System.out.print("Введите 'Z': ");
        z = scan.nextDouble();
        System.out.print("Введите 'T': ");
        t = scan.nextDouble();
        k = sqrt(x * x + y * y);
        System.out.print("Площадь четырехугольника: ");
        getAreaOfTriangle(getAreaOfTriangle1(x, y), getAreaOfTriangle2(k, z, t));
        scan.close();
    }

    public static double getAreaOfTriangle1(double x, double y) {
        double area1;
        area1 = (x * y) / 2;
        if (area1 <= 0) {
            area1 = 0;
        }
        return area1;
    }

    public static double getAreaOfTriangle2(double k, double z, double t) {
        double p;
        double area2;
        p = (k + z + t) / 2;
        area2 = sqrt(p * (p - k) * (p - z) * (p - t));    //формула Герона
        if (Double.isNaN(area2)) {
            area2 = 0;
        }
        return area2;
    }

    public static void getAreaOfTriangle(double area1, double area2) {
        double area;
        area = area1 + area2;
        if (area2 == 0 || area1 == 0) {
            System.out.print("Не может быть вычислена!");
        } else
            System.out.printf("%.3f", area);
    }
}




