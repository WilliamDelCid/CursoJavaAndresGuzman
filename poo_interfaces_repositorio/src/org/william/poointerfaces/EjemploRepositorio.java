package org.william.poointerfaces;

import org.william.poointerfaces.modelo.Cliente;
import org.william.poointerfaces.repositorio.*;
import org.william.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.william.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.william.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.william.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repository = new ClienteListRepositorio();
            repository.crear(new Cliente("Jano", "Perez"));
            repository.crear(new Cliente("Bea", "Gonzales"));
            repository.crear(new Cliente("Luci", "Martinez"));
           Cliente andres =  new Cliente("Andres", "Gonzales");
            repository.crear(andres);
            repository.crear(andres);
            List<Cliente> clientes = repository.listar();
            clientes.forEach(System.out::println);
            System.out.println("==== Paginable ====");
            List<Cliente> paginable = repository.listar(2, 3);
            paginable.forEach(System.out::println);

            System.out.println("==== ordenar ====");
            List<Cliente> clientesOrdenAsc = repository.listar("nombre", Direcccion.ASC);
            for (Cliente cliente : clientesOrdenAsc) {
                System.out.println(cliente);
            }

            System.out.println("=== Editar ===");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repository.editar(beaActualizar);
            Cliente bea = repository.porId(2);
            System.out.println(bea);
            System.out.println("=== Editar ===");
            List<Cliente> clientesOrdenAsc2 = repository.listar("nombre", Direcccion.ASC);
            for (Cliente cliente : clientesOrdenAsc2) {
                System.out.println(cliente);
            }
            System.out.println("=== Eliminar ===");
            repository.eliminar(50);
            repository.listar().forEach(System.out::println);
        }catch(LecturaAccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }catch(EscrituraAccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }catch(AccesoDatoException e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
