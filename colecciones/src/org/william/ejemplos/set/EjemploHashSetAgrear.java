package org.william.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgrear {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("uno");
        hashSet.add("dos");
        hashSet.add("tres");
        hashSet.add("cuatro");
        hashSet.add("cinco");
        System.out.println(hashSet);
        boolean b = hashSet.add("tres");
        System.out.println("permite duplicados");
    }
}
