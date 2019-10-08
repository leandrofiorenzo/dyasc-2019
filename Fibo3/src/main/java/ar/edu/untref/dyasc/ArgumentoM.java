package ar.edu.untref.dyasc;

public class ArgumentoM {
    private final String INDICADOR_ARGUMENTO = "-m=";
    private ModoDeFuncionamientoEnum modoDeFuncionamiento;

    public void inicializarArgumento(String[] args) {
        for(int i = 0; i < args.length; i++) {
            if(args[i].contains(INDICADOR_ARGUMENTO)) {
                String modoDeFuncionamientoString = args[i].replace(INDICADOR_ARGUMENTO, "");
                if(modoDeFuncionamientoString == "l") this.modoDeFuncionamiento = ModoDeFuncionamientoEnum.Lista;
                else if(modoDeFuncionamientoString == "s") this.modoDeFuncionamiento = ModoDeFuncionamientoEnum.Sumatoria;
            }
        }
    }

    public ModoDeFuncionamientoEnum obtenerModoDeFuncionamiento() {
        return this.modoDeFuncionamiento;
    }
}
