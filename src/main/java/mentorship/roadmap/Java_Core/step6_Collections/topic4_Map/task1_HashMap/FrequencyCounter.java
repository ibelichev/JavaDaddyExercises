package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task1_HashMap;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String, Integer> count = new HashMap<>();

        for (String i : arr) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        System.out.println(count);

    }
}