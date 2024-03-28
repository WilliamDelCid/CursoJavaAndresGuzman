package org.wiliam.popinterfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(String persona, String carrera,String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String exp){
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for(String exp: this.experiencias){
            stringBuilder.append(" - ").append(exp).append("\n");
        }
        return stringBuilder.toString();
    }
}
