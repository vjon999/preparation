package Java8FeaturesPreparation;

import java.util.function.Function;

// Traditional way
/*
class FunctionImpl implements Function<String,Integer>
{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
*/

public class PredefinedFunctionalInterfaceOne {
    public static void main(String[] args) {
      //Traditional way
//        Function<String,Integer> func = new FunctionImpl();
//        System.out.println(func.apply("Venkatesh"));


        Function<String,Integer> function = (String s) -> s.length();
        System.out.println(function.apply("venkatesh"));
    }
}
