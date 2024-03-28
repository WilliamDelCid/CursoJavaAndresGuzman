package org.wiliam.popinterfaces.imprenta.models;

public interface Imprimible {

    default String imprimir(){
        return "Imprimiendo un valor por defecto";
    }; //Se pueden colocar default para que no sean requeridos a la hora de implementarlos

//    Java 8->Metodos defauld y static
}
