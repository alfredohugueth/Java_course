package test;

import accesoDatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        imprimir(datos);

        datos = new ImplementacionOracle();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
