package ar.edu.untref.dyasc;

public class FormateadorSucesionDeFibonacci {

    public String formatearSucesion(int[] sucesion) {
        String sucesionFormateada = "fibo<" + sucesion.length + ">:";
        for (int i = 0; i < sucesion.length; i++) {
            sucesionFormateada += " " + sucesion[i];
        }
        return sucesionFormateada;
    }

}
