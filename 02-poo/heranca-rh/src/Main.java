package ExemploHeranca;

public class Main {

	public static void main(String[] args) {
		
		FolhaPagamento folha = new FolhaPagamento();
		
		folha.addEmpregado(new Desenvolvedor("Ana", 5000));
		folha.addEmpregado(new Estagiario("Ronaldo", 800));
		folha.addEmpregado(new Gerente("Wellington", 7500));


	}

}
