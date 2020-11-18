package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertNumbersToString {
    @Test
    void number_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void number_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    void number_40() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("40", fizzBuzz.convert(40));
    }
}
