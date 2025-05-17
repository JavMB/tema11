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

    }
}