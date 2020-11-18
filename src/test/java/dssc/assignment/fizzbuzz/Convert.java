package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {
     //makes it possible to run a test multiple times
    //with different args
     @ParameterizedTest
     //pairs of (in, out) expressed as strings
     @CsvSource({"1, 1", "2, 2", "40, 40"})
    void numbersNotDivisibleBy3Or5ToStrings(int number, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.convert(number));
    }
}
