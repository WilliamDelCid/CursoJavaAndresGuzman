package api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EjemploStreamRange {

    public static void main(String[] args) {

      IntStream numeros = IntStream.range(5,20).peek(System.out::println);
//      IntStream numeros = IntStream.rangeClosed(5,20).peek(System.out::println); // Incluye el ultimo

//        int resultado = numeros.reduce(0, (a,b) -> a+b);
//        int resultado = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println(stats);
        
    }

}
