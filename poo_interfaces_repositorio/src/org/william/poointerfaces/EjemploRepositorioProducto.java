package org.william.poointerfaces;

import org.william.poointerfaces.modelo.Producto;
import org.william.poointerfaces.repositorio.Direcccion;
import org.william.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.william.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.william.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.william.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        try{
        OrdenablePaginableCrudRepositorio<Producto> repository = new ProductoListRepositorio();
        repository.crear(new Producto("Jano",12.0));
        repository.crear(new Producto("Bea",12.0));
        repository.crear(new Producto("Luci",12.0));
        repository.crear(new Producto("Andres",12.0));

        List<Producto> productos = repository.listar();
        productos.forEach(System.out::println);
        System.out.println("==== Paginable ====");
        List<Producto> paginable = repository.listar(2,3);
        paginable.forEach(System.out::println);

        System.out.println("==== ordenar ====");
        List<Producto> productosOrdenAsc = repository.listar("descripcion", Direcccion.ASC);
        for (Producto cliente:productosOrdenAsc){
            System.out.println(cliente);
        }

        System.out.println("=== Editar ===");
        Producto beaActualizar = new Producto("Bea",12.0);
        beaActualizar.setId(2);
        repository.editar(beaActualizar);
        Producto bea = repository.porId(2);
        System.out.println(bea);
        System.out.println("=== Editar ===");
        List<Producto> productosOrdenAsc2 = repository.listar("nombre", Direcccion.ASC);
        for (Producto cliente:productosOrdenAsc2){
            System.out.println(cliente);
        }
        System.out.println("=== Eliminar ===");
        repository.eliminar(2);
        repository.listar().forEach(System.out::println);
        }catch(LecturaAccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }catch(AccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
