package ar.edu.untref.dyasc;
import org.junit.Test;
import static org.junit.Assert.*;

public class SucesionDeFibonacciTest {

    @Test
    public void testPrimeros8()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] primeros8Esperados = { 0, 1, 1, 2, 3, 5, 8, 13 };
        assertArrayEquals(sucesionDeFibonacci.ObtenerPrimerosN(8), primeros8Esperados);
    }

}
