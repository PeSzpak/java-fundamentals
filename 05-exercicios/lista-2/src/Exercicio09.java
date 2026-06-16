package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[12];
		int[] B = new int[12];

		System.out.println("Digite os 12 elementos do vetor A:");
		for (int i = 0; i < 12; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		for (int i = 0; i < 12; i++) {
			if (A[i] % 2 != 0) {
				B[i] = A[i] * 2;
			} else {
				B[i] = A[i];
			}
		}

		System.out.println("\nVetor B:");
		for (int i = 0; i < 12; i++) {
			System.out.print(B[i] + " ");
		}
	}
}
