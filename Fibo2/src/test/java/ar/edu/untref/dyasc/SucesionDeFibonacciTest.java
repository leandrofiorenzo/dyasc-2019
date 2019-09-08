package ar.edu.untref.dyasc;
import org.junit.Test;
import static org.junit.Assert.*;

public class SucesionDeFibonacciTest {

    @Test
    public void testDevuelveLaSucesion5Correctamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2, 3 };
        assertArrayEquals(sucesionDeFibonacci.obtenerPrimerosNNumeros(5), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8Correctamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2, 3, 5, 8, 13 };
        assertArrayEquals(sucesionDeFibonacci.obtenerPrimerosNNumeros(8), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5FormateadaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerPrimerosNNumeros(5));
        assertEquals("fibo<5>: 0 1 1 2 3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        String expectedValue = formateadorSucesionDeFibonacci.formatearSucesion(sucesionDeFibonacci.obtenerPrimerosNNumeros(8));
        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", expectedValue);
    }

}
