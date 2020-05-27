package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

//functions = takes 1 parameter, produces 1 result
//chaining functions
//bifunction = instead of taking 1 parameter, it takes 2 parameters and spits out 1 result
public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        System.out.println("//chaining functions together");
       Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        System.out.println("//Normal Java Function");
        System.out.println(incrementByOneAndMultiply(4, 100));

        System.out.println("//BiFunction");
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));


    }
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function <Integer, Integer> multiplyBy10Function = number -> number * 10;


    static int incrementByOne(int number){
        return number + 1;
    }

    //parameter, parameter, result

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMulitplyBy) -> (numberToIncrementByOne + 1)
                    * (numberToMulitplyBy);

    static int incrementByOneAndMultiply(int number, int numToMulitplyBy){
        return (number + 1) * numToMulitplyBy;
    }
}
