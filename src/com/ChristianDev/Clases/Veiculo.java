package com.ChristianDev.Clases;

//Super clase o clase padre.
public class Veiculo {
    //Propiedades.
    private String marca;
    private String modelo;
    private int ano;
    private int llantas;
    private int pasajeros;
    private double velocidadMaxima;
    private double velocidadActual;
    private Motor motor;

    //Constructores.
    //Constructor vació (Este es creado por defecto si nosotros no lo creamos).
    public Veiculo () {

    }
    //Podemos tener mas de un constructor (Sobre carga del constructor).
    public Veiculo (String marca, String modelo, int ano, int llantas, int pasajeros, double velocidadMaxima, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.llantas = llantas;
        this.pasajeros = pasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.motor = motor;
    }

    //Métodos (Comportamiento)
    public void acelerar (double velocidad) {
        if (velocidad <= velocidadMaxima) {
            this.velocidadActual = velocidad;
        } else {
            System.out.println("La velocidad supera la velocidad maxima!!!");
        }
        System.out.println("La velocidad actual es: " + velocidadActual);
    }

    //Métodos getter y setters.
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public String getMarca () {
        return this.marca;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public String getModelo () {
        return this.modelo;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }
    public int getAno () {
        return this.ano;
    }

    public void setLlantas (int llantas) {
        this.llantas = llantas;
    }
    public int getLlantas () {
        return this.llantas;
    }

    public void setPasajeros (int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public int getPasajeros () {
        return this.pasajeros;
    }

    public void setVelocidadMaxima (double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getVelocidadMaxima () {
        return this.velocidadMaxima;
    }

    public void setVelocidadActual (double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public double getVelocidadActual () {
        return this.velocidadActual;
    }

    public void setMotor (Motor motor) {
        this.motor = motor;
    }
    public Motor getMortor () {
        return this.motor;
    }

    public void acelerar () {
        System.out.println("Estoy acelerando.");
    }
}
