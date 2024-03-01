package edu.ej1;

import edu.ej1.Persona;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos Ej 1
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Maria", 30);

        // Acceso a métodos y atributos
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

    }
}
