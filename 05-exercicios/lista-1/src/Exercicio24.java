package exercicios;

import java.util.Scanner;

public class Exercicio24 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		boolean primo = true;
		int num;
		System.out.println("Digite um numero para validar se é primo: ");
		num = Ler.nextInt();

		if (num < 2) {
			primo = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = false;
					break;
				}
			}
		}
		if (primo) {
			System.out.println(num + " é um número primo.");
		} else {
			System.out.println(num + " não é um número primo.");
		}
	}
}
