package exercicios;

public class Exercicio23 {
	public void executar() {

		double total = 0, media, soma = 0;

		for (int i = 50; i <= 70; i++) {
			if (i % 2 == 0) {
			soma = soma + i;
			total = total + 1;
			}
		}
		media = soma / total;
		System.out.println("A média dos numeros digitados é: " + media + " e o total somado foi: " + soma );
	}
}
