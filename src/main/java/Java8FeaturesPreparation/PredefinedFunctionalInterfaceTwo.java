package Java8FeaturesPreparation;


import java.util.function.Consumer;

//Traditional way
/*
class ConsumerImpl implements Consumer<String>
{
    @Override
    public void accept(String s) {
        System.out.println(s);

    }
}
 */

public class PredefinedFunctionalInterfaceTwo {
    public static void main(String[] args) {
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("Venkatesh");

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Venkatesh");

    }
}
