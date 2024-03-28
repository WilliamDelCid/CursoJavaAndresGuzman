package org.william.app.jardin;

import org.william.app.hogar.Persona;

import static org.william.app.hogar.ColorPelo.CAFE;
import static org.william.app.hogar.Persona.GENERO_MASCULINO;
import static org.william.app.hogar.Persona.saludar;
public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Andres");
        persona.setColorPelo(CAFE);
        System.out.println("persona = " + persona.getNombre());
        Perro  perro = new Perro();
        perro.nombre =  "tobby";
        perro.raza  =  "casita";
        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        String generoMasculino = GENERO_MASCULINO;
    }
}
