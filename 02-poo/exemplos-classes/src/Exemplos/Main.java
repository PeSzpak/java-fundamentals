package Exemplos;

public class Main {

	public static void main(String[] args) {
		Professor Prof = new Professor("Pedro Szpak", "124453211", 5000, 800);
		System.out.println();
		System.out.println("O professor" + Prof.getNome() + " Nº Martricula: " + Prof.getMatriula());
		System.out.println("Salario Total: R$" + Prof.CalculaSalarioTotal());
		System.out.println("Classificação do Salário: " + Prof.status());

		System.out.println(" ");
		Professor Prof2 = new Professor("Julio do Cocóricó", "76543456", 4500, 600);
		System.out.println("O professor" + Prof2.getNome() + " Nº Martricula: " + Prof2.getMatriula());
		System.out.println("Salario Total: R$" + Prof2.CalculaSalarioTotal());
		System.out.println("Classificação do Salário: " + Prof2.status());

		if (Prof.getSalarioBase() > Prof2.getSalarioBase()) {
			System.out.println("Maior Salario: " + Prof.getNome());
		} else {
			System.out.println("Maior Salario: " + Prof2.getNome());
		}
	}

}
