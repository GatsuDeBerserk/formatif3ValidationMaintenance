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

    @Test
    void givenString2_whenAdd_thenReturn2() {
        assertEquals(2, calculatrice.add("2"));
    }

    @Test
    void givenString1And2_whenAdd_thenReturn3() {
        assertEquals(3, calculatrice.add("1,2"));
    }

}