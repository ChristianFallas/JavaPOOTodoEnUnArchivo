# Interfaces en Java.

Una interfaz en Java es una colección de métodos abstractos y constantes que se pueden implementar en otras clases. A diferencia de las clases abstractas, las interfaces no pueden contener implementaciones de métodos, solo declaraciones de métodos y constantes. 
Una interfaz se define utilizando la palabra clave  interface  y puede contener métodos abstractos y métodos estáticos. Además, puede contener constantes, que son variables finales y estáticas. 
Cuando una clase implementa una interfaz, debe proporcionar una implementación para todos los métodos declarados en la interfaz. Esto se hace utilizando la palabra clave  implements  en la declaración de la clase y proporcionando las implementaciones de los métodos. 
Una clase puede implementar múltiples interfaces, lo que permite la implementación de múltiples comportamientos. Esto es beneficioso para lograr la modularidad y el reuso de código. 
Las interfaces en Java también se utilizan para lograr la abstracción y el polimorfismo. Pueden ser utilizadas como tipos de datos, lo que permite tratar a los objetos de diferentes clases que implementan la misma interfaz como objetos del mismo tipo. 
En resumen, una interfaz en Java es una colección de métodos abstractos y constantes que se pueden implementar en otras clases. Proporciona una forma de definir comportamientos comunes y establecer contratos para las clases que la implementan.

## Usos.

Los principales usos de las interfaces en Java son los siguientes: 
 
1. Definir contratos: Las interfaces se utilizan para establecer un contrato entre diferentes partes de un programa. Al implementar una interfaz, una clase se compromete a proporcionar la implementación de todos los métodos declarados en la interfaz. Esto permite una comunicación clara y consistente entre diferentes componentes del programa. 
 
2. Lograr la abstracción: Las interfaces permiten la creación de abstracciones, ya que definen un conjunto de métodos que deben ser implementados por las clases concretas. Esto permite que el código se base en la interfaz en lugar de depender de implementaciones específicas, lo que facilita la modularidad y el reuso del código. 
 
3. Permitir el polimorfismo: Las interfaces se utilizan para lograr el polimorfismo en Java. Una clase puede implementar una interfaz y luego ser tratada como un objeto de esa interfaz. Esto permite escribir código genérico que pueda trabajar con diferentes implementaciones de la interfaz. 
 
4. Facilitar la creación de bibliotecas y frameworks: Las interfaces son fundamentales para la creación de bibliotecas y frameworks en Java. Al definir interfaces claras y bien diseñadas, se pueden proporcionar puntos de extensión y personalización para que los usuarios de la biblioteca o framework implementen sus propias clases y utilicen la funcionalidad proporcionada. 
 
5. Permitir herencia múltiple limitada: A diferencia de las clases, una clase puede implementar múltiples interfaces en Java. Esto permite que una clase adquiera comportamientos de varias fuentes diferentes, lo que proporciona una mayor flexibilidad en el diseño y la implementación de sistemas.

### Ejemplo:

~~~

interface Figura {
    double calcularArea();
    void mostrarInformacion();
}

class Circulo implements Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Círculo - Radio: " + radio);
    }
}

class Rectangulo implements Figura {
    private double longitud;
    private double ancho;
    
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea() {
        return longitud * ancho;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Rectángulo - Longitud: " + longitud + ", Ancho: " + ancho);
    }
}

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.mostrarInformacion();
        System.out.println("Área del Círculo: " + circulo.calcularArea());
        
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        rectangulo.mostrarInformacion();
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
    }
}
~~~

En este ejemplo, tenemos una interfaz llamada  Figura  que declara dos métodos:  calcularArea()  y  mostrarInformacion() . Las clases  Circulo  y  Rectangulo  implementan esta interfaz y proporcionan sus propias implementaciones de los métodos. 
La clase  Principal  crea objetos de  Circulo  y  Rectangulo  y muestra información sobre ellos, como el radio o las dimensiones. Además, se calcula y muestra el área de cada figura utilizando los métodos implementados en las clases. 
Ten en cuenta que una interfaz solo declara los métodos, pero no proporciona implementaciones. Las clases que implementan la interfaz deben proporcionar las implementaciones de los métodos declarados en la interfaz.

#### Nota sobre @Override.

El  @Override  es una anotación en Java que se utiliza para indicar que un método está sobrescribiendo (o implementando) un método de una superclase o interfaz. En el contexto de la implementación de métodos de una interfaz, el  @Override  se utiliza para asegurarse de que el método se está implementando correctamente y no se está introduciendo un nuevo método con un nombre similar por error. 
 
Cuando una clase implementa una interfaz, debe proporcionar una implementación para todos los métodos declarados en la interfaz. Al utilizar  @Override , se garantiza que el método que se está implementando realmente coincide con un método de la interfaz, evitando errores de sintaxis o lógica. 
 
La anotación  @Override  es opcional, pero se considera una buena práctica utilizarla siempre que se sobrescriba un método. Además, ayuda a mejorar la legibilidad del código y a mantenerlo más claro, ya que indica claramente que el método está reemplazando a otro en una superclase o interfaz. 
 
En resumen, el  @Override  se utiliza en la implementación de métodos de una interfaz para asegurarse de que el método se está sobrescribiendo correctamente y para evitar errores de sintaxis o lógica.