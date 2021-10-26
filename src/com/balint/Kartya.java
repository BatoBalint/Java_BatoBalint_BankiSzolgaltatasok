package com.balint;

public class Kartya extends BankiSzolgaltatas {
    private String kartyaszam;
    private final Szamla szamla;

    public String getKartyaszam() { return this.kartyaszam; }

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaszam = kartyaszam;

    }

    public boolean Vasarlas(int osszeg) {
        return szamla.Kivesz(osszeg);
    }
}
