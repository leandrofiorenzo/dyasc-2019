package ar.edu.untref.dyasc;
import org.junit.Test;
import static org.junit.Assert.*;

public class SucesionDeFibonacciTest {

    @Test
    public void testDevuelveLaSucesionCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] primeros8Esperados = { 0, 1, 1, 2, 3, 5, 8, 13 };
        assertArrayEquals(sucesionDeFibonacci.ObtenerPrimerosN(8), primeros8Esperados);
    }

    @Test
    public void testDevuelveLaSucesion5FormateadaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        String expectedValue = sucesionDeFibonacci.FormatearSucesion(sucesionDeFibonacci.ObtenerPrimerosN(5));
        assertEquals("fibo<5>: 0 1 1 2 3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        String expectedValue = sucesionDeFibonacci.FormatearSucesion(sucesionDeFibonacci.ObtenerPrimerosN(8));
        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", expectedValue);
    }

}
