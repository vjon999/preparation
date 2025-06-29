package Java8FeaturesPreparation;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//Traditional way

/*


class SupplierImpl implements Supplier<LocalDateTime>
{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
*/

public class  PredefinedFunctionalInterfaceThree {
    public static void main(String[] args) {

//        Supplier<LocalDateTime> localDateTime = new SupplierImpl();
//        System.out.println(localDateTime.get());

        Supplier<LocalDateTime> localDateTime = () -> LocalDateTime.now();
        System.out.println(localDateTime.get());
    }
}

