package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sanja", FEMALE),
                new Person("Eva", FEMALE),
                new Person("David", Gender.MALE),
                new Person("Ian", Gender.MALE),
                new Person("Anja", FEMALE)
        );
        //imperative approach
        System.out.println("imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);

            // Declarative approach
            System.out.println("declarative approach");

            Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
            List<Person> females2 = people.stream()
                    .filter(personPredicate)
                    .collect(Collectors.toList());
           females2.forEach(System.out::println);

        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
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

    enum Gender {
        MALE, FEMALE
    }
}
