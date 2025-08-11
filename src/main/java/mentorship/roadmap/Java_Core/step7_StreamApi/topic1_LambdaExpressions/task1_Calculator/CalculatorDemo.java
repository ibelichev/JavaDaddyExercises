package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        Calculator calculator = (c, d) -> c + d;
        System.out.println(calculator.operate(a, b));
    }
}