package org.william.app.hogar;

public class Persona {

   private String nombre;
   public static final String GENERO_MASCULINO = "Masculino";
   public static final String GENERO_FEMENINO = "Femenino";
   private ColorPelo colorPelo;
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String lanzarPelota(){
      return "lanzar pelota";
   }
   public static String saludar(){
      return "Hola que tal";
   }

   public ColorPelo getColorPelo() {
      return colorPelo;
   }

   public void setColorPelo(ColorPelo colorPelo) {
      this.colorPelo = colorPelo;
   }
}
