package by.javaonline.partethree.stringobject;

public class TaskFour {
    public static void main(String[] args) {
        String text = "информатика";
        String result = text.substring(7, 8);
        result =  result.concat(text.substring(3, 5)).concat(result);
        System.out.println(result);
    }
}
