package org.william.java9.lambda;

import org.william.java9.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {
        Consumer<String> consumer = saludo -> System.out.println(saludo); //Si se tiene una sola linea de codigo se puede omitir las llaves


        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(format.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String,Integer> consumidorBi = (nombre,edad) -> {
            System.out.println("Nombre: "+nombre+" Edad: "+edad);
        };

        consumidorBi.accept("William", 25);

        consumidorBi.accept("Taylor Swift", 34);

        Consumer<String> consumidor2 = System.out::printf;

        List<String> nombres = Arrays.asList("William", "Taylor Swift", "Selena Gomez", "Ariana Grande");

        nombres.forEach(consumidor2);
        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();
        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "William");

        System.out.println("Nombre del usuario: "+usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo"; //Solo devuelve un valor
        System.out.println(proveedor.get());
    }

}
