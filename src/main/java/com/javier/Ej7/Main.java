package com.javier.Ej7;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream()) {
            int b, contador = 0;
            while ((b = fis.read()) != -1) {
                System.out.printf("%02x ", b);
                contador++;
                if (contador % 12 == 0) System.out.println();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }


    }
}
