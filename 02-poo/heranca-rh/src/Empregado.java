package ExemploHeranca;

public abstract class Empregado {
	protected String nome;
	
	public Empregado (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract double calcularSalario();
}
