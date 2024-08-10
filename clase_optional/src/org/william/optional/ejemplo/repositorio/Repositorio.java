package org.william.optional.ejemplo.repositorio;

import org.william.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computador> filtrar(String nombre);
}
