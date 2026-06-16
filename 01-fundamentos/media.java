package PrimeiraAula;

import java.util.Scanner;

public class media {
     public void main() {
        Scanner Ler = new Scanner(System.in);
		double a, b, media;
		System.out.println("Digite uma nota:");
		a = Ler.nextDouble();

		System.out.println("Digite a outra nota:");
		b = Ler.nextDouble();

	 media = (a + b)/2;

        System.out.println("O resultado da media é: " + media);
    }
}
