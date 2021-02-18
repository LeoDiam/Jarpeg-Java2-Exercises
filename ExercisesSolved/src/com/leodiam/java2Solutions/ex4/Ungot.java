package com.leodiam.java2Solutions.ex4;

//Άσκηση 4: Δημιουργία μιας κλάσης.
//
//        Task 1
//        Να γραφεί μια δημόσια κλάση με όνομα com.leodiam.java2Solutions.ex4.Ungot η οποία να περιέχει
//        δύο ιδιωτικά μέλη υπόστασης με ίδιο τύπο αριθμό κινητής υποδιαστολής
//        διπλής ακρίβειας και ονόματα accouche και mainan και ένα ιδιωτικό
//        στατικό ακέραιο μέλος με όνομα bree. Το μέλος bree έχει αρχική
//        τιμή μηδέν και χρησιμοποιείται για να μετρά τον αριθμό των αντικειμένων
//        αυτής της κλάσης που δημιουργούνται.  Για πρόσβαση στις τιμές
//        των μελών accouche και mainan η κλάση διαθέτει τις δημόσιες μεθόδους
//        υπόστασης getAccouche και getMainan ενώ για την ανάθεση τιμών
//        στα μέλη αυτά τις δημόσιες μεθόδους υπόστασης setAccouche και
//        setMainan. Μια άλλη δημόσια μέθοδος υπόστασης με όνομα getVulpes
//        και τύπο αριθμό κινητής υποδιαστολής μονής ακρίβειας δεν έχει
//        κανένα όρισμα και επιστρέφει 2.66F αν η τιμή του accouche είναι
//        διαφορετική από την τιμή του mainan και 1.05F στην άλλη περίπτωση.
//        Η κλάση διαθέτει επίσης δύο δημόσιους κατασκευαστές. Ο πρώτος
//        κατασκευαστής δεν έχει ορίσματα και απλά αρχικοποιεί τo μέλος
//        accouche με τιμή 892.4 και το μέλος mainan με τιμή 340.0. Ο δεύτερος
//        κατασκευαστής διαθέτει δύο ορίσματα ίδιου τύπου με αυτόν των μελών
//        accouche και mainan εκ των οποίων το πρώτο όρισμα χρησιμοποιείται
//        για την ανάθεση τιμής στο μέλος accouche και το δεύτερο για την
//        ανάθεση τιμής στο μέλος mainan. Τέλος, η κλάση διαθέτει την δημόσια
//        στατική μέθοδο getBree τύπου ακεραίου η οποία δεν δέχεται κανένα
//        όρισμα και επιστρέφει το αποτέλεσμα της έκφρασης ([αριθμός αντικειμένων
//        της κλάσης που έχουν δημιουργηθεί] συν (1 επί 5)).
public class Ungot {
    private double accouche;
    private double mainan;
    private static int bree = 0;

    public Ungot() {
        this.accouche = 892.4;
        this.mainan = 340.0;
        bree++;
    }

    public Ungot(double accouche, double mainan) {
        this.accouche = accouche;
        this.mainan = mainan;
        bree++;
    }

    public static int getBree() {
        return bree + (1 * 5);
    }

    public float getVulpes() {
        if (accouche != mainan) {
            return 2.66F;
        } else {
            return 1.05F;
        }

    }

    public double getAccouche() {
        return accouche;
    }


    public double getMainan() {
        return mainan;
    }

    public void setMainan(double mainan) {
        this.mainan = mainan;
    }

    public void setAccouche(double accouche) {
        this.accouche = accouche;
    }
}
