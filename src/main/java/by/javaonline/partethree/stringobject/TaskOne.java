package by.javaonline.partethree.stringobject;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите исходный текст: ");
        String str = scan.nextLine();
        System.out.println("Результат: " + getMaxNumberSpace(str));
        scan.close();
    }

    public static int getMaxNumberSpace (String str) {
        int max = 0, count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }
}
