package PrimeiraAula;

import java.util.Scanner;

public class identificacao {
	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		String nome;
        int idade;

		System.out.println("Digite o nome: ");
		nome = Ler.nextLine();

		System.out.println("Digite a sua idade: ");
		idade = Ler.nextInt();

        System.out.print("Seu nome é " + nome + " e sua idade é " + idade + "Anos"

);
        

	}
}

