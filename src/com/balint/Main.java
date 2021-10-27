package com.balint;

import java.util.MissingResourceException;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t1 = new Tulajdonos("Peti");
        Tulajdonos t2 = new Tulajdonos("Bela");

        HitelSzamla h1 = new HitelSzamla(t1, 5000);
        HitelSzamla h2 = new HitelSzamla(t2, 15000);

        MegtakaritasiSzamla m1 = new MegtakaritasiSzamla(t1);

        h1.Befizet(52000);
        h2.Befizet(150000);

        m1.Befizet(56000);

        System.out.println(h1.Kivesz(100000));
        System.out.println(h2.Kivesz(10000));
        System.out.println();

        System.out.println(m1.getEgyenleg());
        m1.Kamatjovairas();
        System.out.println(m1.getEgyenleg());
        m1.Kamatjovairas();
        System.out.println(m1.getEgyenleg());
        m1.Kamatjovairas();
        System.out.println(m1.getEgyenleg());
        System.out.println();

        Bank b1 = new Bank(10);

        b1.SzamlaNyitas(t1, 0);
        b1.SzamlaNyitas(t1, 5000);
        b1.SzamlaNyitas(t1, 150000);
        b1.SzamlaNyitas(t2, 0);
        b1.SzamlaNyitas(t2, 5000);
        b1.SzamlaNyitas(t2, 0);
        b1.SzamlaNyitas(t2, 300000);

        System.out.println(b1.Osszhitelkeret());
        Szamla legnagyobb = b1.LegnagyobbEgyenleguSzamla(t1);
        System.out.println(legnagyobb.getTulajdonos().toString());
        System.out.println(legnagyobb.getEgyenleg());
        System.out.println(b1.Osszegyenleg(t2));
    }
}
