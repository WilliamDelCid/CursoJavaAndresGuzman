package org.william.appfacturas.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] itemFactura;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.itemFactura = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItemFactura() {
        return itemFactura;
    }

    public void addItemFactura(ItemFactura itemFactura) {
        if (indiceItems < MAX_ITEMS) {
            this.itemFactura[indiceItems++] = itemFactura;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura itemFactura1 : this.itemFactura) {
            if (itemFactura1 == null) {
                continue;
            }
            total += itemFactura1.calcularImporte();
        }
        return total;
    }  

    public String generarDetalle() {
        StringBuilder stringBuilder = new StringBuilder("Factura N: ");
        stringBuilder.append(folio).append("\n Cliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ").append(cliente.getNif())
                .append("\n Descripcion: ").append(this.descripcion)
                .append("\n");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        stringBuilder.append("\tFecha Emision: ").append(dateFormat.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\t Total\n");
        for(ItemFactura itemFactura1:this.itemFactura){
            if(itemFactura1 == null){
                continue;
            }
            stringBuilder.append(itemFactura1.getProducto().getCodigo())
                    .append("\t")
                    .append(itemFactura1.getProducto().getNombre())
                    .append("\t")
                    .append(itemFactura1.getProducto().getPrecio())
                    .append("\t")
                    .append(itemFactura1.getCantidad())
                    .append("\t")
                    .append(itemFactura1.calcularImporte())
                    .append("\n");
        }
        stringBuilder.append("\nGran Total: ")
                .append(calcularTotal());
        return stringBuilder.toString();
    }

}
