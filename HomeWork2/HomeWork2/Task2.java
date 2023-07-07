package HomeWork2;

// Задание 2. Если необходимо, исправьте данный код 

public class Task2 {
    public static void main(String[] args) {
        // Было
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

        // Стало
        int[] intArray = {1, 2, 3, 5, 4, 6, 8, 1, 6};
        int d = 2;
        if (d == 0) {
            throw new RuntimeException("Делить на 0 нельзя!");
        }
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}