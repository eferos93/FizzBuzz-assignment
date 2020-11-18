package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertFizzBuzzBang {
    private final FizzBuzzBang fizzBuzzBang = new FizzBuzzBang();
    @ParameterizedTest
    @CsvSource({"8, 8", "40, 40", "60, 60", "85, 85"})
    void numbersToString(String expected, int number) {
        assertEquals(expected, fizzBuzzBang.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 21, 84})
    void multiplesOf7ToBang(int number) {
        assertEquals("Bang", fizzBuzzBang.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {42, 63})
    void multiplesOf3And7ToFizzBang(int number) {
        assertEquals("FizzBang", fizzBuzzBang.convert(number));
    }
}
