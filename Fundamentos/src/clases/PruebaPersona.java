package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.name = "Juan";
        persona1.lastName = "Perez";
        persona1.showData();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
