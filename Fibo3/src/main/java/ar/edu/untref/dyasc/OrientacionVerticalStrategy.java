package ar.edu.untref.dyasc;

public class OrientacionVerticalStrategy implements IOrientacionStrategy {

    public String formatearSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        String sucesionFormateada = "fibo<" + sucesionDeFibonacci.length + ">:";
        for (int i = 0; i < sucesionDeFibonacci.length; i++) {
            sucesionFormateada += "\n" + sucesionDeFibonacci[i];
        }
        return sucesionFormateada;
    }
}
