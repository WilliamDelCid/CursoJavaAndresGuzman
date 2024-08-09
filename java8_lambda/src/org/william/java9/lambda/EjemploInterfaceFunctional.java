package org.william.java9.lambda;

import org.william.java9.lambda.aritmetica.Aritmetica;
import org.william.java9.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {

    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.computar(10, 5, suma));
        System.out.println(calculadora.computar(10, 5, resta));
        System.out.println(calculadora.computarBiFuncion(10, 5, (a, b) -> a * b));
        System.out.println(calculadora.computarBiFuncion(10, 5, (a, b) -> a / b));

    }

}
