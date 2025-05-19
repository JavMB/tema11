package com.javier.Ej1;

import com.javier.lib.ConsoleMenu;

import java.io.File;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("debe indicar la ruta del archivo");
        }
        String rutaArchivo = String.valueOf(Path.of("/home/javi/tema11/ficheros"));

        File file = new File(rutaArchivo);

        if (file.exists()) {
            System.out.println("El archivo existe");

        } else {
            System.out.println("El archivo no existe");


        }

        
    }
}
