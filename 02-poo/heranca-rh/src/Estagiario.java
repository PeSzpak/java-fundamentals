package ExemploHeranca;

public class Estagiario extends Empregado{
	private double bolsaAuxilio;

	public Estagiario(String nome, double bolsaAuxilio) {
		super(nome);
		this.bolsaAuxilio = bolsaAuxilio;
	}

	public double getBolsaAuxilio() {
		return bolsaAuxilio;
	}

	public void setBolsaAuxilio(double bolsaAuxilio) {
		this.bolsaAuxilio = bolsaAuxilio;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return bolsaAuxilio;
	}
	
}
