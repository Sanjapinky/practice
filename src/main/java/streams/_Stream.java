package streams;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sanja", FEMALE));
        people.add(new Person("Eva", FEMALE));
        people.add(new Person("David", MALE));
        people.add(new Person("Ian", MALE));
        people.add(new Person("Anja", FEMALE));
        people.add(new Person("Bob", PNTS));

//        people.stream().map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .noneMatch(person -> PNTS.equals(person.gender));
        System.out.println(containsOnlyFemales);

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

    static enum Gender {
        MALE, FEMALE, PNTS
    }
}
