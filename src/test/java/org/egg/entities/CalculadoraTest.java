package org.egg.entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void sumar() {
        Calculadora calculadora = new Calculadora(4f,5f);

        assertEquals(9f, calculadora.sumar(), 0.1);
    }

    @Test
    public void sumarError() {
        Calculadora calculadora = new Calculadora(4f,5f);

        assertEquals(10f, calculadora.sumar(), 0.1);
    }
}