import java.util.function.Function;
import java.util.function.Predicate;

public class FifthExercize {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse){
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
    Function<Double, Long> function1 = x -> Math.round(x);
    Function<Double, Long> function2 = x -> Math.round(x)/2;
    Predicate<Double> predicate2 = x -> x < 0;

}
