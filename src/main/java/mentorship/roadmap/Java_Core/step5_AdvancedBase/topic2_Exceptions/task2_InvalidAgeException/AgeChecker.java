package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task2_InvalidAgeException;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        System.out.println("Введите возраст ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("Возраст введен корректно");
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }

    private static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150)
            throw new InvalidAgeException(
                    "Возраст не может быть меньше 0 и больше 150. Введенный: ",
                    age
            );
    }
}