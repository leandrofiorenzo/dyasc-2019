package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
        ArgumentsParser argumentsParser = new ArgumentsParser(args);
        if(!argumentsParser.sonArgumentosValidos()) {
            System.out.println(argumentsParser.getMensajeDeValidacion());
            return;
        }

        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        int[] sucesion = sucesionDeFibonacci.obtenerSucesion(argumentsParser.getCantidadDeNumeros(), argumentsParser.esFormatoDirecto());
        String sucesionFormateada = formateadorSucesionDeFibonacci.formatearSucesion(sucesion, argumentsParser.esFormatoHorizontal());
        System.out.println(sucesionFormateada);
    }
}
