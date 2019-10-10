package ar.edu.untref.dyasc;

public class SucesionDeFibonacci {

    private IDireccionStrategy direccionStrategy = new DireccionDirectaStrategy();

    public int[] obtenerSucesionDeFibonacci(int longitudDeLaSucesion) {
        return direccionStrategy.obtenerSucesionDeFibonacci(longitudDeLaSucesion);
    }

    public void definirStrategyDeDireccion(IDireccionStrategy direccionStrategy) {
        this.direccionStrategy = direccionStrategy;
    }

}
