package exercicios;

import java.util.Scanner;

public class Exercicio20 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		double media, num, total = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero: ");
			num = Ler.nextDouble();
			 total += num ;
		}
		media = total / 10 ;
		System.out.println("A média dos numeros digitados é: " + media);
	}
}