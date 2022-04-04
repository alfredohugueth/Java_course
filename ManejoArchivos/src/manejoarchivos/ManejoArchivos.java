package manejoarchivos;

import java.io.*;


public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close(); // Se crea el archivo en el disco duro
            System.out.println("Se ha creado el archivo en el disco duro");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close(); // Se crea el archivo en el disco duro
            System.out.println("Se ha escrito al archivo en el disco duro");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close(); // Se crea el archivo en el disco duro
            System.out.println("Se ha anexado contenido al archivo en el disco duro");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(nombreArchivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
