package ExemploHeranca;

public class Desenvolvedor extends Empregado {
	private double salarioFixo;

	public Desenvolvedor(String nome, double salarioFixo) {
		super(nome);
		this.setSalarioFixo(salarioFixo);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
}
