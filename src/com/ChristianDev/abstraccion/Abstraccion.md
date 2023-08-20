# Abstracción.

La abstracción en Java es un concepto clave en la programación orientada a objetos que permite simplificar y organizar el código al enfocarse en los aspectos esenciales de un objeto y ocultar los detalles innecesarios. 
La abstracción se logra mediante el uso de clases abstractas e interfaces. Una clase abstracta es una clase que no se puede instanciar directamente, sino que se utiliza como base para derivar subclases concretas. Proporciona una estructura común y define métodos abstractos que las subclases deben implementar. La abstracción permite definir comportamientos y propiedades generales que se comparten entre las subclases, mientras que los detalles específicos se implementan en cada subclase. 
Por otro lado, una interfaz en Java es una colección de métodos abstractos que una clase puede implementar. Las interfaces permiten definir un contrato que una clase debe cumplir, especificando los métodos que deben ser implementados. Esto proporciona una forma de establecer una estructura común y permite que las clases se comporten de manera similar, independientemente de su implementación real. 
La abstracción en Java permite separar la implementación de los detalles internos de un objeto de su uso externo. Esto facilita la modularidad, el reuso de código y el mantenimiento del programa. Al utilizar la abstracción, se pueden crear jerarquías de clases que representen conceptos del mundo real de manera más clara y concisa. 
En resumen, la abstracción en Java es un concepto que permite simplificar y organizar el código al enfocarse en los aspectos esenciales de un objeto y ocultar los detalles innecesarios. Se logra mediante el uso de clases abstractas e interfaces, que proporcionan una estructura común y definen comportamientos generales para las clases derivadas o implementadoras.

## Clases Abstractas.

Una clase abstracta en Java es una clase que no puede ser instanciada directamente, es decir, no se pueden crear objetos de ella. Sin embargo, puede ser utilizada como una clase base para derivar subclases concretas. 
 
La principal característica de una clase abstracta es que puede contener métodos abstractos. Un método abstracto es un método que no tiene implementación en la clase abstracta, solo se declara la firma del método. Las subclases concretas deben proporcionar una implementación para estos métodos abstractos. 
 
Cuando una clase hereda de una clase abstracta, debe implementar todos los métodos abstractos definidos en la clase abstracta o también puede ser una clase abstracta. Esto permite que las subclases concretas proporcionen una implementación específica para cada método abstracto, adaptándose a sus necesidades individuales. 
 
Además de los métodos abstractos, una clase abstracta puede contener métodos concretos, es decir, métodos que tienen una implementación definida. Estos métodos concretos pueden ser heredados y utilizados por las subclases sin necesidad de ser implementados nuevamente. 
 
La utilidad de una clase abstracta radica en proporcionar una estructura común y definir comportamientos generales que se comparten entre las subclases. Esto promueve la reutilización de código y la creación de jerarquías de clases más claras y concisas. 
 
En resumen, una clase abstracta en Java es una clase que no puede ser instanciada directamente y que puede contener métodos abstractos. Sirve como una clase base para que las subclases concretas hereden y proporcionen implementaciones específicas para los métodos abstractos. Proporciona una estructura común y promueve la reutilización de código en la programación orientada a objetos.

### Ejemplo de una clase abstracta

~~~
abstract class Forma {
    protected String color;
    
    public Forma(String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    public void mostrarColor() {
        System.out.println("El color de la forma es: " + color);
    }
}

class Circulo extends Forma {
    private double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Forma {
    private double longitud;
    private double ancho;
    
    public Rectangulo(String color, double longitud, double ancho) {
        super(color);
        this.longitud = longitud;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea() {
        return longitud * ancho;
    }
}

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5.0);
        circulo.mostrarColor();
        System.out.println("Área del Círculo: " + circulo.calcularArea());
        
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);
        rectangulo.mostrarColor();
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
    }
}
~~~

En este ejemplo, tenemos una clase abstracta llamada  Forma  que tiene un constructor para establecer el color y un método abstracto  `calcularArea()`  que es implementado por sus subclases concretas  Circulo  y  Rectángulo . La clase  Forma  también tiene un método no abstracto  `mostrarColor()` que es heredado por sus subclases. 
 
Las clases  Circulo  y  Rectángulo  extienden la clase  Forma  y proporcionan sus propias implementaciones del método  `calcularArea()` . En la clase  Principal , creamos objetos de  Circulo  y  Rectángulo  y demostramos el uso de la clase abstracta y sus subclases concretas. 
 
Ten en cuenta que no podemos crear un objeto de la clase abstracta  Forma , pero sí podemos crear objetos de sus subclases concretas.