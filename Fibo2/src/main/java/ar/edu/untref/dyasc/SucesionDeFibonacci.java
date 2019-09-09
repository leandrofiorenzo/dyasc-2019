package ar.edu.untref.dyasc;

public class SucesionDeFibonacci {

    /**
     * Devuelve hasta el n-esimo número de la sucesion de fibonacci.
     * @param n n-esimo número de la sucesion hasta el que se quiere obtener.
     * @return Devuelve hasta el n-esimo número de la sucesion de fibonacci.
     */
    public int[] obtenerSucesion(int n) {
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

    /**
     * Devuelve hasta el n-esimo número de la sucesion de fibonacci.
     * @param n n-esimo número de la sucesion hasta el que se quiere obtener.
     * @param enDirecto si se dese obtener la sucesion en formato directo.
     * @return Devuelve hasta el n-esimo número de la sucesion de fibonacci.
     */
    public int[] obtenerSucesion(int n, boolean enDirecto) {
        int[] sucesion = obtenerSucesion(n);
        if(enDirecto) return sucesion;

        for(int i = 0; i < sucesion.length / 2; i++)
        {
            int temp = sucesion[i];
            sucesion[i] = sucesion[sucesion.length - i - 1];
            sucesion[sucesion.length - i - 1] = temp;
        }

        return sucesion;
    }
}
