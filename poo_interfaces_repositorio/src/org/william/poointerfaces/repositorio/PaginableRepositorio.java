package org.william.poointerfaces.repositorio;

import org.william.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> listar(int desde,int hasta);


}
