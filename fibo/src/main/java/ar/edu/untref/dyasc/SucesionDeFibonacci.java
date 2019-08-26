package ar.edu.untref.dyasc;

public class SucesionDeFibonacci {

    public int[] ObtenerPrimerosN(int n) {
        int primero = 0;
        int siguiente = 1;
        int[] sucesion = new int[n];

        for (int i = 0; i < n; i++)
        {
            if(i == 0) {
                sucesion[i] = primero;
            } else if(i == 1) {
                sucesion[1] = siguiente;
            } else {
                int sum = primero + siguiente;
                primero = siguiente;
                siguiente = sum;
                sucesion[i] = siguiente;
            }
        }
        return sucesion;
    }

    public String FormatearSucesion(int[] sucesion) {
        String sucesionFormateada = "fibo<" + sucesion.length + ">:";
        for (int i = 0; i < sucesion.length; i++) {
            sucesionFormateada += " " + sucesion[i];
        }
        return sucesionFormateada;
    }
}
