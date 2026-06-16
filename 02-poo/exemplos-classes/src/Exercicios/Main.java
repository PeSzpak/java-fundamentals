package Exercicios;

public class Main {

	public static void main(String[] args) {

		System.out.println("=-=-=-=-=-=-=-=-= Alunos =-=-=-=-=-=-=-=-=");

		Aluno aluno1 = new Aluno();
		aluno1.setNota1(7.5);
		aluno1.setNota2(8.0);

		Aluno aluno2 = new Aluno();
		aluno2.setNota1(4.0);
		aluno2.setNota2(5.5);

		System.out.println("Nome:       " + aluno1.getNome());
		System.out.println("Matrícula:  " + aluno1.getMatricula());
		System.out.printf("Média:      %.2f%n", aluno1.calculaMedia());
		System.out.println("Status:     " + aluno1.status());

		System.out.println("");

		System.out.println("Nome:       " + aluno2.getNome());
		System.out.println("Matrícula:  " + aluno2.getMatricula());
		System.out.printf("Média:      %.2f%n", aluno2.calculaMedia());
		System.out.println("Status:     " + aluno2.status());

		System.out.println("=-=-=-=-=-=-=-=-= Produtos =-=-=-=-=-=-=-=-=");
		Produto produto1 = new Produto();
		produto1.setPreco(49.90);
		produto1.setQuantidade(15);

		Produto produto2 = new Produto();
		produto2.setPreco(129.99);
		produto2.setQuantidade(4);

		System.out.println("Nome:               " + produto1.getNome());
		System.out.println("Código:             " + produto1.getCodigo());
		System.out.printf("Valor em estoque:   R$ %.2f%n", produto1.calculaValorEstoque());
		System.out.println("Status do estoque:  " + produto1.statusEstoque());

		System.out.println("");

		System.out.println("Nome:               " + produto2.getNome());
		System.out.println("Código:             " + produto2.getCodigo());
		System.out.printf("Valor em estoque:   R$ %.2f%n", produto2.calculaValorEstoque());
		System.out.println("Status do estoque:  " + produto2.statusEstoque());

		System.out.println("=-=-=-=-=-=-=-=-= Livros =-=-=-=-=-=-=-=-=");

		Livro[] livros = new Livro[5];

		livros[0] = new Livro("Dom Casmurro", "Machado de Assis", "Garnier", 1899);
		livros[1] = new Livro("O Cortico", "Aluisio Azevedo", "Atica", 1890);
		livros[2] = new Livro("Memorias Postumas", "Machado de Assis", "Globo", 1881);
		livros[3] = new Livro("A Moreninha", "Joaquim Macedo", "Melhoramentos", 1844);
		livros[4] = new Livro("Díario de um banana - Rodrick é o cara", "Jeff Kinney\n" + "\n" + "", "Expressao", 1865);

		imprimirLivros(livros);

		livros[0].emprestar();
		livros[1].emprestar();
		livros[2].emprestar();
		livros[0].emprestar();

		System.out.println();

		livros[1].devolver();
		livros[1].emprestar();

		imprimirLivros(livros);
	}

	public static void imprimirLivros(Livro[] livros) {
		for (int i = 0; i < livros.length; i++) {
			System.out.println("\n--- Livro " + (i + 1) + " ---");
			System.out.println("Titulo:      " + livros[i].getTitulo());
			System.out.println("Autor:       " + livros[i].getAutor());
			System.out.println("Editora:     " + livros[i].getEditora());
			System.out.println("Publicacao:  " + livros[i].getAnoDePublicacao());
			System.out.println("Status:      " + (livros[i].isEmEstoque() ? "Disponivel" : "Emprestado"));
		}

	}

}
