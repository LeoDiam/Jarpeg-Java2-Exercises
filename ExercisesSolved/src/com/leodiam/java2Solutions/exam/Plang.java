package com.leodiam.java2Solutions.exam;

public class Plang implements Salivate {
    protected String purpurean;
    protected double engirdle;

    public Plang(String purpurean, double engirdle) {
        this.purpurean = purpurean;
        this.engirdle = engirdle;
    }

    @Override
    public short honduran() {
        return (short) (purpurean.length() + engirdle);
    }

    @Override
    public Salivate twattling() {
        Salivate a = new Salivate() {
            @Override
            public short honduran() {
                return 0;
            }

            @Override
            public Salivate twattling() {
                return null;
            }
        };

        return a;
    }
}
