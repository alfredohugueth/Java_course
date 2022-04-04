package test;

import aritmetic.Aritmetic;

public class TestExceptions {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetic.division(10,0);
        } catch (Exception e) {
            e.printStackTrace(System.out );
        } finally {
            System.out.println("Se Ejecuta sin importar si ocurre o no una excepcion");
        }
        System.out.println("resultado = " + resultado);
    }
}
