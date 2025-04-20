package StreamsPreparation;

import java.util.Arrays;
import java.util.List;

public class CountOfWords {
    public static void main(String[] args) {
        List<String> listOne = Arrays.asList("Banana","Apple","Grapes");
        listOne.stream().
                filter(words->words.startsWith("A")).
                forEach(System.out::println);
    }
}
