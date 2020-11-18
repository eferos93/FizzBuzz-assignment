package dssc.assignment.fizzbuzz;

import java.time.Instant;
import java.util.stream.IntStream;

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


    public static void main(String... args) {
        Integer n = 105;
        playExtendedVersion(105);

    }

    public String covert(int number) {
        return "1";
    }
}
