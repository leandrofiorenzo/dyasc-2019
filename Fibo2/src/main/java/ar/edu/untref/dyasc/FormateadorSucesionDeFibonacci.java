package ar.edu.untref.dyasc;

public class FormateadorSucesionDeFibonacci {

    /**
     * Devuelve la sucesion en formato horizontal
     * @param sucesion sucesion que se desea formatear.
     * @return Devuelve la sucesion en formato horizontal
     */
    public String formatearSucesion(int[] sucesion) {
        String sucesionFormateada = "fibo<" + sucesion.length + ">:";
        for (int i = 0; i < sucesion.length; i++) {
            sucesionFormateada += " " + sucesion[i];
        }
        return sucesionFormateada;
    }

    /**
     * Devuelve la sucesion en el formato solicitado
     * @param sucesion sucesion que se desea formatear.
     * @param enHorizontal si se desea dar formato horizontal
     * @return Devuelve la sucesion en el formato solicitado
     */
    public String formatearSucesion(int[] sucesion, boolean enHorizontal) {
        if(enHorizontal) return formatearSucesion(sucesion);

        String sucesionFormateada = "fibo<" + sucesion.length + ">:";
        for (int i = 0; i < sucesion.length; i++) {
            sucesionFormateada += "\n" + sucesion[i];
        }
        return sucesionFormateada;
    }

}
