package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

import java.sql.SQLOutput;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> myStack= new MyStack<String>();
        System.out.println(myStack.isEmpty());
        myStack.push("assd");
        myStack.push("123");
        myStack.push("sdfs");

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }
}