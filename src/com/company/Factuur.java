package com.company;

public class Factuur {
    private int factuurNummer;
    private String factuurDatum;
    private double totaalBedrag;
    private Zzper zzper;
    private Klant klant;
    private double kostenAfstand;
    private double kostenUren;

    public Factuur(Zzper zzper, Klant klant, int factuurNummer, String factuurDatum, double kostenAfstand, double kostenUren) {
        this.zzper = zzper;
        this.klant = klant;
        this.factuurNummer = factuurNummer;
        this.factuurDatum = factuurDatum;
        this.kostenAfstand = kostenAfstand;
        this.kostenUren = kostenUren;
        berekenTotaalBedrag(kostenAfstand, kostenUren);


    }


    public Zzper getZzper(){
        return zzper;
    }

    public Klant getKlant(){
        return klant;
    }
    public Factuur(int factuurNr, String factuurDatum) {
    }

    public int getFactuurNummer() {
        return factuurNummer;
    }

    public String getFactuurDatum() {
        return factuurDatum;
    }

    public double getKostenAfstand() {
        return kostenAfstand;
    }

    public double getKostenUren() {
        return kostenUren;
    }
    public void berekenTotaalBedrag(double kostenAfstand, double kostenUren) {
        totaalBedrag = kostenAfstand + kostenUren;
    }

    public double getTotaalBedrag(){
        return totaalBedrag;
    }


}
