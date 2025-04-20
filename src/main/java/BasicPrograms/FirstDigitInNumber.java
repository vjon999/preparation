package BasicPrograms;

import java.util.Arrays;
import java.util.List;

public class FirstDigitInNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 12, 134, 453, 345, 156);
        boolean found = false;

        for (Integer number : numbers) {
            int firstDigit = number;
            while (firstDigit >= 10) { // Extract the first digit
                firstDigit /= 10;
            }

            if (firstDigit == 1) { // Check if the first digit is 1
                System.out.println("Number with 1 is present: " + number);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number with 1 is not present");
        }
    }
}