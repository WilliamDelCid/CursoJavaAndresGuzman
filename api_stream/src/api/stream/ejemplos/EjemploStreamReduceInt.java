package api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {

    public static void main(String[] args) {

      Stream<Integer> numeros = Stream.of(5,10,15,20);

        int resultado = numeros.reduce(0, (a,b) -> a+b);
        System.out.println(resultado);
        
    }

}
