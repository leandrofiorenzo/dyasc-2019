package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OrquestadorDelPrograma {

    private SucesionDeFibonnaci sucesionDeFibonnaci = new SucesionDeFibonnaci();
    private SucesionDeFibonnaciFormateador sucesionDeFibonnaciFormateador = new SucesionDeFibonnaciFormateador();
    private GeneradorDeArchivos generadorDeArchivos = new GeneradorDeArchivos();
    private GeneradorDelMensajeEnPantalla generadorDelMensajeEnPantalla = new GeneradorDelMensajeEnPantalla();
    private ReglasDeFuncionamiento reglasDeFuncionamiento = new ReglasDeFuncionamiento();
    private ArgumentosDelPrograma argumentosDelPrograma ;

    public OrquestadorDelPrograma(ArgumentosDelPrograma argumentosDelPrograma) {
        this.argumentosDelPrograma = argumentosDelPrograma;
    }

    public void ejecutarPrograma() {
        sucesionDeFibonnaci.definirStrategyDeDireccion(obtenerStrategyDeDireccion());
        int[] sucesionDeFibonacci = sucesionDeFibonnaci.obtenerSucesionDeFibonacci(argumentosDelPrograma.obtenerLongitudDeLaSucesion());

        reglasDeFuncionamiento.definirModoDeFuncionamiento(argumentosDelPrograma.obtenerModoDeFuncionamiento());
        sucesionDeFibonacci = reglasDeFuncionamiento.ejecutarReglasDeFuncionamientoSobreLaSucesionDeFibonacci(sucesionDeFibonacci);

        sucesionDeFibonnaciFormateador.definirStrategyDeOrientacion(obtenerStrategyDeOrientacion());
        String sucesionDeFibonacciFormateada = sucesionDeFibonnaciFormateador.formatearSucesionDeFibonacci(sucesionDeFibonacci);

        generadorDeArchivos.generarArchivoConContenido(sucesionDeFibonacciFormateada, argumentosDelPrograma.obtenerArchivoDeSalida());

        String mensajeEnPantalla = generadorDelMensajeEnPantalla.generarMensajeParaImprimirEnPantalla(argumentosDelPrograma.obtenerLongitudDeLaSucesion(), argumentosDelPrograma.obtenerArchivoDeSalida(), sucesionDeFibonacciFormateada);
        System.out.println(mensajeEnPantalla);

    }

    private IDireccionStrategy obtenerStrategyDeDireccion() {
        switch (argumentosDelPrograma.obtenerDireccion()) {
            case Directa:
                return new DireccionDirectaStrategy();
            case Inversa:
                return new DireccionInversaStrategy();
            default:
                return null; //error;
        }
    }

    private IOrientacionStrategy obtenerStrategyDeOrientacion() {
        switch (argumentosDelPrograma.obtenerOrientacion()) {
            case Horizontal:
                return new OrientacionHorizontalStrategy();
            case Vertical:
                return new OrientacionVerticalStrategy();
            default:
                return null; //error;
        }
    }


    public void guardarEnArchivo(String mensaje, String rutaArchivo) {
        try (PrintWriter out = new PrintWriter(rutaArchivo)) {
            out.println(mensaje);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
