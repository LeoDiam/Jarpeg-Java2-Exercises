package com.leodiam.java2Solutions.ex6;

//Άσκηση 6: Παραγωγή και έλεγχος εξαιρέσεων.
//
//        Task 1
//        Να γραφεί μια δημόσια κλάση με όνομα Predelude η οποία να περιέχει
//        μια δημόσια στατική μέθοδο με όνομα squibbery που δεν επιστρέφει
//        κανένα αποτέλεσμα. H μέθοδος squibbery δέχεται ένα όρισμα με τύπο
//        λογική τιμή. Εάν η τιμή του ορίσματος είναι αληθής η μέθοδος παράγει
//        την εξαίρεση Skeeling ενώ εάν είναι ψευδής παράγει την εξαίρεση
//        Lamia. Οι κλάσεις που αντιπροσωπεύουν τις εξαιρέσεις Skeeling
//        και Lamia θα πρέπει να οριστούν σε ξεχωριστά αρχεία και απλά να
//        επεκτείνουν την κλάση Exception της Java. H κλάση Predelude περιέχει
//        επίσης τη δημόσια στατική μέθοδο ariel η οποία δεν δέχεται κανένα
//        όρισμα και είναι τύπου ακεραίου. Η μέθοδος ariel καλεί τη μέθοδο
//        squibbery με παράμετρο την τιμή true και επιστρέφει την τιμή 982
//        όταν η μέθοδος squibbery παράγει την εξαίρεση Skeeling και την
//        τιμή 231 όταν η μέθοδος squibbery παράγει την εξαίρεση Lamia.
public class Predelude {


    public static void squibbery(boolean any) throws Skeeling, Lamia {
        if (any) {
            throw new Skeeling();
        } else {
            throw new Lamia();
        }

    }

    public static int ariel() {
        try {
            squibbery(true);
        } catch (Skeeling skeeling) {
            return 982;
        } catch (Lamia lamia) {
            return 231;
        }
        return 0;
    }
}
