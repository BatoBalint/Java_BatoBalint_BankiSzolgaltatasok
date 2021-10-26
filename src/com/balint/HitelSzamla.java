package com.balint;

public class HitelSzamla extends Szamla {
    private int hitelkeret;

    public int getHitelkeret() { return this.hitelkeret; }

    public HitelSzamla(Tulajdonos tulajdonos, int hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    @Override
    public boolean Kivesz(int osszeg) {
        if (super.getEgyenleg() - osszeg > -1 * hitelkeret) {
            super.egyenleg -= osszeg;
            return true;
        }
        return false;
    }
}
