package ar.edu.untref.dyasc;

public class ArgumentoF {
    private final String INDICADOR_ARGUMENTO = "-f=";
    private String archivoDeSalida = "";

    public void inicializarArgumento(String[] args) {
        for(int i = 0; i < args.length; i++) {
            if(args[i].contains(INDICADOR_ARGUMENTO)) {
                this.archivoDeSalida = args[i].replace(INDICADOR_ARGUMENTO, "");
            }
        }
    }

    public String obtenerArchivoDeSalida() {
        return this.archivoDeSalida;
    }
}
