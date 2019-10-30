package ar.edu.untref.dyasc;

public class OrientacionHorizontalStrategy implements IOrientacionStrategy {

    public String formatearSucesionDeFibonacci(int longitudDeLaSucesion, int[] sucesionDeFibonacci) {
        String sucesionFormateada = "fibo<" + longitudDeLaSucesion + ">:";
        for (int i = 0; i < sucesionDeFibonacci.length; i++) {
            sucesionFormateada += " " + sucesionDeFibonacci[i];
        }
        return sucesionFormateada;
    }

}
