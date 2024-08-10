package org.william.optional.ejemplo;

import org.william.optional.ejemplo.models.Computador;
import org.william.optional.ejemplo.models.Fabricante;
import org.william.optional.ejemplo.models.Procesador;
import org.william.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.william.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        String pc = repositorio.filtrar("Asus")
                        .flatMap(Computador::getProcesador) // Optional<Procesador> se usa flatMap si el valor es un Optional si no se usa map
                        .flatMap(Procesador::getFabricante)
                        .filter(fabricante -> "intel".equalsIgnoreCase(fabricante.getNombre()))
                        .map(Fabricante::getNombre)
                        .orElse("Desconocido");
        System.out.println(pc);
    }
}
