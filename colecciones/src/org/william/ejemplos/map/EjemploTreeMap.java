package org.william.ejemplos.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
//        Map<String,Object> persona = new TreeMap<>((a,b)->a.compareTo(b));
//        Map<String,Object> persona = new TreeMap<>(Comparator.reverseOrder());
        Map<String,Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        System.out.println("persona.isEmpty() = " + persona.isEmpty());
        persona.put("nombre", "William");
        persona.put("apellido", "Guzmán");
        persona.put("email", "a@gmail.com");
        persona.put("edad", 25);

        Map<String,String> direccion = new TreeMap<>();
        direccion.put("pais", "Colombia");
        direccion.put("ciudad", "Bogotá");
        direccion.put("calle", "calle 100");
        direccion.put("numero", "70A-55");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);

    }
}
