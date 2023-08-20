package com.ChristianDev.abstraccion.interfaces;

public class Roble implements Arbol {

    int edad;

    public Roble (int edad) {
        this.edad = edad;
    }

    @Override
    public void crecer () {
        System.out.println("Creciendo.");
    }
    
}
