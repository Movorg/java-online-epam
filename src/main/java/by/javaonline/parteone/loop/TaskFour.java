package by.javaonline.parteone.loop;

import java.math.BigInteger;

public class TaskFour {
    public static void main(String[] args) {
        BigInteger integer = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            integer = integer.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Результат: " + integer);
    }
}
