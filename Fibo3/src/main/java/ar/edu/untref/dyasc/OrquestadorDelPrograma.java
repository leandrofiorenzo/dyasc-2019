package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OrquestadorDelPrograma implements IDireccionStrategy {

    private IDireccionStrategy direccionStrategy;
    private IOrientacionStrategy orientacionStrategy;

    public void definirStrategyDeDireccion(IDireccionStrategy sucesionDeFibonacciStrategy) {
        this.direccionStrategy = sucesionDeFibonacciStrategy;
    }

    public void definirStrategyDeOrientacion(IOrientacionStrategy formateoStrategy) {
        this.orientacionStrategy = formateoStrategy;
    }

    public int[] obtenerSucesionDeFibonacci(int longitudDeLaSucesion) {
        return direccionStrategy.obtenerSucesionDeFibonacci(longitudDeLaSucesion);
    }

    public String formatearSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        return orientacionStrategy.formatearSucesionDeFibonacci(sucesionDeFibonacci);
    }


    public void guardarEnArchivo(String mensaje, String rutaArchivo) {
        try (PrintWriter out = new PrintWriter(rutaArchivo)) {
            out.println(mensaje);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
