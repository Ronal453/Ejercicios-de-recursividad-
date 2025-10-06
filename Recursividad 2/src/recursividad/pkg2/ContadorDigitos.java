package recursividad.pkg2;

public class ContadorDigitos {
        public static int contarDigitos(int numero) {
        // Caso base: cuando el número tiene un solo dígito
        if (numero >= -9 && numero <= 9) {
            return 1;
        }
        
        // Caso recursivo: eliminar el último dígito y sumar 1
        return 1 + contarDigitos(numero / 10);
    }
    
    /**
     * Versión que maneja números negativos
     */
    public static int contarDigitosCompleto(int numero) {
        // Convertir a positivo si es negativo
        if (numero < 0) {
            return contarDigitos(-numero);
        }
        
        // Caso base
        if (numero < 10) {
            return 1;
        }
        
        // Caso recursivo
        return 1 + contarDigitosCompleto(numero / 10);
    }

}
