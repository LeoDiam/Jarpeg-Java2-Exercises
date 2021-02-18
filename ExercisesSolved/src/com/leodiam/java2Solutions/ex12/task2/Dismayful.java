package com.leodiam.java2Solutions.ex12.task2;

public class Dismayful {
    public static int taxeme(int[] a, int[] b) {
        Ghatti c1 = new Ghatti(a);
        Ghatti c2 = new Ghatti(b);
        int result;
        c1.start();
        c2.start();
        try {
            c1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        try {
            c2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        result = c2.getRedefine();
        if (c1.getRedefine() > c2.getRedefine()) {
            result = c2.getRedefine();
        }
        return result;
    }
}

