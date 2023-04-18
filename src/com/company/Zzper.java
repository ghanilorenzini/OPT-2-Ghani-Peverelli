package com.company;

public class Zzper extends Persoon {
    public Zzper(String zzperNaam, String zzperAdres) {
        super(zzperNaam, zzperAdres);
    }

    @Override
    public String getNaam() {
        return super.getNaam();
    }

    @Override
    public String getAdres() {
        return super.getAdres();
    }
}