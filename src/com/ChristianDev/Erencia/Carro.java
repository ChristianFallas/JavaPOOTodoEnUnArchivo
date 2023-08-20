package com.ChristianDev.Erencia;

import com.ChristianDev.Clases.Veiculo;

import com.ChristianDev.Clases.Motor;

public  class Carro extends Veiculo {
    //metodo super para llamar al contructor de mi case padre.

    private int numPuertas;


    public Carro (int numPuertas, String marca, String modelo, int ano, int llantas, int pasajeros, double velocidadMaxima, Motor motor) {
        super(marca, modelo, ano, llantas, pasajeros, velocidadMaxima, motor); /*esto pasa los valores de este constructor al constructor de
        la super clase, para que esta inicialice sus propias variables utilizando estos valores*/
        this.numPuertas = numPuertas;
    }

    public void setNumPuertas (int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas () {
        return this.numPuertas;
    }

    @Override
    public void acelerar () {
        System.out.println("Estoy acelerando el carro.");
    }
}
