package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {
    private static final String FIZZBUZZES_1_TO_100 =
            IntStream.rangeClosed(1, 100).
                    mapToObj(number -> {
                       if(number % 15 == 0) {
                           return "FizzBuzz";
                       }
                       if (number % 5 == 0) {
                           return "Buzz";
                       }
                       if (number % 3 == 0) {
                           return "Fizz";
                       }
                       return Integer.toString(number);
                    }).collect(Collectors.joining(", ")).concat("\n");

    @Test
    void numbersFrom1To100() {
        //we can read the text in stdout by using this fake stdout
        ByteArrayOutputStream fakeStdOutput = new ByteArrayOutputStream();
        //set the output stream
        System.setOut(new PrintStream(fakeStdOutput));

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print();

        assertEquals(FIZZBUZZES_1_TO_100, fakeStdOutput.toString());
    }

}
