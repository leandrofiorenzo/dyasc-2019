package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
        GeneradorDeArgumentos generadorDeArgumentos = new GeneradorDeArgumentos(args);
        if(!generadorDeArgumentos.sonArgumentosValidos())
            return;
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        int[] sucesion = sucesionDeFibonacci.obtenerSucesion(generadorDeArgumentos.getCantidadDeNumeros(), generadorDeArgumentos.esFormatoDirecto());
        String sucesionFormateada = formateadorSucesionDeFibonacci.formatearSucesion(sucesion, generadorDeArgumentos.esFormatoHorizontal());
        System.out.println(sucesionFormateada);
    }
}
