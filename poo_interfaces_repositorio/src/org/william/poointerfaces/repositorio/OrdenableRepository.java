package org.william.poointerfaces.repositorio;

import org.william.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepository<T> {

    List<T> listar(String campo,Direcccion dir);



}
