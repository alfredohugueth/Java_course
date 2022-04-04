package test;

import genericos.ClasesGenericas;

public class TestGenerics {
    public static void main(String[] args) {
        ClasesGenericas<Integer> objetoInt = new ClasesGenericas(15);
        objetoInt.obtenerTipo();

        ClasesGenericas<String> objetoString = new ClasesGenericas("juan");
        objetoString.obtenerTipo();
    }
}
