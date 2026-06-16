package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int[] A = new int[12];
		double[] B = new double[12];

		System.out.println("Digite os 12 elementos do vetor A:");
		for (int i = 0; i < 12; i++) {
			System.out.print(i + ": ");
			A[i] = Ler.nextInt();
		}

		for (int i = 0; i < 12; i++) {
			if (i % 2 == 0) {
				B[i] = A[i] / 2.0;
			} else {
				B[i] = A[i] * 1.5;
			}
		}

		System.out.println("\nVetor B:");
		for (int i = 0; i < 12; i++) {
			System.out.println("B[" + i + "] = " + B[i]);
		}
	}
}
