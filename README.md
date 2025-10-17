# Abstracción y Polimorfismo

## Abstracción
Sirve para generar “plantillas” de clases. Ayuda a generalizar el código y volverlo más legible. La clase abstracta se encarga de los aspectos más generales que todos sus hijos compartirán. Pero sus hijos le dan sus puntos distintivos, distintos a la clase padre.

En java el modificador de abstract puede usarse cuando se declara una clase o un método. 

Abstract class: es una clase que no puede ser instanciada, no permite la creación de objetos. Para poder utilizarla son necesarias generar subclases que nazcan de ella.

Abstract method: sólo puede ser usado dentro de una clase abstracta, no tiene código. El código se lo da la subclase. Al igual que cuando se hace cualquier override de una instancia padre el metodo hijo debe de tener el mismo nombre, parámetros y orden de parámetros.

Es importante resaltar que no todos los métodos dentro de una clase abstracta deben ser abstractos ellos mismos, también pueden ser como los métodos que trabajamos normalmente(public, void, static,etc). 


## Polimorfismo
Las subclases pueden definir sus comportamientos únicos pero compartir algunas funcionalidades básicas con la clase padre. Ya sea utilizado algunos (o todos) de sus parámetros o métodos.

Cuando unimos estos dos conceptos se nos da una herramienta muy útil. Donde la clase padre es altamente versátil y donde sus hijos le dan toda la especificación a la clase.


Decidí trabajar con el código creado en la práctica de herencia, donde a la clase persona le di el modificador de abstract, ya que nunca necesitamos crear un objeto tipo Persona y para lo unico que utilizamos la clase fue para crear sub clases. 
El polimorfismo se puede ver en las clases hijas, ya que usan parámetros (nombre y edad) definidos en la clase persona y ambos hacen override del método presentarse().
