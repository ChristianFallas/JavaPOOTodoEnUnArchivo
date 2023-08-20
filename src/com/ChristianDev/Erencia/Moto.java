package com.ChristianDev.Erencia;

import com.ChristianDev.Clases.Veiculo;

import com.ChristianDev.Clases.Motor;

public class Moto extends Veiculo  {
    private boolean cajon;

    public Moto (boolean cajon, String marca, String modelo,int ano, int llantas, int pasajeros, double velocidadMaxima, Motor motor) {
        super(marca, modelo, ano, llantas, pasajeros, velocidadMaxima, motor); /*esto pasa los valores de este constructor al constructor de
        la super clase, para que esta inicialice sus propias variables utilizando estos valores*/
        this.cajon = cajon;
    }

    public void setMoto (boolean cajon) {
        this.cajon = cajon;
    }
    public boolean isCajon () {
        return cajon;
    }

    @Override
    public void acelerar () {
        System.out.println("Estoy acelerando la moto.");
    }
}
