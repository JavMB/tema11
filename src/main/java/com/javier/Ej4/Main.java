package com.javier.Ej4;
import java.io.File;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        File rutaCompleta = new File("/home/javi/tema11/ficheros/elpepe");

        if (rutaCompleta.exists()) {
            System.out.println(rutaCompleta.getName());
            System.out.println(rutaCompleta.getPath());
            System.out.println("Se puede leer: " + rutaCompleta.canRead());
            System.out.println("Se puede escribir: " + rutaCompleta.canWrite());
            System.out.println("Es un fichero oculto " + rutaCompleta.isHidden());
            System.out.println();
            System.out.println();
        }

    }

//    private static String espacioTotal(File file){
//
//    }
//    private static LocalDateTime ultimaModificacion(File file){
//        long ultimaMod=file.lastModified();
//
//    }



}
