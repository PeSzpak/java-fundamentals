package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		int vlr1, vlr2, vlr3, vlr4;
		System.out.println("Digite um valor Inteiro");
		vlr1 = Ler.nextInt();

		System.out.println("Digite um valor Inteiro");
		vlr2 = Ler.nextInt();

		System.out.println("Digite um valor Inteiro");
		vlr3 = Ler.nextInt();

		System.out.println("Digite um valor Inteiro");
		vlr4 = Ler.nextInt();

		if (vlr1 % 2 == 0 || vlr1 % 3 == 0) {
			System.out.println(vlr1);
		}

		if (vlr2 % 2 == 0 || vlr2 % 3 == 0) {
			System.out.println(vlr2);
		}

		if (vlr3 % 2 == 0 || vlr3 % 3 == 0) {
			System.out.println(vlr3);
		}

		if (vlr4 % 2 == 0 || vlr4 % 3 == 0) {
			System.out.println(vlr4);
		}

	}
}
