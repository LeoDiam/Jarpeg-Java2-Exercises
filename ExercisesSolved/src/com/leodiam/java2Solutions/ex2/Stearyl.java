package com.leodiam.java2Solutions.ex2;

//Άσκηση 2: Εξοικείωση με ορίσματα, εκφράσεις, βρόχους και αποφάσεις
//
//        Task 1
//        Να γραφεί μια κλάση με όνομα com.leodiam.java2Solutions.ex2.Stearyl και προσδιοριστή public η
//        οποία να περιέχει μια στατική δημόσια ορατή μέθοδο με όνομα getEquip.
//        Η μέθοδος αυτή δέχεται ως ορίσματα τύπου int το climacus και το
//        whare και επιστρέφει int. Εάν ο climacus είναι μεγαλύτερος από
//        τον whare τότε επιστρέφει  την τετραγωνική ρίζα της απόλυτης τιμής
//        της διαφοράς τους (στρογγυλοποιημένη χρησιμοποιώντας την Math.round()
//        )  αλλιώς επιστρέφει  την τετραγωνική ρίζα του γινομένου τους
//        (στρογγυλοποιημένη χρησιμοποιώντας την Math.round() ) .
//        Task 2
//        Στην παραπάνω κλάση να προστεθεί η δημόσια στατική μέθοδος getBirdlore
//        η οποία δέχεται τρία ορίσματα τύπου int, τα bailable, aspirate
//        και mousehawk και επιστρέφει ως αποτέλεσμα int.  Προσθέστε  2
//        φορές, την bailable  στην  aspirate και καταχωρήστε το αποτέλεσμα
//        στην μεταβλητή τύπου int unhating. Εάν  η  unhating είναι  μεγαλύτερη
//        από  την mousehawk επιστρέψτε την unhating αλλιώς την αντίθετη
//        τιμή της μεταβλητής unhating.
public class Stearyl {
    public static int getEquip(int climacus, int whare) {
        if (climacus > whare) {
            return (int) Math.sqrt(Math.abs(Math.round(climacus - whare)));
        } else {
            return (int) Math.sqrt(Math.round(climacus * whare));
        }
    }

    public static int getBirdlore(int bailable, int aspirate, int mousehawk) {
        aspirate += 2 * bailable;
        int unhating = aspirate;

        if (unhating > mousehawk) {
            return unhating;
        } else {
            return -unhating;
        }
    }
}
