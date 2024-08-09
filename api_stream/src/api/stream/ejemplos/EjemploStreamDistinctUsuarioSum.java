package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {

    public static void main(String[] args) {

      IntStream largoNombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Mena")
              .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
              .distinct()
              .mapToInt(u-> u.toString().length())
              .peek(System.out::println);
//        .distinct() // Elimina los elementos duplicados del stream de datos (no se puede usar con objetos)
//        largoNombres.forEach(System.out::println);
//        System.out.println("Suma de los largos de los nombres: " + largoNombres.sum());

        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("Suma de los largos de los nombres: " + stats.getSum());
        System.out.println("Max de los largos de los nombres: " + stats.getMax());
        System.out.println("Min de los largos de los nombres: " + stats.getMin());
        System.out.println("Promedio de los largos de los nombres: " + stats.getAverage());

    }

}
