package HomeWork1;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

// Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task_1_Metod {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        String number = "123a";

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: 1, 2 или 3?");
        int choice = sc.nextInt();

        if (choice == 1) translate(number);
        if (choice == 2) division(a, b);
        if (choice == 3) file();
    }

    private static Integer translate(String number) {
        int result2 = Integer.parseInt(number);
        return result2;
    }

    private static Integer division(int a, int b) {
        int result = a / b;
        return result;
    }

    private static void file() {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}