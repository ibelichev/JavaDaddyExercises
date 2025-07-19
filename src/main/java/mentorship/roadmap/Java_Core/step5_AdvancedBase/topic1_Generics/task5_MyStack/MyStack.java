package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T el) {
        stack.add(el);
    }

    public T pop() {
        stack.remove(stack.remove(stack.size() - 1));
        return stack.get(stack.size() - 1);
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() > 0 ? false : true;
    }

    public MyStack() {
    }
}