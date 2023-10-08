package by.javaonline.parteone.loop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TaskEight {
    public static void main(String[] args) {
        long a;
        long b;
        ArrayList<Long> arrayA = new ArrayList<>();
        ArrayList<Long> arrayB = new ArrayList<>();
        TreeSet<Long> result = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 'a': ");
        a = scan.nextLong();
        System.out.print("Введите число 'b': ");
        b = scan.nextLong();
        getArray(arrayA, a);
        getArray(arrayB, b);
        for (Long aLong : arrayA) {
            for (Long bLong : arrayB) {
                if (aLong.equals(bLong)) {
                    result.add(aLong);
                }
            }
        }
        if (result.size() == 0) {
            System.out.println("Цифры в числах не повторяются!");
        } else {
            System.out.println("Повторяющиеся цфры: " + result);
        }
        scan.close();
    }

    public static void getArray(ArrayList<Long> array, long number) {
        while (number > 0) {
            array.add(number % 10);
            number /= 10;
        }
    }

}


/*
 *  Вариант кода без использования ArrayList:
 *
    public static void main(String[] args) {
        long a;
        long b;
        TreeSet<Integer> result = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 'a': ");
        a = scan.nextLong();
        System.out.print("Введите число 'b': ");
        b = scan.nextLong();
        long numB = b;
        int sizeA = numSize(a);
        int sizeB = numSize(b);

        for (int i = 1; i <= sizeB; i++) {
            long numA = a;
            int remnantB = (int) (numB % 10);
            for (int k = 1; k <= sizeA; k++) {
                int remnantA = (int) (numA % 10);
                if (remnantA == remnantB) {
                    result.add(remnantA);
                }
                numA /= 10;
            }
            numB /= 10;
        }

        if (result.size() == 0) {
            System.out.println("Цифры в числах не повторяются!");
        } else {
            System.out.println("Повторяющиеся цфры: " + result);
        }
        scan.close();
    }

    public static int numSize(long x) {
        long p = 10;
        for (int i = 1; i < 19; i++) {
            if (x < p)
                return i;
            p = 10 * p;
        }
        return 19;
    }
}
*/
