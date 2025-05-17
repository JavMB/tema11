package com.javier.Ej10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros\\d1\\texto1");
        File z = new File("C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros\\d1\\texto2");
        String outputPath = "C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros\\d1\\texto_concatenado.txt";

        try {
            File concatenado = concat(f, z, outputPath);
            BufferedReader bf = new BufferedReader(new FileReader(concatenado));
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
            bf.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File concat(File f1, File f2, String rutaArchivoSalida) {
        try (
                BufferedReader b1 = new BufferedReader(new FileReader(f1));
                BufferedReader b2 = new BufferedReader(new FileReader(f2));
                BufferedWriter b3 = new BufferedWriter(new FileWriter(rutaArchivoSalida, false))) {
            String linea;
            while ((linea = b1.readLine()) != null) {
                b3.write(linea);
                b3.newLine();
            }
            while ((linea = b2.readLine()) != null) {
                b3.write(linea);
                b3.newLine();
            }
            return new File(rutaArchivoSalida);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}