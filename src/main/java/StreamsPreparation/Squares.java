package StreamsPreparation;

import java.util.Arrays;
import java.util.List;

public class Squares {
    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(1, 2 ,5, 25);
        listOne.stream().
                map(n->n*n).
                forEach(System.out::println);
    }
}
