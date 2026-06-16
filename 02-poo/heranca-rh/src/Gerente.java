package ExemploHeranca;

public class Gerente extends Empregado {
	private double salarioBase;

	public Gerente(String nome, double salarioBase) {
		super(nome);
		this.salarioBase = salarioBase; 
		
			}

	@Override
	public double calcularSalario() {
		return salarioBase + (salarioBase * 0.1);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
