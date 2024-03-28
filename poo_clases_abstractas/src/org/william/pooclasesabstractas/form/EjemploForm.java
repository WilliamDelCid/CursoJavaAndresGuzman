package org.william.pooclasesabstractas.form;

import com.sun.source.tree.NewArrayTree;
import org.william.pooclasesabstractas.elementos.*;
import org.william.pooclasesabstractas.elementos.select.Opcion;
import org.william.pooclasesabstractas.validador.EmailValidador;
import org.william.pooclasesabstractas.validador.LargoValidador;
import org.william.pooclasesabstractas.validador.NoNuloValidador;
import org.william.pooclasesabstractas.validador.RequeridoValidador;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email","email");
        email.addValidador(new RequeridoValidador()).addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NoNuloValidador());
        TextareaForm experiencia = new TextareaForm("exp",5,9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(java).addOpcion(new Opcion("2","Python")).addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP").setSelected());
//        username.setValor("");
        password.setValor("1");

        ElementoFor saludar = new ElementoFor("saludo") {

            @Override
            public String dibujarHtml() {
                return "<input name='prueba'>";
            }
        };

        email.setValor("john.@correo.com");
        edad.setValor("28");
        experiencia.setValor("experiencia");
//        java.setSelected(true);
        List<ElementoFor> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje
        );
        for(ElementoFor elementoFor: elementos){
            System.out.println(elementoFor.dibujarHtml());
        }

        elementos.forEach(e->{
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });

//        elementos.forEach(e->{
//
//        });

    }
}
