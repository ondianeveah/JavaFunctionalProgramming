package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Represents an method that accepts a single parameter and returns no result
//BiConsumer = takes two parameters and returns no result
public class _Consumer {
    public static void main(String[] args) {
        System.out.println("//Normal Java Function");
        Customer Ondia = new Customer("Ondia", "302-572-8279");
        greetCustomer(Ondia);

        System.out.println("//Using Normal Java Function");
        greetCustomerVersion2(Ondia, false);

        System.out.println("//Using Consumer Functional Interface");
        greetCustomerConsumer.accept(Ondia);

        System.out.println("//Using BiConsumer Functional Interface");
        greetCustomerConsumerVersion2.accept(Ondia, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerVersion2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering the phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "**********") + ".");

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering the phone number "
                    + customer.customerPhoneNumber + ".");

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering the phone number "
                + customer.customerPhoneNumber + ".");
    }

    static void greetCustomerVersion2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + ", thanks for registering the phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "**********") + ".");
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
