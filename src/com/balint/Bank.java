package com.balint;

import java.util.ArrayList;

public class Bank {
    private Szamla[] szamlak;
    private int index = 0;

    public Bank(int mennyiSzamla) {
        this.szamlak = new Szamla[mennyiSzamla];
    }

    public Szamla SzamlaNyitas(Tulajdonos tulajdonos, int hitelkeret) {
        Szamla mySzamla;
        if (hitelkeret == 0) {
            if (index < szamlak.length) {
                mySzamla = new MegtakaritasiSzamla(tulajdonos);
                szamlak[index] = mySzamla;
                index++;
            } else {
                mySzamla = new Szamla(new Tulajdonos("Nincs hely"));
            }
        } else {
            if (index < szamlak.length) {
                mySzamla = new HitelSzamla(tulajdonos, hitelkeret);
                szamlak[index] = mySzamla;
                index++;
            } else {
                mySzamla = new Szamla(new Tulajdonos("Nincs hely"));
            }
        }
        return mySzamla;
    }

    public int Osszegyenleg(Tulajdonos tulajdonos) {
        int sum = 0;
        for (Szamla szamla : szamlak) {
            if (szamla.getTulajdonos() == tulajdonos) sum += szamla.getEgyenleg();
        }
        return sum;
    }
    public Szamla LegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        int biggest = 0;
        for (int i = 0; i < szamlak.length; i++) {
            if (szamlak[i].getEgyenleg() > szamlak[biggest].getEgyenleg()) biggest = i;
        }
        return szamlak[biggest];
    }

    public int Osszhitelkeret() {
        int sum = 0;
        for (Szamla szamla : szamlak) {
            if (szamla instanceof HitelSzamla) {
                sum += ((HitelSzamla) szamla).getHitelkeret();
            }
        }
        return sum;
    }
}
