package PrimeiraAula;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        System.out.print("Valor da compra: R$ ");
        double valor = Ler.nextDouble();
        
        int faixas = (int) (valor / 100);
        double desconto = faixas * 10;
        
        double valorFinal = valor - (valor * desconto / 100);
        
        System.out.printf("Desconto: %.0f%%%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        
    }
}
