package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scan.nextLine();
        String character = "a";
        System.out.println(getNumberOfCharacters(text, character));
        scan.close();
    }

    public static int getNumberOfCharacters(String text, String character) {
        int count = 0;
        int index;
        while ((index = text.indexOf(character)) != -1 && index < text.length()) {
            count++;
            text = text.substring(index + 1);
        }
        return count;
    }
}