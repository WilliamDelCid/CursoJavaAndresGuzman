package org.william.hilos;

import org.william.hilos.runnable.ViajeTarea;

public class ProcesarPedido implements Runnable {
    private String pedido;

    public ProcesarPedido(String pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        try {
            validarPedido();
            procesarPago();
            empaquetar();
            enviar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void validarPedido() throws InterruptedException {
        System.out.println("Validando pedido: " + pedido);
        
//        Thread.sleep((long) (Math.random() * 1000));
    }

    private void procesarPago() throws InterruptedException {
        System.out.println("Procesando pago del pedido: " + pedido);
//        Thread.sleep((long) (Math.random() * 1000));
    }

    private void empaquetar() throws InterruptedException {
        System.out.println("Empaquetando pedido: " + pedido);
//        Thread.sleep((long) (Math.random() * 1000));
    }

    private void enviar() throws InterruptedException {
        System.out.println("Enviando pedido: " + pedido);
//        Thread.sleep((long) (Math.random() * 1000));
        System.out.println("Pedido enviado: " + pedido);
    }

    public static void main(String[] args) {
        Thread pedido1 = new Thread(new ProcesarPedido("Pedido 1"));
        Thread pedido2 = new Thread(new ProcesarPedido("Pedido 2"));
        Thread pedido3 = new Thread(new ProcesarPedido("Pedido 3"));
        Thread pedido4 = new Thread(new ProcesarPedido("Pedido 4"));
        Thread pedido5 = new Thread(new ProcesarPedido("Pedido 5"));

        pedido1.start();
        pedido2.start();
        pedido3.start();
        pedido4.start();
        pedido5.start();
    }
}