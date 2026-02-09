package org.climoilou.vetm.formatif2;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("Y'a rien dans le string");
    }
}