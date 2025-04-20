package StreamsPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimilarElements {
    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1,123,562,452);
        List<Integer> listTwo = Arrays.asList(234,1,456,562);

        List<Integer> result = listOne.stream().
                filter(listTwo::contains).
                collect(Collectors.toList());
        System.out.println(result);

    }
}
