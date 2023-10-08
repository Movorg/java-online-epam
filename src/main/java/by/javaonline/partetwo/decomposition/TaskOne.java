package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int a, b;
        int gcd, lcm;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = scan.nextInt();
        System.out.print("Введите второе число: ");
        b = scan.nextInt();
        gcd = getGCD(a, b);
        lcm = getLCM(a, b);
        System.out.println("НОД: " + gcd);
        System.out.println("НОК: " + lcm);
        scan.close();
    }

    public static int getLCM(int a, int b) {
        return a / getGCD(a, b) * b;
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (getGCD(b, a % b));
        }
    }
}
