package ar.edu.untref.dyasc;

public class ReglasDeFuncionamiento {

    private ModoDeFuncionamientoEnum modoDeFuncionamiento;

    public int[] ejecutarReglasDeFuncionamientoSobreLaSucesionDeFibonacci(int[] sucesionDeFibonacci) {
        if(modoDeFuncionamiento == ModoDeFuncionamientoEnum.Sumatoria) {
            int sucesionSumada = 0;
            for (int i = 0; i < sucesionDeFibonacci.length; i++) {
                sucesionSumada += sucesionDeFibonacci[i];
            }
            return new int[] {sucesionSumada};
        } else {
            return sucesionDeFibonacci;
        }
    }

    public void definirModoDeFuncionamiento(ModoDeFuncionamientoEnum modoDeFuncionamiento) {
        this.modoDeFuncionamiento = modoDeFuncionamiento;
    }

}
