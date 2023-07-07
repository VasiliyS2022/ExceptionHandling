package HomeWork2;

// Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя!!!

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите слово: ");
            String word = scanner.nextLine();

            if(word.isEmpty()){
                throw new RuntimeException("Вы ввели пустую строку, введите текст!");
            }
        }

    }
}