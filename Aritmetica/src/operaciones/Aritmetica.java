package operaciones;

public class Aritmetica {
    int a;
    int b;

    // Constructor
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    // Sobrecarga de constructores
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Methods
    public void sum() {
        int result = a + b;
        System.out.println("result = " + result);
    }

    public int sumResult() {
        return this.a + this.b;
    }

    public int sumWithArguments(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
