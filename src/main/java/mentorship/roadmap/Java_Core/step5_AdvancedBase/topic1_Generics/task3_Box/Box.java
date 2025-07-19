package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class Box<T> {
    private T first;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public Box() {
    }
}