package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um valor");
		num = Ler.nextInt();

		if (num <= 0) {
			num = num * -1;
			System.out.println("O valor é: " + num);
		} else {
			System.out.println("O valor é: " + num);
		}

	}
}
