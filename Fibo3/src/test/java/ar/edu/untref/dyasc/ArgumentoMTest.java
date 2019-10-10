package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentoMTest {

    @Test
    public void testGeneraElModoDeFuncionamientoSumatoria() {
        String[] args = { "-m=s", "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        ModoDeFuncionamientoEnum modoDeFuncionamiento = argumentosDelPrograma.obtenerModoDeFuncionamiento();
        assertEquals(modoDeFuncionamiento, ModoDeFuncionamientoEnum.Sumatoria);
    }

    @Test
    public void testGeneraElModoDeFuncionamientoLista() {
        String[] args = { "-m=l", "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        ModoDeFuncionamientoEnum modoDeFuncionamiento = argumentosDelPrograma.obtenerModoDeFuncionamiento();
        assertEquals(modoDeFuncionamiento, ModoDeFuncionamientoEnum.Lista
        );
    }

}
