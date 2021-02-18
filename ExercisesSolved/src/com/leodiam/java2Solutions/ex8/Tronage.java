package com.leodiam.java2Solutions.ex8;
//Άσκηση 8: Χειρισμός αρχείων.
//
//        Task 1
//        Να γραφεί μια κλάση με όνομα Tronage και δημόσιο προσδιοριστή.
//        Η κλάση Tronage πρέπει να περιέχει δύο δημόσιες, στατικές μεθόδους
//        mConvert και mCarnauba.
//        Η πρώτη μέθοδος mConvert θα πρέπει να δέχεται ως όρισμα μια συμβολοσειρά
//        (String). Η συμβολοσειρά αυτή θα περιέχει το όνομα του αρχείου
//        που πρέπει να δημιουργηθεί.
//        Προσοχή: Για το νέο αρχείο θα πρέπει να ορίσετε και το μονοπάτι
//        στο οποίο θα βρίσκεται (δηλ. στο φάκελο με τις απαντήσεις σας).
//        Το αρχείο  αυτό θα πρέπει να έχει τα εξής χαρακτηριστικά:
//
//        - Μέγεθος: 1467 bytes
//        - Λίστα επιτρεπόμενων bytes:
//        byte[] aChilde = {97, 98, 99, 100, 101, 102, 103, 104, 105, 49,
//        45, 50, 51}.
//        Η λίστα των επιτρεπόμενων bytes θα πρέπει να οριστεί ως στατικό
//        δημόσιο χαρακτηριστικό της κλάσης Tronage με όνομα aChilde.
//        Τα δεδομένα θα πρέπει να καταχωρούνται τυχαία μέσω μιας συνάρτησης
//        που υπάρχει υλοποιημένη στην κλάση Random (Όλα τα bytesνα έχουν
//        περίπου τον ίδιο αριθμό εμφάνισης).
//        Η μέθοδος mConvert θα πρέπει να επιστρέφει μια μεταβλητή τύπου
//        long που θα περιέχει το άθροισμα των τιμών των 975 πρώτων bytes.
//
//        Η δεύτερη μέθοδος mCarnauba θα πρέπει να δέχεται ως όρισμα μία
//        συμβολοσειρά (String) η οποία θα περιέχει το όνομα ενός αρχείου.
//        Το αρχείο θα διαβάζεται στην μνήμη (ορίστε και το μονοπάτι όπως
//        παραπάνω) και θα καταγράφονται για αυτό οι παρακάτω μετρικές:
//
//        - Μέγεθος
//        - Αριθμός εμφανίσεων για κάθε byte που περιλαμβάνεται
//        στον πίνακα που ορίστηκε στον πίνακα aChilde.
//
//        Τα δεδομένα θα πρέπει να επιστρέφονται ως πίνακας από ακεραίους
//        (int) από την mCarnauba. Ο πίνακας αυτός στην θέση 1 (π.χ. a[0])
//        θα έχει το μεγεθος του αρχείου και στις υπόλοιπες των αριθμό εμφανίσεων
//        για κάθε byte (π.χ. στην θέση 2 τον αριθμό εμφανίσεων του πρώτου
//        byte κ.ο.κ.).
//
//        Συμβουλή: εξετάστε τις προδιαγραφές των κλάσεων java.io.DataInputStream,
//        java.io.FileInputStream java.io.FileOutputStream και java.io.DataOutputStream

import java.io.*;
import java.util.Random;

public class Tronage {
    static byte[] aChilde = {97, 98, 99, 100, 101, 102, 103, 104, 105, 49, 45, 50, 51};

    public static long mConvert(String var0) {
        String var1 = "C:\\Users\\leoni\\OneDrive\\Υπολογιστής\\jarpeg\\" + var0;
        try {
            RandomAccessFile var2 = new RandomAccessFile(var1, "rw");
            var2.setLength(1467L);
            var2.close();
        } catch (IOException var8) {
            var8.printStackTrace();
        }

        BufferedOutputStream var11 = null;

        try {
            var11 = new BufferedOutputStream(new FileOutputStream(var1));
        } catch (FileNotFoundException var7) {
            System.err.println("Unable to open file " + var0);
        }

        long var3 = 0L;

        try {
            for (int var5 = 0; var5 < 1467; ++var5) {
                int var6 = (new Random()).nextInt(aChilde.length);
                var11.write(aChilde[var6]);
                if (var5 < 975) {
                    var3 += (long) aChilde[var6];
                }
            }

            var11.close();
        } catch (Exception var10) {
            System.err.println("Unable to open file " + var0);
        }

        return var3;
    }

    public static int[] mCarnauba(String var0) {
        String var1 = "C:\\Users\\leoni\\OneDrive\\Υπολογιστής\\jarpeg\\" + var0;
        BufferedInputStream var2 = null;

        try {
            var2 = new BufferedInputStream(new FileInputStream(var1));
        } catch (FileNotFoundException var6) {
            System.err.println("Unable to open file ");
        }

        int[] var3 = new int[14];

        try {
            int var4;
            while (true) {
                assert var2 != null;
                if ((var4 = var2.read()) == -1) break;
                for (int var5 = 1; var5 < 14; ++var5) {
                    if (var4 == aChilde[var5 - 1]) {
                        int var10002 = var3[var5]++;
                    }
                }
            }

            var3[0] = 1467;
            var2.close();
        } catch (Exception var7) {
            System.err.println("Error reading byte ");
        }

        return var3;
    }
}
