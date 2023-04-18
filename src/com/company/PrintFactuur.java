package com.company;

public class PrintFactuur {
    private Uren uren;
    private Afstand afstand;
    private Factuur factuur;

    public PrintFactuur(Uren uren, Afstand afstand, Factuur factuur) {
        this.uren = uren;
        this.afstand = afstand;
        this.factuur = factuur;
    }

    public void printFactuur() {
        System.out.println("Factuur nummer: " + factuur.getFactuurNummer());
        System.out.println("Factuur datum: " + factuur.getFactuurDatum());
        System.out.println("Zzper gegevens: " + factuur.getZzper().getNaam() + " - " + factuur.getZzper().getAdres());
        System.out.println("Klantgegevens: " + factuur.getKlant().getNaam() + " - " + factuur.getKlant().getAdres());
        System.out.println("Reiskosten: " + factuur.getKostenAfstand() + " euro");
        System.out.println("Werkkosten: " + factuur.getKostenUren() + " euro");
        System.out.println("Totaalbedrag dat moet worden betaald: " + factuur.getTotaalBedrag() + " euro");
    }
}
