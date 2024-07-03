package org.william.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
//        Set<String> ts = new TreeSet<>((o1, o2) -> {
//            return o2.compareTo(o1);
//        });
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println(ts);
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println(numeros);
    }
}
