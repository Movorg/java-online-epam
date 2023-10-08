package by.javaonline.partethree.stringarray;

import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        String[] str = {"camelCaseOne", "camelCaseTwo", "camelCaseThree", "camelCaseFour"};
        System.out.print("Результат преобразования: ");
        camelToSnake(str);
    }

    public static void camelToSnake (String[] str) {
        String result;
        char ch;
        for (int i =  0; i < str.length; i++) {
            result = "";
            for (int j = 0; j < str[i].length(); j++ ) {
                ch = str[i].charAt(j);
                if (Character.isUpperCase(ch)) {
                    result += "_" + Character.toLowerCase(ch);
                } else {
                    result += ch;
                }
            }
            str[i] = result;
        }
        System.out.println(Arrays.toString(str));
    }
}
