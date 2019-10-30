package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SucesionDeFibonacciFormateadorTest {

    @Test
    public void testDevuelveLaSucesion5FormateadaHorizontal()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        SucesionDeFibonacciFormateador sucesionDeFibonacciFormateador = new SucesionDeFibonacciFormateador();
        sucesionDeFibonacciFormateador.definirStrategyDeOrientacion(new OrientacionHorizontalStrategy());
        String expectedValue = sucesionDeFibonacciFormateador.formatearSucesionDeFibonacci(5, sucesionDeFibonacci.obtenerSucesionDeFibonacci(5));
        assertEquals("fibo<5>: 0 1 1 2 3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaHorizontal()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        SucesionDeFibonacciFormateador sucesionDeFibonacciFormateador = new SucesionDeFibonacciFormateador();
        sucesionDeFibonacciFormateador.definirStrategyDeOrientacion(new OrientacionHorizontalStrategy());
        String expectedValue = sucesionDeFibonacciFormateador.formatearSucesionDeFibonacci(8, sucesionDeFibonacci.obtenerSucesionDeFibonacci(8));
        assertEquals("fibo<8>: 0 1 1 2 3 5 8 13", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5FormateadaVertical()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        SucesionDeFibonacciFormateador sucesionDeFibonacciFormateador = new SucesionDeFibonacciFormateador();
        sucesionDeFibonacciFormateador.definirStrategyDeOrientacion(new OrientacionVerticalStrategy());
        String expectedValue = sucesionDeFibonacciFormateador.formatearSucesionDeFibonacci(5, sucesionDeFibonacci.obtenerSucesionDeFibonacci(5));
        assertEquals("fibo<5>:\n0\n1\n1\n2\n3", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion8FormateadaVertical()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        SucesionDeFibonacciFormateador sucesionDeFibonacciFormateador = new SucesionDeFibonacciFormateador();
        sucesionDeFibonacciFormateador.definirStrategyDeOrientacion(new OrientacionVerticalStrategy());
        String expectedValue = sucesionDeFibonacciFormateador.formatearSucesionDeFibonacci(8, sucesionDeFibonacci.obtenerSucesionDeFibonacci(8));
        assertEquals("fibo<8>:\n0\n1\n1\n2\n3\n5\n8\n13", expectedValue);
    }

    @Test
    public void testDevuelveLaSucesion5FormateadaHorizontalSinStrategy()
    {
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        SucesionDeFibonacciFormateador sucesionDeFibonacciFormateador = new SucesionDeFibonacciFormateador();
        String expectedValue = sucesionDeFibonacciFormateador.formatearSucesionDeFibonacci(5, sucesionDeFibonacci.obtenerSucesionDeFibonacci(5));
        assertEquals("fibo<5>: 0 1 1 2 3", expectedValue);
    }

}
