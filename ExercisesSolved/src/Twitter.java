import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Twitter {


    public static Function<Long, Long> unspeak() {
        Function<Long, Long> fun = Long -> Long * 9;
        return fun;
    }

    public Function<Float, Float> stumplike(Function<Float, Float> ghoster) {
        ghoster = Long -> Long / 22;
        return ghoster;
    }

    public Optional<Long> lapse(Stream<Long> s, Predicate<Long> p,
                                BinaryOperator<Long> b) {
        return s.filter(p)
                .reduce(b);
    }
}
