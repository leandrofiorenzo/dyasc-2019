package ar.edu.untref.dyasc;

public class ArgumentosDelPrograma {

    private String[] args;
    private int longitudDeLaSucesion;
    private ArgumentoF argumentoF = new ArgumentoF();
    private ArgumentoO argumentoO = new ArgumentoO();
    private ArgumentoM argumentoM = new ArgumentoM();

    public ArgumentosDelPrograma(String[] args) {
        this.args = args;

        //La longitud de la sucesión es un parametro indispensable para el funcionamiento del mismo. Los demás son opcionales.
        for(int i = 0; i < args.length; i++) {
            if (isInteger(args[i])) {
                this.longitudDeLaSucesion = Integer.parseInt(args[i]);
                break;
            }
        }
    }

    public void inicializarArgumentos() {
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

    public DireccionEnum obtenerDireccion () {
        return argumentoO.obtenerDireccion();
    }

    public OrientacionEnum obtenerOrientacion () {
        return argumentoO.obtenerOrientacion();
    }

    public ModoDeFuncionamientoEnum obtenerModoDeFuncionamiento () {
        return argumentoM.obtenerModoDeFuncionamiento();
    }

    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

}
