package PrimeiraAula;

import java.util.Scanner;

public class soma {
    public void main() {
        Scanner Ler = new Scanner(System.in);
		int a, b, soma;
		System.out.println("Digite um valor:");
		a = Ler.nextInt();

		System.out.println("Digite um valor:");
		b = Ler.nextInt();

		soma = a + b;

        System.out.println("O resultado da soma é: " + soma
);
    }
}
