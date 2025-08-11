package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonFilterDemo {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Asd", 123));
        persons.add(new Person("Dsad", 1));
        persons.add(new Person("kdsfl", 2));
        persons.add(new Person("xpcvcpzx", 34));

        persons.stream()
                .filter(person -> person.getAge() > 30)
//                .toList()
                .forEach(a -> System.out.println(a.toString()));
    }
}