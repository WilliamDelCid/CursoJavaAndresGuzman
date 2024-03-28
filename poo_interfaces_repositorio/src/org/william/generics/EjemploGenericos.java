package org.william.generics;

import org.william.poointerfaces.modelo.Cliente;
import org.william.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {

        List cliente = new ArrayList();
        cliente.add(new Cliente("a","b"));
        Cliente a = (Cliente) cliente.iterator().next();
        Cliente[] clientesArreglo = {new Cliente("b","b"),new Cliente("a","b")};
        Integer[] enteros = {1,2,3};
        List<Cliente> clientes2 = fromArray(clientesArreglo);
        List<Integer> enteros2 = fromArray(enteros);

        clientes2.forEach(System.out::println);
        enteros2.forEach(System.out::println);
        List<String> nombre = fromArray(new String[]{"a","b"},enteros);
        nombre.forEach(System.out::println);

        List<ClientePremium> clientesPremium = fromArray(new ClientePremium[]
                {new ClientePremium("Paco", "Fernandez") }
        );

        imprimirClientes(clientes2);
        System.out.println(maximo(1, 2, 3));
        System.out.println(maximo(3.1, 3.2, 31.12));
        System.out.println(maximo("zanahoria","arandano","manzana"));
    }

    public static <T> List<T> fromArray(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArray(T[] c){
        return Arrays.asList(c);
    }

//    public static  List<Cliente> fromArray(Cliente[] c){
//        return Arrays.asList(c);
//    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArray(T[] c){
        return Arrays.asList(c);
    }

    public static <T,G> List<T> fromArray(T[] c,G[] x){
        for (G elemento:x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0 ){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

}
