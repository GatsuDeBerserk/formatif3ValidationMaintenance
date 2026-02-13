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

    @Test
    void givenMultipleSeperators_WhenExecuteAdd_ThenStringSplittedAtBoth() {
        assertEquals(6, calculatrice.add("1,2\n3"));
    }


    @Test
    void GivenChangeLineSeperator_whenExecuteAdd_ThenStringRightfullySplitted() {
        assertEquals(3, calculatrice.add("1\n2"));
    }

    @Test
    void givenSeperatorAtTheEndOfString_WhenExecuteAdd_ThenReturnException() {
        assertThrows(SeparatorAtTheEndException.class, () -> calculatrice.add("1,2,"));
    }

    @Test
    void givenDelimiteurAndNumber_WhenExecuteAdd_thenRightAnswer3() {
        assertEquals(3, calculatrice.add("//;\n2;1"));
    }

    @Test
    void givenNegativeNumber_WhenExecuteAdd_ThenThorowException() {
        assertThrows(NegativeNumberException.class, () -> calculatrice.add("1,-2"));
    }

}