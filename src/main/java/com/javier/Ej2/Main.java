package com.javier.Ej2;

import java.io.*;
import java.nio.file.*;

public class Main {
    //3,7,10,12
    public static void main(String[] args) {
        // Path directorioActual = Paths.get("C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros");
        File file = new File("C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros");
        for (String item : file.list()) {
            System.out.println(item);
        }


//        if (Files.exists(directorioActual) && Files.isDirectory(directorioActual)) {
//            System.out.println("Archivos y directorios en: " + directorioActual.toAbsolutePath());
//
//            try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorioActual)) {
//                for (Path item : stream) {
//                    if (Files.isDirectory(item)) {
//                        System.out.printf("Directorio: %-20s%n", item.getFileName());
//                    } else if (Files.isRegularFile(item)) {
//                        System.out.printf("Archivo   : %-20s%n", item.getFileName());
//                    } else {
//                        System.out.printf("Otro      : %-20s%n", item.getFileName());
//                    }
//                }
//            } catch (IOException e) {
//                System.out.println("No se pudo listar el contenido: " + e.getMessage());
//            }
//        } else {
//            System.out.println("El directorio no existe o no es un directorio.");
//        }
    }
}