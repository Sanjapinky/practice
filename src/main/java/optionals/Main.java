package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Optional.empty()
                .ifPresentOrElse(email -> System.out.println("Sending email to: " + email),
                        () -> {
                            System.out.println("Can not send email!");
                        });
    }
}
