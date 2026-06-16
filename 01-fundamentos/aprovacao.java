package PrimeiraAula;

import java.util.Scanner;

public class aprovacao {
    public void main() {
          Scanner Ler = new Scanner(System.in);
		double a, b, media;
		System.out.println("Digite uma nota:");
		a = Ler.nextDouble();

		System.out.println("Digite a outra nota:");
		b = Ler.nextDouble();

	 media = (a + b)/2;

        if (media > 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
