package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scan.nextLine();
        getNumberOfLetters(text);
        scan.close();
    }

    public static void getNumberOfLetters(String text) {
        int countUpper = 0, countLower = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                countUpper++;
            } else if (Character.isLowerCase(ch)) {
                countLower++;
            }
        }
        System.out.println("Количество строчных букв: " + countLower);
        System.out.println("Количество прописных букв: " + countUpper);
    }
}
