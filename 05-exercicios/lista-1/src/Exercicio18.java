package exercicios;

public class Exercicio18 {
	public void executar() {
		int anterior = 1, atual = 1, proximo;

		System.out.print(anterior + ", " + atual);

		for (int i = 3; i <= 15; i++) {
			proximo = anterior + atual;
			System.out.print(", " + proximo);
			anterior = atual;
			atual = proximo;
		}

	}
}
