package org.william.ejemplos.set;

import org.william.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
//        Set<Alumno> sa = new TreeSet<>((a,b)->a.getNombre().compareTo(b.getNombre()));
        Set<Alumno> sa = new TreeSet<>((a,b)->a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Pato",4));
        sa.add(new Alumno("Cata",5));
        sa.add(new Alumno("Will",7));
        sa.add(new Alumno("Pata",3));
        System.out.println(sa);
    }
}
