package com.balint;

public class Tulajdonos {
    private String tulajdonosNeve;

    public void setNev(String nev) { this.tulajdonosNeve = nev; }

    public String getNev() { return this.tulajdonosNeve; }

    public Tulajdonos(String nev) {
        this.tulajdonosNeve = nev;
    }
}
