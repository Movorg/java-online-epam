package by.javaonline.parteone.linearprogram;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskFour {
    public static void main(String[] args) {
        double num;
        double first;
        double second;
        double result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите действительное число в формате 'nnn,ddd': ");
        num = scan.nextDouble();
        first = num * 1000 % 1000;
        second = floor(num) / 1000;
        scan.close();
        result = first + second;
        System.out.println("Результат преобразования: " + result);
    }
}
