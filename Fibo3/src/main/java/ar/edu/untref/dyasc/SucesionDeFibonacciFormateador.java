package ar.edu.untref.dyasc;

public class SucesionDeFibonacciFormateador {

    private IOrientacionStrategy orientacionStrategy = new OrientacionHorizontalStrategy();

    public void definirStrategyDeOrientacion(IOrientacionStrategy orientacionStrategy) {
        this.orientacionStrategy = orientacionStrategy;
    }

    public String formatearSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        return orientacionStrategy.formatearSucesionDeFibonacci(sucesionDeFibonacci);
    }

}
