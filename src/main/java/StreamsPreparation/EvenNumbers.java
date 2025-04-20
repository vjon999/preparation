package StreamsPreparation;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1,23,34,56,32,235);
        listOne.stream().
                filter(n->n%2==0).
                forEach(System.out::println);
    }
}
