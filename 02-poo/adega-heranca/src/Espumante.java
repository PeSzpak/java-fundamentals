package Sistema;

public class Espumante extends Bebida {
	private String uva;
	private String classificacao;

	public Espumante(String nome, String uva, String classificacao, String regiao, double preco, double teorAlcoolico,
			int quantidadeEstoque) {
		super(nome, regiao, preco, teorAlcoolico, quantidadeEstoque);
		this.uva = uva;
		this.classificacao = classificacao;
	}

	public String getUva() {
		return uva;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setUva(String uva) {
		this.uva = uva;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public void exibir() {
		System.out.println("Espumante: " + getNome() + " | Uva: " + uva + " | Classificacao: " + classificacao
				+ " | Regiao: " + getRegiao() + " | Teor: " + getTeorAlcoolico() + "%" + " | Estoque: "
				+ getQuantidadeEstoque() + " | Preco: R$ " + String.format("%.2f", getPreco()));
	}

	@Override
	public void servir() {
		baixarEstoque();
	}

	@Override
	public String classificarConsumo() {
		switch (classificacao.toLowerCase()) {
		case "brut":
			return "Seco e elegante — perfeito para celebracoes, aperitivos e frutos do mar.";
		case "demi-sec":
			return "Levemente adocicado — combina com sobremesas leves e frutas.";
		case "moscatel":
			return "Doce e aromatico — ideal para brunch, sobremesas e ocasioes festivas.";
		default:
			return "Espumante ideal para momentos especiais e celebracoes.";
		}
	}
}