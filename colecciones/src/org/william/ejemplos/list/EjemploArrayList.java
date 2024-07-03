package org.william.ejemplos.list;

import org.william.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Pato",4));
        al.add(new Alumno("Cata",5));
        al.add(1,new Alumno("Will",7));
        al.add(new Alumno("Pata",3));
        al.set(2,new Alumno("Pata Eliimnada",3));
        System.out.println(al + ", size = " + al.size());
        al.remove(1);
        al.remove(new Alumno("Pato",4));
        boolean b = al.contains(new Alumno("Pato",4));
        System.out.println("Contiene a Pato = " + b);
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Desde el arreglo = "    + al.get(i).getNombre());
            
        }
        Object a[] = al.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo = "    + a[i]);
        }
    }
}
