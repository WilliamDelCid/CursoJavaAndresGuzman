package org.william.hilos.threads;

public class NombreThread extends Thread {
    public NombreThread(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el metodo run del hilo " + getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo " + this.getName() + " ejecutando, i = " + i);
        }
        System.out.println("finaliza el metodo run del hilo " + getName());
    }
}
