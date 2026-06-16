package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		System.out.print("Digite os anos: ");
		int anos = Ler.nextInt();
		System.out.print("Digite os meses: ");
		int meses = Ler.nextInt();
		System.out.print("Digite os dias: ");
		int dias = Ler.nextInt();

		int totalDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("\nIdade expressa em dias: " + totalDias + " dias");

	}
}
