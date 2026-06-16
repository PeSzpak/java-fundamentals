package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		System.out.print("Digite o raio da esfera: ");
		double raio = Ler.nextDouble();

		double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

		System.out.printf("Volume da esfera: %.2f%n", volume);
	}
}
