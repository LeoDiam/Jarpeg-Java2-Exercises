package com.leodiam.java2Solutions.ex7;

//Task 1
//        Να γραφεί μια κλάση με όνομα Heinesque και προσδιοριστή public
//η οποία να περιέχει δημόσια ορατή στατική μέθοδο με όνομα getUpslant
//        και με ορίσματα τα  gastral , bandcase τύπου συμβολοσειράς και
//        η οποία επιστρέφει συμβολοσειρά. Η μέθοδος getUpslant ελέγχει
//        αν η συμβολοσειρά gastral είναι  διάφορη από την bandcase και
//        σε περίπτωση που η παραπάνω πρόταση επαληθεύεται επιστρέφει  τους
//        πρώτους 4 χαρακτήρες της συμβολοσειράς gastral. Εάν η παραπάνω
//        σχέση δεν επαληθεύεται τότε επιστρέφει ως συμβολοσειρά το μήκος
//        της συμβολοσειράς bandcase.
public class Heinesque {
    public static String getUpslant(String gastral, String bandcase) {
        if (!gastral.equals(bandcase)) {
            return gastral.substring(0, 4);
        } else {
            return String.valueOf(bandcase.length());
        }
    }
}
