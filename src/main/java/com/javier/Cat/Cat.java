package com.javier.Cat;

import java.io.*;

public class Cat {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("debe indicar la ruta del archivo");

        }
        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);
        if (file.exists()) {
            System.out.println("El archivo existe");

            try (FileReader fr = new FileReader(file);  // o con fr.read(array de chars)
                 BufferedReader br = new BufferedReader(fr)) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } else {
            System.out.println("El archivo no existe");
        }


    }
}
