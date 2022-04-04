package genericos;

public class ClasesGenericas<T> { // La T indica tipo generico
    T objeto;

    public ClasesGenericas(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
