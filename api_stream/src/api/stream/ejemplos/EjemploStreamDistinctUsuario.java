package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {

    public static void main(String[] args) {

      Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Mena")
              .distinct()
              .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));
//        .distinct() // Elimina los elementos duplicados del stream de datos (no se puede usar con objetos)
      nombres.forEach(System.out::println);
    }

}
