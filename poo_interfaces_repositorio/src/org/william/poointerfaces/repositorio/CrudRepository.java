package org.william.poointerfaces.repositorio;

import org.william.poointerfaces.repositorio.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
}
