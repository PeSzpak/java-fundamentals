package exercicios;

import java.util.Scanner;

public class Exercicio21 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		double soma = 0, media, num;
		int i = 0;

		do {
			System.out.print("Digite um número positivo [negativo para encerrar]: ");
			num = Ler.nextDouble();
			if (num >= 0) {
				soma += num;
				i++;
			}
		} while (num >= 0);

		if (i > 0) {
			media = soma / i;
			System.out.println("Total de valores lidos: " + i);
			System.out.println("soma total: " + soma);
			System.out.println("média dos valores: " + media);
		} else {
			System.out.println("Nenhum valor positivo foi informado.");
		}

	}
}
