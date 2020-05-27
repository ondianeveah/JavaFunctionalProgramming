package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
       Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");
        System.out.println(value);

        Supplier<IllegalStateException> exceptionSupplier = () -> new IllegalStateException("exception");
        Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(exceptionSupplier);
        System.out.println(value2);

        //logic
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to "
                        + email), () -> {
                    System.out.println("Cannot send email" );
                });
    }
}
