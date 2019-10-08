package ar.edu.untref.dyasc;

public class OrientacionHorizontalStrategy implements IOrientacionStrategy {

    public String formatearSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        String sucesionFormateada = "fibo<" + sucesionDeFibonacci.length + ">:";
        for (int i = 0; i < sucesionDeFibonacci.length; i++) {
            sucesionFormateada += " " + sucesionDeFibonacci[i];
        }
        return sucesionFormateada;
    }

}
