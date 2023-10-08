package by.javaonline.parteone.linearprogram;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskFive {
    public static void main(String[] args) {
        double sec;
        double min;
        double hr;
        double remainder;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите исходное количество секунд: ");
        sec = scan.nextDouble();
        hr = floor(sec / 3600);
        min = floor((sec / 3600 - hr) * 60);
        remainder = sec - hr * 3600 - min * 60;
        scan.close();
        System.out.print("Результат: " + (int) hr + "ч " + (int) min + "мин " + (int) remainder + "с");
    }
}
