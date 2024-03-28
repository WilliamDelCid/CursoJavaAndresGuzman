package org.wiliam.popinterfaces.imprenta.models;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Imprimible pag: this.paginas){
            stringBuilder.append(pag.imprimir()).append("\n");
        }
        return stringBuilder.toString();
    }

}
