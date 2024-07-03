package org.william.ejemplos.set;

import org.william.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHastSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato",4));
        sa.add(new Alumno("Cata",5));
        sa.add(new Alumno("Will",7));
        sa.add(new Alumno("Pata",3));
        System.out.println(sa);
        for (Alumno alumno : sa){
            System.out.println(alumno);
        }
        System.out.println("Itrerando por usando while");
        Iterator<Alumno> iterator = sa.iterator();
        while(iterator.hasNext()){
            Alumno alumno = iterator.next();
            System.out.println(alumno.getNombre());
        }
        System.out.println("Iterando ForEacch");
        sa.forEach(System.out::println);
    }
}
