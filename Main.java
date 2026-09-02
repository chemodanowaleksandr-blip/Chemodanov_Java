import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // 1. Работа с целыми числами (a и b)
        // ==========================================
        System.out.println("=== Задание 1 ===");
        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();
        
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Сравнение чисел
        if (a > b) {
            System.out.println("Результат сравнения: a > b");
        } else if (a < b) {
            System.out.println("Результат сравнения: a < b");
        } else {
            System.out.println("Результат сравнения: a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        
        // Валидация деления на ноль
        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Деление: " + a + " / " + b + " = " + division);
        } else {
            System.out.println("Деление: Ошибка! На ноль делить нельзя.");
        }
        System.out.println();

        // ==========================================
        // 2. Сравнение строк (a и b)
        // ==========================================
        System.out.println("=== Задание 2 ===");
        System.out.print("Введите первую строку (a): ");
        String strA = scanner.nextLine();
        
        System.out.print("Введите вторую строку (b): ");
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        System.out.println();

        // ==========================================
        // 3. Вывод четных чисел из массива
        // ==========================================
        System.out.println("=== Задание 3 ===");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные числа из массива: ");
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
        
        scanner.close();
    }
}
