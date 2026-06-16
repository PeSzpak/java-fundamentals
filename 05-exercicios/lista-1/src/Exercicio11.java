package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public void executar() {

		Scanner Ler = new Scanner(System.in);

		int numero;
		System.out.println("Digite um número INTEIRO: ");
		numero = Ler.nextInt();

		System.out.println("\nTabuada do " + numero + ":");
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}

	}
}
