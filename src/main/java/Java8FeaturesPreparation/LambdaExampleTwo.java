package Java8FeaturesPreparation;


interface Colour{
    void draw();
}


public class LambdaExampleTwo {
    public static void main(String[] args) {
        Colour green = () -> System.out.println("green colour");

        Colour red = () -> System.out.println("red colour");

        test(green);
        test(red);

       // ( or )
        // This is the way to pass Lambda expression as a parameter

      //  test(() -> System.out.println("green colour"));
        // test(() -> System.out.println("red colour"));

    }

    private static void test(Colour colour) {
        colour.draw();
    }
}
