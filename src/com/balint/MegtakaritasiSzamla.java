package com.balint;

public class MegtakaritasiSzamla extends Szamla {
    private static int alapKamat = 10;
    private int kamat = alapKamat;

    public void setKamat(int kamat) { this.kamat = kamat; }
    public int getKamat() { return this.kamat; }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public void Kamatjovairas() {
        super.egyenleg = super.egyenleg * (100 + this.kamat) / 100;
    }

    @Override
    public boolean Kivesz(int osszeg) {
        if (super.egyenleg - osszeg > 0) {
            super.egyenleg -= osszeg;
            return true;
        }
        return false;
    }
}
