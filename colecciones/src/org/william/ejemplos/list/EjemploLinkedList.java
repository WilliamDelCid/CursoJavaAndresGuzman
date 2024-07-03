package org.william.ejemplos.list;

import org.william.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato",4));
        enlazada.add(new Alumno("Cata",5));
        enlazada.add(new Alumno("Will",7));
        enlazada.add(new Alumno("Pata",3));
        enlazada.add(new Alumno("Pata Eliimnada",3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Primero",1));
        enlazada.addLast(new Alumno("Ultimo",10));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Ultimo = " + enlazada.getLast());
        System.out.println("Indice 2 = " + enlazada.get(2));
//        System.out.println("Indice 2 = " + enlazada.peekLast()); No lanza excepcion
        enlazada.removeFirst();
        enlazada.removeLast();

//        System.out.println(enlazada.pollFirst()); TODO lo que se elimina se retorna o null si no hay nada
//        System.out.println(enlazada.pollLast());

        enlazada.remove(new Alumno("Pata Eliimnada",3));

        Alumno alumno = new Alumno("Pato",4);
        enlazada.addLast(alumno);
        System.out.println("Indice de Pato = " + enlazada.indexOf(alumno));

        enlazada.set(1, new Alumno("Will",9));

        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }

    }
}
