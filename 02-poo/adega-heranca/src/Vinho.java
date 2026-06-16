package Sistema;

public class Vinho extends Bebida {
	private String tipo;

	public Vinho(String nome, String tipo, String regiao, double preco, double teorAlcoolico, int quantidadeEstoque) {
		super(nome, regiao, preco, teorAlcoolico, quantidadeEstoque);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void exibir() {
		System.out.println("Vinho: " + getNome() + " | Tipo: " + tipo + " | Regiao: " + getRegiao() + " | Teor: "
				+ getTeorAlcoolico() + "%" + " | Estoque: " + getQuantidadeEstoque() + " | Preco: R$ "
				+ String.format("%.2f", getPreco()));
	}

	@Override
	public void servir() {
		baixarEstoque();
	}

	@Override
	public String classificarConsumo() {
		switch (tipo.toLowerCase()) {
		case "tinto":
			return "Encorpado e complexo — ideal para carnes vermelhas e massas com molho.";
		case "branco":
			return "Leve e refrescante — perfeito com peixes, frutos do mar e aves.";
		case "rose":
		case "rosé":
			return "Versatil e frutado — harmoniza bem com carnes suinas, saladas e pratos leves.";
		default:
			return "Aprecie com moderacao em boa companhia.";
		}
	}
}