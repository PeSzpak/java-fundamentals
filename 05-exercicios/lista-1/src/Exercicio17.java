package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);
		int B, E;
		do {
			System.out.println("Digite um numero INTEIRO e POSITIVO para a base");
			B = Ler.nextInt();
			System.out.println("Digite um numero INTEIRO e POSITIVO para o expoente");
			E = Ler.nextInt();
		} while (B < 0 && E < 0);
		long resultado = (long) Math.pow(B, E);
		System.out.println("Resultado " + B + " ˆ " + E + " = " + resultado);
	}
}
