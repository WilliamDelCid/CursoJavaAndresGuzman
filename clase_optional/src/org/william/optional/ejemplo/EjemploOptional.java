package org.william.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "William";
        Optional<String> optional = Optional.of(nombre);
        System.out.println("optional = " + optional);
        System.out.println("optional.isPresent() = " + optional.isPresent());
        if (optional.isPresent()) {
            String valor = optional.get();
            System.out.println("valor = " + valor);
        }
        System.out.println(optional.isEmpty());
        optional.ifPresent(valor->{
            System.out.println("valor = " + valor);
        });
        nombre = null;
        optional = Optional.ofNullable(nombre);
        System.out.println("optional = " + optional);
        System.out.println("optional.isPresent() = " + optional.isPresent());
        System.out.println(optional.isEmpty());

        optional.ifPresentOrElse(valor->{
            System.out.println("valor = " + valor);
        }, ()->{
            System.out.println("No está presente");
        });

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("optionalEmpty = " + optionalEmpty);
        System.out.println("optionalEmpty.isPresent() = " + optionalEmpty.isPresent());
    }
}
