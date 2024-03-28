package org.william.pooherencia;


public class EjemploHerenciaConstructores {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("William","Del Cid",41,"Ins");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(5.5);
        alumno.setNotaMatematica(5.5);
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Extranjero","Extranjero","Australia");
        alumnoInternacional.setEdad(14);
        alumnoInternacional.setInstitucion("Ins");
        alumnoInternacional.setNotaCastellano(5.5);
        alumnoInternacional.setNotaHistoria(5.5);
        alumnoInternacional.setNotaMatematica(5.5);

        Profesor profesor = new Profesor("Luci","Perez","Matematicas");
        profesor.setEdad(14);

        System.out.println("==========================");
imprimir(alumno);
imprimir(alumnoInternacional);
imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo los datos de tipo persona");
        System.out.println(persona.getNombre()
        + " " + persona.getApellido()
        + " " + persona.getEdad()
        + " "+ persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos de alumno");
            System.out.println("Institucion" + ((Alumno)persona).getInstitucion());
            System.out.println("Nota" + ((Alumno)persona).getNotaMatematica());
            System.out.println("Nota" + ((Alumno)persona).getNotaHistoria());
            System.out.println("Nota" + ((Alumno)persona).getNotaCastellano());
            System.out.println("Imprimiendo los datos de alumnoInternacional");

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Nota" + ((AlumnoInternacional)persona).getPais());
            }
        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Nota" + ((Profesor)persona).getAsignatura());

        }
        System.out.println();
    }
    
}
