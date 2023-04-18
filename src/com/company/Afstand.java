package com.company;

public class Afstand implements Berekening {
    private double afstandKm;
    private double tariefPerKm;

    public Afstand(double afstandKm, double tariefPerKm) {
        this.afstandKm = afstandKm;
        this.tariefPerKm = tariefPerKm;
    }

    public double getAfstandKm() {
        return afstandKm;
    }

    public double getTariefPerKm() {
        return tariefPerKm;
    }

    @Override
    public double berekenKosten() {
        return afstandKm * tariefPerKm;
    }
}
