package com.ChristianDev.abstraccion;

public abstract class Animal {
    String sexo;
    int edad;

    public void comer () {
        System.out.println("Estoy comiendo");
    }
    public void defecar () {
        System.out.println("Estoy defecando");
    }
    public void dormir () {
        System.out.println("Estoy durmiendo");
    }

    // Método abstracto.
    public abstract void instinto();
}
