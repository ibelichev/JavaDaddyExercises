package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task1_Pair.mySolution;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(1, "sdf");

        System.out.println("old first of pair: " + pair.getFirst());
        pair.setFirst(2025);

        System.out.println(pair.toString());
    }
}