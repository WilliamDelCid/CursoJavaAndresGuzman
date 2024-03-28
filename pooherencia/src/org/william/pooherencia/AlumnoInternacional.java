package org.william.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;

    public AlumnoInternacional(){
        System.out.println("Alumno: Inicializando constructor");
    }

    public AlumnoInternacional(String nombre,String apellido){
        super(nombre,apellido);
    }

    public AlumnoInternacional(String nombre,String apellido,String pais){
        this(nombre,apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return "Buenos dias soy el alumnoInternacional de";
    }

   @Override
    public double calcularPromedio(){
       System.out.println("impresion"+ AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) +5)/4;
   }

    @Override
    public String toString() {
        return super.toString() + "AlumnoInternacional{" +

                "pais='" + pais + '\'' +
                '}';
    }
}
