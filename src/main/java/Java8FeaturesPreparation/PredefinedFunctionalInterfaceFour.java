package Java8FeaturesPreparation;

class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread begins");
    }
}
public class PredefinedFunctionalInterfaceFour {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableImpl());
        thread.start();

        Runnable runnable = () -> System.out.println("Thread begins with Lambda");
        Thread threadLambda = new Thread();
        threadLambda.start();
    }

}
