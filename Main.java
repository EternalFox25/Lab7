import people.*;
public class Main {
    public static void main(String[] args){
    Estudiante estudiantePablo = new Estudiante("Pablo Ramirez", 7, "primaria", 1234, "segundo");
    Estudiante estudianteAndres = new Estudiante("Andres Latorre", 24, "arquitectura", 555, "cuarto");
    Estudiante estudianteMaria = new Estudiante("Maria", 22, "magistrado", 912, "primero");
    Docente docenteLaura = new Docente("Laura Boffa", 62, "Av. Libertador Brig. Gral. Lavalleja 1960, Montevideo, Departamento de Montevideo", "Quimica", 80000);
    Docente docenteRafael = new Docente("Rafael Lopez", 66, "Av. Instrucciones del Año XIII 654, Las Piedras, Departamento de Canelones", "Matematica", 40000);
    System.err.println(estudiantePablo.presentarse());
    System.err.println(estudianteAndres.presentarse());
    System.err.println(estudianteMaria.presentarse());
    System.err.println(docenteLaura.presentarse());
    System.err.println(docenteRafael.presentarse());
    }
}
