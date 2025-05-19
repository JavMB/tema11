package com.javier.Ej12;

import java.io.*;

/**
 * 12. Haz un método que reciba como parámetro un fichero con 20 DNI aleatorios (sin letra) y:
 * a) compruebe que todos los DNI tienen una longitud de 8 dígitos, sino es así, deberá rellenar con
 * 0’s por la izquierda.
 * b) calcule la letra correspondiente a cada DNI y la añada por la derecha.
 * c) Guarde el resultado en otro archivo cuyo nombre sea el resultado de concatenar el nombre del
 * archivo original más “_conLetras” en la parte del nombre.
 */
public class Main {
    public static void main(String[] args) {
        File dni = new File("/home/javi/tema11/ficheros/d1/dni");
        dni(dni);
    }

    public static void dni(File fichero) {

        String nombreOriginal = fichero.getName();
        int punto = nombreOriginal.lastIndexOf(".");
        String nombreNuevo = (punto == -1) ? nombreOriginal + "_conLetras" : nombreOriginal.substring(0, punto) + "_conLetras" + nombreOriginal.substring(punto);
        File nueva = new File(fichero.getParent(), nombreNuevo);

        System.out.println("Archivo de salida: " + nueva.getPath());


        try (BufferedReader br = new BufferedReader(new FileReader(fichero));
             BufferedWriter bw = new BufferedWriter(new FileWriter(nueva))) {

            String dni;
            while ((dni = br.readLine()) != null) {

                if (!dni.matches("\\d+")) {
                    throw new IllegalArgumentException("solo numeros");
                }


                dni = numerosCorregido(dni);
                dni = dni.concat(String.valueOf(letraDni(dni)));


                bw.write(dni);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Archivo no encontrado: " + fichero.getPath(), e);
        } catch (IOException e) {
            throw new RuntimeException("Error al leer/escribir archivos", e);
        }
    }

    private static String numerosCorregido(String dni) {

        return String.format("%08d", Integer.parseInt(dni));
    }

    private static char letraDni(String numeros) {
        char[] letras = new char[]{
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        return letras[Integer.parseInt(numeros) % letras.length];
    }
}