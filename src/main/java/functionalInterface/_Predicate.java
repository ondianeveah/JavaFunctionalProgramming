package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//Represents a predicate (boolean-valued function) of one argument.
public class _Predicate {
    public static void main(String[] args) {
        System.out.println("//Not Using Predicate Functional Interface");

        System.out.println(isPhoneNumberValid("02000000000"));
        System.out.println(isPhoneNumberValid("07333000000"));
        System.out.println(isPhoneNumberValid("0733300000"));

        System.out.println("//Using Predicate Functional Interface");

        System.out.println(isPhoneNumberValidPredicate.test("02000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("07333000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0733300000"));

        //or = either one of them is true
        //and = all arguments have to be true
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.or(containsNumber3).test("07333000000"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("02000000003"));

    }

    //Phone validation method
    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("02") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("02") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
