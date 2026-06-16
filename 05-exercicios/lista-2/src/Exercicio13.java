package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		System.out.print("Digite a duração da partida em segundos: ");
		int totalSegundos = Ler.nextInt();

		int horas = totalSegundos / 3600;
		int minutos = (totalSegundos % 3600) / 60;
		int segundos = totalSegundos % 60;

		System.out.println("\nDuração da partida:");
		System.out.println(horas + "h " + minutos + "min " + segundos + "s");

	}
}
