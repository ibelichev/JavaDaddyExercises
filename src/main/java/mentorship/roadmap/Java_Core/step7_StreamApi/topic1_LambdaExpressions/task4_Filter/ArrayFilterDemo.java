package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayFilterDemo {
    private static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> returnList = new ArrayList<>();

        for (T i : array) {
            if (predicate.test(i)) returnList.add(i);
        }

        return returnList;
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 12, 7, 20, 3};

//        MyPredicate<Integer> myPredicate = a -> a > 10;
        List<Integer> filteredList = filterArray(arr, a -> a > 10);

        System.out.println(filteredList);
    }
}