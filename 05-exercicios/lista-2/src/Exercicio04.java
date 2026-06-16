package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[20];
		int[] B = new int[30];
		int[] C = new int[50];

		System.out.println("Digite os 20 elementos do vetor A:");
		for (int i = 0; i < 20; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		System.out.println("\nDigite os 30 elementos do vetor B:");
		for (int i = 0; i < 30; i++) {
			System.out.print(i + "]: ");
			B[i] = Ler.nextInt();
		}

		for (int i = 0; i < 20; i++) {
			C[i] = A[i];
		}

		for (int i = 0; i < 30; i++) {
			C[20 + i] = B[i];
		}

		System.out.println("\nVetor C (junção de A e B):");
		for (int i = 0; i < 50; i++) {
			System.out.print(C[i] + " ");
		}
	}
}
