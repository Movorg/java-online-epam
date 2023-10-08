package by.javaonline.partethree.stringarray;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите исходный текст: ");
        String text = scan.nextLine();
        char[] textChar = text.toCharArray();
        int result = getNumberOfNumbers(textChar);
        System.out.println("Количество чисел в строке: " + result);
        scan.close();
    }

    public static int getNumberOfNumbers(char[] textChar) {
        int counter = 0;
        for (int i = 0; i < textChar.length; i++) {
            int count = 0;
            if (textChar[i] >= '0' & textChar[i] <= '9') {
                for (int j = i; j < textChar.length; j++) {
                    if (textChar[j] >= '0' & textChar[j] <= '9') {
                        count++;
                        if (j == textChar.length - 1) {
                            i = j;
                            break;
                        }
                    } else {
                        i = j;
                        break;
                    }
                }
            }
            if (count > 0) {
                counter++;
            }
        }
        return counter;
    }
}
