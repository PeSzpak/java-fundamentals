package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		double not1, not2, not3, not4, soma;
		System.out.println("Digite um valor");
		not1 = Ler.nextDouble();

		System.out.println("Digite um valor");
		not2 = Ler.nextDouble();

		System.out.println("Digite um valor");
		not3 = Ler.nextDouble();

		System.out.println("Digite um valor");
		not4 = Ler.nextDouble();

		soma = (not1 + not2 + not3 + not4) / 4;

		if (soma >= 5) {
			System.out.println("Aprovado com nota: " + soma);
		} else {
			System.out.println("Reprovado com nota: " + soma);
		}

	}
}
