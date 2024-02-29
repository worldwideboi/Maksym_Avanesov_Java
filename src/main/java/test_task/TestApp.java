package test_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Введите число:");
            int digit = scanner.nextInt();

            if (digit > 7) {
                System.out.println("Привет");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите целое число.");
            scanner.nextLine();
        }

        System.out.println();

        System.out.println("Введите имя:");
        String name = scanner.next();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println();
        System.out.println("Элементы массива, кратные 3:");
        String input = scanner.nextLine();
        input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            try {

                int num = Integer.parseInt(element);
                if (num % 3 == 0) {
                    System.out.println(num);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите числовое значение.");
            }
        }
    /*
    Задание #2:

    Дана скобочная последовательность: [((())()(())]]
    Можно ли считать эту последовательность правильной?
    Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтобы она стала правильной?

    Ответ:

    Данная скобочная последовательность не является правильной, так как она содержит лишнюю
    закрывающую квадратную скобку. Поэтому, для приведенной последовательности "[((())()(())]]"
    следует удалить последний лишний символ "]" чтобы сделать её правильной.
    */
    }
}