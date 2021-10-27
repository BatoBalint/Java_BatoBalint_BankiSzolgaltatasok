package com.balint;

public class Szamla extends BankiSzolgaltatas {
    protected int egyenleg = 0;

    public int getEgyenleg() { return this.egyenleg; }

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public void Befizet(int osszeg) {
        this.egyenleg += osszeg;
    }
    public boolean Kivesz(int osszeg) {
        throw new UnsupportedOperationException("No");
    }

    public Kartya UjKartya(String kartyaszam) {
        return new Kartya(this.getTulajdonos(), this, kartyaszam);
    }
}
