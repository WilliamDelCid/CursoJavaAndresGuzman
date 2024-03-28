package org.william.pooclasesabstractas.elementos;

import org.william.pooclasesabstractas.validador.LargoValidador;
import org.william.pooclasesabstractas.validador.Validador;
import org.william.pooclasesabstractas.validador.mensaje.MensajeFormateable;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

abstract public class ElementoFor {

    protected String valor;
    protected String nombre;
    private List<Validador> validadors;
    private List<String> errores;

    public ElementoFor() {
        this.validadors = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoFor(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoFor addValidador(Validador validador) {
        this.validadors.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido() {
        for (Validador validador : validadors) {
            if (validador instanceof MensajeFormateable ) {
                this.errores.add(((LargoValidador) validador).getMensajeFormateado(nombre));
            } else {
                this.errores.add(validador.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

}
