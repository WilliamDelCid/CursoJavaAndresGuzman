package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {

    public static void main(String[] args) {

        Usuario usuario = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(3)).findFirst().get();

        System.out.println(usuario);
    }

}
