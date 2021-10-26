package com.balint;

public abstract class BankiSzolgaltatas {
    private Tulajdonos tulajdonos;

    public Tulajdonos getTulajdonos() { return this.tulajdonos; }

    public BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }
}
