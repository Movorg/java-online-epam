package by.javaonline.partethree.stringarray;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите исходный текст: ");
        String text = scan.nextLine();
        char[] textChar = text.toCharArray();
        int result = getNumberOfDigits(textChar);
        System.out.println("Количество цифр в строке: " + result);
        scan.close();
    }

    public static int getNumberOfDigits(char[] textChar) {
        int count = 0;
        for (char i : textChar) {
            if (i >= '0' & i <= '9') {
                count++;
            }
        }
        return count;
    }
}
