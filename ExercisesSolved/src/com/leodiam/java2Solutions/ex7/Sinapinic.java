package com.leodiam.java2Solutions.ex7;

import java.util.Date;
import java.util.LinkedList;

//Task 2
//        Να γραφεί μια κλάση Sinapinic με δημόσιο προσδιοριστή.Η κλάση
//        Sinapinic πρέπει να περιέχει μια δημόσια στατική μέθοδο beak που
//        λαμβάνει ως όρισμα μια συλλογή τύπου LinkedList από Date και δύο
//        πίνακες στοιχείων τύπου boolean. Οι δύο πίνακες και η συλλογή
//        έχουν τον ίδιο αριθμό στοιχείων.
//        Η μέθοδος επιστρέφει ως αποτέλεσμα μια συλλογή τύπου LinkedList
//        από Date που αποτελείται από τα στοιχεία της συλλογής του πρώτου
//        ορίσματος για τα οποία το αντίστοιχο στοιχείο του πρώτου πίνακα
//        έχει την τιμή false και το αντίστοιχο  στοιχείο του δεύτερου πίνακα
//        έχει την τιμή true.
public class Sinapinic {
    public static LinkedList beak(LinkedList<Date> a, boolean[] b, boolean[] c) {
       for (int i = 0; i < b.length + c.length; i++){
           if (c[0] && !b[0]){
               return a;
           }
       }
        return null;
    }
}
