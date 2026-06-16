package Sistema;

public class Uisque extends Bebida {
	private int idade;
	private String tipo;

	public Uisque(String nome, String tipo, int idade, String regiao, double preco, double teorAlcoolico,
			int quantidadeEstoque) {
		super(nome, regiao, preco, teorAlcoolico, quantidadeEstoque);
		this.tipo = tipo;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void exibir() {
		System.out.println("Uisque: " + getNome() + " | Tipo: " + tipo + " | Idade: " + idade + " anos" + " | Regiao: "
				+ getRegiao() + " | Teor: " + getTeorAlcoolico() + "%" + " | Estoque: " + getQuantidadeEstoque()
				+ " | Preco: R$ " + String.format("%.2f", getPreco()));
	}

	@Override
	public void servir() {
		baixarEstoque();
	}

	@Override
	public String classificarConsumo() {
		if (idade <= 8) {
			return "Jovem e acessivel — sabor suave, ideal para drinks e coqueteis.";
		} else if (idade <= 15) {
			return "Equilibrado e maduro — bom puro, com pedra de gelo ou em bons churrascos.";
		} else {
			return "Complexo e sofisticado — experiencie puro, em temperatura ambiente, degustando lentamente.";
		}
	}
}