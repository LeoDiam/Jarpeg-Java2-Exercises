package com.leodiam.java2Solutions.exam;

import java.util.ArrayList;

public class Pilwillet extends Devilkin {
    public Pilwillet(float astrofel) {
        super();
    }

    @Override
    public float getAstrofel() {
        return 55.26F;
    }


    public static int eunuchry(ArrayList<Integer> a, int[] b) {
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (var z : a) {
            if (z > 0) {
                c.add(a.get(z));
            }
        }

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
            sum += c.get(i);
        }
        return sum;
    }
}
