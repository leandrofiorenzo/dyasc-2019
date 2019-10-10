package ar.edu.untref.dyasc;

import java.util.*;

public class DireccionInversaStrategy extends DireccionDirectaStrategy implements IDireccionStrategy {

    @Override
    public int[] obtenerSucesionDeFibonacci (int longitudDeLaSucesion) {
        int[] sucesionDeFibonacci = super.obtenerSucesionDeFibonacci(longitudDeLaSucesion);
        int[] sucesionDeFibonacciInvertida = invertirArray(sucesionDeFibonacci);
        return sucesionDeFibonacciInvertida;

    }

    private int[] invertirArray (int[] array) {
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}