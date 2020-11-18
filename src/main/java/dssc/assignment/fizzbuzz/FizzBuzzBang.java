package dssc.assignment.fizzbuzz;
public class FizzBuzzBang {
    public String convert(int number) {
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
}
