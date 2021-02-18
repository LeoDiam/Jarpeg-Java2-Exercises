package com.leodiam.java2Solutions.ex12.task1;
//Task 1
//        Σας δίνεται (στον τρέχοντα κατάλογο) η κλάση Anion που παραμετροποιείται
//        μέσω 5 τύπων. Σας δίνονται ακόμα οι ακόλουθες κλάσεις: Grumpish
//        Owldom Touser Mousebane Boll. Εξετάστε τον πηγαίο κώδικα της κλάσης
//        Anion για να καταλάβετε τη διεπαφή του κατασκευαστή και της μεθόδου
//        της.
//        Να γραφεί μια κλάση με όνομα Rimbase με δημόσια ορατότητα η οποία
//        να περιέχει μια δημόσια ορατή στατική μέθοδο με όνομα bassaris.
//        Η μέθοδος αυτή δεν δέχεται κανένα όρισμα. Η μέθοδος πρέπει να
//        δημιουργεί αντικείμενα των κλάσεων Grumpish Owldom Touser Mousebane
//        Boll. Στη συνέχεια πρέπει να δημιουργεί ένα αντικείμενο της κλάσης
//        Anion παραμετροποιημένης με τους τύπους Grumpish Owldom Touser
//        Mousebane Boll (με αυτή τη σειρά). Τέλος, η μέθοδος bassaris πρέπει
//        να καλεί τη μέθοδο smoked της κλάσης Anion με όρισμα ένα (το σωστό)
//        από τα αντικείμενα που έχετε δημιουργήσει, και να επιστρέφει πίσω
//        το αποτέλεσμα της μεθόδου. Ο τύπος του αποτελέσματος της μεθόδου
//        smoked ορίζει και τον τύπο του αποτελέσματος της δικής σας μεθόδου
//        bassaris.

public class Rimbase {
    public static Boll bassaris() {
        Grumpish t1 = new Grumpish();
        Owldom t2 = new Owldom();
        Touser t3 = new Touser();
        Mousebane t4 = new Mousebane();
        Boll t5 = new Boll();
        Anion<Grumpish, Owldom, Touser, Mousebane, Boll> l;
        l = new Anion<Grumpish, Owldom, Touser, Mousebane, Boll>(t3, t2, t1, t5, t4);
        return l.smoked(t2);
    }
}
