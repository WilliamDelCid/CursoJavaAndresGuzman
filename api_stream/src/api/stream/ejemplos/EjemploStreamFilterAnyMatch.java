package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {

    public static void main(String[] args) {

        boolean existe  = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(3));//Una vez que encuentra el elemento, ya no sigue iterando retorna un booleano

        System.out.println(existe);

        List<Usuario> lista = Arrays.asList(
                new Usuario("Andres", "Guzman"),
                new Usuario("Luci", "Martinez"),
                new Usuario("Pepe", "Fernandez"),
                new Usuario("Pepe", "Gonzalez")
        );

        boolean resultado = false;
        for (Usuario u : lista) {
            if (u.getId().equals(5)) {
                resultado = true;
                break;
            }
        }
        System.out.println(resultado);

    }

}
