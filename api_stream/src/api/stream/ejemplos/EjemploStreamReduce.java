package api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {

    public static void main(String[] args) {

      String nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
              .distinct() // Elimina los elementos duplicados
              .reduce("", (accumulator, name) -> accumulator + " " + name); // Acumula los elementos en un solo String

        System.out.println(nombres);

    }

}
