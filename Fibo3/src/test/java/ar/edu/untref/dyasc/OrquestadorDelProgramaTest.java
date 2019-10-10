package ar.edu.untref.dyasc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OrquestadorDelProgramaTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testOrquestaElProgramaDeSucesion5()
    {
        String[] args = { "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>: 0 1 1 2 3\n", outContent.toString());
    }

    @Test
    public void testOrquestaElProgramaDeSucesion5OrientacionHorizontalYDireccionDirecta()
    {
        String[] args = { "5", "-o=hd" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>: 0 1 1 2 3\n", outContent.toString());
    }

    @Test
    public void testOrquestaElProgramaDeSucesion5OrientacionHorizontalYDireccionInversa()
    {
        String[] args = { "5", "-o=hi" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>: 3 2 1 1 0\n", outContent.toString());
    }

    @Test
    public void testOrquestaElProgramaDeSucesion5OrientacionVerticalYDireccionDirecta()
    {
        String[] args = { "5", "-o=vd" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>:\n0\n1\n1\n2\n3\n", outContent.toString());
    }

    @Test
    public void testOrquestaElProgramaDeSucesion5OrientacionVerticalYDireccionInversa()
    {
        String[] args = { "5", "-o=vi" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>:\n3\n2\n1\n1\n0\n", outContent.toString());
    }

    @Test
    public void testOrquestaElProgramaDeSucesion5EnModoDeFuncionamientoLista()
    {
        String[] args = { "5", "-m=l" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>: 0 1 1 2 3\n", outContent.toString());
    }

    /*@Test
    public void testOrquestaElProgramaDeSucesion5EnModoDeFuncionamientoSumatoria()
    {
        String[] args = { "5", "-m=s" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5>: 7\n", outContent.toString());
    }*/

    @Test
    public void testOrquestaElProgramaDeSucesion5ConArchivoDeSalida()
    {
        String[] args = { "5", "-f=test.txt" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();

        assertEquals("fibo<5> guardado en test.txt\n", outContent.toString());
    }





}
