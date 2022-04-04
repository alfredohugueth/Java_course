package test;

import static manejoarchivos.ManejoArchivos.leerArchivo;

public class TestManejoArchivos {

    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
//        crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo, "hola desde el archivo");
//        anexarArchivo(nombreArchivo, "Contenido adicional");
        leerArchivo(nombreArchivo);
    }
}
