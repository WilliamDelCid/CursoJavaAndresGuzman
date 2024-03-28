package org.william.poointerfaces.repositorio;

import org.william.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente cliente = null;
        for (Cliente cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                cliente = cli;
                break;
            }
        }
        return cliente;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cliente1 = this.porId(cliente.getId());
        cliente1.setNombre(cliente.getNombre());
        cliente1.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente cliente = this.porId(id);
        this.dataSource.remove(cliente);
    }

    @Override
    public List<Cliente> listar(String campo, Direcccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((o1, o2) -> {
                    int resultado = 0;
                    if (dir == Direcccion.ASC) {
                        resultado = ordenar(campo, o1, o2);
                    } else if (dir == Direcccion.DESC) {
                        resultado = ordenar(campo, o2, o1);
                    }
                    return resultado;
                }
        );
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
