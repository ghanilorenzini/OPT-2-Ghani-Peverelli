package com.company;

public class Uren implements Berekening {
    private int invoerUren;
    private double tarief;

    public Uren(int invoerUren, double tarief) {
        this.invoerUren = invoerUren;
        this.tarief = tarief;
    }

    @Override
    public double berekenKosten() {
        return invoerUren * tarief;
    }
}
