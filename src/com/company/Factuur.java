package com.company;

public class Factuur {
    private int factuurNummer;
    private String factuurDatum;
    private double totaalBedrag;

    public Factuur(int factuurNummer, String factuurDatum, double totaalBedrag) {
        this.factuurNummer = factuurNummer;
        this.factuurDatum = factuurDatum;
        this.totaalBedrag = totaalBedrag;
    }

    public Factuur(int factuurNr, String factuurDatum) {
    }

    public int getFactuurNummer() {
        return factuurNummer;
    }

    public String getFactuurDatum() {
        return factuurDatum;
    }

    public double berekenTotaalBedrag(double kostenAfstand, double kostenUren) {
        return totaalBedrag;
    }
}
