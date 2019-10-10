package ar.edu.untref.dyasc;

public class ArgumentoO {
    private final String INDICADOR_ARGUMENTO = "-o=";
    private OrientacionEnum orientacion = OrientacionEnum.Horizontal;
    private DireccionEnum direccion = DireccionEnum.Directa;

    public void inicializarArgumento(String[] args) {
        for(int i = 0; i < args.length; i++) {
            if(args[i].contains(INDICADOR_ARGUMENTO)) {
                char[] orientacionYDireccion = args[i].replace(INDICADOR_ARGUMENTO, "").toCharArray();

                if(orientacionYDireccion[0] == 'v') this.orientacion = OrientacionEnum.Vertical;
                else if(orientacionYDireccion[0] == 'h') this.orientacion = OrientacionEnum.Horizontal;

                if(orientacionYDireccion[1] == 'd') this.direccion = DireccionEnum.Directa;
                else if(orientacionYDireccion[1] == 'i') this.direccion = DireccionEnum.Inversa;
            }
        }
    }

    public OrientacionEnum obtenerOrientacion() {
        return this.orientacion;
    }

    public DireccionEnum obtenerDireccion() {
        return this.direccion;
    }
}
