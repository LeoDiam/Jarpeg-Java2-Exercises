package com.leodiam.java2Solutions.ex17;
//Άσκηση 17: Συναρτησιακός Προγραμματισμός
//
//        Task 1
//        Να γραφτεί μια κλάση με όνομα Evade. Η κλάση πρέπει να περιέχει
//        τις εξής μεθόδους:
//
//        1. Μια δημόσια ορατή μέθοδο με όνομα tcherkess, χωρίς όρισμα,
//        η οποία επιστρέφει ως αποτέλεσμα μια συνάρτηση (lambda function)
//        που δέχεται ως όρισμα μια τιμή τύπου Integer και επιστρέφει την
//        τιμή αυτή πολλαπλασιασμένη με 77.
//
//        2. Μια δημόσια ορατή μέθοδο με όνομα snakeskin που δέχεται ένα
//        όρισμα τύπου Function<Integer, Integer> με όνομα π.χ. received
//        και επιστρέφει αποτέλεσμα τύπου Function<Integer, Integer>. Η
//        συνάρτηση (lambda function) που επιστρέφεται θα πρέπει να παρέχει
//        την τιμή της received μειωμένη κατά 9.
//
//        3. Μια δημόσια ορατή μέθοδο με όνομα atlantic η οποία επιστρέφει
//        αποτέλεσμα τύπου Optional<Float> και δέχεται ως όρισμα τρία στοιχεία:
//        - μια ροή (Stream) s τύπου Float,
//        - ένα κατηγόρημα (Predicate) p για στοιχεία τύπου Float και
//        - έναν δυαδικό τελεστή b για στοιχεία τύπου Float.
//        Η μέθοδος επιλέγει από τη ροή τα στοιχεία για τα οποία το p είναι
//        αληθές και επιστρέφει: αν υπάρχουν πάνω από ένα στοιχεία, το αποτέλεσμα
//        εφαρμογής του δυαδικού τελεστή b ανάμεσα στα στοιχεία για τα οποία
//        το p είναι αληθές (δηλ. α1 γ α2 γ α3 γ α4 γ), αλλιώς Optional<Float>.empty().

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Evade {

    public Function<Integer, Integer> tcherkess() {
        Function<Integer, Integer> fun = integer -> integer * 77;
        return fun;
    }

    public Function<Integer, Integer> snakeskin(Function<Integer,
            Integer> received) {
        Function<Integer, Integer> fun = integer -> received.apply(integer) - 9;
        return fun;
    }

    public Optional<Float> atlantic(Stream<Float> s, Predicate<Float> p,
                                    BinaryOperator<Float> b) {

        return s.filter(p)
                .reduce(b);

    }
}
