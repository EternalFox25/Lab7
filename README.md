# Abstracción y Polimorfismo

## Abstracción
Sirve para generar “plantillas” de clases. Ayuda a generalizar el código y volverlo más legible. La clase abstracta se encarga de los aspectos más generales que todos sus hijos compartirán. Pero sus hijos le dan sus puntos distintivos, distintos a la clase padre.

En java el modificador de abstract puede usarse cuando se declara una clase o un método. 

Abstract class: es una clase que no puede ser instanciada, no permite la creación de objetos. Para poder utilizarla son necesarias generar subclases que nazcan de ella.

Abstract method: solo puede ser usado dentro de una clase abstracta, no tiene código. El código se lo da la subclase. Al igual que cuando se hace cualquier override de una instancia padre el método hijo debe de tener el mismo nombre, parámetros y orden de parámetros.

Es importante resaltar que no todos los métodos dentro de una clase abstracta deben ser abstractos ellos mismos, también pueden ser como los métodos que trabajamos normalmente(public, void, static,etc). 


## Polimorfismo
Inicialmente, polimorfismo puede sonar similar a herencia, pero tiene algunas diferencias claves. 

La **herencia** se produce cuando una *clase* deriva de una *clase* ya creada. Por lo tanto, si tenés una clase *Persona*, y luego creas una clase *Estudiante* y una clase *Docente* que extiende *Persona*, *Estudiante* y *Docente* heredan todas las características que tiene *Persona*.

El **polimorfismo** se encarga de cómo el programa decide qué métodos debe utilizar. Si tienes una *Persona*, que tiene un método de pagar impuestos, y tenés *Estudiante* y *Docente* que extienden a *Persona*, que tienen su propia implementación de pagar impuestos (Override), el método que se llama lo determina el tiempo de ejecución, dependiendo de si tienes una Persona o un Estudiante. Por ejemplo:

Persona p = new Estudiante();
Persona d = new Docente();
p.pagaImpuestos();
d.pagaImpuestos();

Se invocará el método pagar impuestos de *Estudiante* o *Docente*. Esta asignación es posible porque *Estudiante* y *Docentes* son *Persona*s.

### Diferencia entre herencia y polimorfismo
La **herencia** se refiere al uso de la estructura y el comportamiento de una superclase en una subclase.

El **polimorfismo** se refiere al cambio del comportamiento de una superclase en la subclase.

## Explicación del código
Decidí trabajar con el código creado en la práctica de herencia, donde a la clase *Persona* le di el modificador de abstract, ya que nunca necesitamos crear un objeto tipo Persona y para lo único que utilizamos la clase fue para generar sub clases. 
Deje el método presentarse() igual, para demostrar que dentro de una clase abstracta pueden existir métodos no abstractos, pero cree un método abstracto pagaImpuestos() que lo único que muestra un int fijo para hacer esta demostración más sencilla. Las clases *Estudiante* y *Docente* le hacen override y le dan su propio valor.

En Main, genere un método calcularPromedioImpuestos(), que lo que hace es sumar todos los impuestos y los divide por la cantidad de veces que tuvo que contar. Para hacerlo se usa un simple for each que solo acepta ArrayLists de tipo *Persona*, pero esos objetos están haciendo uso del **polimorfismo**, lo que les permite comportarse como su subclase.

## Conclusiones
Cuando unimos estos dos conceptos se nos da una herramienta muy útil. Donde la clase padre es altamente versátil y donde sus hijos le dan toda la especificación a la clase. Que facilitan la lectura y comprensión del código. Haciendo que sea más fácil poder trabajar con el código a medida que va creciendo