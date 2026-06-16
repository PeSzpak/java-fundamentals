package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		double[] A = new double[10];
		double[] B = new double[10];

		System.out.println("Digite os 10 elementos do vetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "]: ");
			A[i] = Ler.nextDouble();
		}

		for (int i = 0; i < 10; i++) {
			B[i] = A[i] / 2;
		}

		System.out.println("\nVetor A:");
		for (int i = 0; i < 10; i++) {
			System.out.print(A[i] + " ");
		}

		System.out.println("\n\nVetor B das metades:");
		for (int i = 0; i < 10; i++) {
			System.out.print(B[i] + " ");
		}
	}
}
