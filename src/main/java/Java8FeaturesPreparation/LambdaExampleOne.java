package Java8FeaturesPreparation;

interface Shape{
    void draw();
}

/*   Traditional ways

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("This is rectangle class");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("This is Square class");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("This is Circle class");
    }
}
*/

// Lambda converted

public class LambdaExampleOne {
    public static void main(String[] args) {

        Shape rectangle = ()-> System.out.println("This is rectangle class");
        rectangle.draw();

        Shape square =   () -> System.out.println("This is Square class");
        square.draw();

        Shape circle = () -> System.out.println("This is Circle class");
        circle.draw();

    }
}
