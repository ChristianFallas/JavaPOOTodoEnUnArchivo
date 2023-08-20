package com.ChristianDev.Clases;

import com.ChristianDev.Erencia.Carro;
import com.ChristianDev.Erencia.Moto;
import com.ChristianDev.abstraccion.Animal;
import com.ChristianDev.abstraccion.Gato;
import com.ChristianDev.abstraccion.Perro;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //1. Creando un Objeto (instanciar un objeto).
        Motor motorV8 = new Motor("V8", 25, 120, 8);
        Veiculo carro = new Veiculo("Toyota", "Tundra", 2023, 4, 5, 190, motorV8);
        carro.acelerar(200);
        System.out.println("Tipo de motor: " + carro.getMortor());

        //2. Herencia.
        Moto kawasakiNinja = new Moto(true, "Kawasaki", "Ninja", 2023, 2, 2, 200, motorV8);
        System.out.println("La marca de la moto es: " + kawasakiNinja.getMarca());

        //3. Polimorfismo.
        Veiculo veiculo = new Moto(false, "honda", "Aventur", 2022, 2, 2, 160, motorV8);
        veiculo.acelerar();

        veiculo = new Carro(4, "Toyota", "Prado", 1997, 4, 5, 130, motorV8);
        veiculo.acelerar();

        //4. Abstracción.
        Animal gato = new Gato("Masculino", 2, "Negro");
        gato.dormir();

        Animal perro = new Perro("Femenino", 1, "Criollo");
        perro.comer();
    }
}
