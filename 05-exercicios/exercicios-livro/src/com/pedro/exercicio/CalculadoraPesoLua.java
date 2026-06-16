package br.com.pedro.exercicio;
import java.util.Scanner;
import java.util.Locale;

public class CalculadoraPesoLua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("--- Calculadora de Peso na Lua ---");
        System.out.print("Digite o seu peso na Terra (em kg): ");
        
        if (scanner.hasNextDouble()) {
            double pesoTerra = scanner.nextDouble();
            
            double gravidadeLua = 0.166;
            double pesoLua = pesoTerra * gravidadeLua;
            
            System.out.printf(Locale.US, "Seu peso na Terra: %.2f kg%n", pesoTerra);
            System.out.printf(Locale.US, "Seu peso na Lua: %.2f kg%n", pesoLua);
            System.out.println("---------------------------------");
            
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        }
        
        scanner.close();
    }
}
