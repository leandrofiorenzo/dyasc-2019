package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentoFTest {

    @Test
    public void testGeneraElArgumentoArchivoDeSalida() {
        String[] args = { "-f=test.txt" , "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        String archivoDeSalida = argumentosDelPrograma.obtenerArchivoDeSalida();
        assertEquals(archivoDeSalida, "test.txt");
    }

    @Test
    public void testDejaEnBlancoElArgumentoArchivoDeSalida() {
        String[] args = { "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        String archivoDeSalida = argumentosDelPrograma.obtenerArchivoDeSalida();
        assertEquals(archivoDeSalida, "");
    }

}
