package by.javaonline.partetwo.decomposition;

public class TaskSeven {
    public static void main(String[] args) {
        System.out.print("Сумма факториалов нечетных чисел от 1 до 9: ");
        getSumFactorial();
    }

    public static void getSumFactorial() {
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += getFactorial(i);
        }
        System.out.println(sum);
    }

    public static int getFactorial(int number) {
        if (number == 0) {
            return 1;
        } else if (number != 0) {
            number *= getFactorial(number  - 1);
        }
        return number;
    }
}
