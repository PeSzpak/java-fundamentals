package Sistema;

public abstract class Bebida {
	private String nome;
	private String regiao;
	private double preco;
	private double teorAlcoolico;
	private int quantidadeEstoque;

	public Bebida(String nome, String regiao, double preco, double teorAlcoolico, int quantidadeEstoque) {
		this.nome = nome;
		this.regiao = regiao;
		this.preco = preco < 0 ? 0 : preco;
		this.teorAlcoolico = teorAlcoolico;
		this.quantidadeEstoque = quantidadeEstoque < 0 ? 0 : quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public double getPreco() {
		return preco;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public void setPreco(double preco) {
		this.preco = preco < 0 ? 0 : preco;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque < 0 ? 0 : quantidadeEstoque;
	}

	protected void baixarEstoque() {
		if (quantidadeEstoque > 0) {
			quantidadeEstoque--;
			System.out.println("Uma garrafa de " + nome + " foi servida!");
		} else {
			System.out.println("Estoque insuficiente para: " + nome);
		}
	}

	public abstract void exibir();

	public abstract void servir();

	public abstract String classificarConsumo();
}
