package org.william.poointerfaces.repositorio.lista;

import org.william.poointerfaces.modelo.Cliente;
import org.william.poointerfaces.modelo.Producto;
import org.william.poointerfaces.repositorio.AbstractaListRepositorio;
import org.william.poointerfaces.repositorio.Direcccion;
import org.william.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {


    @Override
    public void editar(Producto producto) throws LecturaAccesoDatoException {
        Producto p = porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(p.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direcccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }

}
