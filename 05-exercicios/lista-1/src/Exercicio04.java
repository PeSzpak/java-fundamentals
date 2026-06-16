package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		double not1, not2, not3, not4, media, media2, exame;
		System.out.println("Digite um valor");
		not1 = Ler.nextDouble();

		System.out.println("Digite um valor");
		not2 = Ler.nextDouble();

		System.out.println("Digite um valor");
		not3 = Ler.nextDouble();

		System.out.println("Digite um valor");
		not4 = Ler.nextDouble();

		media = (not1 + not2 + not3 + not4) / 4;

		if (media >= 7) {
			System.out.println("Aprovado com nota: " + media);
		} else {
			System.out.println("Digite a nota do exame");
			exame = Ler.nextDouble();

			media2 = (not1 + not2 + not3 + not4 + exame) / 5;
			if (media2 >= 7) {
				System.out.println("Aprovado com exame - média: " + media2);
			} else {
				System.out.println("Reprovado com média: " + media2);
			}
		}

	}
}
