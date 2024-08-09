package org.william.hilos.runnable;

public class ViajeTarea implements Runnable{

    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hilo " + this.getNombre() + " ejecutando, i = " + i);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finalmente me voy de viaje a: " + this.getNombre() + "!!!");
    }
}