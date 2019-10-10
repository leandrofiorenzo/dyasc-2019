package ar.edu.untref.dyasc;

public class SucesionDeFibonnaci {

    private IDireccionStrategy direccionStrategy;

    public int[] obtenerSucesionDeFibonacci(int longitudDeLaSucesion) {
        return direccionStrategy.obtenerSucesionDeFibonacci(longitudDeLaSucesion);
    }

    public void definirStrategyDeDireccion(IDireccionStrategy direccionStrategy) {
        this.direccionStrategy = direccionStrategy;
    }

}
