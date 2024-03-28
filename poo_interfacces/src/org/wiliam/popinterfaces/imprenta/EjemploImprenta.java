package org.wiliam.popinterfaces.imprenta;

import org.wiliam.popinterfaces.imprenta.models.*;
import static org.wiliam.popinterfaces.imprenta.models.Genero.*;
public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("William","Ingeniero en sistema","Resumen Laboral...");
        cv.addExperiencia("Java").addExperiencia("Oracle DBA").addExperiencia("Spring Framework").addExperiencia("Desarrolador fullstack").addExperiencia("Angular");

        Libro libro = new Libro("Erich Gamma","Patron de diseños", ACCION);
        libro.addPagina(new Pagina("Patron Singlenton")).addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Composite")).addPagina(new Pagina("Facade"));
        Informe informe = new Informe("Estudio sobre microservicios","Martin Fowler","Contenido");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
