package com.ChristianDev.Clases;

public class Motor {
    String modelo;
    int caballos;
    double parNM;
    int numCilindros;

    public Motor (String modelo, int caballos, double parNM, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNM = parNM;
        this.numCilindros = numCilindros;
    }

    @Override

    public String toString () {
        return "Motor [modelo= " + modelo + " caballos= " + caballos + " parNM= " + parNM + " NumeroCilindor= " + numCilindros + "]";
    }

}
