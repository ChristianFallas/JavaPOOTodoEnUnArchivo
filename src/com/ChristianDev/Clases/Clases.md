# Clase en Java.

Las clases en Java son la base de la programación orientada a objetos (POO). Una clase es una plantilla o modelo que define la estructura y el comportamiento de un objeto. En otras palabras, una clase es un plano para crear objetos. 
 
En Java, una clase se define utilizando la palabra clave "class" seguida del nombre de la clase. Por ejemplo, aquí tienes una clase simple llamada "Persona":

~~~
public class Persona {
    // Variables de instancia
    String nombre;
    int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos
    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
~~~

En este ejemplo, la clase "Persona" tiene dos variables de instancia: "nombre" y "edad". También tiene un constructor que se utiliza para crear objetos de tipo "Persona" y un método llamado "saludar" que muestra un mensaje por pantalla. 
 
Para utilizar esta clase, debes crear objetos de tipo "Persona" en tu programa principal. Aquí tienes un ejemplo:

~~~
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);
        
        persona1.saludar();
        persona2.saludar();
    }
}
~~~

En este caso, se crean dos objetos de tipo "Persona" (persona1 y persona2) utilizando el constructor de la clase. Luego se llama al método "saludar" en cada objeto para mostrar los mensajes por pantalla. 
 
Este es solo un ejemplo básico para entender cómo funcionan las clases en Java. Las clases pueden contener muchas más variables, métodos y funcionalidades según las necesidades del programa. La programación orientada a objetos permite organizar y modularizar el código de manera eficiente y reutilizable.

## Que son los atributos de una clase?
Los atributos de una clase son variables que representan las características o propiedades de los objetos creados a partir de esa clase. También se les conoce como variables de instancia o variables miembro. Estos atributos definen el estado de un objeto y pueden tener diferentes tipos de datos, como enteros, cadenas de texto, booleanos, etc. 
 
Por ejemplo, considera la clase "Persona" que mencionamos anteriormente. Los atributos de esta clase podrían ser "nombre" y "edad". Estos atributos son específicos de cada objeto de tipo "Persona" y pueden tener diferentes valores para cada instancia de la clase. 
 
Aquí tienes un ejemplo actualizado de la clase "Persona" con atributos:
~~~
public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
~~~
En este caso, "nombre" y "edad" son los atributos de la clase "Persona". Estos atributos se definen dentro de la clase, pero fuera de cualquier método. Cada objeto de tipo "Persona" tendrá su propio conjunto de valores para estos atributos. 
 
Puedes acceder y modificar los atributos de un objeto utilizando el operador de punto. Por ejemplo:
~~~
Persona persona1 = new Persona("Juan", 25);
System.out.println(persona1.nombre); // Imprime "Juan"
System.out.println(persona1.edad);   // Imprime 25

persona1.edad = 26; // Modifica el valor del atributo "edad"
System.out.println(persona1.edad);   // Imprime 26
~~~

En resumen, los atributos de una clase son variables que definen las características o propiedades de los objetos creados a partir de esa clase. Estos atributos representan el estado de los objetos y pueden tener diferentes valores para cada instancia de la clase.

## Que son los contructores?

Los constructores de una clase son métodos especiales que se utilizan para crear objetos de esa clase. Un constructor tiene el mismo nombre que la clase y no tiene un tipo de retorno explícito. Su principal función es inicializar los atributos de un objeto cuando se crea una instancia de la clase. 
 
En Java, cuando creas un objeto utilizando la palabra clave "new", se invoca automáticamente el constructor de la clase. Puedes tener varios constructores en una clase, cada uno con diferentes parámetros, lo que te permite crear objetos de diferentes maneras. 
 
Aquí tienes un ejemplo de una clase "Persona" con un constructor:

~~~
public class Persona {
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Otros métodos...
}
~~~

En este ejemplo, el constructor de la clase "Persona" recibe dos parámetros: "nombre" y "edad". Dentro del constructor, se asignan los valores de estos parámetros a los atributos correspondientes de la clase utilizando la palabra clave "this". 
 
Luego, puedes crear objetos de tipo "Persona" utilizando el constructor de la siguiente manera:

~~~
Persona persona1 = new Persona("Juan", 25);
Persona persona2 = new Persona("María", 30);
~~~

En este caso, se crean dos objetos de tipo "Persona" utilizando el constructor. Los valores proporcionados como argumentos al constructor se asignan a los atributos "nombre" y "edad" de cada objeto. 
 
Los constructores son útiles para asegurarse de que los objetos se inicialicen correctamente y para proporcionar una forma conveniente de crear instancias de una clase. Puedes tener constructores con diferentes parámetros para adaptarse a diferentes situaciones de creación de objetos.

## Que son los metodos de clases?

Los métodos de una clase son funciones o procedimientos que se definen dentro de la clase y que pueden ser invocados para realizar operaciones o acciones específicas en los objetos creados a partir de esa clase. Los métodos son parte del comportamiento de la clase y pueden acceder y manipular los atributos de los objetos. 
 
Los métodos pueden tener diferentes tipos de retorno, como void (si no devuelven ningún valor) o un tipo de dato específico. También pueden tener parámetros, que son valores que se pasan al método para que pueda realizar ciertas operaciones. 
 
Por ejemplo, considera una clase "Calculadora" con un método llamado "sumar" que recibe dos parámetros de tipo entero y devuelve la suma de esos dos números:

~~~
public class Calculadora {
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}
~~~

En este caso, el método "sumar" recibe dos parámetros de tipo entero ("num1" y "num2") y devuelve la suma de esos dos números. 
 
Puedes llamar a este método desde el programa principal de la siguiente manera:

~~~
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(5, 3);
        System.out.println("El resultado es: " + resultado);
    }
}
~~~

En este ejemplo, se crea un objeto de tipo "Calculadora" y se llama al método "sumar" pasando los valores 5 y 3 como argumentos. El método realiza la suma y devuelve el resultado, que se almacena en la variable "resultado". Luego, se muestra el resultado por pantalla. 
 
En resumen, los métodos de una clase son funciones o procedimientos que se definen dentro de la clase y que pueden ser invocados para realizar operaciones específicas en los objetos creados a partir de esa clase. Los métodos pueden tener diferentes tipos de retorno y pueden recibir parámetros para realizar ciertas operaciones.