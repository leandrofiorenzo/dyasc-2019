package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArgumentosDelProgramaTest {

    @Test
    public void testGeneraLaLongitudDeLaSucesion5() {
        String[] args = { "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();
        int longitudDeLaSucesion = argumentosDelPrograma.obtenerLongitudDeLaSucesion();

        assertEquals(longitudDeLaSucesion, 5);
    }

    @Test
    public void testGeneraLaLongitudDeLaSucesion5ConOtrosArgumentosOpcionales() {
        String[] args = { "-o=vi", "5", "-m=s" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();
        int longitudDeLaSucesion = argumentosDelPrograma.obtenerLongitudDeLaSucesion();

        assertEquals(longitudDeLaSucesion, 5);
    }
}
