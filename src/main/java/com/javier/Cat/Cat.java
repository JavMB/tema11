package com.javier.Cat;

import java.io.*;

public class Cat {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new RuntimeException("debe indicar la ruta del archivo");
        }
        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);

        if (file.exists()) {
            System.out.println("El archivo existe");

        } else {
            System.out.println("El archivo no existe");
        }

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            System.out.println(br.readLine());
        }




    }
}
