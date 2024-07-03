package org.william.poointerfaces.repositorio.lista;

import org.william.poointerfaces.modelo.Cliente;
import org.william.poointerfaces.repositorio.AbstractaListRepositorio;
import org.william.poointerfaces.repositorio.Direcccion;
import org.william.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente cliente1 = this.porId(cliente.getId());
        cliente1.setNombre(cliente.getNombre());
        cliente1.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direcccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((o1, o2) -> {
                    int resultado = 0;
                    if (dir == Direcccion.ASC) {
                        resultado = ordenar(campo, o1, o2);
                    } else if (dir == Direcccion.DESC) {
                        resultado = ordenar(campo, o2, o1);
                    }
                    return resultado;
                }
        );
        return listaOrdenada;
    }

    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

}
