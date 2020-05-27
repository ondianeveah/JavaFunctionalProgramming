package finalSection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        // name -> name.toUpperCase() same thing as String::toUpperCase

        //OBJECT TYPE AND NOT PRIMITIVE TYPE
        Function<String, String> upperCaseName = (name) -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> upperCaseName2 = (name, age) -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName2.apply("Ondia", 18));
    }
}
