package org.william.poointerfaces.repositorio;

import org.william.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepository {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
