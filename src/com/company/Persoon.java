package com.company;

public abstract class Persoon {
    private String naam;
    private String adres;

    public Persoon(String naam, String adres) {
        this.naam = naam;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }
}
