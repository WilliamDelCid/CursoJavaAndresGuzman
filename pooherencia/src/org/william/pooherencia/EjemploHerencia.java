package org.william.pooherencia;


public class EjemploHerencia {

    public static void main(String[] args) {
        System.out.println("Creando la instancia de clase Alumno");
        Alumno alumno = new Alumno();
        alumno.setNombre("William");
        alumno.setApellido("Deel Cid");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Peerez");
        profesor.setAsignatura("Matematicaa");
        System.out.println("alumno.getNombre() = " + alumno.getNombre());

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        Class clase = alumnoInt.getClass();
//        while()

    }
    
}
