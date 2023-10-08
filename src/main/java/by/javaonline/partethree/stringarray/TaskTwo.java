package by.javaonline.partethree.stringarray;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text, target, replacement;
        System.out.print("Введите исходный текст: ");
        text = scan.nextLine();
        System.out.print("Введите заменяемое слово или символ: ");
        target = scan.nextLine();
        System.out.print("Заменить на: ");
        replacement = scan.nextLine();
        char[] textChar = text.toCharArray(), targetChar = target.toCharArray(),
                replacementChar = replacement.toCharArray();
        int[] indexes = indexOf(textChar, targetChar);
        char[] result = result(indexes, textChar, targetChar, replacementChar);
        System.out.println("Результат: " + new String(result));
        scan.close();
    }

    /** Определяем индексы вхождения заменяемых слов */

    public static int[] indexOf(char[] textChar, char[] targetChar) {
        int[] indexes = new int[textChar.length / targetChar.length];
        int lastIndex = textChar.length - targetChar.length;
        int index = 0, count = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if (textChar[i] == targetChar[0]) {
                for (int j = i, k = 0; k < targetChar.length; j++, k++) {
                    if (textChar[j] != targetChar[k]) {
                        i = j;
                        break;
                    }
                    if (k == targetChar.length - 1) {
                        count++;
                        indexes[index++] = i;
                        i += targetChar.length - 1;
                    }
                }
            }
        }
        indexes = Arrays.copyOf(indexes, count);
        return indexes;
    }

    /** Производим замену с учетом сдвига индексов */

    public static char[] result(int[] indexes, char[] textChar, char[] targetChar, char[] replacementChar) {
        int difference = replacementChar.length - targetChar.length;
        char[] result = new char[textChar.length + difference * indexes.length];
        int shift = 0;
        for (int i = 0, j = 0; i < textChar.length; i++) {
            result[i + shift] = textChar[i];
            if (j < indexes.length && i == indexes[j]) {
                System.arraycopy(replacementChar, 0, result, i + shift, replacementChar.length);
                i += targetChar.length - 1;
                j++;
                shift += difference;
            }
        }
        return result;
    }
}
