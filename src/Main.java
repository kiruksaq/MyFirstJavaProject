import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();

        System.out.println("Сколько тебе лет?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Привет, " + name + "! Ты уже взрослый, садись за руль!");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Привет, " + name + "! Чериез " + yearsLeft + " лет ты сможешь водить машину.");
        }

        scanner.close();
    }
}