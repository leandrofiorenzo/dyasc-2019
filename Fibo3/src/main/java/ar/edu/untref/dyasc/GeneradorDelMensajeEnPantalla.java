package ar.edu.untref.dyasc;

public class GeneradorDelMensajeEnPantalla {

    public String generarMensajeParaImprimirEnPantalla(int longitudDeLaSucesion, String archivoDeSalida, String sucesionDeFibonacciFormateada) {
        String mensajeEnPantalla = "";
        if(archivoDeSalida != "") mensajeEnPantalla = "fibo<" + longitudDeLaSucesion + "> guardado en " + archivoDeSalida;
        else mensajeEnPantalla = sucesionDeFibonacciFormateada;
        return mensajeEnPantalla;
    }
}
