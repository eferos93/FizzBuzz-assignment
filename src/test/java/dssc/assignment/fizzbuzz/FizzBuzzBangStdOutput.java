package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzBangStdOutput {
    private static final String FIZZ_BUZZ_BANGS_1_TO_105 =
            IntStream.rangeClosed(1, 105).
                mapToObj(number -> {
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
                 }).collect(Collectors.joining(", ")).concat("\n");

    @Test
    void numbersFrom1to105() {
        ByteArrayOutputStream fakeOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeOutputStream));

        FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
        fizzBuzzBang.print();

        assertEquals(FIZZ_BUZZ_BANGS_1_TO_105, fakeOutputStream.toString());
    }
}
