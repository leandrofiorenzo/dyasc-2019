package ar.edu.untref.dyasc;

public class OrquestadorDelPrograma {

    private SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
    private SucesionDeFibonacciFormateador sucesionDeFibonacciFormateador = new SucesionDeFibonacciFormateador();
    private GeneradorDeArchivos generadorDeArchivos = new GeneradorDeArchivos();
    private GeneradorDelMensajeEnPantalla generadorDelMensajeEnPantalla = new GeneradorDelMensajeEnPantalla();
    private ModoDeFuncionamiento modoDeFuncionamiento = new ModoDeFuncionamiento();
    private ArgumentosDelPrograma argumentosDelPrograma ;

    public OrquestadorDelPrograma(ArgumentosDelPrograma argumentosDelPrograma) {
        this.argumentosDelPrograma = argumentosDelPrograma;
    }

    public void ejecutarPrograma() {
        sucesionDeFibonacci.definirStrategyDeDireccion(obtenerStrategyDeDireccion());
        int[] sucesionDeFibonacci = this.sucesionDeFibonacci.obtenerSucesionDeFibonacci(argumentosDelPrograma.obtenerLongitudDeLaSucesion());

        modoDeFuncionamiento.definirStrategyModoDeFuncionamiento(obtenerStrategyDeModoDeFuncionamiento());
        sucesionDeFibonacci = modoDeFuncionamiento.convertirSucesionDeFibonacci(sucesionDeFibonacci);

        sucesionDeFibonacciFormateador.definirStrategyDeOrientacion(obtenerStrategyDeOrientacion());
        String sucesionDeFibonacciFormateada = sucesionDeFibonacciFormateador.formatearSucesionDeFibonacci(argumentosDelPrograma.obtenerLongitudDeLaSucesion(), sucesionDeFibonacci);

        generadorDeArchivos.generarArchivoDeSalida(sucesionDeFibonacciFormateada, argumentosDelPrograma.obtenerArchivoDeSalida());

        String mensajeEnPantalla = generadorDelMensajeEnPantalla.generarMensajeParaImprimirEnPantalla(argumentosDelPrograma.obtenerLongitudDeLaSucesion(), argumentosDelPrograma.obtenerArchivoDeSalida(), sucesionDeFibonacciFormateada);
        System.out.println(mensajeEnPantalla);
    }

    private IDireccionStrategy obtenerStrategyDeDireccion() {
        switch (argumentosDelPrograma.obtenerDireccion()) {
            case Directa:
                return new DireccionDirectaStrategy();
            case Inversa:
                return new DireccionInversaStrategy();
            default:
                return null;
        }
    }

    private IOrientacionStrategy obtenerStrategyDeOrientacion() {
        switch (argumentosDelPrograma.obtenerOrientacion()) {
            case Horizontal:
                return new OrientacionHorizontalStrategy();
            case Vertical:
                return new OrientacionVerticalStrategy();
            default:
                return null;
        }
    }

    private IModoDeFuncionamientoStrategy obtenerStrategyDeModoDeFuncionamiento() {
        switch (argumentosDelPrograma.obtenerModoDeFuncionamiento()) {
            case Lista:
                return new ModoDeFuncionamientoListaStrategy();
            case Sumatoria:
                return new ModoDeFuncionamientoSumatoriaStrategy();
            default:
                return null;
        }
    }
}
