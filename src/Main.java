import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


//      Задание 1 Анонимный класс
        Predicate<Integer> isPositive = new Predicate<Integer>() {
            public boolean test(Integer num) {
                return num > 0;
            }
        };
//      Лямбда-выражение

        Predicate<Integer> isPositiveLambda = (num) -> num > 0;
        System.out.println(isPositiveLambda.test(123));

//      Задание 2 Анонимный класс
        Consumer greeting = new Consumer() {
            @Override
            public void greeting(String name) {
                System.out.println("Привет " + name);
            }
        };
//      Лямбда-выражение

        Consumer greetingLambda = (name) -> System.out.println("Привет " + name);
        greetingLambda.greeting("Кирилл");

//      Задание 3 Анонимный класс
        Function<Double, Long> round = new Function<Double, Long>() {
            @Override
            public Long apply(Double d) {
                return Math.round(d);
            }
        };
        System.out.println(round.apply(12.3));
//      Лямбда-выражение
        Function<Double, Long> roundLambda = d -> Math.round(d);
        System.out.println(roundLambda.apply(13.4));

//      Задание 4 Анонимный класс

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return (int)(Math.random() * (100 - 1) + 1);
            }
        };
        System.out.println(supplier.get());

//      Лямбда-выражение

        Supplier supplierLambda = () -> (int) (Math.random() * (100 - 1) + 1);
        System.out.println(supplierLambda.get());

    }
}
