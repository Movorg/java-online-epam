package by.javaonline.partethree.stringarray;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        String target = "  ", replacement = " ";
        System.out.print("Введите исходный текст: ");
        text = scan.nextLine();
        char[] textChar = text.toCharArray();
        char[] targetChar = target.toCharArray();
        char[] replacementChar = replacement.toCharArray();
        char[] result = replace(textChar, targetChar, replacementChar);
        trim(result);
        scan.close();
    }

    /**
     * Используем методы из второй задачи. Находим и заменяем два пробела одним до тех пор,
     * пока метод indexOf не вернет пустой массив. Метод result вернет текст, в котором
     * разделителем будет один пробел.
     */

    public static char[] replace(char[] textChar, char[] targetChar, char[] replacementChar) {
        int[] indexes = TaskTwo.indexOf(textChar, targetChar);
        char[] result = TaskTwo.result(indexes, textChar, targetChar, replacementChar);
        while (indexes.length != 0) {
            indexes = TaskTwo.indexOf(result, targetChar);
            result = TaskTwo.result(indexes, result, targetChar, replacementChar);
        }
        return result;
    }

    public static void trim(char[] textChar) {
        if (textChar[0] == ' ' & textChar[textChar.length - 1] == ' ') {
            textChar = Arrays.copyOfRange(textChar, 1, textChar.length - 1);
        } else if (textChar[0] == ' ') {
            textChar = Arrays.copyOfRange(textChar, 1, textChar.length);
        } else if (textChar[textChar.length - 1] == ' ') {
            textChar = Arrays.copyOfRange(textChar, 0, textChar.length - 1);
        }
        System.out.println(textChar);
    }
}
