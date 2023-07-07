package HomeWork2;
// Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите дробное число: ");
            String input = scanner.next();
            String floatNumberPattern = "-?\\d+(\\.\\d+)?";

            while (!input.matches(floatNumberPattern)) {
                input = scanner.next();
            }
            System.out.println("Введенное число: " + input);
        }
    }
}
