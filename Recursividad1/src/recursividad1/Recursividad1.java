package recursividad1;

import static recursividad1.Fibonacci.fibonacci;

public class Recursividad1 {

    public static void main(String[] args) {
        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("F(" + i + ") = " + fibonacci(i));
        }
        
        // Ejemplo específico
        System.out.println("\nFibonacci de 8: " + fibonacci(8));
    }
}