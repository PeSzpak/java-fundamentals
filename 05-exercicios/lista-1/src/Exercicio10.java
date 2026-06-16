package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public void executar() {
		Scanner Ler = new Scanner(System.in);

		String nome, sexo;

		System.out.println("Digite o nome: ");
		nome = Ler.nextLine();

		System.out.println("Digite o sexo [M/F]: ");
		sexo = Ler.nextLine();

		if (sexo.equals("M")) {
			System.out.println("Seja muito bem vindo Ilmo. Sr. " + nome);
		} else if (sexo.equals("F")) {
			System.out.println("Seja muito bem vinda Ilma. Sra. " + nome);
		} else {
			System.out.println("Sexo inválido. Digite M ou F");
		}
	}
}
