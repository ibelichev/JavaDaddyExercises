package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task2_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 72);
        students.put("Charlie", 90);
        students.put("Diana",68);

        int passMark = 75;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            if (student.getValue() > passMark) System.out.println(student.getKey());
        }
    }
}