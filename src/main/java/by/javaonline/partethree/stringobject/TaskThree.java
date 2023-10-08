package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите исходный текст: ");
        String word = scan.nextLine().toLowerCase();
        String temp = new StringBuilder(word).reverse().toString();
        if (temp.equals(word)) {
            System.out.println("Введенное слово является палиндромом!");
        } else {
            System.out.println("Введенное слово не является палиндромом!");
        }
        scan.close();
    }
}
