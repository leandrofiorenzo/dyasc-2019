package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FormatosSucesionDeFibonacciTest {

    @Test
    public void testDevuelveLaSucesion5FormateadaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerSucesion(5));
        assertEquals("fibo<5>: 0 1 1 2 3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerSucesion(8));
        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5FormateadaHorizontalCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerSucesion(5), true);
        assertEquals("fibo<5>: 0 1 1 2 3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaHorizontalCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerSucesion(8), true);
        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5FormateadaVerticalCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerSucesion(5), false);
        assertEquals("fibo<5>:\n0\n1\n1\n2\n3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaVerticalCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerSucesion(8), false);
        assertEquals("fibo<8>:\n0\n1\n1\n2\n3\n5\n8\n13", expectedValue);
    }
}
