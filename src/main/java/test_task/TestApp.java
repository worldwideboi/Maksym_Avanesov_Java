package test_task;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        if (digit > 7) {
            System.out.println("Привет");
        }

        String name = scanner.next();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        String input = scanner.nextLine();
        input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            int num = Integer.parseInt(element);
            if (num % 3 == 0) {
                System.out.println(num);
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