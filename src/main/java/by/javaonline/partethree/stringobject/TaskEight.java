package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scan.nextLine();
        System.out.print("Самое длинное слово: " + getLongestWord(text));
        scan.close();
    }

    public static String getLongestWord(String text) {
        String[] words = text.split(" ");
        int max = 0, index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                index = i;
            }
        }
        return words[index];
    }
}
