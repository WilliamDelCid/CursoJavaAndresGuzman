package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterCount {

    public static void main(String[] args) {

        Long count  = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();//Una vez que encuentra el elemento, ya no sigue iterando retorna un booleano

        System.out.println(count);


    }

}
