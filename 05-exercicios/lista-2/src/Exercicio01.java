package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[15];
		long[] B = new long[15];

		System.out.println("Digite os 15 elementos do vetor A:");
		for (int i = 0; i < 15; i++) {
			System.out.print(i + " : ");
			A[i] = Ler.nextInt();
		}

		for (int i = 0; i < 15; i++) {
			long fat = 1;
			for (int j = 1; j <= A[i]; j++) {
				fat *= j;
			}
			B[i] = fat;
		}

		System.out.println("\nVetor A:");
		for (int i = 0; i < 15; i++) {
			System.out.print(A[i] + " ");
		}

		System.out.println("\n\nVetor B dos fatoriais:");
		for (int i = 0; i < 15; i++) {
			System.out.print(B[i] + " ");
		}
	}
}
