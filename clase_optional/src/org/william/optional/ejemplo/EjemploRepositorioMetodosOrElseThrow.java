package org.william.optional.ejemplo;

import org.william.optional.ejemplo.models.Computador;
import org.william.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.william.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(s -> s.contains("."))
                .map(s -> s.substring(archivo.indexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);
    }

}
