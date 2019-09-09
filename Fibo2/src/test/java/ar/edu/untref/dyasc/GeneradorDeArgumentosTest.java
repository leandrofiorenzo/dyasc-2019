package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneradorDeArgumentosTest {

    @Test
    public void testGeneraLosArgumentosVerticalDirecto5()
    {
        String[] args = { "-o=vd" , "5" };
        GeneradorDeArgumentos generadorDeArgumentos = new GeneradorDeArgumentos(args);
        assertFalse(generadorDeArgumentos.esFormatoHorizontal());
        assertTrue(generadorDeArgumentos.esFormatoDirecto());
        assertEquals(generadorDeArgumentos.getCantidadDeNumeros(), 5);
        assertTrue(generadorDeArgumentos.sonArgumentosValidos());
    }

    @Test
    public void testGeneraLosArgumentosHorizontalInverso8()
    {
        String[] args = { "-o=hi" , "8" };
        GeneradorDeArgumentos generadorDeArgumentos = new GeneradorDeArgumentos(args);
        assertTrue(generadorDeArgumentos.esFormatoHorizontal());
        assertFalse(generadorDeArgumentos.esFormatoDirecto());
        assertEquals(generadorDeArgumentos.getCantidadDeNumeros(), 8);
        assertTrue(generadorDeArgumentos.sonArgumentosValidos());
    }

    @Test
    public void testLosArgumentosSonInvalidos()
    {
        String[] args = { "-o=xy" , "8" };
        GeneradorDeArgumentos generadorDeArgumentos = new GeneradorDeArgumentos(args);
        assertFalse(generadorDeArgumentos.sonArgumentosValidos());
        assertEquals(generadorDeArgumentos.getMensajeDeValidacion(), "Opción no válida");
    }

    @Test
    public void testGeneraLosArgumentosHorizontalDirecto8SinEspecificarOrientacion()
    {
        String[] args = { "8" };
        GeneradorDeArgumentos generadorDeArgumentos = new GeneradorDeArgumentos(args);
        assertTrue(generadorDeArgumentos.esFormatoHorizontal());
        assertTrue(generadorDeArgumentos.esFormatoDirecto());
        assertEquals(generadorDeArgumentos.getCantidadDeNumeros(), 8);
        assertTrue(generadorDeArgumentos.sonArgumentosValidos());
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
