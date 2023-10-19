package functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("With predicate!");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000008600"));
        System.out.println(isPhoneNumberValid("0900000860"));

        System.out.println("Without predicate!");
        System.out.println(isNumberValidPredicate.test("07000000000"));
        System.out.println(isNumberValidPredicate.test("009000008600"));
        System.out.println(isNumberValidPredicate.test("0700000000"));

        System.out.println("Is Number valid and contains 3:" + isNumberValidPredicate.and(containsNumber3).test("07000000003"));
        System.out.println("Is Number valid or contains 3:" + isNumberValidPredicate.or(containsNumber3).test("07000000000"));
        System.out.println(containsNumber.test("07000000003", 98));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {

        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
    static BiPredicate<String,Integer> containsNumber = (phoneNumber, number) ->
            phoneNumber.contains("3") ||  number == 98;

}