package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos(args);

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();
    }
}
