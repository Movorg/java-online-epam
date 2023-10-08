package by.javaonline.parteone.loop;

public class TaskThree {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            result += i * i;
        }
        System.out.println("Результат: " + result);
    }
}
