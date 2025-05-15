package com.javier.Ej2;

import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Path directorioActual = Paths.get("/home/javi/tema11/ficheros");

        if (Files.exists(directorioActual) && Files.isDirectory(directorioActual)) {
            System.out.println("Archivos y directorios en: " + directorioActual.toAbsolutePath());

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorioActual)) {
                for (Path item : stream) {
                    if (Files.isDirectory(item)) {
                        System.out.printf("Directorio: %-20s%n", item.getFileName());
                    } else if (Files.isRegularFile(item)) {
                        System.out.printf("Archivo   : %-20s%n", item.getFileName());
                    } else {
                        System.out.printf("Otro      : %-20s%n", item.getFileName());
                    }
                }
            } catch (IOException e) {
                System.out.println("No se pudo listar el contenido: " + e.getMessage());
            }
        } else {
            System.out.println("El directorio no existe o no es un directorio.");
        }
    }
}