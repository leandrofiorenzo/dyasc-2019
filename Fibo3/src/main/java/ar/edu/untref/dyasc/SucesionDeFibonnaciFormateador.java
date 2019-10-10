package ar.edu.untref.dyasc;

public class SucesionDeFibonnaciFormateador {

    private IOrientacionStrategy orientacionStrategy;

    public void definirStrategyDeOrientacion(IOrientacionStrategy orientacionStrategy) {
        this.orientacionStrategy = orientacionStrategy;
    }

    public String formatearSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        return orientacionStrategy.formatearSucesionDeFibonacci(sucesionDeFibonacci);
    }

}
