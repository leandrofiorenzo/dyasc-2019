package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorDeArchivos {

    public void generarArchivoDeSalida(String contenidoArchivoDeSalida, String rutaArchivoDeSalida) {
        if(rutaArchivoDeSalida != "") {
            try (PrintWriter out = new PrintWriter(rutaArchivoDeSalida)) {
                out.println(contenidoArchivoDeSalida);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
