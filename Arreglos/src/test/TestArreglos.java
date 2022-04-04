package test;

public class TestArreglos {

    public static void main(String[] args) {
        int ages[] = new int[3]; // No se pueden agregar elementos de manera dimanica.

        ages[0] = 3;
        System.out.println("ages 0 = " + ages[0]);

        // Acceder a un elemento fuera del arreglo.
        // ages[3] = 10; // No es un error de compilacion, sino un error de ejecucion

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Edades = " + ages[i]);
        }
    }

}
