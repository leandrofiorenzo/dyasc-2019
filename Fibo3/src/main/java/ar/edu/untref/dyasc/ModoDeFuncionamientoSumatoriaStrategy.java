package ar.edu.untref.dyasc;

public class ModoDeFuncionamientoSumatoriaStrategy implements IModoDeFuncionamientoStrategy {

    public int[] convertirSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        int sucesionSumada = 0;
        for (int i = 0; i < sucesionDeFibonacci.length; i++) {
            sucesionSumada += sucesionDeFibonacci[i];
        }
        return new int[] {sucesionSumada};
    }
}
