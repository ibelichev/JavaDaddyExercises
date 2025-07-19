package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> boxString = new Box<String>();
        boxString.setFirst("asd");
        System.out.println(boxString.getFirst());

        Box<Box<String>> boxInteger = new Box<Box<String>>();
        boxInteger.setFirst(boxString);
        System.out.println(boxInteger.getFirst().getFirst());

    }
}