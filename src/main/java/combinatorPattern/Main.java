package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Ondia", "ondia@gmail.com", "+1 302-889-3294", LocalDate.of(2001, 8, 1)
        );
 //       System.out.println(new CustomerValidatorService().isValid(customer));

        //if valid we can store customer in db

        //Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(customer.getName() + "'s " + result.name());
        }
    }
}
