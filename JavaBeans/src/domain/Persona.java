package domain;

import java.io.Serializable;

public class Persona implements Serializable {

    // Atributos privados para considerarlo JavaBean
    private String name;
    private String lastName;

    // Constructores vacios para considerarlo JavaBean
    public Persona() {}

    public Persona( String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
