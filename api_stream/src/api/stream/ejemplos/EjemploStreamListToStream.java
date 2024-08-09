package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Luci", "Martinez"));
        lista.add(new Usuario("Pepe", "Fernandez"));
        lista.add(new Usuario("Cata", "Perez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));


        System.out.println("**********");

        Stream <String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre ->{
                    if (nombre.contains("bruce".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
//                .forEach(System.out::println);
                .peek(System.out::println);

        System.out.println("**********");
        System.out.println(nombres.count());

    }

}
