package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текс: ");
        StringBuilder str = new StringBuilder(scan.nextLine());
        System.out.print("Результат: " + newString(str));
        scan.close();
    }

    public static StringBuilder newString(StringBuilder str) {
        for (int i = 0; i < str.length(); i += 2) {
            str.insert(i, str.charAt(i));
        }
        return str;
    }
}
