package org.william.poointerfaces;

import org.william.poointerfaces.modelo.Cliente;
import org.william.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        CrudRepository repository = new ClienteListRepositorio();
        repository.crear(new Cliente("Jano","Perez"));
        repository.crear(new Cliente("Bea","Gonzales"));
        repository.crear(new Cliente("Luci","Martinez"));
        repository.crear(new Cliente("Andres","Gonzales"));

        List<Cliente> clientes = repository.listar();
        clientes.forEach(System.out::println);
        System.out.println("==== Paginable ====");
        List<Cliente> paginable = ((PaginableRepositorio)repository).listar(2,3);
        paginable.forEach(System.out::println);

        System.out.println("==== ordenar ====");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepository)repository).listar("nombre", Direcccion.ASC);
        for (Cliente cliente:clientesOrdenAsc){
            System.out.println(cliente);
        }

        System.out.println("=== Editar ===");
        Cliente beaActualizar = new Cliente("Bea","Mena");
        beaActualizar.setId(2);
        repository.editar(beaActualizar);
        Cliente bea = repository.porId(2);
        System.out.println(bea);
        System.out.println("=== Editar ===");
        List<Cliente> clientesOrdenAsc2 = ((OrdenableRepository)repository).listar("nombre", Direcccion.ASC);
        for (Cliente cliente:clientesOrdenAsc2){
            System.out.println(cliente);
        }
        System.out.println("=== Eliminar ===");
        repository.eliminar(2);
        repository.listar().forEach(System.out::println);
    }
}
