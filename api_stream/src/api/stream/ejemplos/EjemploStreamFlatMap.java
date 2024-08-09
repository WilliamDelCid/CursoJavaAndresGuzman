package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
//                .filter(u -> u.getNombre().equals("Pepe"))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("Pepe")) {
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

//        List<Usuario> lista = nombres.collect(Collectors.toList());
//        lista.forEach(System.out::println);
        nombres.forEach(System.out::println);
    }

}
