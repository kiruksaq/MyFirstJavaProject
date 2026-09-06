import java.util.Scanner;

public class OvenMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите текущую температуру печи (или 'exit' для выхода):");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Программа завершена. Хорошей выпечки!");
                break;
            }

            int currentTemp;
            try {
                currentTemp = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число или 'exit'.");
                continue; // возвращаемся к началу цикла
            }

            System.out.println("Введите желаемую температуру печи:");
            int targetTemp;
            try {
                targetTemp = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
                continue;
            }

            if (currentTemp < targetTemp) {
                System.out.println("Печь подогревается.");
            } else if (currentTemp > targetTemp) {
                System.out.println("Печь остывает.");
            } else {
                System.out.println("Температура идеальна.");
            }

            System.out.println(); // пустая строка для разделения циклов
        }

        scanner.close();
    }
}