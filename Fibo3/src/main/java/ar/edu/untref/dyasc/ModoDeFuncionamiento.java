package ar.edu.untref.dyasc;

public class ModoDeFuncionamiento {

    private IModoDeFuncionamientoStrategy modoDeFuncionamientoStrategy;

    public void definirStrategyModoDeFuncionamiento(IModoDeFuncionamientoStrategy modoDeFuncionamientoStrategy) {
        this.modoDeFuncionamientoStrategy = modoDeFuncionamientoStrategy;
    }

    public int[] convertirSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        return modoDeFuncionamientoStrategy.convertirSucesionDeFibonacci(sucesionDeFibonacci);
    }

}
