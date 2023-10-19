package _optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Optional<String> hello = Optional.ofNullable(null);
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());
//        String orElse = hello
//                .map(String::toUpperCase)
//                .orElseGet(() -> {
//                    //... extra computation to retrieve value
//                    return "world";
//
//                });
//
//        System.out.println(orElse);
//
        Person person = new Person("Sanja", "SaNJA.LETICH@LIve.com");
//        String email = person.getEmail()
//                .map(String::toLowerCase)
//                .orElse("email not provided");
//        System.out.println(email);
        if (person.getEmail().isPresent()){
            String email = person.getEmail().get();
            System.out.println(email.toLowerCase());
        }else {
            System.out.println("Email not provided");
        }
    }

    static class Person {
        private final String name;
        private final String email;

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
