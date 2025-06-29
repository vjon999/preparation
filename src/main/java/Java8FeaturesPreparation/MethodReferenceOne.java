package Java8FeaturesPreparation;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String s);
}

public class MethodReferenceOne {

    public static int addition(int a, int b){
        return a+b;
    }

    public void display(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {

        //1. Method reference for static method examples

        // with lambda expression

        Function<Integer, Double> function = (a) -> Math.sqrt(a);
        System.out.println(function.apply(4));

        //without lambda expression

        Function<Integer, Double> functionMethodReference = Math::sqrt;
        System.out.println(function.apply(25));

        // another static method with lambda expression

        BiFunction<Integer,Integer,Integer> bifunction = (a,b) -> MethodReferenceOne.addition(a,b);
        System.out.println(bifunction.apply(3,6));


        // static method without lambda expression

        BiFunction<Integer,Integer,Integer> bifunctionMethodReference =MethodReferenceOne::addition;
        System.out.println(bifunction.apply(6,3));

        // 2) Method references to an instance method of an object

        MethodReferenceOne methodReferenceOne = new MethodReferenceOne();
        Printable printable = (s) -> methodReferenceOne.display(s);
        printable.print("venkatesh");

        //lambda expression

        MethodReferenceOne methodReferenceOneLambda = new MethodReferenceOne();
        Printable printableLambda = methodReferenceOneLambda::display;
        printableLambda.print("venkatesh Jonna");


        // 3) References to an instance method of an arbitary object

        //with lambda expression

        Function<String, String> stringFunction = (s1)-> s1.toLowerCase();
        System.out.println(stringFunction.apply("VenkateSH"));

        //without Lambda expression

        Function<String, String> stringFunctionMethodReference = String::toLowerCase;
        System.out.println(stringFunctionMethodReference.apply("VenkateSH"));

        String [] str = {"A","E","I","O","U","a","e","i","o","u"};

        //Lambda
        Arrays.sort(str, (str1,str2)-> str1.compareToIgnoreCase(str2));

        //Without Lambda

        Arrays.sort(str,String::compareToIgnoreCase);


        // 4) reference to a constructor

        List<String> listOne = Arrays.asList("Banana","apple","mango","Watermelon");

        //Lambda expression

        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(listOne));

        //using method reference

        Function<List<String>, Set<String>> setFunctionMethodReference= HashSet::new;
        System.out.println(setFunctionMethodReference.apply(listOne));


    }


}
