package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[20];
		int[] B = new int[20];

		System.out.println("Digite os 20 elementos do vetor A:");
		for (int i = 0; i < 20; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		for (int i = 0; i < 20; i++) {
			int soma = 0;
			for (int j = 1; j <= A[i]; j++) {
				soma += j;
			}
			B[i] = soma;
		}

		System.out.println("\nVetor B dos somatorios:");
		for (int i = 0; i < 20; i++) {
			System.out.println("B[" + i + "] = " + B[i]);
		}
	}
}
