package GeradorDeEquipes;

import java.util.Random;
import java.util.Scanner;

public class GeradorDeEquipes {

	public static void main(String[] args) {
		String[] Adjetivos = { "Poderosos", "Indestrutiveis", "Imorriveis", "Maravilindos", "Bravos" };
		String[] Substantivos = { "Morcegos", "Caminhoneiros", "Pandas", "Crocodilos", "Humanos" };
		String[] Verbos = { "Destroem", "Massacram", "Abraçam", "Derrotam", "Imobilizam" };
		String[] Cores = { "Roxo-Berinjela", "Vermelho-Tomate", "Amarelo-Mostarda", "Branco-Sentinela", "Verde-Bandeira" };
		String[] Lugares = { "Do Senac", "De SJP", "Da Amazonia", "Da Lua", "Do Hip-Hop" };
		int quantidade, i;

		Scanner Ler = new Scanner(System.in);

		System.out.print("Quantos nomes de times deseja gerar? (máximo 10): ");
		quantidade = Ler.nextInt();

		if (quantidade > 10) {
			quantidade = 10;
			System.out.println("Valor ajustado para o máximo permitido: 10");
		}

		if (quantidade <= 0) {
			System.out.println("Número inválido. Encerrando o programa.");
			Ler.close();
			return;
		}

		Random random = new Random();

		System.out.println("\n=-=-=-=-= Nomes Gerados das Equipes =-=-=-=-=\n");
		for (i = 1; i <= quantidade; i++) {
			int indiceAdjetivo = random.nextInt(Adjetivos.length);
			int indiceSubstantivo = random.nextInt(Substantivos.length);
			
			int indiceVerbo = random.nextInt(Verbos.length);
			int indiceCor = random.nextInt(Cores.length);
			int indiceLugar = random.nextInt(Lugares.length);

			String nomeEquipe = Adjetivos[indiceAdjetivo] + " " + Substantivos[indiceSubstantivo] ;
			//String nomeEquipes = Adjetivos[indiceAdjetivo] + " " + Substantivos[indiceSubstantivo] + " que " + Verbos[indiceVerbo] + " - " + Cores[indiceCor] + " " + Lugares[indiceLugar];

			System.out.println("Time " + i + ": " + nomeEquipe);
			//System.out.println("Time " + i + ": " + nomeEquipes);

		}
		Ler.close();
	}

}
