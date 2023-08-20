package com.ChristianDev.abstraccion;

public class Gato extends Animal {
    String color;

    public Gato (String sexo, int edad, String color) {
        this.sexo = sexo;
        this.edad = edad;
        this.color = color;
    }

    public void instinto () {
        System.out.println("Instinto de casa");
    }

    public void casar () {
        System.out.println("Estoy en modo cacería");
    }
}
