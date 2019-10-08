package ar.edu.untref.dyasc;

public class DireccionDirectaStrategy implements IDireccionStrategy {

    public int[] obtenerSucesionDeFibonacci (int longitudDeLaSucesion) {
        int[] sucesionDeFibonacci = new int[longitudDeLaSucesion];
        int primero = 0;
        int siguiente = 1;
        for (int i = 0; i < longitudDeLaSucesion; i++)
        {
            if(i == 0) {
                sucesionDeFibonacci[i] = primero;
            } else if(i == 1) {
                sucesionDeFibonacci[1] = siguiente;
            } else {
                int suma = primero + siguiente;
                primero = siguiente;
                siguiente = suma;
                sucesionDeFibonacci[i] = siguiente;
            }
        }
        return sucesionDeFibonacci;
    }
}
