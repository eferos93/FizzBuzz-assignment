package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {
    private final FizzBuzz fizzBuzz = new FizzBuzz();
     //makes it possible to run a test multiple times
    //with different args
     @ParameterizedTest
     //pairs of (in, out) expressed as strings
     @CsvSource({"1, 1", "2, 2", "41, 41"})
    void numbersNotDivisibleBy3Or5ToStrings(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 24})
    void multiplesOfThreeToFizz(int number) {
        assertEquals("Fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 100})
    void multiplesOfFiveToBuzz(int number) {
         assertEquals("Buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 75})
    void multiplesOf15ToFizzBuzz(int number) {
        assertEquals("FizzBuzz", fizzBuzz.convert(number));
    }
}
