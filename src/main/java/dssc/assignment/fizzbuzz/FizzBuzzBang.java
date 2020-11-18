package dssc.assignment.fizzbuzz;
public class FizzBuzzBang {
    public String convert(int number) {
        if (number % 7 == 0) {
            return "Bang";
        }

        return Integer.toString(number);
    }
}
