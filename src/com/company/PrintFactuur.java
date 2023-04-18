package com.company;

public class PrintFactuur {
    private Zzper zzper;
    private Klant klant;
    private Uren uren;
    private Afstand afstand;
    private Factuur factuur;

    public PrintFactuur(Zzper zzper, Klant klant, Uren uren, Afstand afstand, Factuur factuur) {
        this.zzper = zzper;
        this.klant = klant;
        this.uren = uren;
        this.afstand = afstand;
        this.factuur = factuur;
    }

    public void printFactuur() {
        System.out.println("Factuur nummer: " + factuur.getFactuurNummer());
        System.out.println("Factuur datum: " + factuur.getFactuurDatum());
        System.out.println("Zzper: " + zzper.getNaam() + " - " + zzper.getAdres());
        System.out.println("Klant: " + klant.getNaam());
    }
}
