import java.util.ArrayList;

import people.*;
public class Main {
    public static double calcularPromedioImpuestos(ArrayList<Persona> array){
        double total = 0;
        int contador = 0;

        for (Persona p : array) {
            total += p.pagaImpuestos();
            contador++;
        }
        if (contador > 0) {
            return total / contador;
        } else {
            return 0; // maneja el caso que la lista este vacia para evitar la división por cero
        }
    }
    public static void main(String[] args){
        // creamos los objetos
        Persona estudiantePablo = new Estudiante("Pablo Ramirez", 7, "primaria", 1234, "segundo");
        Persona estudianteAndres = new Estudiante("Andres Latorre", 24, "arquitectura", 555, "cuarto");
        Persona estudianteMaria = new Estudiante("Maria", 22, "magistrado", 912, "primero");
        Persona docenteLaura = new Docente("Laura Boffa", 62, "Av. Libertador Brig. Gral. Lavalleja 1960, Montevideo, Departamento de Montevideo", "Quimica", 80000);
        Persona docenteRafael = new Docente("Rafael Lopez", 66, "Av. Instrucciones del Año XIII 654, Las Piedras, Departamento de Canelones", "Matematica", 40000);
    
        ArrayList<Persona> arrayPersonas = new ArrayList<>();//creamos el ArrayList que contendrán los objetos creados
        arrayPersonas.add(docenteRafael);
        arrayPersonas.add(docenteLaura);
        arrayPersonas.add(estudianteAndres);
        arrayPersonas.add(estudianteMaria);
        arrayPersonas.add(estudiantePablo);
        
        double resultado = calcularPromedioImpuestos(arrayPersonas);

        System.out.println(resultado);
    
    
    
    
        /* OLD 
        System.err.println(estudiantePablo.presentarse());
        System.err.println(estudianteAndres.presentarse());
        System.err.println(estudianteMaria.presentarse());
        System.err.println(docenteLaura.presentarse());
        System.err.println(docenteRafael.presentarse());
        */
    }//end void main
}//end Main
