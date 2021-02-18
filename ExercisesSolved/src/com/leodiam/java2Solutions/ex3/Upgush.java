package com.leodiam.java2Solutions.ex3;

//Task 1
//        Δίνεται το αρχείο com.leodiam.java2Solutions.ex3.Upgush.java το οποίο ορίζει την δημόσια κλάση
//        com.leodiam.java2Solutions.ex3.Upgush (Προσοχή! Δεν χρειάζεται να δημιουργηθεί το αρχείο, υπάρχει
//        ήδη στο δίσκο). H κλάση com.leodiam.java2Solutions.ex3.Upgush περιέχει τo ιδιωτικό πεδίο κλάσης
//        zygomatic με τύπο χαρακτήρα, το ιδιωτικό πεδίο υπόστασης begrime
//        με τύπο χαρακτήρα και το ιδιωτικό πεδίο υπόστασης daubingly με
//        τύπο χαρακτήρα. Για την πρόσβαση στις τιμές των ιδιωτικών μελών
//        υπόστασης begrime και daubingly η κλάση ορίζει τις δημόσιες μεθόδους
//        υπόστασης getBegrime και getDaubingly, ενώ για την ανάθεση τιμών
//        σε αυτά τις δημόσιες μεθόδους υπόστασης setBegrime και setDaubingly.
//        Για τη δημιουργία αντικειμένων της κλάσης com.leodiam.java2Solutions.ex3.Upgush διατίθενται δύο
//        δημόσιοι κατασκευαστές. Ο πρώτος κατασκευαστής δεν περιέχει ορίσματα
//        και αρχικοποιεί τα πεδία υπόστασης με τις τιμές 'f' και 'h' αντίστοιχα.
//        Ο δεύτερος κατασκευαστής έχει δύο ορίσματα εκ των οποίων το πρώτο
//        χρησιμοποιείται για την ανάθεση αρχικής τιμής στο πεδίο begrime
//        και το δεύτερο για την ανάθεση αρχικής τιμής στο πεδίο daubingly.
//        Τέλος, η κλάση διαθέτει τη δημόσια μέθοδο anice με τύπο λογική
//        τιμή και τη δημόσια στατική μέθοδο idyllic με τύπο χαρακτήρα,
//        οι οποίες δε δέχονται ορίσματα και επιστρέφουν τις τιμές false
//        και 'e', αντίστοιχα.
public class Upgush {
    private char zygomatic;
    private char daubingly;
    private char begrime;

    public Upgush() {
        this.zygomatic = 'f';
        this.daubingly = 'h';
    }

    public Upgush(char x,char y) {
        this.begrime = x;
        this.daubingly = y;
    }
    public boolean anice(){
        return false;
    }
    public static char idyllic (){
        return 'e';
    }

    public char getBegrime() {
        return begrime;
    }

    public void setBegrime(char begrime) {
        this.begrime = begrime;
    }

    public char getDaubingly() {
        return daubingly;
    }

    public char getZygomatic() {
        return zygomatic;
    }

    public void setZygomatic(char zygomatic) {
        this.zygomatic = zygomatic;
    }

    public void setDaubingly(char daubingly) {
        this.daubingly = daubingly;
    }
}
