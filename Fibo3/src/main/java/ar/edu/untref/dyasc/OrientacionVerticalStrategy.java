package ar.edu.untref.dyasc;

public class OrientacionVerticalStrategy implements IOrientacionStrategy {

    public String formatearSucesionDeFibonacci(int longitudDeLaSucesion, int[] sucesionDeFibonacci) {
        String sucesionFormateada = "fibo<" + longitudDeLaSucesion + ">:";
        for (int i = 0; i < sucesionDeFibonacci.length; i++) {
            sucesionFormateada += "\n" + sucesionDeFibonacci[i];
        }
        return sucesionFormateada;
    }
}
