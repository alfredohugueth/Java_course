package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setName("Juan");
        persona.setLastName("Perez");

        System.out.println("persona = " + persona);
    }
}
