package by.javaonline.partetwo.decomposition;

import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Ввдите число: ");
        number = scan.nextInt();
        getNumberOfOperation(number);
        scan.close();
    }

    private static int sumDigits(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    public static void getNumberOfOperation(int number) {
        int count = 0, item = 1;
        while (number > 0) {
            System.out.print(item + ". " + number + " - " + sumDigits(number) + " = ");
            number -= sumDigits(number);
            System.out.println(number);
            count++;
            item++;
        }
        System.out.println("Количество действий: " + count);
    }
}
