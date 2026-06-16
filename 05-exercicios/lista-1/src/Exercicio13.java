package exercicios;

public class Exercicio13 {
	public void executar() {
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}
		System.out.println("A soma dos 100 primeiros numeros inteiros é: " + soma);
	}
}
