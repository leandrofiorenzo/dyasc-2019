package ar.edu.untref.dyasc;

public class ArgumentosDelPrograma {
    private int longitudDeLaSucesion;
    private ArgumentoF argumentoF = new ArgumentoF();
    private ArgumentoO argumentoO = new ArgumentoO();
    private ArgumentoM argumentoM = new ArgumentoM();

    public ArgumentosDelPrograma(String[] args) {
        this.longitudDeLaSucesion = Integer.parseInt(args[args.length - 1]);
    }

    public void inicializarArgumentos(String[] args) {
        argumentoF.inicializarArgumento(args);
        argumentoO.inicializarArgumento(args);
        argumentoM.inicializarArgumento(args);
    }

    public int obtenerLongitudDeLaSucesion() {
        return longitudDeLaSucesion;
    }

    public String obtenerArchivoDeSalida() {
        return argumentoF.obtenerArchivoDeSalida();
    }

    public IDireccionStrategy obtenerStrategyDeDireccion() {
        switch (argumentoO.obtenerDireccion()) {
            case Directa:
                return new DireccionDirectaStrategy();
            case Inversa:
                return new DireccionInversaStrategy();
            default:
                return null; //error;
        }
    }

    public IOrientacionStrategy obtenerStrategyDeOrientacion() {
        switch (argumentoO.obtenerOrientacion()) {
            case Horizontal:
                return new OrientacionHorizontalStrategy();
            case Vertical:
                return new OrientacionVerticalStrategy();
            default:
                return null; //error;
        }
    }
}
