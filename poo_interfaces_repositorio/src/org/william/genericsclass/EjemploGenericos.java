package org.william.genericsclass;

public class EjemploGenericos {

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));

        for (Animal animal: transporteCaballos){
            System.out.println((animal.getNombre() + " tipo: " + animal.getTipo()));
        }

        Camion<Maquinaria> transMaquinas = new Camion<>(1);
        transMaquinas.add(new Maquinaria("Grua"));
        for (Maquinaria maquinaria : transMaquinas){
            System.out.println(maquinaria.getTipo());
        }

        Camion<Automovil> transAuto = new Camion<>(2);
        transAuto.add(new Automovil("Toyota"));
        for (Automovil automovil:transAuto){
            System.out.println(automovil.getMarca());
        }

    }

}
