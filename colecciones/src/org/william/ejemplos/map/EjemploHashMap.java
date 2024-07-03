package org.william.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        // TODO code application logic here

        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");
        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

//        String valorEliminado = persona.remove("email");
        boolean valor =  persona.remove("edad","30");
        System.out.println("valor = " + valor);
        System.out.println("persona = " + persona);

        boolean existe = persona.containsKey("email");
        System.out.println("existe = " + existe);

        boolean existeValor = persona.containsValue("Doe");
        System.out.println("existeValor = " + existeValor);

        Collection<String> valores = persona.values();
        for (String valor1 : valores) {
            System.out.println("valor1 = " + valor1);
        }

        Set<String> llaves = persona.keySet();
        for (String llave : llaves) {
            System.out.println("llave = " + llave);
        }

        for (Map.Entry<String, String> entry : persona.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println("key = " + key + ", value = " + value);
        }

        persona.forEach((k,v) -> {
            System.out.println("key = " + k + ", value = " + v);
        });

        System.out.println("persona = " + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());
        persona.replace("nombre", "Juan");
        persona.replace("nombre", "John", "Juan");



        System.out.println("======================= keySet ========================");
        for(String llave: persona.keySet()){
            System.out.println("llave = " + llave + ", valor = " + persona.get(llave));
            Object valor1 = persona.get(llave);
            if (valor1 instanceof Map){

            }else{

            }
        }


    }
}
