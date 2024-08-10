package org.william.optional.ejemplo.repositorio;

import org.william.optional.ejemplo.models.Computador;
import org.william.optional.ejemplo.models.Fabricante;
import org.william.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{
    private List<Computador> dataSource;
    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador procesador = new Procesador("Intel i9", new Fabricante("Intel"));
        Computador asus = new Computador("Asus", "Strix");
        asus.setProcesador(procesador);
        dataSource.add(asus);
        dataSource.add(new Computador("HP", "Pavilion"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
//        for (Computador computador : dataSource) {
//            if (computador.getNombre().equalsIgnoreCase(nombre)) {
//                return Optional.of(computador);
//            }
//        }
//        return Optional.empty();
        return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase())).findFirst();
    }
}
