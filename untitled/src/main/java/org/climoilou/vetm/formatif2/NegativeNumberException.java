package org.climoilou.vetm.formatif2;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("Negatives Numbers are not allowed");
    }
}
