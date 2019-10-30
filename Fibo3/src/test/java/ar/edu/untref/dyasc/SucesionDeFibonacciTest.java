package ar.edu.untref.dyasc;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SucesionDeFibonacciTest {

    @Test
    public void testDevuelveLaSucesion5()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesionDeFibonacci(5), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2, 3, 5, 8, 13 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesionDeFibonacci(8), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5Inversa()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.definirStrategyDeDireccion(new DireccionInversaStrategy());
        int[] expectedValue = { 3, 2, 1, 1, 0 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesionDeFibonacci(5), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8Inversa()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        sucesionDeFibonacci.definirStrategyDeDireccion(new DireccionInversaStrategy());
        int[] expectedValue = { 13, 8, 5, 3, 2, 1, 1, 0 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesionDeFibonacci(8), expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5SinStrategy()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] expectedValue = { 0, 1, 1, 2, 3 };
        assertArrayEquals(sucesionDeFibonacci.obtenerSucesionDeFibonacci(5), expectedValue);
    }

}
