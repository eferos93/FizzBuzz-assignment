package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
    static public void play(Integer number) {
        IntStream.rangeClosed(1, number)
                .forEach(x -> {
                    StringBuilder test = new StringBuilder();
                    if (x % 3 == 0) {
                        test.append("Fizz");
                    }
                    if (x % 5 == 0) {
                        test.append("Buzz");
                    }
                    System.out.println(test.isEmpty() ? x : test);
                });
    }

    static public void playExtendedVersion(Integer number) {
        IntStream.rangeClosed(1, number)
                .forEach(x -> {
                    StringBuilder test = new StringBuilder();
                    if(x % 3 == 0) {
                        test.append("Fizz");
                    }

                    if (x % 5 == 0) {
                        test.append("Buzz");
                    }

                    if (x % 7 == 0) {
                        test.append("Bang");
                    } else {
                        test = new StringBuilder(); //set to empty
                    }
                    System.out.println(test.isEmpty() ? x : test);
                });
    }


    public String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }

    public void print() {
        Stream<String> fizzBuzzes = IntStream.rangeClosed(1, 100).mapToObj(this::convert);
        System.out.println(fizzBuzzes.collect(Collectors.joining(", ")));
    }
}
