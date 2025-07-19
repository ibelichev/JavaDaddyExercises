package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticException;

import java.util.Scanner;

public class DevisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: себя на ноль подели");
        }
    }
}