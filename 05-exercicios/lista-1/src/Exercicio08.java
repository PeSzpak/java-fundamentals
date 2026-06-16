package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor INTEIRO: ");
		valor = Ler.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println(valor + "  é Par");
		} else {
			System.out.println(valor + "  é Impar");

		}
	}
}
