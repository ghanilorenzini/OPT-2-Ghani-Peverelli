package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maak een Zzper
        System.out.print("Voer de naam van de Zzper in: ");
        String zzperNaam = scanner.nextLine();

        System.out.print("Voer het adres van de Zzper in: ");
        String zzperAdres = scanner.nextLine();

        Zzper zzper = new Zzper(zzperNaam, zzperAdres);

        // Maak een Klant
        System.out.print("Voer de naam van de Klant in: ");
        String klantNaam = scanner.nextLine();

        System.out.print("Voer het adres van de Klant in: ");
        String klantAdres = scanner.nextLine();

        Klant klant = new Klant(klantNaam, klantAdres);

        // Afstand
        System.out.print("Voer de afstand in kilometers in: ");
        double afstandKm = scanner.nextDouble();

        System.out.print("Voer de prijs per kilometer in: ");
        double prijsPerKm = scanner.nextDouble();

        Afstand afstand = new Afstand(afstandKm, prijsPerKm);

        // Uren
        System.out.print("Voer het aantal gewerkte uren in: ");
        int urenGewerkt = scanner.nextInt();

        System.out.print("Voer het uurtarief in: ");
        double uurtarief = scanner.nextDouble();

        Uren uren = new Uren(urenGewerkt, uurtarief);

        // Factuur
        System.out.print("Voer het factuurnummer in: ");
        int factuurNr = scanner.nextInt();

        System.out.print("Voer de factuurdatum in (dd-mm-yyyy): ");
        String factuurDatum = scanner.next();

        Factuur factuur = new Factuur(factuurNr, factuurDatum);

        // Bereken de kosten voor Afstand en Uren
        double kostenAfstand = afstand.berekenKosten();
        double kostenUren = uren.berekenKosten();

        // Bereken het totaalbedrag van de Factuur
        double totaalBedrag = factuur.berekenTotaalBedrag(kostenAfstand, kostenUren);

        PrintFactuur printFactuur = new PrintFactuur(zzper, klant, uren, afstand, factuur);

        // Druk de factuur af
        printFactuur.printFactuur();
    }
}


