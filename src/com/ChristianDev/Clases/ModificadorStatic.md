# Modificador Static en Java.

En Java, el modificador "static" se utiliza para declarar variables, métodos y bloques de código que pertenecen a la clase en sí, en lugar de pertenecer a una instancia específica de la clase. Esto significa que los miembros estáticos son compartidos por todas las instancias de la clase y se pueden acceder directamente a través del nombre de la clase. 
 
Aquí hay algunos ejemplos de uso del modificador "static" en Java: 
 
1. Variables estáticas: Una variable estática se declara utilizando la palabra clave "static" y se comparte entre todas las instancias de la clase. Pueden ser accedidas directamente a través del nombre de la clase, sin necesidad de crear una instancia. Por ejemplo:

~~~
public class MyClass {
    static int myStaticVariable = 10;
    
    public static void main(String[] args) {
        System.out.println(MyClass.myStaticVariable); // Acceso directo a la variable estática
    }
}
~~~

2. Métodos estáticos: Un método estático se declara utilizando la palabra clave "static" y se puede llamar directamente a través del nombre de la clase, sin necesidad de crear una instancia. Estos métodos no pueden acceder a variables de instancia, solo a variables estáticas. Por ejemplo:

~~~
public class MathUtils {
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int result = MathUtils.sum(5, 3); // Llamada al método estático sin instancia
        System.out.println(result);
    }
}
~~~

3. Bloques estáticos: Un bloque estático se utiliza para inicializar variables estáticas y se ejecuta solo una vez cuando se carga la clase. Por ejemplo:

~~~
public class MyClass {
    static int myStaticVariable;
    
    static {
        myStaticVariable = 10; // Inicialización en el bloque estático
    }
    
    public static void main(String[] args) {
        System.out.println(MyClass.myStaticVariable);
    }
}
~~~

En resumen, el modificador "static" en Java se utiliza para declarar variables y métodos que pertenecen a la clase en sí, en lugar de pertenecer a una instancia específica. Esto permite acceder a ellos directamente a través del nombre de la clase, sin necesidad de crear una instancia.