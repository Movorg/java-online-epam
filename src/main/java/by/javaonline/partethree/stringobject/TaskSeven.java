package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        StringBuilder str = new StringBuilder(scan.nextLine().replace(" ", ""));
        System.out.println(getUniqueString(str));
        scan.close();
    }

    public static StringBuilder getUniqueString(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    str.deleteCharAt(k);
                    k = i;
                }
            }
        }
        return str;
    }
}
