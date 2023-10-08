package by.javaonline.parteone.loop;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        String str;
        char ch;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите символ: ");
        str = scan.next();
        ch = str.charAt(0);
        num = ch;
        System.out.println("Численное обозначение символа: " + num);
        scan.close();
    }
}
