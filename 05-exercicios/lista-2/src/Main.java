package exercicios;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\nSelecione um exercício para executar (1 a 24) ou 0 para sair:");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				new Exercicio01().executar();
				break;
			case 2:
				new Exercicio02().executar();
				break;
			case 3:
				new Exercicio03().executar();
				break;
			case 4:
				new Exercicio04().executar();
				break;
			case 5:
				new Exercicio05().executar();
				break;
			case 6:
				new Exercicio06().executar();
				break;
			case 7:
				new Exercicio07().executar();
				break;
			case 8:
				new Exercicio08().executar();
				break;
			case 9:
				new Exercicio09().executar();
				break;
			case 10:
				new Exercicio10().executar();
				break;
			case 11:
				new Exercicio11().executar();
				break;
			case 12:
				new Exercicio12().executar();
				break;
			case 13:
				new Exercicio13().executar();
				break;
			case 14:
				new Exercicio14().executar();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);
		scanner.close();
	}
}