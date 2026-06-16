package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[30];
		int pares = 0;
		int impares = 0;

		System.out.println("Digite os 30 elementos do vetor A:");
		for (int i = 0; i < 30; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		for (int i = 0; i < 30; i++) {
			if (A[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("\nQuantidade de valores pares: " + pares);
		System.out.println("Quantidade de valores ímpares: " + impares);

	}
}
