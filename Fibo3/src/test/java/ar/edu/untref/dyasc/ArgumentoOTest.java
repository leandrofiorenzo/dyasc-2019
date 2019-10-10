package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentoOTest {

    @Test
    public void testGeneraOrientacionHorizontalDireccionDirecta() {
        String[] args = { "-o=hd" , "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrientacionEnum orientacion = argumentosDelPrograma.obtenerOrientacion();
        DireccionEnum direccion = argumentosDelPrograma.obtenerDireccion();

        assertEquals(orientacion, OrientacionEnum.Horizontal);
        assertEquals(direccion, DireccionEnum.Directa);
    }

    @Test
    public void testGeneraOrientacionHorizontalDireccionInversa() {
        String[] args = { "-o=hi" , "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrientacionEnum orientacion = argumentosDelPrograma.obtenerOrientacion();
        DireccionEnum direccion = argumentosDelPrograma.obtenerDireccion();

        assertEquals(orientacion, OrientacionEnum.Horizontal);
        assertEquals(direccion, DireccionEnum.Inversa);
    }

    @Test
    public void testGeneraOrientacionVerticalDireccionDirecta() {
        String[] args = { "-o=vd" , "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrientacionEnum orientacion = argumentosDelPrograma.obtenerOrientacion();
        DireccionEnum direccion = argumentosDelPrograma.obtenerDireccion();

        assertEquals(orientacion, OrientacionEnum.Vertical);
        assertEquals(direccion, DireccionEnum.Directa);
    }

    @Test
    public void testGeneraOrientacionVerticalDireccionInversa() {
        String[] args = { "-o=vi" , "5" };
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrientacionEnum orientacion = argumentosDelPrograma.obtenerOrientacion();
        DireccionEnum direccion = argumentosDelPrograma.obtenerDireccion();

        assertEquals(orientacion, OrientacionEnum.Vertical);
        assertEquals(direccion, DireccionEnum.Inversa);
    }

}
