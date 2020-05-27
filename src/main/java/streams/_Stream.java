package streams;


import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ondia", FEMALE),
                new Person("Maddy", FEMALE),
                new Person("John", MALE),
                new Person("Doe", MALE),
                new Person("Erika", FEMALE),
                new Person("bub", PREFER_NOT_TO_SAY)


                );

        Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);
       boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);
        System.out.println(containsOnlyFemales);

     /*   Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        people.stream()
                //convert into genders
                .map(personStringFunction)
                //collect to a set, removing duplicates
                .mapToInt(length)
                //then print
                .forEach(println);

        people.stream()
                //convert into genders
                .map(person -> person.name)
                .mapToInt(String::length)
                //then print
                .forEach(System.out::println);

        people.stream()
                //convert into genders
                .map(person -> person.name)
                //collect to a set, removing duplicates
                .collect(Collectors.toSet())
                //then print
                .forEach(System.out::println); */

}
    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    public enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY

    }
}
