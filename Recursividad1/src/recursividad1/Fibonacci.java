package recursividad1;

public class Fibonacci {

     public static int fibonacci(int n) {
        // Casos base
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        // Caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}