package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(List.of(new String[]{"Apple", "Banana", "Orange", "Apple"}));
        for (String fruit : hashSet) System.out.println(fruit);
    }
}