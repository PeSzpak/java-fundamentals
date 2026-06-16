package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[15];
		int pares = 0;

		System.out.println("Digite os 15 elementos do vetor:");
		for (int i = 0; i < 15; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		for (int i = 0; i < 15; i++) {
			if (A[i] % 2 == 0) {
				pares++;
			}
		}

		System.out.println("\nTotal de elementos pares: " + pares);

	}
}
