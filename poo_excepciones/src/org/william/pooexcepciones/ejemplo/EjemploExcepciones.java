package org.william.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        double division;
        try {
            divisor= Integer.parseInt(valor);
            division = calculadora.dividir(10,divisor);
            System.out.println(division);

            double division2 = calculadora.dividir("", "5");
            System.out.println("division 2" + division2);
        } catch (NumberFormatException | ArithmeticException nfe) {
            System.out.println("Capturamos" + nfe.getMessage());
            main(args);
        } catch (DivisionPorZeroException e) {
            System.out.println("Capturamos " + e.getMessage());
        } catch (FormatoNumeroException e) {
            System.out.println("Se detecto una excepcion " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre");
        }
        System.out.println("Continuamos con el flujo ");
    }

}
