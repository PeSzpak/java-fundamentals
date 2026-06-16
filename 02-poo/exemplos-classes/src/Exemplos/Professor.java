package Exemplos;

public class Professor {
	private String nome;
	private String matricula;
	private double salarioBase, Bonus;
	
	public Professor(String nome, String matricula, double salarioBase, double Bonus) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		this.Bonus = Bonus;
	}
	
	//Métodos de acesso - Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatriula() {
		return matricula;
	}
	public void setMatriula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getBonus() {
		return Bonus;
	}
	public void setbonus(double Bonus) {
		this.Bonus = Bonus;
	}
	
	public double CalculaSalarioTotal() {
		return salarioBase + Bonus;
	}
	
	public String status() {
		return Bonus >= 1000? "Bonus Alto":"Bonus baixo";
	}
	
}
