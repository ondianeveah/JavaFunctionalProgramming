package imperativeAndDeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperativeAndDeclarative.Main.Gender.FEMALE;
import static imperativeAndDeclarative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ondia", FEMALE),
                new Person("Maddy", FEMALE),
                new Person("John", MALE),
                new Person("Doe", MALE),
                new Person("Erika", FEMALE)

        );

        System.out.println("// Imperative Approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        System.out.println("// Declarative Approach");
        //Declarative Approach (streams with collections)
        //stream() - abstract
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Main.Gender gender;

        public Person(String name, Main.Gender gender) {
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
        MALE, FEMALE

    }
}



