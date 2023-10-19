package functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function takes one argument and produces 1 result
        int increment = incrementByOne(9);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(8);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);
        Function<Integer, Integer> addBy1ThenMultiply = incrementByOneFunction.andThen(multiplyBy10Function);
        addBy1ThenMultiply.apply(8);
        System.out.println(addBy1ThenMultiply.apply(8));
        // BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiply) -> (numberToIncrementByOne + 1 ) * numberToMultiply;
    static  int incrementByOneAndMultiply(int number, int numToMultiply){
        return (number + 1)* numToMultiply;
    }
}
