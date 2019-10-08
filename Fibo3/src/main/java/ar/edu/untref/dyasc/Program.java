package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
        //Inicializamos los argumentos del programa.
        ArgumentosDelPrograma argumentosDelPrograma = new ArgumentosDelPrograma(args);
        argumentosDelPrograma.inicializarArgumentos(args);

        //Inicializamos el orquestador del programa.
        OrquestadorDelPrograma orquestadorDelPrograma = new OrquestadorDelPrograma();

        //Definimos las strategys acorde a los argumentos.
        orquestadorDelPrograma.definirStrategyDeDireccion(argumentosDelPrograma.obtenerStrategyDeDireccion());
        orquestadorDelPrograma.definirStrategyDeOrientacion(argumentosDelPrograma.obtenerStrategyDeOrientacion());

        //Obtenemos la sucesion de fibonacci
        int[] sucesionDeFibonacci = orquestadorDelPrograma.obtenerSucesionDeFibonacci(argumentosDelPrograma.obtenerLongitudDeLaSucesion());

        //Formateamos la sucesion de fibonacci
        String sucesionDeFibonacciFormateada = orquestadorDelPrograma.formatearSucesionDeFibonacci(sucesionDeFibonacci);

        //Imprimimos en pantalla
        System.out.println(sucesionDeFibonacciFormateada);

        boolean mostrar = false;
        if(mostrar) {
            orquestadorDelPrograma.guardarEnArchivo(sucesionDeFibonacciFormateada, "prueba.txt");
        }



//-o=vd: orientacion y direccion
//-f=xxxxxx: escribe la salida en el archivo cuyo nombre se especifique
//-m=s: donde m define el modo de funcionamiento, el cual puede ser "l" o "s".
        // "l" significa "lista", lo cual es el comportamiento actual en fibo2.
        // "s"  significa "sumatoria" y significa que el programa debe calcular la sumatoria de los items de la secuencia de fibonacci del número especificado.
        //El programa puede invocarse sin la opción "-m" en cuyo caso el comportamiento debe ser por default debe ser el de fibo2.
//5: longitud de la sucesion

        /*ArgumentsParser argumentsParser = new ArgumentsParser(args);
        if(!argumentsParser.sonArgumentosValidos()) {
            System.out.println(argumentsParser.getMensajeDeValidacion());
            return;
        }

        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        FormateadorSucesionDeFibonacci formateadorSucesionDeFibonacci = new FormateadorSucesionDeFibonacci();
        int[] sucesion = sucesionDeFibonacci.obtenerSucesion(argumentsParser.getCantidadDeNumeros(), argumentsParser.esFormatoDirecto());
        String sucesionFormateada = formateadorSucesionDeFibonacci.formatearSucesion(sucesion, argumentsParser.esFormatoHorizontal());
        System.out.println(sucesionFormateada);*/
    }
}
