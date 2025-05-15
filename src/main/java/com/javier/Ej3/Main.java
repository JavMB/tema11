package com.javier.Ej3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path rutaCompleta = Paths.get("/home/javi/tema11/ficheros/elpepe");

        if (Files.exists(rutaCompleta)) {
            System.out.println(rutaCompleta.getFileName());
            System.out.println(rutaCompleta.toAbsolutePath());
            System.out.println("Se puede leer: " + Files.isReadable(rutaCompleta));
            System.out.println("Se puede escribir: " + Files.isWritable(rutaCompleta));
            try {
                System.out.println("Es un fichero oculto: " + Files.isHidden(rutaCompleta));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

