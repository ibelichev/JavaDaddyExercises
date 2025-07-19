package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

import java.util.Arrays;

public class ArrauUtilsDemo {
    public static void main(String[] args) {
        String[] arr = {"123", "asd", "345"};
        System.out.println(Arrays.toString(arr));

        ArrayUtils.swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }
}