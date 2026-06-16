package exercicios;

public class Exercicio22 {
	public void executar() {
		for (int i = 1; i <= 10; i += 2) {
			long fatorial = 1;
			for (int j = 1; j <= i; j++) {
				fatorial *= j;
			}
			System.out.println(i + "! = " + fatorial);
		}
	}
}
