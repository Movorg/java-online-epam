package by.javaonline.parteone.loop;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskFive {
    public static void main(String[] args) {
        double e;
        double sum = 0;
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 'e': ");
        e = scan.nextDouble();
        for (int n = 0; n <= 50; n++) {
            a = 1 / pow(2, n) + 1 / pow(3, n);
            if (abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
