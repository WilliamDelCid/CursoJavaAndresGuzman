package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe").map(nombre -> {
            return nombre.toUpperCase();
        });
        nombres.forEach(System.out::println);

        Stream<String> nombres2 = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)
                .peek(nombre -> System.out.println(nombre))// peek() es un método intermedio que permite realizar operaciones sin modificar el flujo de datos
                .map(String::toLowerCase);
        nombres2.forEach(System.out::println);

        Stream<String> nombres3 = Stream.of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> lista = nombres3.collect(Collectors.toList());
        lista.forEach(System.out::println);


        Stream<Usuario> nombres4 = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getNombre() + " " + u.getApellido()))
                .map(usuario -> {
                    String nombre = usuario.getNombre();
                    usuario.setNombre(nombre.toLowerCase());
                    return usuario;

                });

        List<Usuario> listaUsuarios = nombres4.collect(Collectors.toList());
        listaUsuarios.forEach(usuario -> System.out.println(usuario.getNombre() + " " + usuario.getApellido()));
    }

}
