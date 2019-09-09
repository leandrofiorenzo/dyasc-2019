package ar.edu.untref.dyasc;
import org.junit.Test;
import static org.junit.Assert.*;

public class SucesionDeFibonacciTest {

    @Test
    public void testDevuelveLaSucesion5Correctamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2, 3 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesion(5), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8Correctamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2, 3, 5, 8, 13 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesion(8), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5InversaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 3, 2, 1, 1, 0 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesion(5, false), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8InversaCorrectamente()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 13, 8, 5, 3, 2, 1, 1, 0 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesion(8, false), expectedValue);
    }

}
