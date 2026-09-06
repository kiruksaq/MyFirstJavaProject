import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущую температуру печи:");
        int currentTemp = scanner.nextInt();   // ← теперь это число

        System.out.println("Введите желаемую температуру печи:");
        int targetTemp = scanner.nextInt();    // ← теперь это число

        if (currentTemp < targetTemp) {
            System.out.println("Догреваем до нужной температуры.");
        } else if (currentTemp > targetTemp) {
            System.out.println("Остужаем печь.");
        } else {
            System.out.println("Температура идеальна.");
        }

        scanner.close();
    }
}