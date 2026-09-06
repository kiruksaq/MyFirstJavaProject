import java.util.Scanner;

public class BakingControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите температуру (или 'exit' для выхода):");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            try {
                int currentTemp = Integer.parseInt(input);
                System.out.println("Введите желаемую температуру:");
                int targetTemp = Integer.parseInt(scanner.nextLine());

                if (currentTemp < targetTemp) {
                    System.out.println("Нагреваем...");
                } else if (currentTemp > targetTemp) {
                    System.out.println("Остужаем...");
                } else {
                    System.out.println("Идеально!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число или 'exit'.");
            }
        }
        scanner.close();
    }
}