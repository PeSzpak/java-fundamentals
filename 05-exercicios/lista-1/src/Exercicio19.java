package exercicios;

public class Exercicio19 {
	public void executar() {
		double F;
		for (int i = 10; i <= 100; i += 10) {
			F = (i * 1.8) + 32;
			System.out.println(i + " Graus em Fahrenheit é = " + F);
		}
	}
}
