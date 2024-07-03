package org.william.poointerfaces.repositorio;

import org.william.poointerfaces.modelo.BaseEntity;
import org.william.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.william.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {


    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if (id==null || id<=0){
            throw new LecturaAccesoDatoException("Id Invalidado debe ser > 0");
        }
        T resultado = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        if (resultado == null) {
            throw new LecturaAccesoDatoException("No existe el registro con id :");
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if (t == null){
            throw new EscrituraAccesoDatoException("Error al insertar un objeto");
        }
        if (this.dataSource.contains(t)){
            throw new EscrituraAccesoDatoException("Error el objeto con id :" + t.getId());
        }
        this.dataSource.add(t);
    }

//    @Override
//    public void editar(Cliente cliente) {
//        Cliente cliente1 = this.porId(cliente.getId());
//        cliente1.setNombre(cliente.getNombre());
//        cliente1.setApellido(cliente.getApellido());
//    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        this.dataSource.remove(this.porId(id));
    }

//    @Override
//    public List<Cliente> listar(String campo, Direcccion dir) {
//        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
//        listaOrdenada.sort((o1, o2) -> {
//                    int resultado = 0;
//                    if (dir == Direcccion.ASC) {
//                        resultado = ordenar(campo, o1, o2);
//                    } else if (dir == Direcccion.DESC) {
//                        resultado = ordenar(campo, o2, o1);
//                    }
//                    return resultado;
//                }
//        );
//        return listaOrdenada;
//    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

//    public static int ordenar(String campo, Cliente a, Cliente b) {
//        int resultado = 0;
//        switch (campo) {
//            case "id" -> resultado = a.getId().compareTo(b.getId());
//            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
//            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
//        }
//        return resultado;
//    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
