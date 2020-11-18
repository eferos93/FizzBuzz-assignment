package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzBang {
    public String convert(int number) {
        if (number % 105 == 0) {
            return "FizzBuzzBang";
        }
        if (number % 35 == 0) {
            return "BuzzBang";
        }
        if (number % 21 == 0) {
            return "FizzBang";
        }
        if (number % 7 == 0) {
            return "Bang";
        }

        return Integer.toString(number);
    }

    public void print() {
        String result = IntStream.rangeClosed(1, 105)
                .mapToObj(this::convert)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
