package curso;


import java.util.ArrayList;
import java.util.List;



public class Curso {

    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Yessica", "Dieguez", 5, 01));
        estudiantes.add(new Estudiante("Preiscila", "Mendez", 6, 02));

        System.out.println("Los estudiantes son:");
        for (Estudiante estudianteactual1 : estudiantes) {
            System.out.println("nombre: " + estudianteactual1.getNombre() + "  Apellido:  " + estudianteactual1.getApellido() + " Calificacion:  " + estudianteactual1.getCalificacion() + " ID: " + estudianteactual1.getId());

        }

        System.out.println("Ingresar id del alumno");
       
        int id=00
        while ( int i = 0; i < estudiantes.size();i++){
            if (int id=estudiantes.get(00)){
        System.out.println("El alumno es: " + estudiantes.get(00));
        } 

}
    }}