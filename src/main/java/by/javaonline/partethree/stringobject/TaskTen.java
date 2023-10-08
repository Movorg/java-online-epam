package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scan.nextLine();
        getNumberOfSentences(text);
        scan.close();
    }

    public static void getNumberOfSentences(String text) {
        String[] sentences = text.split("[.!?]");
        System.out.println("Количество предложений: " + sentences.length);
    }
}
