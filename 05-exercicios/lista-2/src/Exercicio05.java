package exercicios;

import java.util.Scanner;

public class Exercicio05 {
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
			B[19 - i] = A[i];
		}

		System.out.println("\nVetor A:");
		for (int i = 0; i < 20; i++) {
			System.out.print(A[i] + " ");
		}

		System.out.println("\n\nVetor B invertido:");
		for (int i = 0; i < 20; i++) {
			System.out.print(B[i] + " ");
		}
	}
}
