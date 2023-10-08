package by.javaonline.partetwo.sortarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        int[] numerators;
        int[] denominators;
        int genDenominator;
        Scanner scan = new Scanner(System.in);
        int length;
        System.out.print("Введите кол-во дробей: ");
        length = scan.nextInt();
        numerators = getRandomSequence(length);
        denominators = getRandomSequence(length);
        genDenominator = getGeneralDenominator(denominators);
        System.out.println("Сгенерированные дроби:");
        printFractionalNumbers(numerators, denominators, length);
        System.out.println("Общий знаменатель: " + genDenominator + "\n");
        System.out.println("Результат приведения к общему знаменателю:");
        castingFractionalNumbers(numerators, denominators, genDenominator, length);
        System.out.println("Результат с сортировкой (по возрастанию):");
        sortFractionalNumbers(numerators, denominators, length);
        scan.close();
    }

    public static int[] getRandomSequence(int length) {
        Random random = new Random();
        int value = 9;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(value) + 1;
        }
        return array;
    }

    public static void printFractionalNumbers(int[] numerators, int[] denominators, int length) {
        for (int i = 0; i < length; i++) {
            System.out.printf("%6d", numerators[i]);
        }
        System.out.println();
        System.out.print("  ----,");
        for (int j = 0; j < length - 1; j++) {
            System.out.print(" ----,");
        }
        System.out.println();
        for (int k = 0; k < length; k++) {
            System.out.printf("%6d", denominators[k]);
        }
        System.out.println("\n");
    }

    /** Получаем НОК */
    public static int getLCM(int a, int b) {
        return a / getGCD(a, b) * b;
    }

    /** Получаем НОД (алгоритм Евклида) */
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (getGCD(b, a % b));
        }
    }

    public static int getGeneralDenominator(int[] denominators) {
        int lcm = getLCM(denominators[0], denominators[1]);
        for (int i = 2; i < denominators.length; i++) {
            lcm = getLCM(lcm, denominators[i]);
        }
        return lcm;
    }

    /** Приводим дроби к общему знаменателю */
    public static void castingFractionalNumbers(int[] numerators, int[] denominators, int genDenominator, int length) {
        for (int i = 0; i < length; i++) {
            numerators[i] = genDenominator / denominators[i] * numerators[i];
        }
        Arrays.fill(denominators, genDenominator);
        printFractionalNumbers(numerators, denominators, length);
    }

    public static void sortFractionalNumbers(int[] numerators, int[] denominators, int length) {
        TaskSix.shellSort(numerators);                                //используем сортировку Шелла из задачи №6
        printFractionalNumbers(numerators, denominators, length);
    }
}
