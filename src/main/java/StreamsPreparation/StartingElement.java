package StreamsPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingElement {

    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1,12,123,134,456,432,142);

        List<Integer> result = listOne.stream().
                filter(n->Integer.toString(n).startsWith(String.valueOf(1))).
                collect(Collectors.toList());
        System.out.println(result);

        for(Integer intResult : result)
        {
            System.out.println("Numbers starts with 1 = " + intResult);
        }

    }
}

/* without converting to Strings
 .filter(n -> {
                    while (n >= 10) {
                        n /= 10; // Remove the last digit
                    }
                    return n == 1; // Check if the first digit is 1
                })
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + result);
 */
