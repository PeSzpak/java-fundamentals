package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		double a, b, c, delta, x, x1, x2;
		System.out.print("Digite o valor de A: ");
		a = Ler.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = Ler.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = Ler.nextDouble();

		if (a != 0) {
			delta = (b * b) - (4 * a * c);
			System.out.println("Delta = " + delta);

			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("A equação possui uma raiz real: x = " + x);
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
			}
		} else {
			System.out.println("O valor de A não pode ser zero em uma equação do 2° grau.");
		}

	}
}