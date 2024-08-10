package org.william.optional.ejemplo;

import org.william.optional.ejemplo.models.Computador;
import org.william.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.william.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("Rog").ifPresentOrElse(System.out::println, () -> System.out.println("No se encontró el computador"));
//        Optional<Computador> pc = repositorio.filtrar("Asus ROG1");
//        if (pc.isPresent()) {
//            System.out.println(pc.get());
//        } else {
//            System.out.println("No se encontró el computador");
//        }
    }
}
