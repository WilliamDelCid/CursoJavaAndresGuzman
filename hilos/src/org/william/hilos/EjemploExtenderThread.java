package org.william.hilos;

import org.william.hilos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jhon Doe");
        Thread hilo2 = new NombreThread("Maria");
        hilo.start();
        Thread.sleep(1);
        hilo2.start();
        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
