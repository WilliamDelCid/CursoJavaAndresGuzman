package org.william.appfacturas;

import org.william.appfacturas.models.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("555-5");
        cliente.setNombre("WIlliam");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese una descripcion");
        String desc = scanner.nextLine();
        Factura factura = new Factura(desc,cliente);
        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.println("Ingrese producto n" + producto.getCodigo() + ": ");
            nombre = scanner.next();
            producto.setNombre(nombre);
            System.out.println("Ingrese el precio: ");
            precio = scanner.nextFloat();
            producto.setPrecio(precio);
            System.out.println("Ingrese la cantidad: ");
            cantidad = scanner.nextInt();

            ItemFactura itemFactura = new ItemFactura(cantidad, producto);
            factura.addItemFactura(itemFactura);
            System.out.println();

        }
        System.out.println(factura.generarDetalle());

    }
}
