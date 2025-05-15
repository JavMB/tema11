package com.javier.Ej10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros\\d1\\texto1");
        File z = new File("C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros\\d1\\texto2");

        try {
            BufferedReader bf = new BufferedReader(new FileReader(concat(f, z, "C:\\Users\\Javi.MB\\IdeaProjects\\tema11\\ficheros\\d1")));
            while (bf.readLine() != null) {
                System.out.println(bf.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File concat(File f1, File f2, String ruta) {
        StringBuilder concat = new StringBuilder();
        File nueva = new File(ruta);
        try (
                BufferedReader b1 = new BufferedReader(new FileReader(f1));
                BufferedReader b2 = new BufferedReader(new FileReader(f2));
                BufferedWriter b3 = new BufferedWriter(new FileWriter(nueva, true))) {
            String linea;
            while ((linea = b1.readLine()) != null) {
                concat.append(linea);
            }
            while ((linea = b2.readLine()) != null) {
                concat.append(linea);
            }

            b3.write(concat.toString());
            return nueva;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
