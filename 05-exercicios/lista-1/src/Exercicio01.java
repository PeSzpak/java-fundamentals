package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);
		int a, b;
		System.out.println("Digite um valor");
		a = Ler.nextInt();

		System.out.println("Digite um valor");
		b = Ler.nextInt();

		if (a > b) {
			System.out.println("Resultado: " + (a - b));
		} else {
			System.out.println("Resultado: " + (b - a));
		}

	}
}
