package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение стороны 'а': ");
        a = scan.nextDouble();
        getHexagonArea(a);
        scan.close();
    }

    public static double getTriangleArea(double a) {
        double area;
        area = a * a * Math.sqrt(3) / 4;
        return area;
    }

    public static void getHexagonArea(double a) {
        double area;
        area = getTriangleArea(a) * 6;
        System.out.print("Площадь шестиугольника: ");
        System.out.printf("%.3f", area);
    }
}
