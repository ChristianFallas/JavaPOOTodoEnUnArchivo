# Encapsulamiento.

El encapsulamiento es un concepto importante en la programación orientada a objetos (POO) en Java. Se refiere a la idea de ocultar los detalles internos de una clase y proporcionar una interfaz pública para interactuar con ella. 
 
En Java, el encapsulamiento se logra utilizando modificadores de acceso como "private", "public" y "protected" para controlar el acceso a los atributos y métodos de una clase. 
 
La idea principal del encapsulamiento es proteger los datos y el funcionamiento interno de una clase. Los atributos de una clase suelen definirse como privados ("private"), lo que significa que solo se pueden acceder directamente desde dentro de la propia clase. Esto evita que otros objetos o clases accedan y modifiquen directamente los datos internos de la clase. 
 
En lugar de acceder directamente a los atributos privados, se utilizan métodos públicos llamados "getters" y "setters" para obtener y establecer los valores de los atributos. Los "getters" permiten obtener el valor de un atributo y los "setters" permiten establecer un nuevo valor para un atributo. Estos métodos proporcionan una interfaz controlada para acceder y modificar los datos internos de una clase, lo que garantiza una mejor encapsulación. 
 
El encapsulamiento también permite establecer reglas y validaciones en los "setters" para garantizar que los datos se mantengan en un estado válido y coherente. 
 
En resumen, el encapsulamiento en Java POO es el concepto de ocultar los detalles internos de una clase y proporcionar una interfaz pública controlada para acceder y modificar los datos internos. Esto se logra utilizando modificadores de acceso, atributos privados y métodos públicos "getters" y "setters". El encapsulamiento ayuda a proteger los datos y garantizar una mejor organización y mantenimiento del código.

## Modificadores de acceso.

En Java, los modificadores de acceso son palabras clave que se utilizan para controlar el nivel de acceso a los miembros (atributos y métodos) de una clase. Hay cuatro modificadores de acceso en Java: 
 
1. Public: El miembro es accesible desde cualquier clase y desde cualquier paquete. No hay restricciones en el acceso. 
 
2. Private: El miembro es accesible solo desde dentro de la misma clase. No es visible ni accesible desde ninguna otra clase o paquete. Este modificador proporciona el más alto nivel de encapsulamiento. 
La única manera de manipular este miembro seria mediante la utilización de getters y setters.
 
3. Protected: El miembro es accesible desde dentro de la misma clase, desde cualquier subclase de la misma clase y desde cualquier clase en el mismo paquete. Sin embargo, no es visible ni accesible desde clases en otros paquetes. 
 
4. Default (sin especificar un modificador de acceso): El miembro es accesible desde dentro de la misma clase y desde cualquier clase en el mismo paquete. Sin embargo, no es visible ni accesible desde clases en otros paquetes. 
 
Estos modificadores de acceso permiten controlar el nivel de visibilidad y acceso a los miembros de una clase, lo que ayuda a garantizar la seguridad y la encapsulación en la programación orientada a objetos. Es importante elegir el modificador de acceso adecuado según los requisitos de diseño y la lógica de la clase.

## Getters y Setters.

Los getters y setters son métodos utilizados en la programación orientada a objetos para acceder y modificar los valores de los atributos de una clase de manera controlada.  
 
Un getter es un método público que se utiliza para obtener el valor de un atributo privado. Por convención, el nombre del getter comienza con "get" seguido del nombre del atributo en CamelCase. Por ejemplo, si tenemos un atributo privado llamado "nombre", el getter correspondiente se llamaría "getNombre()". Este método devuelve el valor actual del atributo. 
 
Un setter es un método público que se utiliza para establecer un nuevo valor para un atributo privado. Por convención, el nombre del setter comienza con "set" seguido del nombre del atributo en CamelCase. Por ejemplo, si tenemos un atributo privado llamado "nombre", el setter correspondiente se llamaría "setNombre()". Este método toma un parámetro que representa el nuevo valor que se desea asignar al atributo. 
 
La ventaja de utilizar getters y setters es que proporcionan un nivel de encapsulamiento, ya que los atributos privados no se pueden acceder directamente desde fuera de la clase. En cambio, se utilizan los métodos públicos para acceder a ellos, lo que permite controlar cómo se obtienen y establecen los valores. 
 
Además, los getters y setters también permiten realizar validaciones y aplicar lógica adicional al obtener o establecer los valores de los atributos. Por ejemplo, en el setter se pueden agregar condiciones para asegurarse de que el valor asignado cumpla ciertas reglas o restricciones. 
 
En resumen, los getters y setters son métodos utilizados para acceder y modificar los valores de los atributos de una clase de manera controlada. Proporcionan un nivel de encapsulamiento y permiten realizar validaciones y aplicar lógica adicional al obtener y establecer los valores.