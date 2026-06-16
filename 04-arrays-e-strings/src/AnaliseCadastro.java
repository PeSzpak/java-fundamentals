package ArrAndString;

import java.util.Scanner;

public class AnaliseCadastro {

	public static void main(String[] args) {

		Scanner Ler = new Scanner(System.in);

		System.out.print("Digite seu nome completo: ");
		String nome = Ler.nextLine();

		System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");
		String data = Ler.nextLine();

		System.out.print("Digite seu e-mail: ");
		String email = Ler.nextLine();

		System.out.print("Digite sua linguagem favorita: ");
		String linguagem = Ler.nextLine();

		String nomeSemEspaco = nome.trim();
		String nomeMaiusculo = nome.toUpperCase();
		String nomeMinusculo = nome.toLowerCase();
		int nomeTamanho = nome.length();
		char nomeSegundaLetra = nome.charAt(1);

		System.out.println("Nome sem espaços: " + nomeSemEspaco);
		System.out.println("Nome MAIUSCULO: " + nomeMaiusculo);
		System.out.println("Nome minusculo: " + nomeMinusculo);
		System.out.println("Tamanho Nome: " + nomeTamanho);
		System.out.println("Segunda letra do nome: " + nomeSegundaLetra);

		String[] partes = data.split("-");

		String dia = partes[0];
		String mes = partes[1];
		String ano = partes[2];
		
		System.out.println("dia: " + dia);
		System.out.println("mês: " + mes);
		System.out.println("ano: " + ano);
		
		boolean contemPalavra = email.contains("@");
		boolean terminaCom = email.endsWith(".com");
		
		System.out.println("Contem @? " + contemPalavra);
		System.out.println("Termina com .com? " + terminaCom);
		
        boolean saoIguais = linguagem.equalsIgnoreCase(linguagem);


		Ler.close();
	}

}
