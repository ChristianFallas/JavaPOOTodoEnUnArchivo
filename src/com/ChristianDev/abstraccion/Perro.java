package com.ChristianDev.abstraccion;

public class Perro extends Animal {
    String rasa;

    public Perro (String sexo, int edad, String rasa) {
        this.sexo = sexo;
        this.edad = edad;
        this.rasa = rasa;
    }

    public void instinto () {
        System.out.println("Instinto de matar");
    }

    public void olfatear () {
        System.out.println("Huelo algo.");
    }
}
