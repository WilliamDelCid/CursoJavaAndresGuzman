package api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        Stream.generate(()->"Hola Mundo")
                .forEach(System.out::println);
    }
}
