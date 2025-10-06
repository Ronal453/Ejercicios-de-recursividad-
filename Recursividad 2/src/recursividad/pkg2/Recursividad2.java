package recursividad.pkg2;

import static recursividad.pkg2.ContadorDigitos.contarDigitosCompleto;

public class Recursividad2 {

    public static void main(String[] args) {
        System.out.println("Contar digitos de numeros:");
        
        int[] numeros = {0, 5, 42, 123, 9876, -123, -7};
        
        for (int num : numeros) {
            System.out.println("El numero " + num + " tiene " + 
                             contarDigitosCompleto(num) + " digitos");
        }
    }
}