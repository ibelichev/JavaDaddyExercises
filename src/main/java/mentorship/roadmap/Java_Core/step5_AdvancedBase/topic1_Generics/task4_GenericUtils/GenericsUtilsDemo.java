package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task4_GenericUtils;

public class GenericsUtilsDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        double c = 3.2;
        double d = 6.5;

        System.out.println(GenericUtils.max(a, b));
        System.out.println(GenericUtils.max(c, d));
    }
}