package combinator_pattern;

import java.time.LocalDate;

import static combinator_pattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Sanja",
                "sanja@live.com",
                "+06776265636461",
                LocalDate.of(1997, 8, 29));


//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isValid(customer));
        //If valid we can store customer in db

        //Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        System.out.println(result);
        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }


}
