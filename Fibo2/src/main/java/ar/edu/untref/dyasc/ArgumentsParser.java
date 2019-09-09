package ar.edu.untref.dyasc;

public class ArgumentsParser {

    private int cantidadDeNumeros;
    private boolean esFormatoHorizontal;
    private boolean esFormatoDirecto;

    private boolean sonArgumentosValidos;
    private String mensajeDeValidacion;

    public ArgumentsParser(String[] args) {
        this.esFormatoHorizontal = true;
        this.esFormatoDirecto = true;
        this.sonArgumentosValidos = true;
        if(args.length == 2) {
            char[] argsFormato = args[0].toCharArray();
            if(argsFormato.length != 5) {
                this.mensajeDeValidacion = "Opción no válida";
                this.sonArgumentosValidos = false;
                return;
            }

            char parametroHorizontalOVertical = argsFormato[3];
            char parametroDirectoOInverso = argsFormato[4];

            if(parametroHorizontalOVertical != 'h' && parametroHorizontalOVertical != 'v'){
                this.mensajeDeValidacion = "Opción no válida";
                this.sonArgumentosValidos = false;
                return;
            }

            if(parametroDirectoOInverso != 'd' && parametroDirectoOInverso != 'i'){
                this.mensajeDeValidacion = "Opción no válida";
                this.sonArgumentosValidos = false;
                return;
            }

            this.esFormatoHorizontal= parametroHorizontalOVertical == 'h';
            this.esFormatoDirecto = parametroDirectoOInverso == 'd';
            this.cantidadDeNumeros = Integer.parseInt(args[1]);
        } else if(args.length == 1) {
            this.cantidadDeNumeros = Integer.parseInt(args[0]);
        } else {
            this.mensajeDeValidacion = "No se puede ejecutar el programa sin argumentos";
            this.sonArgumentosValidos = false;
            return;
        }
    }

    public int getCantidadDeNumeros() {
        return  this.cantidadDeNumeros;
    }

    public boolean esFormatoHorizontal() {
        return this.esFormatoHorizontal;
    }

    public boolean esFormatoDirecto () {
        return  this.esFormatoDirecto;
    }

    public boolean sonArgumentosValidos () {
        return  this.sonArgumentosValidos;
    }

    public String getMensajeDeValidacion () { return this.mensajeDeValidacion; }
}
