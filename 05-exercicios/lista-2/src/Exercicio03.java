package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);
		int[] A = new int[15];
		int[] B = new int[15];
		int[] C = new int[30];

		System.out.println("Digite os 15 elementos do vetor A:");
		for (int i = 0; i < 15; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		System.out.println("\nDigite os 15 elementos do vetor B:");
		for (int i = 0; i < 15; i++) {
			System.out.print(i + "]: ");
			B[i] = Ler.nextInt();
		}

		for (int i = 0; i < 15; i++) {
			C[i] = A[i];
		}

		for (int i = 0; i < 15; i++) {
			C[15 + i] = B[i];
		}

		System.out.println("\nVetor C junta o A e B):");
		for (int i = 0; i < 30; i++) {
			System.out.print(C[i] + " ");
		}
	}

}
