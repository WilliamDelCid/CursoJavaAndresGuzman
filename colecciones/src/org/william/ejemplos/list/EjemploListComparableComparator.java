package org.william.ejemplos.list;

import org.william.ejemplos.modelo.Alumno;

import java.util.*;

public class  EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato",4));
        sa.add(new Alumno("Cata",5));
        sa.add(new Alumno("Will",7));
        sa.add(new Alumno("Pata",3));
        System.out.println(sa);
        Collections.sort(sa); // Ordenamiento por el compareTo
//        Collections.sort(sa,(a,b)-> b.getNota().compareTo(a.getNota()));
//        sa.sort((a,b)->a.getNota().compareTo(b.getNombre));
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed()); // Ordenamiento por el nombre
        for (Alumno alumno : sa){
            System.out.println(alumno);
        }

        System.out.println("Iterando ForEach");
        sa.forEach(System.out::println);
    }
}
