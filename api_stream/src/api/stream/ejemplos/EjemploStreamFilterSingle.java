package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {

    public static void main(String[] args) {

      Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
              .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
              .filter(u -> u.getNombre().equals("Pepex"))
              .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.orElse(new Usuario("John", "Doe")));
        System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")));//Supplier para crear el objeto si no existe en el optional
        System.out.println(usuario.orElseThrow(NullPointerException::new));
    }

}
