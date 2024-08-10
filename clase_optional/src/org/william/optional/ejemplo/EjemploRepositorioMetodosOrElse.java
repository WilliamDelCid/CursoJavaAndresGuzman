package org.william.optional.ejemplo;

import org.william.optional.ejemplo.models.Computador;
import org.william.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.william.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
//        Computador defecto = new Computador("Asus", "Ryzen 7 3700x");
        Computador pc = repositorio.filtrar("Rog").orElse(obtenerPCDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("Rog").orElseGet(EjemploRepositorioMetodosOrElse::obtenerPCDefecto);
        System.out.println(pc);
    }

    public static Computador obtenerPCDefecto() {
        System.out.println("Obteniendo PC por defecto");
        return new Computador("HP", "Ryzen 5 3500");
    }
}
