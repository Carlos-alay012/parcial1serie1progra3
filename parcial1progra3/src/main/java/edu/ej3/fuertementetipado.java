package edu.ej3;

public class fuertementetipado {
    public static void main(String[] args) {
        // Declaración de variables con tipos específicos
        int numero1 = 5;
        double numero2 = 3.14;

       // int resultado = numero1 + numero2; //generaría un error de compilación

        // Conversión explícita de tipo
       int resultado = numero1 + (int) numero2; // Conversión explícita de double a int

        // Resultado de la suma
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
