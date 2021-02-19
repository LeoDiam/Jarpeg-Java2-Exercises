package com.leodiam.java2Solutions.ex13;
//Άσκηση 13: Προγραμματισμός σε ζεύγη
//
//        Task 1
//        Σας ζητείται να κατασκευάσετε τη δημόσια κλάση Salient, σύμφωνα
//        με τις παρακάτω προδιαγραφές:
//        Η μέθοδος κατασκευαστής (constructor) της κλάσης Salient δέχεται
//        ως όρισμα έναν πίνακα με αριθμούς τύπου int.
//
//        Σημείωση: Οι αριθμοί αφορούν παρατηρήσεις για έναν πλήρη πληθυσμό
//        (όχι ένα δείγμα). Κανένας από τους αριθμούς δεν είναι μεγαλύτερος
//        από το 100 και κανένας από τους αριθμούς δεν είναι μικρότερος
//        από το 1.
//
//        Μετά την κατασκευή ενός αντικειμένου, οι παρακάτω μέθοδοι θα πρέπει
//        να επιστρέφουν τα προδιαγεγραμμένα αποτελέσματα με βάση τα στοιχεία
//        του πίνακα:
//        -Η μέθοδος getSubchief επιστρέφει ως int τον αριθμό των στοιχείων.
//        -Η μέθοδος getTumbrel επιστρέφει ως int το εύρος (range) των τιμών.
//        -Η μέθοδος getSakulya επιστρέφει ως double τον αριθμητικό μέσο
//        όρο (arithmetic mean).
//        -Η μέθοδος getCamerated επιστρέφει ως double τη διάμεσο (median).
//        -Η μέθοδος getAread επιστρέφει ως int την κορυφή (mode). (Αν υπάρχουν
//        πολλές κορυφές θα η επιστρεφόμενη τιμή  θα είναι η κορυφή με τη
//        μικρότερη τιμή).
//        -Η μέθοδος getFerrous επιστρέφει ως double τη διακύμανση (variance)
//        των τιμών του πληθυσμού.
//        -Η μέθοδος getCajuputol επιστρέφει ως double την τυπική απόκλιση
//        (standard deviation) των τιμών του πληθυσμού.
//        -Η μέθοδος getSailship επιστρέφει ως double το συντελεστή μεταβλητότητας
//        (coefficient of variation) των τιμών του πληθυσμού.
//        -Η μέθοδος getBrumby επιστρέφει ως double το γεωμετρικό μέσο όρο
//        (geometric mean).
//        -Η μέθοδος getWindfish επιστρέφει ως double τον αρμονικό μέσο
//        όρο (harmonic mean).
//
//        Σημείωση: Η στατική μέθοδος java.util.Arrays.sort(int []) ταξινομεί
//        τον πίνακα που λαμβάνει ως όρισμα κατ' αύξουσα σειρά.
//
//        Προσπαθήστε να υλοποιήσετε όσο περισσότερες από τις παραπάνω μεθόδους
//        μπορείτε. Κάθε μια από τις παραπάνω μεθόδους μετράει για ένα βαθμό.
//        Επιτρέπεται να χρησιμοποιήσετε ελεύθερα πηγές στο διαδίκτυο. Ορισμούς
//        για στατιστικά μεγέθη θα βρείτε στο διαδίκτυο, όπως π.χ. στη Wikipedia
//        http://en.Wikipedia.org.


import java.util.Arrays;

public class Salient {
    static int[] usersAr;

    public Salient(int[] a) {
        for (int j : a) {
            if (j < 1 || j > 100) {
                return;
            }
        }
        Arrays.sort(a);
        usersAr = new int[a.length];
        System.arraycopy(a, 0, usersAr, 0, a.length);

    }

    public int getSubchief() {
        return usersAr.length;
    }

    public int getTumbrel() {
        int max = Integer.MIN_VALUE;
        for (int i : usersAr) {
            max = Math.max(max, i);
        }
        int min = Integer.MAX_VALUE;
        for (int i : usersAr) {
            min = Math.min(min, i);
        }
        return max - min;
    }

    public double getSakulya() {
        double mean = 0.0;
        for (double i : usersAr) {
            mean += i;
        }
        return mean / usersAr.length;
    }

    public double getCamerated() {
        if (usersAr.length % 2 == 0) {
            return (usersAr[usersAr.length / 2] + usersAr[(usersAr.length / 2) - 1]) / 2.0;
        } else {

            return usersAr[usersAr.length / 2];
        }

    }

    public int getAread() {

        int[] fr = new int[usersAr.length];
        int visited = -1;
        for (int i = 0; i < usersAr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < usersAr.length; j++) {
                if (usersAr[i] == usersAr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        int max = Integer.MIN_VALUE;
        int originalArPos = 0;
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] > max) {
                max = fr[i];
                originalArPos = i;

            }
        }
        return usersAr[originalArPos];
    }

    public double getFerrous() {
        double variance = 0.0;
        double mean = 0.0;
        for (double i : usersAr) {
            mean += i;
        }
        mean = mean / usersAr.length;
        for (int i : usersAr) {
            variance += Math.pow(i - mean, 2);
        }
        return (variance / (double) usersAr.length);
    }

    public double getCajuputol() {
        double variance = 0.0;
        double mean = 0.0;
        for (double i : usersAr) {
            mean += i;
        }
        mean = mean / usersAr.length;
        for (int i : usersAr) {
            variance += Math.pow(i - mean, 2);
        }
        return Math.sqrt(variance / (double) usersAr.length);
    }

    public double getSailship() {
        double variance = 0.0;
        double mean = 0.0;
        for (double i : usersAr) {
            mean += i;
        }
        mean = mean / usersAr.length;
        for (int i : usersAr) {
            variance += Math.pow(i - mean, 2);
        }
        return (Math.sqrt(variance / (double) usersAr.length)) / mean;
    }

    public double getBrumby() {
        double g = 1;
        for (int i : usersAr) {
            g *= i;
        }
        return Math.pow(g, 1.0 / (double) usersAr.length);
    }
    public double getWindfish(){
        double h = 0.0;
        for (int i : usersAr) {
            h += 1.0 / i;
        }
    return (double) usersAr.length / h;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        Salient l = new Salient(a);
        System.out.println(l.getSubchief());
        System.out.println(l.getTumbrel());
        System.out.println(l.getSakulya());
        System.out.println(l.getCamerated());
        System.out.println(l.getAread());
        System.out.println(l.getFerrous());
        System.out.println(l.getCajuputol());
        System.out.println(l.getSailship());
        System.out.println(l.getBrumby());
        System.out.println(l.getWindfish());

    }
}
