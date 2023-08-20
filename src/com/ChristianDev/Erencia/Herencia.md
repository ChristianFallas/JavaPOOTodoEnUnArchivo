# Herencia

La herencia es un concepto fundamental en la programación orientada a objetos (POO) en Java. Se refiere a la capacidad de una clase de heredar características y comportamientos de otra clase. La clase que hereda se conoce como subclase o clase derivada, y la clase de la cual se heredan las características se conoce como superclase o clase base. 
 
Para establecer una relación de herencia entre dos clases en Java, se utiliza la palabra clave "extends". La subclase se declara utilizando la palabra clave "class" seguida del nombre de la subclase, seguida de la palabra clave "extends" y el nombre de la superclase. Por ejemplo:

~~~
public class Subclase extends Superclase {
    // Código de la subclase
}
~~~

Al heredar de una superclase, la subclase adquiere todos los atributos y métodos de la superclase, incluidos los atributos y métodos privados. Esto significa que la subclase puede acceder y utilizar los atributos y métodos heredados como si fueran propios. 
 
La herencia permite crear una jerarquía de clases en la que las clases más específicas heredan características de las clases más generales. Esto facilita la reutilización de código y la organización de las clases en una estructura lógica. 
 
Además de heredar los atributos y métodos de la superclase, la subclase también puede agregar nuevos atributos y métodos, o modificar los existentes. Esto se conoce como extensión o especialización. La subclase puede anular (override) los métodos de la superclase para proporcionar una implementación específica para la subclase. 
 
En resumen, la herencia en la POO de Java permite que una clase herede características y comportamientos de otra clase. Esto facilita la reutilización de código y la organización de las clases en una jerarquía. La subclase puede acceder y utilizar los atributos y métodos heredados de la superclase, y también puede agregar nuevos atributos y métodos, o modificar los existentes.

## Como Hacer Override.

Claro, puedo explicarte cómo se lleva a cabo un override en Java.  
 
El override, también conocido como anulación, es un concepto en la programación orientada a objetos donde una subclase proporciona su propia implementación de un método que ya está definido en su superclase. Esto permite que la subclase modifique o extienda el comportamiento del método heredado. 
 
Para realizar un override, se deben seguir los siguientes pasos: 
 
1. Crear una subclase que extienda a la superclase que contiene el método que se desea anular. 
2. Definir en la subclase un método con la misma firma (nombre y parámetros) que el método que se desea anular en la superclase. 
3. Utilizar la anotación  @Override  antes de la definición del método en la subclase. Esto es opcional, pero es una buena práctica para asegurarse de que el método se está anulando correctamente. 
 
Aquí hay un ejemplo que ilustra cómo se realiza un override en Java:

~~~
class Superclase {
    public void saludar() {
        System.out.println("Hola, soy la superclase");
    }
}

class Subclase extends Superclase {
    @Override
    public void saludar() {
        System.out.println("Hola, soy la subclase");
    }
}

public class Main {
    public static void main(String[] args) {
        Superclase superObjeto = new Superclase();
        superObjeto.saludar();  // Salida: "Hola, soy la superclase"

        Subclase subObjeto = new Subclase();
        subObjeto.saludar();  // Salida: "Hola, soy la subclase"
    }
}
~~~

En este ejemplo, la subclase  `Subclase`  anula el método  `saludar()`  de la superclase  `Superclase` . Cuando se crea un objeto de la subclase y se llama al método  `saludar()` , se ejecuta la implementación de la subclase en lugar de la de la superclase. 
 
El override es útil cuando se necesita modificar o personalizar el comportamiento de un método heredado en una subclase. Permite adaptar el comportamiento de la clase base a las necesidades específicas de la subclase.