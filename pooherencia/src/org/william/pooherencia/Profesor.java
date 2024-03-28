package org.william.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor() {
        System.out.println("Profesor");
    }

    public Profesor(String nombre,String apellido){
        super(nombre,apellido);
    }

    public Profesor(String nombre,String apellido,String asignatura){
        this(nombre,apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return "Buenos dias soy el saludar. de";
    }

    @Override
    public String toString(){
        return super.toString() + " "+ asignatura;
    }

}