package edu.ej2;
import static org.junit.Assert.assertEquals;

import edu.ej2.Calculadora;
import org.junit.Test;
public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(3, 5);
        assertEquals(8, resultado); // Verifica que 3 + 5 sea igual a 8
    }
}