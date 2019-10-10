package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {

        args = new String[] { "5", "-m=l", "-o=vi"};

        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos();

        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma(argumentosDelPrograma);
        orquestadorDelPrograma.ejecutarPrograma();
    }
}
