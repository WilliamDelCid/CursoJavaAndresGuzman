package api.stream.ejemplos;

import api.stream.ejemplos.models.Factura;
import api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("John", "Doe");
        Usuario usuario2 = new Usuario("Pepe", "Perez");

        usuario1.addFactura(new Factura("Compra de la laptop"));
        usuario1.addFactura(new Factura("Compra de la camara"));

        usuario2.addFactura(new Factura("Compra de la bicicleta"));
        usuario2.addFactura(new Factura("Compra de la casa"));

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);

//        for (Usuario u : usuarios) {
//            System.out.println(u.getNombre());
//            for (Factura f : u.getFacturas()) {
//                System.out.println(f.getDescripcion());
//            }
//        }

        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ".concat(f.getUsuario().toString()))));

//        usuarios.stream().map(Usuario::getFacturas).flatMap(List::stream)
//                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ".concat(f.getUsuario().toString()))));

    }
}
