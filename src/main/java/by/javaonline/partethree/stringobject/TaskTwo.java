package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите исходный текст: ");
        String str = scan.nextLine();
        str = str.replace("a", "ab");
        System.out.println(str);
        scan.close();
    }
}
