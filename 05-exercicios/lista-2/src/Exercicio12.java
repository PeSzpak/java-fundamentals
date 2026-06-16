package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		System.out.print("Digite o primeiro lado: ");
		int a = Ler.nextInt();
		System.out.print("Digite o segundo lado: ");
		int b = Ler.nextInt();
		System.out.print("Digite o terceiro lado: ");
		int c = Ler.nextInt();

		if (a < b + c && b < a + c && c < a + b) {

			System.out.println("Os valores formam um triângulo!");

			if (a == b && b == c) {
				System.out.println("Tipo Equilátero todos os lados iguais");
			} else if (a == b || b == c || a == c) {
				System.out.println("Tipo Isósceles só dois lados iguais");
			} else {
				System.out.println("Tipo Escaleno todos lados diferentes");
			}

		} else {
			System.out.println("Os valores não são de triangulo");
		}
	}
}
