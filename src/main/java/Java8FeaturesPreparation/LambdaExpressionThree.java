package Java8FeaturesPreparation;


interface Addition{
    int addition(int a, int b);
}

//traditinal way
/*
class AdditionImplementation implements Addition{
    @Override
    public int addition(int a, int b)
    {
        return (a+b);
    }
}
*/

public class LambdaExpressionThree {
    public static void main(String[] args) {

       Addition addition = (a, b) -> (a+b);
       int res = addition.addition(10,20);
       System.out.println(res);

        //(or)

        Addition additionOne = (a, b) ->
        {
            int c = a+b;
            return c;
        };
    }

}
