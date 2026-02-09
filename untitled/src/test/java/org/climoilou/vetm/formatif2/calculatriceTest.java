package org.climoilou.vetm.formatif2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatriceTest {
    calculatrice calculatrice;

    @BeforeEach
    void setUp() {
        calculatrice = new calculatrice();
    }

    @Test
    void givenEmptyString_whenAdd_thenReturnZero() {
        assertEquals(0, calculatrice.add(""));
    }
}