package org.climoilou.vetm.formatif2;

public class SeparatorAtTheEndException extends RuntimeException {
    public SeparatorAtTheEndException() {
        super("il y as un séparateur a la fin du string de nombre");
    }
}